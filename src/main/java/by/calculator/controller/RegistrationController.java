package by.calculator.controller;

import by.calculator.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/reg")
public class RegistrationController {
    @GetMapping()
    public String viewPage(){
        return "registration";
    }
    @PostMapping()
    public String viewPage(User user, Model model){
        model.addAttribute(user);
        System.out.println(user);
        return "registration";
    }
}
