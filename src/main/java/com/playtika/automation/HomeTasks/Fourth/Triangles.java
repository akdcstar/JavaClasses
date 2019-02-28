package com.playtika.automation.HomeTasks.Fourth;


public class Triangles {
    public static void main(String[] args) {


        class Point {
            protected float x;
            protected float y;

            public Point(float x, float y) {
                this.x = x;
                this.y = y;
            }

            public String toString() {
                return "(" + x + " , " + y + ")";
            }

            public double length(Point point2) {
                return Math.sqrt(Math.pow((x - point2.x), 2) + Math.pow((y - point2.y), 2));

            }
        }

        Point point1 = new Point(0, 0);
        System.out.println("Point1 coordinates: " + point1);

        Point point2 = new Point(10, 60);
        System.out.println("Point2 coordinates: " + point2);

        System.out.println("Length between Point1 and Point2: " + point1.length(point2));
    }

}
