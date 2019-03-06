package com.playtika.automation.HomeTasks.TriangleTask;


public class Triangle {
    private Point point1;
    private Point point2;
    private Point point3;

    private double ab;
    private double bc;
    private double ca;


    @Override
    public String toString() {
        return "Triangle {" + "point1 = " + point1 + ", point2 = " + point2 + ", point3 = " + point3 + '}';
    }

    public Triangle() {
        this.point1 = new Point();
        this.point2 = new Point();
        this.point3 = new Point();
        this.ab = point1.lengthToPoint(point2);
        this.bc = point2.lengthToPoint(point3);
        this.ca = point3.lengthToPoint(point1);
        System.out.println("ab = " + ab);
        System.out.println("bc = " + bc);
        System.out.println("ca = " + ca);
    }

    public Triangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.ab = point1.lengthToPoint(point2);
        this.bc = point2.lengthToPoint(point3);
        this.ca = point3.lengthToPoint(point1);
    }

    public double trianglePerimeter() {
        return ab + bc + ca;
    }

    public double triangleArea() {
        double p = trianglePerimeter() / 2;
        double triangleArea =
                Math.sqrt(p * (p - ab) * (p - bc) * (p - ca));
        return triangleArea;
    }

    public boolean isEqualiteral() {
        if (isEqual(ab, bc) && isEqual(bc, ca)) {
            System.out.println("Equaliteral (Равносторонний)");
            return true;
        }
        return false;
    }

    public boolean isIsoscele() {
        if (isEqual(ab, bc) || isEqual(bc, ca) || isEqual(ca, ab)) {
            System.out.println("Isosceles (Равнобедренный)");
            return true;
        }
        return false;
    }

    public boolean isRight() {
        if (Math.pow(ab, 2) == (Math.pow(bc, 2) + Math.pow(ca, 2)) || Math.pow(bc, 2) == (Math.pow(ca, 2) + Math.pow(ab, 2)) || Math.pow(ca,
                2) == Math.pow(
                ab, 2) + Math.pow(bc, 2)) {
            System.out.println("Right (Прямоугольный)");
            return true;
        }
        return false;
    }

    private boolean isEqual(double x, double y) {

        return Double.compare(x, y) == 0;
    }
}
