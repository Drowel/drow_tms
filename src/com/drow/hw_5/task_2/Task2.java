package com.drow.hw_5.task_2;

//        Дано:
//        Некоторый набор чисел (передать аргументами через командную строку)
//
//        Задание:
//        Найти наибольшее число и вывести его на экран
//        Найти наименьшее число и вывести его на экран

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 5 вынеси в отдельную переменную, myArray - плохое название для переменной
        int[] myArray = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number "+ i + ": ");
            myArray[i] = in.nextInt();
        }

        // слишком сложная логика. мин-макс можно найти за один проход по массиву 'myArray'
        for (int i = 4; i > 0; i--) {
            for (int j = 0; j < i ; j++){
                if (myArray[j] > myArray[j+1]){
                    int tmp = myArray[j];
                    myArray[j] = myArray[j+1];
                    myArray[j+1] = tmp;
                }
            }
        }

        System.out.println("Max number: " + myArray[4]);
        System.out.println("Min number: " + myArray[0]);
    }
}

