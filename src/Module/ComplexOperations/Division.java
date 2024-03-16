package Module.ComplexOperations;

import Module.ComplexOperations.impl.ComplexOperations;
import Module.ComplexNumber;

public class Division implements ComplexOperations {
    @Override
    public ComplexNumber performOperation(ComplexNumber operand1, ComplexNumber operand2) {
        double divisor = operand2.getReal() * operand2.getReal() + operand2.getImg() * operand2.getImg();
        if (divisor == 0) {
            throw new ArithmeticException("Деление на ноль");
        }
        double real = (operand1.getReal()*operand2.getReal()+operand1.getImg()*operand2.getImg())/divisor;
        double imaginary = (operand1.getImg()*operand2.getReal()-operand1.getReal()*operand2.getImg())/divisor;
        return new ComplexNumber(real, imaginary);
    }
}
