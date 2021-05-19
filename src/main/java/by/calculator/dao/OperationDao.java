package by.calculator.dao;

import by.calculator.model.calc.Operation;

import java.util.List;

public interface OperationDao {
    void save(Operation operation);
    List<Operation> get();
}
