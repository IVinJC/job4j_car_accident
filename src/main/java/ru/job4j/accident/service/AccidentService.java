package ru.job4j.accident.service;

import org.springframework.stereotype.Service;
import ru.job4j.accident.model.Accident;
import ru.job4j.accident.model.AccidentType;
import ru.job4j.accident.model.Rule;
import ru.job4j.accident.repository.AccidentJdbcTemplate;

import java.util.Collection;
import java.util.List;

@Service
public class AccidentService {
    private final AccidentJdbcTemplate accidentJdbcTemplate;

    public AccidentService(AccidentJdbcTemplate accidentJdbcTemplate) {
        this.accidentJdbcTemplate = accidentJdbcTemplate;
    }


    public Collection<Accident> findAll() {
        return accidentJdbcTemplate.findAll();
    }

    public Accident add(Accident accident) {
        return accidentJdbcTemplate.add(accident);
    }

    public Accident findById(int id) {
        return accidentJdbcTemplate.findById(id);
    }

    public Accident update(Accident accident, int id) {
        return accidentJdbcTemplate.update(accident, id);
    }
}
