package com.drow.hw_4.task_5;

public class Panel extends Building {
    Panel(){
        floor = 5;
        material = "beton";
        porch = 1;
        year = 1970;
    }

    public void showFullInfo(){
        System.out.println("Floor " + floor + "\nmaterial " + material + "\nyear " + year + "\nporch" + porch);
    }

}
