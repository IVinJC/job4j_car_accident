package ru.job4j.accident.service;

import org.springframework.stereotype.Service;
import ru.job4j.accident.model.Type;
import ru.job4j.accident.repository.byspringjdbc.TypeJdbcTemplate;

import java.util.List;

@Service
public class TypeService {
    private final TypeJdbcTemplate typeJdbcTemplate;

    public TypeService(TypeJdbcTemplate typeJdbcTemplate) {
        this.typeJdbcTemplate = typeJdbcTemplate;
    }


    public Type add(Type type) {
        return typeJdbcTemplate.add(type);
    }

    public List<Type> findAll() {
        return typeJdbcTemplate.findAll();
    }

    public Type findById(int id) {
        return typeJdbcTemplate.findById(id);
    }

    public Type update(Type type, int id) {
        return typeJdbcTemplate.update(type, id);
    }
}
