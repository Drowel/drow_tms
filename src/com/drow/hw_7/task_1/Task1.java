package com.drow.hw_7.task_1;

// Есть массив чисел, заполнить его можете любыми цифрами. Нужно записать его в файл

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;


// форматируй код
public class Task1 {
    public static final String PATH = "src/com/drow/hw_7/task_1/myFile.txt";
    public static void main(String[] args) {
        // myArray -> numbers
        int[] myArray = new int[10];
        for (int i=0; i<9; i++){
            myArray[i] = i;
        }

        try (FileOutputStream fos = new FileOutputStream(PATH)){
            for (int i=0; i<9;i++) {
                fos.write(myArray[i]);
            }
            fos.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
