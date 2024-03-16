package Presenter.Util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import Module.ComplexNumber;
public class ParserNumber {
    private double real;
    private  double img;
    private String strNumber;

    public ComplexNumber getComplexNumber(String number) {

        Pattern pattern = Pattern.compile("((-?)(\\d+)([-+])(\\d+)i)|((-?)(\\d+)i([-+])(\\d+))");
        Matcher matcher = pattern.matcher(number);

        if (matcher.find()) {
            if (matcher.group(6) != null){
                String realPart = matcher.group(10);
                String imaginaryPart = matcher.group(8);
                String realSign = matcher.group(9).equals("+") ? "+" : "-";
                String imaginarySign = matcher.group(7).equals("-") ? "-" : "+"; // Определяем знак мнимой части
                // Преобразуем строковые значения в числа, учитывая знаки
                int real = Integer.parseInt(realSign + realPart);
                int imaginary = Integer.parseInt(imaginarySign + imaginaryPart);
                return new ComplexNumber(real, imaginary);
            } else {
                String realPart = matcher.group(3);
                String imaginaryPart = matcher.group(5);
                String realSign = matcher.group(2).equals("-") ? "-" : "+";
                String imaginarySign = matcher.group(4).equals("+") ? "+" : "-"; // Определяем знак мнимой части
                // Преобразуем строковые значения в числа, учитывая знаки
                int real = Integer.parseInt(realSign + realPart);
                int imaginary = Integer.parseInt(imaginarySign + imaginaryPart);
                return new ComplexNumber(real, imaginary);
            }


        } else {
             throw new RuntimeException("Неверный формат комплексного числа.");
        }
    }
}
