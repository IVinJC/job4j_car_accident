package ru.job4j.accident.service;

import org.springframework.stereotype.Service;
import ru.job4j.accident.model.Rule;
import ru.job4j.accident.repository.byhibernate.RuleHibernate;

import java.util.List;
@Service
public class RuleService {
    private final RuleHibernate ruleHibernate;

    public RuleService(RuleHibernate ruleHibernate) {
        this.ruleHibernate = ruleHibernate;
    }

    public Rule add(Rule rule) {
        return ruleHibernate.add(rule);
    }

    public List<Rule> findAll() {
        return ruleHibernate.findAll();
    }

    public Rule findById(int id) {
        return ruleHibernate.findById(id);
    }

    public Rule update(Rule rule, int id) {
        return ruleHibernate.update(rule, id);
    }
}
