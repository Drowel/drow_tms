package com.drow.hw_5.task_7;

// Butterfly
// форматируй код
public class Task7 {
    public static void main(String[] args) {
        int array[] = new int[17];
        for(int i=0; i<9;i++){
            array[i]=i;
            array[9 - i] = i;
            String str = "";

            // TODO: комментарий хорошо подходит для таких целей
            // тут цикл, который преобразует массив в строку

            System.out.println(str);  //  осталось вывести как строку
        }

    }
}
