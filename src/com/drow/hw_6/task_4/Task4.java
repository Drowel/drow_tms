package com.drow.hw_6.task_4;

        /*Есть стиральная машина, которая работает от электричества, но у нее есть небольшой блок питания, мощности
        которого хватает чтобы слить воду, если эл-во пропало. Предположим, что произошел сбой и эл-во пропало,
        тем самым спровоцировав в программе работы машинки исключение. Нужно написать программу, которая бы обязательно
        запускала программу слива воды, если произошел такой сбой*/

public class Task4 {
    public static void main(String[] args) {
        Machina machina = new Machina();
        machina.initilizing();
    }
}
