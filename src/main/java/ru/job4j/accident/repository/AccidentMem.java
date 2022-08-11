package ru.job4j.accident.repository;

import org.springframework.stereotype.Repository;
import ru.job4j.accident.model.Accident;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class AccidentMem {
    private final Map<Integer, Accident> accidents = new ConcurrentHashMap<>();
    private final AtomicInteger id = new AtomicInteger(3);

    private AccidentMem() {
        accidents.put(1, new Accident(1, "Name1", "Text1", "Address1"));
        accidents.put(2, new Accident(2, "Name2", "Text2", "Address2"));
    }

    public Collection<Accident> findAll() {
        return accidents.values();
    }

    public boolean add(Accident accident) {
        accident.setId(id.incrementAndGet());
        return accidents.put(accident.getId(), accident) == null;
    }

    public Accident findById(int id) {
        return accidents.get(id);
    }

    public Accident update(Accident accident) {
        return accidents.replace(accident.getId(), accident);
    }
}
