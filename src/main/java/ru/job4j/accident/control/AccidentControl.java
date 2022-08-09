package ru.job4j.accident.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.job4j.accident.model.AccidentType;

private

@Controller
public class AccidentControl {

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("types", types);
        return "accident/create";
    }
}