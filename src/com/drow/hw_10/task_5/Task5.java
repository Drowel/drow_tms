package com.drow.hw_10.task_5;

/*
        Есть ArrayList и LinkedList на 100К одинаковых элементов.
        Нужно написать бенчмарк, который бы показал скорость удаления из СЕРЕДИНЫ у двух этих листов
        Удалить нужно все элементы
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

// форматируй код
public class Task5 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(100000);

        for(int i=0; i < 100000; i++){
            arrayList.add(i);
        }

        LinkedList<Integer> linkedList = new LinkedList<>();
        for(int i=0; i < 100000; i++){
            linkedList.add(i);
        }
        long start = System.currentTimeMillis();
        Iterator<Integer> integerIterator = arrayList.listIterator();
        while (integerIterator.hasNext()){
            int center = (int)arrayList.size()/2; // <- это целочисленное деление, результат итак будет целым
            arrayList.remove(center);
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);

        start = System.currentTimeMillis();
        Iterator<Integer> listIterator = linkedList.listIterator();
        while (listIterator.hasNext()){
            int center = (int)arrayList.size()/2; // <- это целочисленное деление, результат итак будет целым
            linkedList.remove(center);
        }
        end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
