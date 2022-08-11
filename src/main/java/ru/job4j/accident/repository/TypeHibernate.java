package ru.job4j.accident.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import ru.job4j.accident.model.Type;

import java.util.List;
import java.util.function.Function;

public class TypeHibernate {
    private final SessionFactory sf;

    public TypeHibernate(SessionFactory sf) {
        this.sf = sf;
    }

    private <T> T tx(final Function<Session, T> command) {
        final Session session = sf.openSession();
        final Transaction tx = session.beginTransaction();
        try {
            T rsl = command.apply(session);
            tx.commit();
            return rsl;
        } catch (final Exception e) {
            session.getTransaction().rollback();
            throw e;
        } finally {
            session.close();
        }
    }

    public Type add(Type type) {
        tx(session -> session.save(type));
        return type;
    }

    public List<Type> findAll() {
        return tx(session -> session.createQuery("from Type", Type.class).list());
    }
}
