package com.drow.hw_7.task_4;

        /*Создайте класс Employee, Work. У Work есть атрибуты название и минимальный стаж.
        У Employee есть имя, возраст и работа (work).
        Запишите объект Employee в файл, затем восстановите его обратно в объект.*/


import java.io.*;

public class Task4 {
    public static final String PATH = "src/com/drow/hw_7/task_4/Employee.dat";

    public Task4() throws IOException {
    }

    public static void main(String[] args) throws IOException {
        try (ObjectOutputStream oop = new ObjectOutputStream(new FileOutputStream(PATH));){
            Employee employee = new Employee();
            oop.writeObject(employee);
        } catch (Exception e){

    }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(PATH))) {
            try {
                Employee employee = (Employee) ois.readObject();
                System.out.println("Employee " + employee.getName() + " " + employee.getAge());
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

        }

    }
}
