package com.playtika.automation.HomeTasks.Second;


import java.util.Scanner;

public class HomeTask2_1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите одно из чисел (3, 6, 9): ");
        int cellSize = console.nextInt();


        for (int i = 0; i < 4; i++) {
            linkCells(cellSize);
        }
        drawLine(cellSize);
    }

    public static void linkCells(int cellSize) {
        if (cellSize % 3 != 0 || cellSize > 9) {
            System.out.println("Вы ввели недопустимое число");
            return;
        } else if (cellSize == 3) {
            drawLine(cellSize);
        } else if (cellSize == 6) {
            drawLine(cellSize);
        } else {
            drawLine(cellSize);

        }
        for (int i = 0; i < (cellSize / 3); i++) {
            drawCell(cellSize);
        }

    }


    public static void drawCell(int cellSize) {
        System.out.print("*");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < cellSize; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
        }
        System.out.println();
    }

    public static void drawLine(int n) {
        int f = 5 + n * 4;
        for (int i = 0; i < f; i++) {
            System.out.print("*");
        }
        System.out.println();

    }
}

