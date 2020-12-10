package fr.certification.tp2.model.operation;

public class Value implements Operation {
    private final int computedValue;

    public Value(int computedValue) {
        this.computedValue = computedValue;
    }

    @Override
    public boolean isValue() {
        return true;
    }

    @Override
    public int compute(){
        return computedValue;
    }
}
