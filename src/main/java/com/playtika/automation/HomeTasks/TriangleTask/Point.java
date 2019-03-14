package com.playtika.automation.HomeTasks.TriangleTask;


import java.util.concurrent.ThreadLocalRandom;

public class Point {
    private float x;
    private float y;

    public Point(){

        this.x = ThreadLocalRandom.current().nextInt(1, 10 + 1);
        this.y = ThreadLocalRandom.current().nextInt(1, 10 + 1);
        this.y = ThreadLocalRandom.current().nextFloat();
    }

    public String toString() {
        return "(" + x + " , " + y + ")";
    }

    public double lengthToPoint(Point point) {
        return Math.sqrt(Math.pow((x - point.x), 2) + Math.pow((y - point.y), 2));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;

        Point point = (Point) o;

        if (Float.compare(point.x, x) != 0) return false;
        return Float.compare(point.y, y) == 0;
    }

    @Override
    public int hashCode() {
        int result = (x != +0.0f ? Float.floatToIntBits(x) : 0);
        result = 31 * result + (y != +0.0f ? Float.floatToIntBits(y) : 0);
        return result;
    }
}
