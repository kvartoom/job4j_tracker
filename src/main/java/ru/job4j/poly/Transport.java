package ru.job4j.poly;

public interface Transport {
    void drive();

    void passenger(int number);

    int fill(int fuel);
}