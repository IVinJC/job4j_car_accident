package ru.job4j.accident.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class IndexControl {
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("userName", "Petr Arsentev");
        List<String> userList = new ArrayList<>();
        userList.add("Name1");
        userList.add("Name2");
        userList.add("Name3");
        model.addAttribute("userList", userList);
        return "index";
    }
}