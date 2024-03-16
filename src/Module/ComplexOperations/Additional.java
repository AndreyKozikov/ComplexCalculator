package Module.ComplexOperations;

import Module.ComplexNumber;
import Module.ComplexOperations.impl.ComplexOperations;

public class Additional implements ComplexOperations {

    public ComplexNumber performOperation(ComplexNumber operand1, ComplexNumber operand2) {
        double real = operand1.getReal() + operand2.getReal();
        double imaginary = operand1.getImg() + operand2.getImg();
        return new ComplexNumber(real, imaginary);
    }
}