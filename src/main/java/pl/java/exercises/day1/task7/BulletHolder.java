package pl.java.exercises.day1.task7;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class BulletHolder {
    //private final Stack<String> bulletHolder = new Stack<>();
    private final Deque<String> bulletHolder = new ArrayDeque<>();
    private final int maxBulletHolderSize;

    public BulletHolder(int maxBulletHolderSize) {
        this.maxBulletHolderSize = maxBulletHolderSize;
    }

    public void loadBullet(String bullet){
        if(maxBulletHolderSize==bulletHolder.size()){
            throw  new IllegalArgumentException("Holder is full!");
        }else{
            bulletHolder.push(bullet);
        }
    }

    public boolean isLoaded(){
        return bulletHolder.size()>=1;
    }

    public String shot(){
        if(!isLoaded()){
            return "Holder is empty!!";
        }else {
            return bulletHolder.pop();
        }
    }

}
