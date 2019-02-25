package com.playtika.automation.Courses;


//Реализовать родительский класс геометрической фигуры и наследуемые от него классы.
//В каждом классе есть методы, которые считают площадь фигуры

import java.awt.*;
import java.sql.SQLOutput;

public class InheritedClasses {
    public static void main(String[] args) {


        class Figure {
            double pi = Math.PI;

        }

        class Circle extends Figure {
            public double circleArea(double radius) {
                double area = pi * (Math.pow(radius, 2));
                return area;

            }

        }

        class Square extends Figure {
            public double squareArea(double mainSide) {
                double area = Math.pow(mainSide, 2);
                return area;
            }

        }

        class Rectangle extends Figure {
            public double rectangleArea(double mainSide, double additionalSide) {
                double area = mainSide * additionalSide;
                return area;
            }
        }

        Circle C = new Circle();
        System.out.println("Площадт круга: " + C.circleArea(10));

        Square S = new Square();
        System.out.println("Площадь квадрата: " + S.squareArea(20));

        Rectangle R = new Rectangle();
        System.out.println("Площадь прямоугольника: " + R.rectangleArea(30,40));

    }
}
