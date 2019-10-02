package com.drow.hw_8.task_2;

public class Branch{
    int fruitNomber = 0;
    int branchNomber = 0;
    int branchLevel = 1;

    public  Branch[] branches = new Branch[branchNomber];

    Branch(int branchLvl){
        branchLevel=branchLvl;

        for(int i = branchLvl; branchLvl>0;branchLvl--){
            Branch newBranch = new Branch(branchLvl);
        }
    }

}
