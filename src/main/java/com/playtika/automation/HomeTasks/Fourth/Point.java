package com.playtika.automation.HomeTasks.Fourth;


public class Point {
    protected float x;
    protected float y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point(){
        int min = 0;
        int max = 100;
        this.x = (float)(min + Math.random() * (max - min));
        this.y = (float)(min + Math.random() * (max - min));

    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Point point = (Point) o;
//
//        if (Float.compare(point.x, x) != 0) return false;
//        return Float.compare(point.y, y) == 0;
//    }
//
//    @Override
//    public boolean equals(Object otherPoint) {
//        if(otherPoint == null) {
//            return false;
//        }
//        if (!(otherPoint instanceof Point) {
//            return false;
//        }
//
//        Point point = (Point) otherPoint;
//        if (x != point.x) {
//            return false;
//        }
//        return y == point.y;
//    }



    public String toString() {
        return "(" + x + " , " + y + ")";
    }

    public double lengthToPoint(Point point) {
        return Math.sqrt(Math.pow((x - point.x), 2) + Math.pow((y - point.y), 2));

    }
}
