package by.calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping
    public String viewPage(@RequestParam(required = false, defaultValue = "Guest") String name,
                           @RequestParam(required = false, defaultValue = "0") int age, Model model){
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        return "home";
    }
}
