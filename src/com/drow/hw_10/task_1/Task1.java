package com.drow.hw_10.task_1;


import java.util.ArrayList;
import java.util.Scanner;

/*      Вход на вечеринку только по списку.
        Есть список имен (коллекция). Пользователь вводит с консоли свое имя, а программа проверяет его наличие в списке,
        после чего говорит может он пройти или нет
*/
public class Task1 {
    public static void main(String[] args){
        ArrayList<Person> personList = new ArrayList<>(10);
        Person ann = new Person("Ann", 22);
        Person john = new Person("John", 24);
        Person jane = new Person("Jane", 18);
        Person paul = new Person("Paul", 20);

        personList.add(ann);
        personList.add(jane);
        personList.add(john);
        personList.add(paul);

        Scanner in = new Scanner(System.in);
        System.out.println("Who are you?");
        String consoleIn = in.next();

            for (int i = 0; i<personList.size(); i++) {
               if(personList.get(i).getName().equals(consoleIn)){
                   System.out.println("You are welcome!");
                   break;
               } if(i == personList.size()-1){
                System.out.println("You a not in list");
               }
            }
    }
}
