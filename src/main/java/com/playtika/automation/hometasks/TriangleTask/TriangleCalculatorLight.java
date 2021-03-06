package com.playtika.automation.hometasks.TriangleTask;

import java.util.Scanner;

public class TriangleCalculatorLight {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Выберите тип треугольника");
        System.out.println("1 - Равносторонни;");
        System.out.println("2 - Равнобедренный;");
        System.out.println("3 - Прямоугольный;");
        System.out.println("4 - Произвольный;");

        int triangleType = console.nextInt();
        System.out.println("Вы выбрали тип треугольника:" + triangleType);

        for (int i = 0; i < 10000000; i++) {

            Triangle triangle = TriangleGenerator.createTriangle();

            if (triangle.isEqualiteral() && triangleType == 1) {
                triangle.getInfo(i);
                return;
            }
            if (triangle.isIsoscele() && triangleType == 2) {
                triangle.getInfo(i);
                return;
            }
            if (triangle.isRight() && triangleType == 3) {
                triangle.getInfo(i);
                return;
            }
            if (triangleType == 4 && !triangle.isEqualiteral() && !triangle.isIsoscele() && !triangle.isRight()) {
                triangle.getInfo(i);
                return;
            }
        }
    }
}
