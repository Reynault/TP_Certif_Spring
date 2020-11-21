package fr.certification.tp2.model.operation.binary;

import fr.certification.tp2.model.operation.Value;

public class Division extends BinaryOperation{
    public Division(Value value, Value value1) {
        super(value, value1);
    }

    @Override
    public int compute() throws ArithmeticException{
        int r = right.compute();
        if(r == 0)
            throw new ArithmeticException("Division by Zero");
        return left.compute() / r;
    }

    @Override
    public boolean isValue() {
        return false;
    }
}
