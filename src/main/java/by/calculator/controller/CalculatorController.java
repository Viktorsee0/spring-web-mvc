package by.calculator.controller;

import by.calculator.model.calc.Action;
import by.calculator.model.calc.Operation;
import by.calculator.service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/calc")
public class CalculatorController {
    @Autowired
    private OperationService service;
    @Autowired
    private Map<String, Action> actionMap;

    @GetMapping()
    public String viewPage() {
        return "calc";
    }

    @PostMapping()
    public String viewPage(Double fNum, String operation, Double sNum, Model model) {
        double result = actionMap.get(operation).execute(fNum, sNum);
        Operation myOperation = new Operation(fNum, sNum, operation, result);
        service.save(myOperation);
        model.addAttribute(myOperation);
        return "calc";
    }
}
