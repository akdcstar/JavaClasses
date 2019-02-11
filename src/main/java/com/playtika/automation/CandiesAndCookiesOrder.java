package com.playtika.automation;

import java.util.Scanner;

public class CandiesAndCookiesOrder {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите стоимость 1 кг конфет (грн.): ");
        float candiesPrice = console.nextFloat();
        System.out.print("Введите вес конфет (кг.): ");
        float candiesWeight = console.nextFloat();
        System.out.print("Введите стоимость 1 кг печенья (грн.): ");
        float cookiesPrice = console.nextFloat();
        System.out.print("Введите вес печенья (кг.): ");
        float cookiesWeight = console.nextFloat();

        float OrderPrice = calculatePrice(candiesPrice, candiesWeight, cookiesPrice, cookiesWeight);
        System.out.println();
        System.out.println("Вы выбрали: " + candiesWeight + " кг. конфет и " + cookiesWeight + " кг. печенья");
        System.out.println();
        System.out.printf("Общая стоимость вашего заказа: %s (грн.)", OrderPrice);
    }

    private static float calculatePrice(float candiesKgPrice, float candiesTotalWeight, float cookiesKgPrice, float cookiesTotalWeight) {
        return (candiesTotalWeight * candiesKgPrice) + (cookiesTotalWeight * cookiesKgPrice);

    }
}