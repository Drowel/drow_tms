package com.drow.hw_6.task_2;

// Написать метод, который бы парсил строку в число, обработать исключение, которое может быть при неверном формате числа

public class Task2 {

    public void parser(String string) throws WrongStringParsingException{
            try{
                int result = Integer.parseInt(string);
                System.out.println(result);
            } catch (Exception e){
                throw new WrongStringParsingException("Incorrect string, can not parse");
            }
   }

    public static void main(String[] args) {

        Task2 parsing = new Task2();
        parsing.parser("123h");

    }
}
