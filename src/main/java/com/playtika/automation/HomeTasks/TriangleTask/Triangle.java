package com.playtika.automation.HomeTasks.TriangleTask;


public class Triangle {
    private Point point1;
    private Point point2;
    private Point point3;

    private double ab;
    private double bc;
    private double ca;


    public Triangle() {
        this.point1 = new Point();
        this.point2 = new Point();
        this.point3 = new Point();
        calculateSideLengths();
    }

    public Triangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        calculateSideLengths();
    }

    @Override
    public String toString() {
        return "Треугольник: {" + "a" + point1 + ", b" + point2 + ", c" + point3 + '}';
    }

    private void calculateSideLengths() {
        this.ab = point1.lengthToPoint(point2);
        this.bc = point2.lengthToPoint(point3);
        this.ca = point3.lengthToPoint(point1);
    }


    public double trianglePerimeter() {
        return ab + bc + ca;
    }

    public double triangleArea() {
        double p = trianglePerimeter() / 2;
        return Math.sqrt(p * (p - ab) * (p - bc) * (p - ca));
    }

    public boolean isEqualiteral() {
        if (isEqual(ab, bc) && isEqual(bc, ca)) {
            return true;
        }
        return false;
    }

    public boolean isIsoscele() {
        if (isEqual(ab, bc) || isEqual(bc, ca) || isEqual(ca, ab)) {
            return true;
        }
        return false;
    }

    public boolean isRight() {
        if (Math.pow(ab, 2) == (Math.pow(bc, 2) + Math.pow(ca, 2)) || Math.pow(bc, 2) == (Math.pow(ca, 2) + Math.pow(ab, 2)) || Math.pow(ca,
                                                                                                                                         2) == Math.pow(
                ab, 2) + Math.pow(bc, 2)) {
            return true;
        }
        return false;
    }

    private boolean isEqual(double sideOne, double sideTwo) {

        return Double.compare(sideOne, sideTwo) == 0;

    }

    public int type() {
        if (isEqualiteral()) {
            return 1;
        } else if (isIsoscele()) {
            return 2;
        } else if (isRight()) {
            return 3;
        }
        return 4;
    }

    public void getInfo() {
        System.out.println(this.toString());
        System.out.println("Периметр: " + this.trianglePerimeter());
        System.out.println("Площадь: " + this.triangleArea());
        switch(type()){
            case 1:
                System.out.println("Тип - Равносторонний");
                break;
            case 2:
                System.out.println("Тип - Равнобедренный");
                break;
            case 3:
                System.out.println("Тип - Прямоугольный");
                break;
            case 4:
                System.out.println("Тип - Произвольный");
                break;
        }

    }
}
