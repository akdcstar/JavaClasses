package com.playtika.automation.hometasks.TriangleTask;

public class TriangleGenerator {

    public static Triangle createTriangle() {
        Point point1 = new Point();
        Point point2;
        Point point3;

        do {
            point2 = new Point();
            point3 = new Point();
        } while (point1.equals(point2) || point2.equals(point3) || point3.equals(point1));

        return new Triangle(point1, point2, point3);

    }
}
