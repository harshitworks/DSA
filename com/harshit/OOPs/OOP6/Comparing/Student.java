package com.harshit.OOPs.OOP6.Comparing;

public class Student implements Comparable<Student> {
    int roll;
    float marks;
    String name;

    public Student(int roll, String name ) {
        this.roll = roll;
        this.name = name;
        this.marks = 0;
    }
    public Student(int roll, float marks, String name) {
        this.roll = roll;
        this.marks = marks;
        this.name = name;
    }
    @Override
    public int compareTo(Student o) {
        return (int)(this.marks- o.marks);
    }

    @Override
    public String toString() {
        return "roll=" + roll +
                ", marks=" + marks + " "+name ;
    }
}
