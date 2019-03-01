package com.playtika.automation.HomeTasks.Fourth;


public class Triangle {
    protected Point point1;
    protected Point point2;
    protected Point point3;

    @Override
    public String toString() {
        return "Triangle{" +
                "point1=" + point1 +
                ", point2=" + point2 +
                ", point3=" + point3 +
                '}';
    }

    public Triangle(){
        this.point1 = new Point();
        this.point2 = new Point();
        this.point3 = new Point();
    }

    public Triangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public double trianglePerimeter() {
        double ab = point1.lengthToPoint(point2);
        double bc = point2.lengthToPoint(point3);
        double ca = point3.lengthToPoint(point1);
        return ab + bc + ca;
    }

    public double triangleArea() {
        double ab = point1.lengthToPoint(point2);
        double bc = point2.lengthToPoint(point3);
        double ca = point3.lengthToPoint(point1);

        double p = trianglePerimeter() / 2;
        double triangleArea =
                Math.sqrt(p * (p - ab) * (p - bc) * (p - ca));
        return triangleArea;
    }

    public String triangleType() {
        double ab = point1.lengthToPoint(point2);
        double bc = point2.lengthToPoint(point3);
        double ca = point3.lengthToPoint(point1);

        if (ab == bc && bc == ca) {
            return "Equaliteral (Равносторонний)";
        } else if (ab == bc || bc == ca || ca == ab) {
            return "Isosceles (Равнобедренный)";

        } else if (Math.pow(ab, 2) == (Math.pow(bc, 2) + Math.pow(ca, 2)) || Math.pow(bc, 2) == (Math.pow(ca, 2) + Math.pow(ab, 2)) || Math.pow(ca,
                                                                                                                                                2) == Math.pow(
                ab, 2) + Math.pow(bc, 2)) {
            return "Right (Прямоугольный)";

        } else {
            return "Scalene (Разносторонний)";

        }
    }
}
