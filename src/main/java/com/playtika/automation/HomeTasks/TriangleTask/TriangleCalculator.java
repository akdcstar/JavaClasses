package com.playtika.automation.HomeTasks.TriangleTask;

import java.util.Scanner;

public class TriangleCalculator {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Выберите тип треугольника");
        System.out.println("1 - Равносторонни;");
        System.out.println("2 - Равнобедренный;");
        System.out.println("3 - Прямоугольный;");
        System.out.println("4 - Произвольный;");

        int triangleType = console.nextInt();
        System.out.println("Вы выбрали тип треугольника:" + triangleType);


        Triangle[] triangleArray = new Triangle[10];

        int numberOfEqualiteral = 0;
        int numberOfIsoscele = 0;
        int numberOfRight = 0;
        int numberOfScalene = 0;

        boolean flag = false;

        for (int i = 0; i < triangleArray.length; i++) {
            Triangle triangle = new Triangle();

            triangleArray[i] = triangle;
            if (triangle.isEqualiteral()) {
                if (triangleType == 1 && flag == false) {
                    System.out.println("Периметр первого треугольника: " + triangle.trianglePerimeter());
                    flag = true;
                } else {
                    numberOfEqualiteral++;
                }

            } else if (triangle.isIsoscele()) {
                if (triangleType == 2 && flag == false) {
                    System.out.println("Периметр первого треугольника: " + triangle.trianglePerimeter());
                    flag = true;
                } else {
                    numberOfIsoscele++;
                }
            } else if (triangle.isRight()) {
                if (triangleType == 3 && flag == false) {
                    System.out.println("Периметр первого треугольника: " + triangle.trianglePerimeter());
                    flag = true;
                } else {
                    numberOfRight++;
                }
            } else if (triangleType == 4 && flag == false) {
                System.out.println("Периметр первого треугольника: " + triangle.trianglePerimeter());
                flag = true;
            } else {
                numberOfScalene++;
            }
        }

        System.out.println();
        System.out.println("Количество равносторонних треугольников: " + numberOfEqualiteral);
        System.out.println("Количество равнобедренных треугольников: " + numberOfIsoscele);
        System.out.println("Количество прямоугольных треугольников: " + numberOfRight);
        System.out.println("Количество произвольных треугольников: " + numberOfScalene);


    }
}
