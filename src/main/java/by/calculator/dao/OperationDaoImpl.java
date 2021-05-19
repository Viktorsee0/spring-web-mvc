package by.calculator.dao;

import by.calculator.model.calc.Operation;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class OperationDaoImpl implements OperationDao{
    private List<Operation> operations = new ArrayList<>();

    @Override
    public void save(Operation operation){
        operations.add(operation);
    }

    @Override
    public List<Operation> get() {
        return operations;
    }
}
