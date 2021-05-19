package by.calculator.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth")
public class AuthorizationController {
    @GetMapping
    public String viewPage(){
        return "auth";
    }

    @PostMapping
    public String viewPage(Model model){
        return "auth";
    }
}
