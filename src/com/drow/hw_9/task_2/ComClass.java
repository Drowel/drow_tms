package com.drow.hw_9.task_2;

public class ComClass<T> implements ComInterface<T>{

    public T className;

    ComClass(T className){
       this.className = className;
    }


    public void showClassName() {
        System.out.println(className.getClass().getName());
    }


}
