package fr.certification.tp2.model;

import fr.certification.tp2.model.operation.Operation;
import fr.certification.tp2.model.operation.Value;
import fr.certification.tp2.model.operation.binary.Addition;
import fr.certification.tp2.model.operation.binary.Division;
import fr.certification.tp2.model.operation.binary.Multiplication;
import fr.certification.tp2.model.operation.binary.Substraction;

public class OperationFabric {
    public static Operation add(int a, int b) {
        return new Addition(new Value(a), new Value(b));
    }

    public static Operation divide(int a, int b) {
        return new Division(new Value(a), new Value(b));
    }

    public static Operation multiply(int a, int b) {
        return new Multiplication(new Value(a), new Value(b));
    }

    public static Operation substract(int a, int b) {
        return new Substraction(new Value(a), new Value(b));
    }
}
