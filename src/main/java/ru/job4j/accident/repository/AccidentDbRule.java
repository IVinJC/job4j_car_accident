package ru.job4j.accident.repository;

import org.springframework.stereotype.Repository;
import ru.job4j.accident.model.Rule;

import java.util.List;

@Repository
public class AccidentDbRule {
    private List<Rule> rules;

    public AccidentDbRule(List<Rule> rules) {
        rules.add(Rule.of(1, "Статья. 1"));
        rules.add(Rule.of(2, "Статья. 2"));
        rules.add(Rule.of(3, "Статья. 3"));
    }

    public List<Rule> getRules() {
        return rules;
    }

    public void setRules(List<Rule> rules) {
        this.rules = rules;
    }
}
