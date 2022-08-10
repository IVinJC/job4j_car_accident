package ru.job4j.accident.service;

import org.springframework.stereotype.Service;
import ru.job4j.accident.model.Accident;
import ru.job4j.accident.repository.AccidentHibernate;

import java.util.List;

@Service
public class AccidentHibernateService {
    private final AccidentHibernate accidentHibernate;

    public AccidentHibernateService(AccidentHibernate accidentHibernate) {
        this.accidentHibernate = accidentHibernate;
    }

    public Accident add(Accident accident) {
        return accidentHibernate.add(accident);
    }

    public List<Accident> findAll() {
        return accidentHibernate.findAll();
    }
}
