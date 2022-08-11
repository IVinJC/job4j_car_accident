package ru.job4j.accident.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import ru.job4j.accident.model.Accident;
import ru.job4j.accident.model.Rule;

import java.util.List;
import java.util.function.Function;

public class RuleHibernate {
    private final SessionFactory sf;

    public RuleHibernate(SessionFactory sf) {
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

    public Rule add(Rule rule) {
        tx(session -> session.save(rule));
        return rule;
    }

    public List<Rule> findAll() {
        return tx(session -> session.createQuery("from Rule", Rule.class).list());
    }
}
