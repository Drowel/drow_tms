package com.drow.hw_10.task_7;

import java.util.Comparator;

// название класса с опечаткой, Set в названии лишнее
public class IntrgerSetComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 - o2;
    }
}
