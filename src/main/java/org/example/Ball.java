package org.example;

public class Ball {
    private int x;
    private int y;
    private int flyingDirectionX;
    private int flyingDirectionY;

    public Ball(int x, int y, int flyingDirectionX, int flyingDirectionY) {
        this.x = x;
        this.y = y;
        this.flyingDirectionX = flyingDirectionX;
        this.flyingDirectionY = flyingDirectionY;
    }

    public void setFlyingDirectionX(int flyingDirection){
        flyingDirectionX = flyingDirection;
    }

    public void setFlyingDirectionY(int flyingDirection){
        flyingDirectionY = flyingDirection;
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
        if(flyingDirection == 1) { x++; }
        if(flyingDirection == -1) { x--; }
    }

    public void movementY(int flyingDirection) {
        if(flyingDirection == 1) { y++; }
        if(flyingDirection == -1) { y--; }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getFlyingDirectionX() {
        return flyingDirectionX;
    }

    public int getFlyingDirectionY() {
        return flyingDirectionY;
    }
}
