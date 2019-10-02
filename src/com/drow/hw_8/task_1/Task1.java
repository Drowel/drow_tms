package com.drow.hw_8.task_1;

// Есть массив чисел, необходимо отсортировать его алгоритмом "пузырек"

public class Task1 {
    public static void main(String[] args) {
        int[] myArray = new int[10];

        for (int i = 0; i < 10; i++) {
            myArray[i] = (int) (Math.random() * 100);
            System.out.println(myArray[i]);
        }

        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (myArray[j] > myArray[j + 1]) {
                    int tmp = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = tmp;
                }
            }
            System.out.println("sort" + myArray[i]);
        }
    }
}
