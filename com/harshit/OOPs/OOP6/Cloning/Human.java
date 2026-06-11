package com.harshit.OOPs.OOP6.Cloning;

public class Human implements Cloneable{
    int age;
    String name;
    int[] arr ;
    public Human(int age, String name) {
        this.age = age ;
        this.name = name;
        this.arr = new int[]{1,3,5};
    }

    public Human(Human other) {
        this.age = other.age;
        this.name = other.name;
        this.arr = other.arr;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        // this will creates shallow copy:
        Human copy = (Human) super.clone();

        // this is deep copy
        copy.arr = new int[this.arr.length];
        for (int i = 0; i < this.arr.length; i++) {
            copy.arr[i] = this.arr[i];
        }
        return copy;
    }
}
