package ru.job4j.cast;

public class Main {
    public static void main(String[] args) {
        Vehicle plane = new Plane();
        Vehicle bus = new Bus();
        Vehicle train = new Train();
        Vehicle[] vehicles = new Vehicle[] {plane, bus, train};
        for (Vehicle transport : vehicles) {
            transport.move();
        }
    }
}
