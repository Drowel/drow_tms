package com.drow.hw_11.task_2;

/*        Создать класс, который в цикле выводит на экран числа от 0-20 и в каждой итерации цикла засыпает на 1 секунду,
        запустить его экземпляр и запустить в отдельном потоке. Поток main должен дождаться окончания работы дочернего потока
        и затем вывести на экран сообщение о том, что главный поток завершен*/

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        Thread myTread = new ArrayOut();
        myTread.run();
        myTread.join();
        System.out.println("output complete");
    }
}
