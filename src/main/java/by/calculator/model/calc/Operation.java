package by.calculator.model.calc;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class Operation {
    private double fNum;
    private double sNum;
    private String operation;
    private double result;
}
