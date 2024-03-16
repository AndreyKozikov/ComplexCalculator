package View;

import Module.ComplexNumber;
import Module.ComplexOperations.impl.ComplexOperations;
import Presenter.Util.Operations;

public interface CalculatorView {
    void displayResult(ComplexNumber number);

    ComplexNumber getComplexNumberInput(String prompt);

    Operations getOperationChoice();

    void updateUI();
}

