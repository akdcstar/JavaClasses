package com.playtika.automation.HomeTasks.Fourth;

public class TriangleCalculator {
    public static void main(String[] args) {


        Triangle triangle = new Triangle();

        System.out.println("Point1 coordinates: " + triangle.point1);
        System.out.println("Point2 coordinates: " + triangle.point2);
        System.out.println("Point3 coordinates: " + triangle.point3);
        System.out.println();

//        System.out.println("Length between points 1 and 2: " + point1.lengthToPoint(point2));
//        System.out.println("Length between points 2 and 3: " + point2.lengthToPoint(point3));
//        System.out.println("Length between points 3 and 1: " + point3.lengthToPoint(point1));
//        System.out.println();

        System.out.println("Triangle is " + triangle.triangleType());
        System.out.println("Triangle Perimeter: " + triangle.trianglePerimeter());
        System.out.println("Triangle Area: " + triangle.triangleArea());

        Triangle[] triangleArray = new Triangle[10];
        for (int i = 0; i < triangleArray.length; i++){


            triangleArray[i] = new Triangle();
        }

        System.out.println(triangleArray[0].toString());
        System.out.println(triangleArray[1].toString());
        System.out.println(triangleArray[2].toString());
        System.out.println(triangleArray[3].toString());
        System.out.println(triangleArray[4].toString());

    }
}
