package com.drow.hw_9.task_1;

public class CommonClass<T> {
    public T field;

    CommonClass(T field){
        this.field = field;
    }

    public void whatTF(){
        System.out.println(field.getClass().getName());
    }

    /*public void whatTF(){
        if (this.field instanceof Integer){
            System.out.println("This is integer! " + (int)field);
        } else
            if (this.field instanceof String){
                System.out.println("This is String! " + (String) field);
            } else
            if (this.field instanceof Double){
                System.out.println("This is Double! " + (Double) field);
            } else System.out.println("I don't know what is it ¯\\_(ツ)_/¯");
    }*/
}
