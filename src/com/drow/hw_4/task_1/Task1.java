package com.drow.hw_4.task_1;

//Игра в слова. Есть строка “engineering”. Нужно выделить подстроку так, чтобы получилось два слова “engine” и “ring”.

public class Task1 {
    public static void main(String[] args) {
        String original = "engineering";
        String substring1 = original.substring(0,6);
        String substring2 = original.substring(7,11);
        System.out.println("From " + original + " we got: " + substring1 + " and " + substring2);

    }
}
