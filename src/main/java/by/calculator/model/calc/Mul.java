package by.calculator.model.calc;

import org.springframework.stereotype.Component;

@Component
public class Mul implements Action {
    @Override
    public double execute(double a, double b) {
        return a * b;
    }
}
