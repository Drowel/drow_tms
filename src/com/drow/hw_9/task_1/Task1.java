package com.drow.hw_9.task_1;

    /*      Создать обобщенный (generic) класс, который в конструкторе принимает аргумент неизвестного типа. Создайте  в классе метод,
            который бы выводил что это за тип на экран (получить имя класса для переменной getClass().getName())    */

public class Task1 {
    public static void main(String[] args) {
        CommonClass someSHT = new CommonClass(true);
        someSHT.whatTF();
    }
}
