package ru.job4j.io;

import java.util.Scanner;
import java.util.Random;
public class MagicBall {
    public static void main(String[] args) {
        System.out.println("Я Великий Оракул. Что ты зочешь узнать?");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        int answer = new Random().nextInt(3);
        String str = switch (answer) {
                case 0 -> "Да";
                case 1 -> "Нет";
                default -> "Может быть";
            };
            System.out.println(str);
        }
}