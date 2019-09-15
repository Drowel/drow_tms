package com.drow.hw_2.task_7;

import java.math.BigDecimal;

public class Task_7 {
    public static void  main(String[] args){
        double a = 5.4f;
        double b = 2.2f;
     //   BigDecimal res = BigDecimal.valueOf(a).divide(BigDecimal.valueOf(b));
        //  BigDecimal res  throws exception, when b has any fractional value

        System.out.println("a / b = " + (a/b));

    }
}
