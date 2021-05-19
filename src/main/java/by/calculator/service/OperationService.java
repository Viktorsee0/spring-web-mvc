package by.calculator.service;

import by.calculator.dao.OperationDao;
import by.calculator.model.calc.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OperationService {
    @Autowired
    private OperationDao dao;

    public void save(Operation operation){
        dao.save(operation);
    }

    public List<Operation> get() {
        return dao.get();
    }
}
