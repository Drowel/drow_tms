package com.drow.hw_5.task_1;

//        Дано:
//        Числа от 0 до 100
//
//        Задание:
//        Посчитать сумму четных и вывести на экран
//        Посчитать сумму нечетных и вывести на экран
//        Найти общую сумму всех чисел

public class Task1 {
    public static void main(String[] args) {
        int even = 0;
        int uneven = 0;
        int sum = 0;
        boolean token = false;

        for (int i = 0; i<=100; i++){
            sum = sum + i;
            if (token == false){
                even += i;
                token = true;
            } else  {
                uneven +=i;
                token = false;
            }
        }

        System.out.println("All sum = " + sum + "\nEven sum = " + even + "\nUneven sum = " + uneven);

    }
}
