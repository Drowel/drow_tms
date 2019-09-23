package com.drow.hw_5.task_6;

// Найти произведение 5*6*7…*n

import java.util.Scanner;

// форматируй код
public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any n over 5: ");
        int n = in.nextInt();
        if(n<5) {
            n = 6;
            System.out.println("Error, n=6 now");
        }
        int res = 5;
        for (int i=6; i<=n; i++ ){
// пустая строка не нужна
            res = res*i;
        }
        System.out.println(res);
    }
}

