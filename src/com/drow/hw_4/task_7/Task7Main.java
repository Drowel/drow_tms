package com.drow.hw_4.task_7;

public class Task7Main {
    public static void main(String[] args) {
        Task7 benchmarkResult = new Task7();

        StringBuilder stringBuilder = new StringBuilder("1");
        StringBuffer stringBuffer = new StringBuffer("1");

        System.out.println("String benchmark: " + benchmarkResult.benchmark("1"));
        System.out.println("StringBuilder benchmark: " + benchmarkResult.benchmark(stringBuilder));
        System.out.println("StringBuffer benchmark: " + benchmarkResult.benchmark(stringBuffer));

    }
}
