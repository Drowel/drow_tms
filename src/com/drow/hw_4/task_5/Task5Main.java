package com.drow.hw_4.task_5;

//        Есть несколько типов домов: панельный, хрущевка, сталинка, одноподьездная монолитная высотка
//        У всех этих домов есть какие-либо общие свойста (методы), например, кол-во подьездов.
//        Придумайте иерархию классов для этих типов домов.

public class Task5Main {
    public static void main(String[] args) {
        Panel floor9Panel = new Panel();
        Monolit floor12Monolit = new Monolit();
        Stalinka floor3Stalin  = new Stalinka();
        Khrushevka floor5Khrush = new Khrushevka();

        floor9Panel.showFullInfo();
        floor12Monolit.showFullInfo();
        floor3Stalin.showFullInfo();
        floor5Khrush.showFullInfo();
    }
}
