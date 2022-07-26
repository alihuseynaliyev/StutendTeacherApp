package org.alinazim.bean;

public class Teacher extends Person{
    private double salary;
    private Student student;

    public Teacher(String name, String surname, int age) {
        super(name, surname, age);
    }

    public Teacher(String name, String surname, int age, double salary, Student student) {
        super(name, surname, age);
        this.salary = salary;
        this.student = student;
    }

    public double getSalary() {
        return salary;
    }

    public Student getStudent() {
        return student;
    }
}
