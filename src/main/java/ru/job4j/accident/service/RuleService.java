package ru.job4j.accident.service;

import org.springframework.stereotype.Service;
import ru.job4j.accident.model.AccidentType;
import ru.job4j.accident.model.Rule;
import ru.job4j.accident.repository.AccidentDbRule;

import java.util.List;

@Service
public class RuleService {
    private final AccidentDbRule accidentDbRule;

    public RuleService(AccidentDbRule accidentDbRule) {
        this.accidentDbRule = accidentDbRule;
    }

    public List<Rule> getTypes() {
        return accidentDbRule.getRules();
    }

    public void setTypes(List<Rule> rules) {
        accidentDbRule.setRules(rules);
    }

}
