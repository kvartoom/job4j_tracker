package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Чтобы начать движение нажмите педаль газа");
    }

    @Override
    public void passenger(int number) {
        if (number <= 1) {
            System.out.println("Дождаться пассажиров");
        } else {
            System.out.println("Начать движение");
        }
    }

    @Override
    public int fill(int fuel) {
        int price = 0;
        if (fuel == 0) {
            System.out.println("Кончилось топливо, заправьте машину");
            price = 1500;
        } else {
            System.out.println("Остаток топлива" + fuel);
        }
        return price;
    }
}
