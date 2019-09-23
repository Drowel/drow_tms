package com.drow.hw_5.task_3;

// Выведите на экран n раз фразу "You are welcome!". Число n передать аргументом в программу

import java.util.Scanner;
//+
public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Сколько раз вывести строку? ");
        int nomber = in.nextInt();

        for (int i = nomber; i > 0; i--){
            System.out.println("You are welcome!");
        }
    }
}
