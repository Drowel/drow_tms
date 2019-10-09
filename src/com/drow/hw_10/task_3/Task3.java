package com.drow.hw_10.task_3;

//   Есть две коллекции, нужно удалить из первой те, которые есть во второй

import java.util.ArrayList;
import java.util.Iterator;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>(10);
        ArrayList<Integer> arrayList2 = new ArrayList<>(10);

        for(int i=0; i < 10; i++){
            arrayList1.add(i);
            arrayList2.add(i*2);
        }

      /*  System.out.println("Array 1: ");
        for(int i=0; i < 10; i++){
            System.out.println(arrayList1.get(i));
        }

        System.out.println("Array 2: ");
        for(int i=0; i < 10; i++){
            System.out.println(arrayList2.get(i));
        }*/

        Iterator<Integer> integerIterator = arrayList1.listIterator();
        while (integerIterator.hasNext()) {
            if (arrayList2.contains(integerIterator.next())) {
                integerIterator.remove();
            }
        }

        System.out.println("Array : ");
        for(int i=0; i < arrayList1.size(); i++){
            System.out.println(arrayList1.get(i));
        }
    }
}
