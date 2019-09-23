package com.drow.hw_5.task_4;

//        Используя цикл выведите на экран
//        ......
//        .....
//        ....
//        ...
//        ..
//        .

public class Task4 {
    public static void main(String[] args) {
        /*
        я думаю можно вынести в отдельную переменную '.' и печатать ее при помощи двух циклов
        твой вариант слишком завязан на исходной строке
        */
        String string = "......";
        // 6 - в отдельную переменную
        for (int i = 0; i < 6; i++){
            String subString = string.substring(i);
                System.out.println(subString);
            }
        }
    }
