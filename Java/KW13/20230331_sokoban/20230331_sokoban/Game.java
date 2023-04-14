package ch.noseryoung;

import java.awt.*;
import java.util.*;

public class Game{
    private int[][] gameField;
    private ArrayList<Point> activatedButtons = new ArrayList<>();

    public Game(){
        gameField = new int[][]{
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 1, 1, 1, 1, 0, 0},
                {0, 1, 1, 1, 0, 0, 0, 1, 0, 0},
                {0, 1, 4, 2, 3, 0, 0, 1, 0, 0},
                {0, 1, 1, 1, 0, 3, 4, 1, 0, 0},
                {0, 1, 4, 1, 1, 3, 0, 1, 0, 0},
                {0, 1, 0, 1, 0, 4, 0, 1, 1, 0},
                {0, 1, 3, 0, 3, 3, 3, 4, 1, 0},
                {0, 1, 0, 0, 0, 4, 0, 0, 1, 0},
                {0, 1, 1, 1, 1, 1, 1, 1, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };
    }
    public void moveUp(){
        moveUp(findPlayerPosition());
        if (stopIfNo4()){
            System.out.println("CONGRATULATIONS YOU WON!!!!");
            System.exit(0);

        }

    }
    public void moveDown(){
        moveDown(findPlayerPosition());
        if (stopIfNo4()){
            System.out.println("CONGRATULATIONS YOU WON!!!!");
            System.exit(0);

        }
    }
    public void moveLeft(){
        moveLeft(findPlayerPosition());
        if (stopIfNo4()){
            System.out.println("CONGRATULATIONS YOU WON!!!!");
            System.exit(0);

        }
    }
    public void moveRight(){
        moveRight(findPlayerPosition());
        if (stopIfNo4()){
            System.out.println("CONGRATULATIONS YOU WON!!!!");
            System.exit(0);

        }
    }

    //sl = start location
    public boolean moveRight(Point sl){
        boolean isBox = gameField[sl.x][sl.y] == 3;
        if(gameField[sl.x][sl.y + 1] == 0){
            gameField[sl.x][sl.y + 1] = gameField[sl.x][sl.y];
            if(activatedButtons.contains(sl)){
                gameField[sl.x][sl.y] = 4;
            } else {
                gameField[sl.x][sl.y] = 0;
            }
            return true;
        }
        if(gameField[sl.x][sl.y + 1] == 1){
            return false;
        }
        if(isBox && (gameField[sl.x][sl.y + 1] == 3)){
            return false;
        }
        if(gameField[sl.x][sl.y + 1] == 3){
            if(moveRight(new Point(sl.x, sl.y + 1))){
                gameField[sl.x][sl.y + 1] = gameField[sl.x][sl.y];
                if(activatedButtons.contains(sl)){
                    gameField[sl.x][sl.y] = 4;
                } else {
                    gameField[sl.x][sl.y] = 0;
                }
                return true;
            }
        }
        if(gameField[sl.x][sl.y + 1] == 4){
            activatedButtons.add(new Point(sl.x, sl.y + 1));
            gameField[sl.x][sl.y + 1] = gameField[sl.x][sl.y];
            if(activatedButtons.contains(sl)){
                gameField[sl.x][sl.y] = 4;
            } else {
                gameField[sl.x][sl.y] = 0;
            }
            return true;
        }
        
        return false;
    }

    public boolean moveLeft(Point sl){
        boolean isBox = gameField[sl.x][sl.y] == 3;
        if(gameField[sl.x][sl.y - 1] == 0){
            gameField[sl.x][sl.y - 1] = gameField[sl.x][sl.y];
            if(activatedButtons.contains(sl)){
                gameField[sl.x][sl.y] = 4;
            } else {
                gameField[sl.x][sl.y] = 0;
            }
            return true;
        }
        if(gameField[sl.x][sl.y - 1] == 1){
            return false;
        }
        if(isBox && (gameField[sl.x][sl.y - 1] == 3)){
            return false;
        }
        if(gameField[sl.x][sl.y - 1] == 3){
            if(moveLeft(new Point(sl.x, sl.y - 1))){
                gameField[sl.x][sl.y - 1] = gameField[sl.x][sl.y];
                if(activatedButtons.contains(sl)){
                    gameField[sl.x][sl.y] = 4;
                } else {
                    gameField[sl.x][sl.y] = 0;
                }
                return true;
            }
        }
        if(gameField[sl.x][sl.y - 1] == 4){
            activatedButtons.add(new Point(sl.x, sl.y - 1));
            gameField[sl.x][sl.y - 1] = gameField[sl.x][sl.y];
            if(activatedButtons.contains(sl)){
                gameField[sl.x][sl.y] = 4;
            } else {
                gameField[sl.x][sl.y] = 0;
            }
            return true;
        }
       return false;
    }

