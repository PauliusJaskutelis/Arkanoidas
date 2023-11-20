package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        int platformAxisX = 16;
        int platformAxisY = 12;

        Ball ball = new Ball(16, 11, 0, 1);

        Map map = new Map(1);

        while(true){
            map.mapPrint(platformAxisX, platformAxisY, ball.getX(), ball.getY());
            ////////////////////////////PlatformMovement///////////////////////////////
            int userInput = System.in.read();

            while (System.in.available() > 0) {
                System.in.read();
            }

            if(userInput == 'a' && platformAxisX != 1){
                platformAxisX--;
            }
            if(userInput == 'd' && platformAxisX != map.getWidth()-2){
                platformAxisX++;
            }
            if(userInput =='q'){
                System.exit(0);
            }

            //////////////////////////////BallMovement//MapBoundaries/////////////////////////////////////
            if(ball.getX() == map.getWidth()-1){
                ball.invertDirectionX();
            }
            if(ball.getX() == 0){
                ball.invertDirectionX();
            }
            if(ball.getY() == map.getLength()-1){
                //ball.invertDirectionY();
                System.out.println("GG prakisai");
                System.exit(0);
            }
            if(ball.getY() == 0){
                ball.invertDirectionY();
            }

            //////////////////////////////BallMovement//PlatformBoundaries///////////////////////////////////
            if(ball.getY() == platformAxisY && ball.getX() == platformAxisX){
                ball.setFlyingDirectionX(0);
                ball.setFlyingDirectionY(-1);
            }
            if(ball.getY() == platformAxisY && ball.getX() == platformAxisX-1){
                ball.setFlyingDirectionX(-1);
                ball.setFlyingDirectionY(-1);
            }
            if(ball.getY() == platformAxisY && ball.getX() == platformAxisX+1){
                ball.setFlyingDirectionX(1);
                ball.setFlyingDirectionY(-1);
            }

            /////////////////////////////BallMovement//BlockBreaking////////////////////////////////////////
            if(map.isBlockHitBox(ball.getX(), ball.getY())){
                ball.invertDirectionY();
            }
            //////////////////////////////////////////////////////////////////////////////////////////////////



            ball.movementX(ball.getFlyingDirectionX());
            ball.movementY(ball.getFlyingDirectionY());

            if(map.isMapCleared()){
                System.out.println("!!!!!!!!!!!!!!!Winner!!!!!!!!!!!!!!!");
                System.exit(0);
            }

            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            //map.mapPrint(platformAxisX, platformAxisY, ball.getX(), ball.getY());
        }




    }
}