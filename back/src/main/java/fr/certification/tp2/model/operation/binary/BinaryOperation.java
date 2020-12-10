package fr.certification.tp2.model.operation.binary;

import fr.certification.tp2.model.operation.Operation;
import fr.certification.tp2.model.operation.Value;

public abstract class BinaryOperation implements Operation {
    protected Operation left;
    protected Operation right;

    protected BinaryOperation(Value value, Value value1) {
        this.left = value;
        this.right = value1;
    }
}
