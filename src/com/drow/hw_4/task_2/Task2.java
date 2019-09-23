package com.drow.hw_4.task_2;

// Есть слово “alucard”. Нужно изменить порядок букв на обратный.

public class Task2 {
    public static void main(String[] args) {
        String original = "alucard";
        int lenth = original.length();
        String revert = "";
        for (int i = lenth - 1; i>=0; i-- ){
            revert = revert + String.valueOf(original.charAt(i));
        }
        System.out.println(revert);

    }
}