    public boolean moveUp(Point sl){
        boolean isBox = gameField[sl.x][sl.y] == 3;
        if(gameField[sl.x - 1][sl.y] == 0){
            gameField[sl.x - 1][sl.y] = gameField[sl.x][sl.y];
            if(activatedButtons.contains(sl)){
                gameField[sl.x][sl.y] = 4;
            } else {
                gameField[sl.x][sl.y] = 0;
            }
            return true;
        }
        if(gameField[sl.x - 1][sl.y] == 1){
            return false;
        }
        if(isBox && (gameField[sl.x - 1][sl.y] == 3)){
            return false;
        }
        if(gameField[sl.x - 1][sl.y] == 3){
            if(moveUp(new Point(sl.x - 1, sl.y))){
                gameField[sl.x - 1][sl.y] = gameField[sl.x][sl.y];
                if(activatedButtons.contains(sl)){
                    gameField[sl.x][sl.y] = 4;
                } else {
                    gameField[sl.x][sl.y] = 0;
                }
                return true;
            }
        }
        if(gameField[sl.x - 1][sl.y] == 4){
            activatedButtons.add(new Point(sl.x - 1, sl.y));
            gameField[sl.x - 1][sl.y] = gameField[sl.x][sl.y];
            if(activatedButtons.contains(sl)){
                gameField[sl.x][sl.y] = 4;
            } else {
                gameField[sl.x][sl.y] = 0;
            }
            return true;
        }
        System.out.println("UP");
        return false;
    }

    public boolean moveDown(Point sl){
        boolean isBox = gameField[sl.x][sl.y] == 3;
        if(gameField[sl.x + 1][sl.y] == 0){
            gameField[sl.x + 1][sl.y] = gameField[sl.x][sl.y];
            if(activatedButtons.contains(sl)){
                gameField[sl.x][sl.y] = 4;
            } else {
                gameField[sl.x][sl.y] = 0;
            }
            return true;
        }
        if(gameField[sl.x + 1][sl.y] == 1){
            return false;
        }
        if(isBox && (gameField[sl.x + 1][sl.y] == 3)){
            return false;
        }
        if(gameField[sl.x + 1][sl.y] == 3){
            if(moveDown(new Point(sl.x + 1, sl.y))){
                gameField[sl.x + 1][sl.y] = gameField[sl.x][sl.y];
                if(activatedButtons.contains(sl)){
                    gameField[sl.x][sl.y] = 4;
                } else {
                    gameField[sl.x][sl.y] = 0;
                }
                return true;
            }
        }
        if(gameField[sl.x + 1][sl.y] == 4){
            activatedButtons.add(new Point(sl.x + 1, sl.y));
            gameField[sl.x + 1][sl.y] = gameField[sl.x][sl.y];
            if(activatedButtons.contains(sl)){
                gameField[sl.x][sl.y] = 4;
            } else {
                gameField[sl.x][sl.y] = 0;
            }
            return true;
        }
        System.out.println("UP");
        return false;
    }
    public Point findPlayerPosition() throws IllegalStateException{
        for(int i = 0; i < gameField.length; i++){
            for(int j = 0; j < gameField[0].length; j++){
                if(gameField[i][j] == 2){
                    return new Point(i, j);
                }
            }
        }
        throw new IllegalStateException("The player is nowhere to be found");
    }
    public boolean pointsContain(Point pToCheck){
        for(Point p: activatedButtons){
            if(p.x == pToCheck.x && p.y == pToCheck.y){
                return true;
            }
        }
        return false;
    }

    public void escAction(){
        System.out.println("ESC");
        Starter.StartProgramm();
    }




    public int getColCount(){
        return gameField.length;
    }

    public int getRowCount(){
        return gameField[0].length;
    }

    public int[][] getField() {
        return gameField;
    }
    private boolean stopIfNo4() {
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField[0].length; j++) {
                if (gameField[i][j] == 4 ) {
                    return false;
                }
            }

        }
        return true;
    }

}