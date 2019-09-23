package com.drow.hw_4.task_7;

//Написать benchmark тест, который бы измерял скорость работы String, StringBuilder и StringBuffer.

public class Task7 {

    String string = "1";
    StringBuilder stringBuilder = new StringBuilder("1");
    StringBuffer stringBuffer = new StringBuffer("1");

    long benchmark(String s){
        long time = System.currentTimeMillis();

        for(int i = 0; i < 10000; i++){
            s = s + "1";
        }
        long finish = System.currentTimeMillis();
        return time = finish - time;
    }

    long benchmark(StringBuilder sbl){
        long time = System.currentTimeMillis();

        for(int i = 0; i < 10000; i++){
            sbl = sbl.append("1");
        }
        long finish = System.currentTimeMillis();
    //    System.out.println("sbl: " + sbl);
        return time = finish - time;
    }

    long benchmark(StringBuffer sbf){
        long time = System.currentTimeMillis();

        for(int i = 0; i < 10000; i++){
            sbf = sbf.append("1");
        }
        long finish = System.currentTimeMillis();
     //   System.out.println("sbf: " + sbf);
        return time = finish - time;
    }


}
