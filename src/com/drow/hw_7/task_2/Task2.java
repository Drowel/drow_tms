package com.drow.hw_7.task_2;

// Есть некоторый текст, его нужно записать в файл. Можно использовать одно и тоже предложение, запишите его 1млн раз

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

// форматируй код
public class Task2 {
    public static final String PATH = "src/com/drow/hw_7/task_2/myFile.txt";
    public static void main(String[] args) {
        // myString -> text
        String myString = "Hello there";
        try(FileWriter fos = new FileWriter(PATH)) {
            for (int i=0; i<100;i++) {              // поставил 100 что бы быстрее грузолось для таска3
                fos.write(myString);
            }

         // про флаш забыл
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
// пустая строка не нужна
    }
}
