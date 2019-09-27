package com.drow.hw_6.task_4;

import java.util.Scanner;

public class Machina {
    boolean power = false;
    boolean isOn = false;
    boolean water = false;

    // думаю не стоит этот метод делать статичным, он относится к конкретному экземпляру стиральной машины
    private static void washing(boolean on /* isOn */, boolean power /* isPowerOn */, boolean water /* hasWater */){
        // if(on && water) {}
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

    // это все должно быть в конструкторе, а данные получи в методе main
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
