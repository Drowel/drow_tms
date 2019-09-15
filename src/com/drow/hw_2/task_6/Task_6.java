package com.drow.hw_2.task_6;

import java.math.BigDecimal;

public class Task_6 {
    public static void main(String[] args){
        int a = 3;
        int b = 2;

        BigDecimal bigDecimal_a = BigDecimal.valueOf(a);
        BigDecimal bigDecimal_b = BigDecimal.valueOf(b);
        BigDecimal bigDecimal_res = bigDecimal_a.divide(bigDecimal_b);

        System.out.println(" 3 / 2 = " + bigDecimal_res);
    }
}
