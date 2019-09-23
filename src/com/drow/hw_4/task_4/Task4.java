package com.drow.hw_4.task_4;

//        Есть текст:
//        “While major gameplay components are already in place and functioning,
//        players help is needed to add some of the smaller features and content.
//        Of course polishing the overall experience is important at the same time.
//        Game has been extensively tested in closed group, but it is always important to hear fresh suggestions
//        from larger crowd that come from various gaming backgrounds.
//        Plan is to make the game as good as possible but without compromising the core idea.”
//
//        Нужно узнать содержит ли текст слова “alert”, “add”, “good”, “plan” и какое кол-во.

public class Task4 {
    public int count(String word, String text){
        int counter = 0;

        int index1 = text.indexOf(word);
        if (index1>0){
            do {
            counter++;

            String textBuffer = text.substring(index1+word.length());
            index1 = textBuffer.indexOf(word);
            }
            while (index1>0);
        }

        return counter;
    }


}
