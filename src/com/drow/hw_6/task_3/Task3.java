package com.drow.hw_6.task_3;

        /*Попросите пользователя ввести число размера будущего массива, но не больше размера Y (задайте сами).
        Если пользователь ввел число больше Y или отрицательное, то выбросьте собственное исключение и
        попросите пользователя ввести число заново.*/

import java.util.Scanner;

public class Task3 {
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
            System.out.println("Please enter n again");
            this.setArray();
        }
    }

    public static void main(String[] args) throws WrongSizeException {
        Task3 task3 = new Task3();
        task3.setArray();
    }
}
