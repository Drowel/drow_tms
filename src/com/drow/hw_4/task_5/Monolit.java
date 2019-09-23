package com.drow.hw_4.task_5;

public class Monolit extends Panel{

    byte lift;
    Monolit(){
        porch = 1;
        lift = 1;
    }

    public void showFullInfo(){
        System.out.println("Floor " + floor + "\nmaterial " + material + "\nyear " + year + "\nporch" + "\nlift " + lift);
    }

}
