package com.playtika.automation.courses;

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
        System.out.printf("Вы выбрали: %.1f кг. конфет и %.1f кг. печенья", candiesWeight, cookiesWeight);
        System.out.println();
        System.out.printf("Общая стоимость вашего заказа: %s (грн.)", OrderPrice);
        System.out.println("Сумма трёх покупок равна: " + calculate(OrderPrice));
    }

    private static float calculatePrice(float candiesKgPrice, float candiesTotalWeight, float cookiesKgPrice, float cookiesTotalWeight) {
        return (candiesTotalWeight * candiesKgPrice) + (cookiesTotalWeight * cookiesKgPrice);

    }
    public static float calculate(float orderPrice){
        return orderPrice * 3;
    }
}