package ru.job4j.accident.service;

import org.springframework.stereotype.Service;
import ru.job4j.accident.model.Accident;
import ru.job4j.accident.repository.AccidentMem;

import java.util.Collection;

@Service
public class AccidentService {
    private final AccidentMem accidentMem;

    public AccidentService(AccidentMem accidentMem) {
        this.accidentMem = accidentMem;
    }

    public Collection<Accident> findAll() {
        return accidentMem.findAll();
    }

    public boolean add(Accident accident) {
        return accidentMem.add(accident);
    }

    public Accident findById(int id) {
        return accidentMem.findById(id);
    }

    public Accident update(Accident accident) {
        return accidentMem.update(accident);
    }
}
