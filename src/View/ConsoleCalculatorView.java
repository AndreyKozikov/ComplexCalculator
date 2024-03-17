package View;

import Module.ComplexNumber;
import Presenter.Util.CalculatorHistory;
import Presenter.Util.Operations;
import Presenter.Util.ParserNumber;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ConsoleCalculatorView implements CalculatorView {

    @Override
    public void displayResult(ComplexNumber number) {
        System.out.println("Вычисленное комплексное число: " + number);
    }

    @Override
    public ComplexNumber getComplexNumberInput(String msg) {
        return new ParserNumber().getComplexNumber(prompt(msg));
    }

    @Override
    public Integer getOperationChoice() {
        Scanner scanner = new Scanner(System.in);
        updateUI();
        while (true) {
            try {
                int choice = scanner.nextInt();
                switch (choice) {
                    case 5:
                        List<String> history;
                        history = CalculatorHistory.getHistory();
                        System.out.println(history);
                        updateUI();
                        break;
                    default:
                        return choice;
                }
            } catch (InputMismatchException e) {
                System.out.println("Неверный выбор. Пожалуйста, попробуйте еще раз.");
                scanner.nextLine();
                updateUI();
            } 
        }
    }

    @Override
    public void updateUI() {
        System.out.println("Выберите операцию: ");
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Умножение");
        System.out.println("4. Деление");
        System.out.println("5. История");
        System.out.println("6. Выход");
        System.out.print("Введите Ваш выбор: ");
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
