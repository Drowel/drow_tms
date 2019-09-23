package com.drow.hw_5.task_5;

// Для данного n найти сумму 1+2+3+...+n. Например, для n=10 ответ равен 55.

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = in.nextInt();
        int res = 0;
        for (int i=0; i<=n; i++ ){

            res = res + i;
        }
        System.out.println(res);
    }
}
