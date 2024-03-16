package Presenter;

import Module.ComplexNumber;
import Module.ComplexOperations.OperationsList;
import Module.ComplexOperations.impl.ComplexOperations;
import Presenter.Util.CalculatorHistory;
import Presenter.Util.Operations;
import View.CalculatorView;


public class CalculatorPresenter {
    private CalculatorView view;
    private CalculatorHistory history;

    public CalculatorPresenter(CalculatorView view, CalculatorHistory history) {
        this.view = view;
        this.history = history;
    }

    private void handleUserInput() {
        Operations operationType = view.getOperationChoice();
        while (operationType != Operations.EXIT) {
            ComplexOperations operation = OperationsList.getOperation(operationType);
            System.out.println("Введите комплексные числа в формате a+bi, где a и b - вещественные числа.");

            try {
                ComplexNumber number1 = view.getComplexNumberInput("Введите первое комплексное число: ");
                ComplexNumber number2 = view.getComplexNumberInput("Введите второе комплексное число: ");
                ComplexNumber result = operation.performOperation(number1, number2);
                String his = "Операция: " + operationType + "\n" + number1.toString() + "\n" + number2.toString() + "\n" + "Результат: " + result.toString() + "\n";
                history.addEntry(his);
                view.displayResult(result);
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
                System.out.println("Повторите операцию с другими числами.");
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
                System.out.println("Повторите операцию с другими числами.");
            }
            operationType = view.getOperationChoice();
        }
    }

    public void start() {
        handleUserInput();
    }
}



