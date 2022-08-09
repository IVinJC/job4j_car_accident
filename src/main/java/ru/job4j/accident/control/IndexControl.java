package ru.job4j.accident.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexControl {
    @GetMapping("/")
    public String index(Model model) {
        /*List<String> users = Arrays.asList("Ivan", "Aleksandr", "Olga", "Dasha", "Lena");
        model.addAttribute("users", users);*/
        model.addAttribute("user", "Petr Arsentev");
        return "index";
    }
}