package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        byte C13 = 9129 % 13;
        System.out.println(C13);
        System.out.println("Визначити ієрархію овочів. Зробити салат. Порахувати калорійність салату. Провести сортування овочів для салату на основі одного з параметрів. " +
                "\nЗнайти овоч у салаті, що відповідає заданому діапазону калорійності.");

        System.out.println();
        Vegetable vegetable1 = new Tomato("Tomato","Red", 40, 50);
        Vegetable vegetable2 = new Cucumber("Cucumber","Green", 30, 40);
        Vegetable vegetable3 = new Cabbage("Cabbage","LightGreen", 60, 30);
        SaladDressing saladDressing1 = new Mayonnaise(100);

        SaladElement[] saladElements1 = new SaladElement[]{vegetable1, vegetable2, vegetable3, saladDressing1};
        Salad salad1 = new Salad(saladElements1);

        salad1.caloriesCounter();
        salad1.colorSort();

        System.out.println();
        System.out.println("Введіть нижню границю діапазону: ");
        int bottom = sc1.nextInt();
        System.out.println("Введіть верхню границю діапазону: ");
        int top = sc2.nextInt();
        salad1.findInRange(bottom, top);
    }
}
