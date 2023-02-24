package ch.noseryoung.blj;

import java.awt.*;

public class CSPoint extends Point {
    private int IDPoint = 0;
    static int IDCounter = 0;
    private CSPoint postition;

    public CSPoint(int x , int y){
        this.x = x;
        this.y = y;
        this.IDPoint = IDCounter;
        IDCounter++;
    }
    public CSPoint(){

    }
    @Override
    public String toString(){
        return "[id = "+IDPoint +", x = " + x + ", y = " + y + "]";
    }
}
