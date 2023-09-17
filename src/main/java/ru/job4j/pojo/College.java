package ru.job4j.pojo;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setNameStudent("Dmitrii Meshcheriakov");
        student.setGroup("RSK-18");
        student.setDateAdmission("01.09.2018");
        System.out.println(student.getNameStudent());
        System.out.println(student.getGroup());
        System.out.println(student.getDateAdmission());
    }
}
