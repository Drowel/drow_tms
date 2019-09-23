package com.drow.hw_4.task_5;

public class Stalinka extends Building {
    Stalinka(){
        floor = 3;
        material = "beton";
        porch = 3;
        year = 1937;
    }

    public void showFullInfo(){
        System.out.println("Floor " + floor + "\nmaterial " + material + "\nyear " + year + "\nporch" + porch);
    }

}
