package com.drow.hw_7.task_3;

// Прочитать файл из Task_2 и вывести на экран содержимое

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Task3 {
    public static final String PATH = "src/com/drow/hw_7/task_2/myFile.txt";

    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader(PATH);
            char[] buffer = new char[10000];
            int c;
            while ((c=fileReader.read(buffer))>0){
                if(c<10000){
                    buffer = Arrays.copyOf(buffer, c);
                }
            }
            System.out.println(buffer + " ");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

 }