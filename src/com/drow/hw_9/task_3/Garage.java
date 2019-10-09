package com.drow.hw_9.task_3;

public class Garage<T> {
    public T[] cars;

    Garage(T[] cars){
        this.cars = cars;
    }

    public void parking(T[] cars){
        if(this.cars[0].getClass().getName() == "BMW"){
            System.out.println("This is BMW");
        } else if(this.cars[0].getClass().getName() == "Lada"){
            System.out.println("This is Lada");
        } else if(this.cars[0].getClass().getName() == "Car"){
            System.out.println("This is any car");
        }
    }

/*    public String detectMark(T[] cars){
        return this.cars[0].getClass().getName();
    }*/
}
