package com.shurikandrew.thymeleaf.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.management.Query;

@Controller
public class MainController {
    @GetMapping("/requestForm")
    public String form(Model model){
        return "form";
    }

    @PostMapping("/answerForm")
    public String findStudent(@RequestParam("name") String name, Model model){
        name = name.toUpperCase();
        name = "Student " + name;
        model.addAttribute("name", name);
        return "answer";
    }
}
