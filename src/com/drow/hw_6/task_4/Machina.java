package com.drow.hw_6.task_4;

import java.util.Scanner;

public class Machina {
    boolean power = false;
    boolean isOn = false;
    boolean water = false;

    private static void washing(boolean on, boolean power, boolean water){
        if(on==true && water == true){
            System.out.println("Washing, washing, tr tr tr...");
        } else
            System.out.println("Mashine is OFF");
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    public void setWater(boolean water) {
        this.water = water;
    }

    public void emergencyWaterDrain(boolean nowater){
        this.water = false;
        System.out.println("Emergency water draining");
    }

    public void initilizing(){
        Scanner in = new Scanner(System.in);
        System.out.println("Set water");
        setWater(in.nextBoolean());
        System.out.println("Set power");
        setPower(in.nextBoolean());
        System.out.println("Turn ON");
        setOn(in.nextBoolean());
        washing(this.isOn, this.power, this.water);
    }
}
