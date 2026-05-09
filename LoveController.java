package com.example.love;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoveController {

    @GetMapping("/")
    public String showLovePage(Model model) {
        model.addAttribute("loverName", "любимая Кариша");
        model.addAttribute("yourName", "твой Сережка");
        return "love";
    }
}
