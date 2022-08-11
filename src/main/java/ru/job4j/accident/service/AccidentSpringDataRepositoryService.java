package ru.job4j.accident.service;

import org.springframework.stereotype.Service;
import ru.job4j.accident.model.Accident;
import ru.job4j.accident.repository.AccidentRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
@Service
public class AccidentSpringDataRepositoryService {
    private final AccidentRepository accidentRepository;

    public AccidentSpringDataRepositoryService(AccidentRepository accidentRepository) {
        this.accidentRepository = accidentRepository;
    }

    public Collection<Accident> findAll() {
        List<Accident> res = new ArrayList<>();
        accidentRepository.findAll().forEach(res::add);
        return res;
    }

    public Accident add(Accident accident) {
        return accidentRepository.save(accident);
    }

    public Accident findById(int id) {
        return accidentRepository.findById(id).get();
    }

    public Accident update(Accident accident, int id) {
        accident.setId(findById(id).getId());
        return accidentRepository.save(accident);
    }
}
