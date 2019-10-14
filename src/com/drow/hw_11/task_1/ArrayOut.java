package com.drow.hw_11.task_1;

public class ArrayOut extends Thread {
    public int[] myArray = new int[11];

    ArrayOut() {
        for (int i = 0; i < 11; i++) {
            myArray[i] = i;
        }
    }

    public void run() {
        for (int i = 0; i < 11; i++) {
            System.out.println(myArray[i]);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
