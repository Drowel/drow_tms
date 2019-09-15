package com.drow.hw_3;

// Person, Таск_1 - в котором будет мейн метод
public class Task_1 {
    /*
    Создайте класс, у которого будут поля имя и возраст (на англ), обязательно сделайте их приватными.
У класса должен быть конструктор, который принимает в виде аргументов эти два поля и конструктор без аргументов,
который присваивает значения по умолчанию для имени и возраста. Добавьте методы, при помощи которых можно
получить имя и возраст. Переопределите метод toString() так, чтобы он выводил на экран имя и возраст в читаемом формате

В отдельном классе в методе main() создать экземпляр этого класса и вывести на экран используя метод toString()

     */
    private String name;
    private Integer age;

    Task_1(){
        // this("Dimon", 18)
        this.name = "Dimon"; // через вызов другого конструктора лучше
        this.age = 18;
    }

    Task_1(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String toString() {     
        Integer age = getAge(); // это можно убрать
        String name = getName(); // это можно убрать
        String result = "Name is: " + this.name +" Age is: " + this.age;
        return result;
    }
// лишняя пустая строка
// лишняя пустая строка
}
