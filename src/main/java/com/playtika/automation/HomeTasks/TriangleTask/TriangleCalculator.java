package com.playtika.automation.HomeTasks.TriangleTask;

public class TriangleCalculator {
    public static void main(String[] args) {



        Triangle[] triangleArray = new Triangle[10000];

        int numberOfEqualiteral = 0;
        int numberOfIsoscele = 0;
        int numberOfRight = 0;
        int numberOfScalene = 0;


        for (int i = 0; i < triangleArray.length; i++) {
            Triangle triangle = new Triangle();

            triangleArray[i] = triangle;
            System.out.printf(triangleArray[i].toString());
            System.out.println();
            if (triangle.isEqualiteral()) {
                numberOfEqualiteral++;
            } else if (triangle.isIsoscele()) {
                numberOfIsoscele++;
            } else if (triangle.isRight()) {
                numberOfRight++;
            } else numberOfScalene++;
        }
        System.out.println();
        System.out.println(numberOfEqualiteral);
        System.out.println(numberOfIsoscele);
        System.out.println(numberOfRight);
        System.out.println(numberOfScalene);


    }
}
