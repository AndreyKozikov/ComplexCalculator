package Module.ComplexOperations;

import Module.ComplexOperations.impl.ComplexOperations;
import Module.ComplexNumber;

public class Multiplication implements ComplexOperations {
    @Override
    public ComplexNumber performOperation(ComplexNumber operand1, ComplexNumber operand2) {
        double real =  operand1.getReal()*operand2.getReal()-operand1.getImg()*operand2.getImg();
        double imaginary = operand1.getReal()*operand2.getImg()+operand1.getImg()*operand2.getReal();
        return new ComplexNumber(real, imaginary);
    }
}
