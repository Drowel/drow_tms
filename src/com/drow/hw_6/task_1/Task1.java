package com.drow.hw_6.task_1;

//        Создать метод, который бы делил одно число на другое, обработать исключение при делении на 0.
//        И вывести пользователю сообщение о том, что на 0 делить нельзя

// тебе нужен был блок try-catch с обработкой исключения деления на 0
public class Task1 {
    public static double divide(double dividend, double divider) throws ZeroDividerException {
        if(divider==0){
            throw new ZeroDividerException("Zero divider!");
        }
        double res = dividend / divider;
        return res;
    }

    public static void main(String[] args) {
        Task1 dividion = new Task1();
        System.out.println(dividion.divide(4,0));
    }
}
