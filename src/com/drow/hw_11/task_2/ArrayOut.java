package com.drow.hw_11.task_2;

public class ArrayOut extends Thread {
    public int[] myArray = new int[21]; // через конструктор

    ArrayOut() {
        for (int i = 0; i < 21; i++) {
            myArray[i] = i;
        }
    }

    public void run() {
        // 21 - через конструктор
        for (int i = 0; i < 21; i++) {
            System.out.println(myArray[i]);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
