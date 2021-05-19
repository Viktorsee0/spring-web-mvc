package by.calculator.controller;

import by.calculator.model.calc.Operation;
import by.calculator.service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/show")
public class ShowOperationsController {

    @Autowired
    private OperationService service;

    @GetMapping
    public String viewPage(Model model){
        List<Operation> operations = service.get();
        model.addAttribute(operations);
        return "showOperations";
    }
}
