package com.drow.hw_6.task_3;

        /*Попросите пользователя ввести число размера будущего массива, но не больше размера Y (задайте сами).
        Если пользователь ввел число больше Y или отрицательное, то выбросьте собственное исключение и
        попросите пользователя ввести число заново.*/

import java.util.Scanner;

// форматируй код
public class Task3 {
    // метод называется setArray() при этом ничего не принимает, лучше изменить название    
    public void setArray()throws WrongSizeException{
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array size, but not bigger than 9: ");
        int size = in.nextInt();
        try{
            if (size > 9){
                throw new WrongSizeException("Size is wrong");
            }
            System.out.println(size);
        } catch (WrongSizeException e){
            System.out.println(e.getMessage());
                
            // такие вызовы лучше уже делать за блоком catch, а в конце try вызывать return
            // я бы рекомендовал не использовать рекурсию, лучше цикл
            System.out.println("Please enter n again");
            this.setArray();
        }
    }

        // метод main() ставь первым из методов
    public static void main(String[] args) throws WrongSizeException {
        Task3 task3 = new Task3();
        task3.setArray();
    }
}
