package io.project;

import java.util.Scanner;


public class FractionAdder {

    /**
     * Метод для выполнения сложения двух дробных чисел.
     *
     * @param num1 первое дробное число
     * @param num2 второе дробное число
     * @return результат сложения двух дробных чисел, округленный до четырех знаков после запятой
     */

    public static double addFractions(double num1, double num2) {
        return Math.round((num1 + num2) * 10000.0) / 10000.0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое дробное число: ");
        double num1 = scanner.nextDouble();

        System.out.println("Введите второе дробное число: ");
        double num2 = scanner.nextDouble();

        double result = addFractions(num1, num2);

        System.out.printf("Результат сложения: %.4f%n", result);

        scanner.close();
    }
}