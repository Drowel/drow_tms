package com.drow.hw_3;

// Task_1_main -> Task_1_Main, а лучше Task_1 а другой класс Person
public class Task_1_main {
    public static void main(String[] args) {
        Task_1 Person = new Task_1("Ivan", 33);
        System.out.println(Person.toString()); //спроси у меня про это строку на занятии, но я думаю и сам не забуду 

        Task_1 Person2 = new Task_1();
        System.out.println(Person2.toString());
    }
}
