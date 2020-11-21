package fr.certification.tp2.model.operation;

public class Value implements Operation {
    private int value;

    public Value(int value) {
        this.value = value;
    }

    @Override
    public boolean isValue() {
        return true;
    }

    @Override
    public int compute() throws ArithmeticException {
        return value;
    }
}
