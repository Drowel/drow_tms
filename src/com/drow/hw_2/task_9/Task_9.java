package com.drow.hw_2.task_9;

public class Task_9 {
    public static void main(String[] args) {
        /*
         * Необходимо получить результат выражения 16/4, используя побитовый сдвиг вправо
         */

        int x = 16;
        int i = 4;
        i = x >> i;
        int z = x >> i >> i;
        System.out.println("16/4 = " + z);
    }
}
