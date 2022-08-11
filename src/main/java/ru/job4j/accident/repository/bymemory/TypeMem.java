package ru.job4j.accident.repository.bymemory;

import org.springframework.stereotype.Repository;
import ru.job4j.accident.model.Type;

import java.util.List;
@Repository
public class TypeMem {
    private List<Type> types;


    public TypeMem() {
        types.add(Type.of(1, "Две машины"));
        types.add(Type.of(2, "Машина и человек"));
        types.add(Type.of(3, "Машина и велосипед"));
    }

    public List<Type> getTypes() {
        return types;
    }

    public void setTypes(List<Type> types) {
        this.types = types;
    }
}
