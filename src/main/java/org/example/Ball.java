package org.example;

public class Ball {
    private int positionX;
    private int positionY;
    private int flyingDirectionX;
    private int flyingDirectionY;

    public Ball(int x, int y, int flyingDirectionX, int flyingDirectionY) {
        this.positionX = x;
        this.positionY = y;
        this.flyingDirectionX = flyingDirectionX;
        this.flyingDirectionY = flyingDirectionY;
    }

    public void setFlyingDirection(int flyingDirectionX, int flyingDirectionY){
        this.flyingDirectionX = flyingDirectionX;
        this.flyingDirectionY = flyingDirectionY;
    }

    public void invertDirectionX(){
        if(flyingDirectionX == 1) { flyingDirectionX = -1; }
        else if(flyingDirectionX == -1) { flyingDirectionX = 1; }
    }

    public void invertDirectionY(){
        if(flyingDirectionY == 1) { flyingDirectionY = -1; }
        else if(flyingDirectionY == -1) { flyingDirectionY = 1; }
    }

    public void movementX(int flyingDirection) {
        if(flyingDirection == 1) { positionX++; }
        if(flyingDirection == -1) { positionX--; }
    }

    public void movementY(int flyingDirection) {
        if(flyingDirection == 1) { positionY++; }
        if(flyingDirection == -1) { positionY--; }
    }

    public int getX() {
        return positionX;
    }

    public int getY() {
        return positionY;
    }

    public int getFlyingDirectionX() {
        return flyingDirectionX;
    }

    public int getFlyingDirectionY() {
        return flyingDirectionY;
    }
}
