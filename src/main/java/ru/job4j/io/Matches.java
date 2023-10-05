package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3:");
            int matches = Integer.parseInt(input.nextLine());
            if (matches >= 1 && matches <= 3) {
                if (count >= matches) {
                    count -= matches;
                } else if (count < matches) {
                    System.out.println("Введённое вами число больше, чем оставшееся количество спичек. Попробуйте заново");
                } else {
                    System.out.println("Можно ввести числа только от 1 до 3. Пожалуйста, введите повторно.");
                }
                if (count == 0) {
                    break;
                }
                turn = !turn;
            }
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}
