package com.drow.hw_7.task_4;

import java.io.Serializable;

public class Employee implements Serializable {
    private String name;
    private int age;
    // можно просто work
    private Work employeeWork;

    // лучше использовать конструктор с аргументами
    Employee(){
        name = "Ivan";
        age = 22;
        employeeWork = new Work();
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
