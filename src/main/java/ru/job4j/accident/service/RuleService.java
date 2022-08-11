package ru.job4j.accident.service;

import org.springframework.stereotype.Service;
import ru.job4j.accident.model.Rule;
import ru.job4j.accident.repository.RuleJdbcTemplate;

import java.util.List;
@Service
public class RuleService {
    private final RuleJdbcTemplate ruleJdbcTemplate;

    public RuleService(RuleJdbcTemplate ruleJdbcTemplate) {
        this.ruleJdbcTemplate = ruleJdbcTemplate;
    }


    public Rule add(Rule rule) {
        return ruleJdbcTemplate.add(rule);
    }

    public List<Rule> findAll() {
        return ruleJdbcTemplate.findAll();
    }

    public Rule findById(int id) {
        return ruleJdbcTemplate.findById(id);
    }

    public Rule update(Rule rule, int id) {
        return ruleJdbcTemplate.update(rule, id);
    }
}
