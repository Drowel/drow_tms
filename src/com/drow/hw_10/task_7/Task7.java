package com.drow.hw_10.task_7;

// Есть TreeSet чисел, нужно отсортировать его в обратном порядке

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

// +
public class Task7 {
    public static void main(String[] args) {

        Comparator<Integer> comparator = new IntrgerSetComparator();
        comparator = comparator.reversed();

        Set<Integer> integerSet = new TreeSet<>(comparator);
        integerSet.add(6);
        integerSet.add(3);
        integerSet.add(1);
        integerSet.add(13);
        System.out.println(integerSet);
    }
}
