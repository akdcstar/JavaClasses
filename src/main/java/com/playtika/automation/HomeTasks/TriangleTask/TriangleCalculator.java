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


        Triangle[] triangleArray = new Triangle[100];

        int numberOfEqualiteral = 0;
        int numberOfIsoscele = 0;
        int numberOfRight = 0;
        int numberOfScalene = 0;

        boolean isFirstTriangle = false;

        for (int i = 0; i < triangleArray.length; i++) {
            Triangle triangle = new Triangle();

            triangleArray[i] = triangle;
            if (triangle.isEqualiteral()) {
                if (triangleType == 1 && !isFirstTriangle) {
                    System.out.println("Периметр первого равностороннего треугольника: " + triangle.trianglePerimeter());
                    System.out.println("Площадь первого равностороннего треугольника: " + triangle.triangleArea());
                    isFirstTriangle = true;
                    numberOfEqualiteral++;
                } else {
                    numberOfEqualiteral++;
                }

            } else if (triangle.isIsoscele()) {
                if (triangleType == 2 && !isFirstTriangle) {
                    System.out.println("Периметр первого равнобедренного треугольника: " + triangle.trianglePerimeter());
                    System.out.println("Площадь первого равнобедренного треугольника: " + triangle.triangleArea());
                    isFirstTriangle = true;
                    numberOfIsoscele++;
                } else {
                    numberOfIsoscele++;
                }
            } else if (triangle.isRight()) {
                if (triangleType == 3 && !isFirstTriangle) {
                    System.out.println("Периметр первого прямоугольного треугольника: " + triangle.trianglePerimeter());
                    System.out.println("Площадь первого прямоугольного треугольника: " + triangle.triangleArea());
                    isFirstTriangle = true;
                    numberOfRight++;
                } else {
                    numberOfRight++;
                }
            } else if (triangleType == 4 && !isFirstTriangle) {
                System.out.println("Периметр первого произвольного треугольника: " + triangle.trianglePerimeter());
                System.out.println("Площадь первого произвольного треугольника: " + triangle.triangleArea());
                isFirstTriangle = true;
                numberOfEqualiteral++;
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
