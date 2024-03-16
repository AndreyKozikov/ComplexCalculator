package Module;

public class ComplexNumber {
    private double real; // Вещественная часть комплексного числа
    private double img; // Мнимая часть комплексного числа

    public double getReal() {
        return real;
    }

    public double getImg() {
        return img;
    }

    public ComplexNumber(double real, double img) {
        this.real = real;
        this.img = img;
    }

    @Override
    public String toString() {
        String number = "";
        if (real != 0) number = String.format("%.2f", real);
        if (img>0) {
            number = number + "+" + String.format("%.2f", img) + "i";
        } else {
            number = number + String.format("%.2f", img) + "i";
        }
        return number;
    }
}
