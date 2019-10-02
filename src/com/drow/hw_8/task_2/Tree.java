package com.drow.hw_8.task_2;

public class Tree extends Branch{

    public String type = "type";

    public int spawnFruit(){
        return (int)Math.random()*10;
    }

    public int spawnBranches(int branchLevel){

        if (branchLevel > 0) {
            spawnFruit();
            this.branchLevel--;
            return (int)Math.random()*10;
        } else return 0;
    }

    public void growth(int branchLevel){
        while (branchLevel>0){
            spawnBranches(branchLevel);
            branchLevel--;
        }
    }

   /* Tree(String treeType, int fruitNmb, int branchNmb, int branchLvl){
        branchLevel = branchLvl;
        type = treeType;
    }*/
}
