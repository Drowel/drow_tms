package com.drow.hw_10.task_2;

 /*       Создайте целочисленный ArrayList. Заполните его 100 элементами, добавляя каждый новый элемент в начало списка и выведите на экран.
        Затем удалите из него все четные элементы. И снова выведите на экран*/

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList= new ArrayList<>(100);
        for(int i=0; i < 100; i++){
            arrayList.add(i);
            //  System.out.println(arrayList.get(i));
        }

        Iterator<Integer> integerIteratorter = arrayList.listIterator();
        while (integerIteratorter.hasNext()){
            if(integerIteratorter.next() %2==0){
                integerIteratorter.remove();
            }
        }
        for(int i = 0; i<arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
    }
}
