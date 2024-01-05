package org.example;

public class GameRules {

    Ball ball;
    Platform platform;
    Map map;

    public GameRules(Ball ball, Platform platform, Map map){
        this.ball = ball;
        this.platform = platform;
        this.map = map;
    }



    public void platformMovement(int userInput){
        if(userInput == 'a') {
            if (map.isAvailable(platform.getPlatformX(), platform.getPlatformY()))
                platform.movePlatformLeft();
        }
        else if(userInput == 'd') {
            if (map.isAvailable(platform.getPlatformX(), platform.getPlatformY()))
                platform.movePlatformRight();
        }
        else if(userInput =='q'){
            System.exit(0);
        }
    }

    public void ballMovementMap(){
        int mapEnd = 0;
        if(ball.getX() == map.getWidth()-1){
            ball.invertDirectionX();
        }
        else if(ball.getX() == mapEnd){
            ball.invertDirectionX();
        }
        else if(ball.getY() == map.getLength()-1){
            System.out.println("GG prakisai");
            System.exit(0);
        }
        else if(ball.getY() == mapEnd){
            ball.invertDirectionY();
        }
    }

    public void ballMovementPlatform(){
        int up = -1;
        int left = -1;
        int still = 0;
        int right = 1;

        if(ball.getY() == platform.getPlatformY()){
            if(ball.getX() == platform.getPlatformX()) {
                ball.setFlyingDirection(still, up);
            }
            else if(ball.getX() == platform.getPlatformX()-1) {
                ball.setFlyingDirection(left, up);
            }
            else if(ball.getX() == platform.getPlatformX()+1) {
                ball.setFlyingDirection(right, up);
            }
        }
    }

    public void blockBreaking(){
        if(map.isBlockHitBox(ball.getX(), ball.getY())){
            map.clearBlock(ball.getX(), ball.getY());
            if(map.isMapCleared()){
                System.out.println("!!!!!!!!!!!!!!!Winner!!!!!!!!!!!!!!!");
                System.exit(0);
            }else {
                ball.invertDirectionY();
            }
        }
    }

    public void setBallMovement(int getDirectionX, int getDirectionY){
        ball.movementX(getDirectionX);
        ball.movementY(getDirectionY);
    }
}
