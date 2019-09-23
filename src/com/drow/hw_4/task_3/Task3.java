package com.drow.hw_4.task_3;

//Есть строка “Green. red. blue. yellow”. Необходимо заменить все точки на запятые

public class Task3 {
    public static void main(String[] args) {
        String original = "Green. red. blue. yellow";
        original = original.replace(".",",");
        System.out.println(original);
    }
}
