package org.example;

public class Platform{
    int platformX;
    int platformY;

    public Platform(int x, int y){
        this.platformX = x;
        this.platformY = y;
    }


    public void movePlatformLeft(){
        this.platformX--;
    }
    public void movePlatformRight(){
        this.platformX++;
    }
    public int getPlatformX(){
        return platformX;
    }
    public int getPlatformY() {
        return platformY;
    }
}
