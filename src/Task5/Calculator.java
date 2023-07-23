package Task5;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Вы вошли в калькулятор.");
        try {
            System.out.println("Введите первое число: ");
            double numer1 = Double.parseDouble(in.nextLine());
            System.out.println("\"Выберите операцию (+, -, *, /):\"");
            String operation = in.nextLine();
            System.out.println("Введите второе число: ");
            double numer2 = Double.parseDouble(in.nextLine());

            double result;
            switch (operation) {
                case "+":
                    result = add(numer1, numer2);
                    System.out.println("Результат: " + result);
                    break;
                case "-":
                    result = sub(numer1, numer2);
                    System.out.println("Результат: " + result);
                    break;
                case "*":
                    result = mul(numer1, numer2);
                    System.out.println("Результат: " + result);
                    break;
                case "/":
                    result = div(numer1, numer2);
                    System.out.println("Результат: " + result);
                    break;
                default:
                    System.out.println("Неверная операция");
            }

        } catch (NumberFormatException e) {
            System.out.println("Ошибка: неверный формат числа");
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль");
        }
    }

    public static double add(double numer1, double numer2) {
        return numer1 + numer2;
    }

    public static double sub(double numer1, double numer2) {
        return numer1 - numer2;
    }

    public static double mul(double numer1, double numer2) {
        return numer1 * numer2;
    }

    public static double div(double numer1, double numer2) {
        if (numer2 == 0) { //деление на 0
            throw new ArithmeticException(); // выводим соответствующее сообщение об ошибке
        }
        return numer1 / numer2;
    }
}
