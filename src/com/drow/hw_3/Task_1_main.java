package com.drow.hw_3;

public class Task_1_main {
    public static void main(String[] args) {
        Task_1 Person = new Task_1("Ivan", 33);
        System.out.println(Person.toString());

        Task_1 Person2 = new Task_1();
        System.out.println(Person2.toString());
    }
}
