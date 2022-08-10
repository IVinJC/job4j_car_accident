package ru.job4j.accident.service;

import org.springframework.stereotype.Service;
import ru.job4j.accident.repository.AccidentDbRule;

@Service
public class RuleService {
    private final AccidentDbRule accidentDbRule;

    public RuleService(AccidentDbRule accidentDbRule) {
        this.accidentDbRule = accidentDbRule;
    }


}
