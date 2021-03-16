package com.company;
import com.company.model.Fruit;
import java.awt.Color;
//    Подсчитать и вывести сумму чека по 4 позициям:
//    Зеленое яблоко 186г / 25.90
//    Красное яблоко 146г / 26.90
//    Банан 186г / 32.80
//    Лимон 246г / 34.90

public class Main {
    public static void main(String[] args) {
        Fruit greenApple = new Fruit(Fruit.Type.APPLE, Color.GREEN, 186, 25.90);
        Fruit redApple = new Fruit(Fruit.Type.APPLE, Color.RED, 146, 26.90);
        Fruit banana = new Fruit(Fruit.Type.BANANA, Color.YELLOW, 186, 32.80);
        Fruit lemon = new Fruit(Fruit.Type.LEMON, Color.YELLOW, 246, 34.90);

        System.out.printf("Green apple price: %.2f\n", greenApple.calculatePrice());
        System.out.printf("Red apple price: %.2f\n", redApple.calculatePrice());
        System.out.printf("Banana price: %.2f\n", banana.calculatePrice());
        System.out.printf("Lemon price: %.2f\n", lemon.calculatePrice());
    }
}