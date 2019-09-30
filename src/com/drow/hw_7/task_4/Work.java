package com.drow.hw_7.task_4;

import java.io.Serializable;

public class Work implements Serializable {
    public String companyName;
    public int stage;

        Work(){
            companyName = "Default company";
            stage = 13;
        }
}
