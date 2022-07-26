package org.alinazim.bean;

public class Student extends Person{
    private String className;
    private Teacher teacher;


    public Student(String name, String surname, int age) {
        super(name, surname, age);
    }

    public Student(String name, String surname, int age, String className, Teacher teacher) {
        super(name, surname, age);
        this.className = className;
        this.teacher = teacher;
    }

    public String getClassName() {
        return className;
    }

    public Teacher getTeacher() {
        return teacher;
    }


}
