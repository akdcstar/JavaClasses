package com.playtika.automation.HomeTasks.TriangleTask;


import java.util.concurrent.ThreadLocalRandom;

public class Point {
    private int x;
    private int y;

//    public Point(float x, float y) {
//        this.x = x;
//        this.y = y;
//    }

    public Point(){
//        int min = 1;
//        int max = 2;
//        this.x = (float)(min + Math.random() * (max - min));
//        this.y = (float)(min + Math.random() * (max - min));

        this.x = ThreadLocalRandom.current().nextInt(1, 5 + 1);
        this.y = ThreadLocalRandom.current().nextInt(2, 5 + 1);



    }

    public String toString() {
        return "(" + x + " , " + y + ")";
    }

    public double lengthToPoint(Point point) {
        return Math.sqrt(Math.pow((x - point.x), 2) + Math.pow((y - point.y), 2));

    }
}
