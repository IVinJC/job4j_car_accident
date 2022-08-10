package ru.job4j.accident.service;

import org.springframework.stereotype.Service;
import ru.job4j.accident.model.AccidentType;
import ru.job4j.accident.repository.AccidentDbType;

import java.util.List;

@Service
public class TypeService {
    private final AccidentDbType accidentDbType;

    public TypeService(AccidentDbType accidentDbType) {
        this.accidentDbType = accidentDbType;
    }

    public List<AccidentType> getTypes() {
        return accidentDbType.getTypes();
    }

    public void setTypes(List<AccidentType> types) {
        accidentDbType.setTypes(types);
    }
}
