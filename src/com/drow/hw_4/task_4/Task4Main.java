package com.drow.hw_4.task_4;

public class Task4Main {
    public static void main(String[] args) {
        String text = "While major gameplay components are already in place and functioning,\n" +
                "players help is needed to add some of the smaller features and content.\n" +
                "Of course polishing the overall experience is important at the same time.\n" +
                "Game has been extensively tested in closed group, but it is always important to hear fresh suggestions\n" +
                "from larger crowd that come from various gaming backgrounds.\n" +
                "Plan is to make the game as good as possible but without compromising the core idea. ";

        Task4 task4 = new Task4();
        System.out.println(task4.count("alert", text));

    }
}
//TODO: долелать тк нихрена не работает ((