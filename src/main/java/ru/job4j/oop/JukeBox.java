package ru.job4j.oop;

import java.sql.SQLOutput;

public class JukeBox {
    public void music(int position) {
        switch (position) {
            case 1 -> System.out.println("Пусть бегут неуклюже");
            case 2 -> System.out.println("Спокойной ночи");
            default -> System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        JukeBox lyrics = new JukeBox();
        lyrics.music(1);
        lyrics.music(2);
        lyrics.music(5);
    }
}
