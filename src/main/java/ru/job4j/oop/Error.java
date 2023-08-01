package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public void printInfo() {
        System.out.println("Состояние: " + active);
        System.out.println("Статус: " + status);
        System.out.println("Сообщение: " + message);
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public Error() {
        active = true;
        status = 25;
        message = "Нет Ошибки";
    }

    public static void main(String[] args) {
        Error error0 = new Error(true, 3, "Ошибка");
        error0.printInfo();
        Error error1 = new Error(false, 100, "Нет ошибки");
        error1.printInfo();
        Error error2 = new Error(true, 7, "Ошибка");
        error2.printInfo();
        Error error3 = new Error();
        error3.printInfo();
    }
}
