package com.drow.hw_11.task_3;

// можно было через List или просто увеличивать счетчик, но главное чтобы был синхронизированным
public class Store {
    private int toys;

    Store(){
        toys=0; // через конструктор
    }

    public int getToys() {
        return toys;
    }

    public void setToys(int toys) {
        this.toys = toys;
    }
}
