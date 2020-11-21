package fr.certification.tp2.service;

import fr.certification.tp2.model.OperationFabric;
import fr.certification.tp2.model.operation.Operation;
import fr.certification.tp2.service.result.Result;
import fr.certification.tp2.service.result.ResultError;
import fr.certification.tp2.service.result.ResultOperation;
import org.springframework.stereotype.Service;

@Service
public class OperationsService {

    private Result handleException(Operation operation, int a, int b) {
        try {
            int c = operation.compute();
            return new ResultOperation(a, b, c);
        } catch (ArithmeticException e) {
            return new ResultError(e.getMessage());
        }
    }

    public Result add(int a, int b) {
        return handleException(OperationFabric.add(a, b), a, b);
    }

    public Result divide(int a, int b) {
        return handleException(OperationFabric.divide(a, b), a, b);
    }

    public Result substract(int a, int b) {
        return handleException(OperationFabric.substract(a, b), a, b);
    }

    public Result multiply(int a, int b) {
        return handleException(OperationFabric.multiply(a, b), a, b);
    }
}
