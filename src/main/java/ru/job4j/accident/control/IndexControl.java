package ru.job4j.accident.control;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.job4j.accident.repository.AccidentRepository;

import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexControl {
    private final AccidentRepository accidents;

    public IndexControl(AccidentRepository accidents) {
        this.accidents = accidents;
    }
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("userName", "Petr Arsentev");
        model.addAttribute("user", SecurityContextHolder.getContext().getAuthentication().getPrincipal());
        model.addAttribute("accidents", accidents.findAll());
        List<String> userList = new ArrayList<>();
        userList.add("Name1");
        userList.add("Name2");
        userList.add("Name3");
        model.addAttribute("userList", userList);
        return "index";
    }
}