package ru.job4j.accident.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.job4j.accident.model.Accident;
import ru.job4j.accident.service.AccidentService;
import ru.job4j.accident.service.RuleService;
import ru.job4j.accident.service.TypeService;

import javax.servlet.http.HttpServletRequest;

@Controller
public class AccidentController {
    private final AccidentService accidentService;
    private final RuleService ruleService;
    private final TypeService typeService;

    public AccidentController(AccidentService accidentService, RuleService ruleService, TypeService typeService) {
        this.accidentService = accidentService;
        this.ruleService = ruleService;
        this.typeService = typeService;
    }

    @GetMapping("/index")
    public String accidents(Model model) {
        model.addAttribute("accidents", accidentService.findAll());
        return "accident";
    }
    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("types", typeService.findAll());
        model.addAttribute("rules", ruleService.findAll());
        return "accident/create";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Accident accident) {
        accidentService.add(accident);
        return "redirect:/";
    }
    @PostMapping("/edit")
    public String edit(@ModelAttribute Accident accident, HttpServletRequest req) {
        accidentService.update(accident, accident.getId());
        String[] ids = req.getParameterValues("rIds");
        return "redirect:/";
    }

    @GetMapping("/update")
    public String update(@RequestParam("id") int id, Model model) {
        model.addAttribute("accident", accidentService.findById(id));
        return "accident/update";
    }
}
