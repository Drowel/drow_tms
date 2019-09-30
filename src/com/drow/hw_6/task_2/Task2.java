package com.drow.hw_6.task_2;

// Написать метод, который бы парсил строку в число, обработать исключение, которое может быть при неверном формате числа

public class Task2 {

    public void parser(String string) throws WrongStringParsingException{
            try{
                int result = Integer.parseInt(string);
                System.out.println(result);
                // Exception -> NumberFormatException, здесь лучше конкретизировать
            } catch (Exception e){
                throw new WrongStringParsingException("Incorrect string, can not parse");
            }
   }

    // метод main лучше делать первым в классе
    public static void main(String[] args) {
// пустая строка не нужна
        Task2 parsing = new Task2();
        parsing.parser("123h");

    }
}
