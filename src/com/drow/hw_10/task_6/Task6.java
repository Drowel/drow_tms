package com.drow.hw_10.task_6;

/*        Есть ArrayList и LinkedList на 100К одинаковых элементов.
        Нужно написать бенчмарк, который бы показал скорость удаления из НАЧАЛА у двух этих листов
        Удалить нужно все элементы*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Task6 {
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
            arrayList.remove(0);
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);

        start = System.currentTimeMillis();
        Iterator<Integer> listIterator = linkedList.listIterator();
        while (listIterator.hasNext()){
            linkedList.removeFirst();
        }
        end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
