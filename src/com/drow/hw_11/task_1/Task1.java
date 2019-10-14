package com.drow.hw_11.task_1;

//   Создать класс, который в цикле выводит на экран числа от 0-10, запустить его в отдельном потоке

public class Task1 {
    public static void main(String[] args) {
        Thread myTread = new ArrayOut();
        myTread.run();
    }
}
