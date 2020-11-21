package fr.certification.tp2.model.operation.binary;

import fr.certification.tp2.model.operation.Value;

public class Addition extends BinaryOperation{
    public Addition(Value value, Value value1) {
        super(value, value1);
    }

    @Override
    public boolean isValue() {
        return false;
    }

    @Override
    public int compute() throws ArithmeticException{
        return left.compute() + right.compute();
    }
}
