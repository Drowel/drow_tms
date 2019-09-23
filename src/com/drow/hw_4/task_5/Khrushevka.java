package com.drow.hw_4.task_5;

public class Khrushevka extends Stalinka {
    Khrushevka(){
        floor = 5;
        material = "beton";
        year = 1960;
        }

    public void showFullInfo(){
        System.out.println("Floor " + floor + "\nmaterial " + material + "\nyear " + year + "\nporch" + porch);
    }

}
