package com.drow.hw_10.task_4;

//   Есть две коллекции, нужно оставить в первой только те, которые есть во второй

import java.util.ArrayList;
import java.util.Iterator;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>(10);
        ArrayList<Integer> arrayList2 = new ArrayList<>(10);

        for(int i=0; i < 10; i++){
            arrayList1.add(i);
            arrayList2.add(i*2);
        }

        Iterator<Integer> integerIterator = arrayList1.listIterator();
        while (integerIterator.hasNext()) {
            if (arrayList2.contains(integerIterator.next())==false) {
                integerIterator.remove();
            }
        }

        System.out.println("Array : ");
        for(int i=0; i < arrayList1.size(); i++){
            System.out.println(arrayList1.get(i));
        }
    }
}
