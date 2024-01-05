package org.example;

import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Platform platform = new Platform(16, 12);
        Ball ball = new Ball(16, 11, 0, 1);
        Map map = new Map(1);
        GameRules gameRules = new GameRules(ball, platform, map);

        while(true){
            map.mapPrint(platform.getPlatformX(), platform.getPlatformY(), ball.getX(), ball.getY());

            int userInput = System.in.read();
            while (System.in.available() > 0) {
                System.in.read();
            }

            gameRules.platformMovement(userInput);
            gameRules.ballMovementMap();
            gameRules.ballMovementPlatform();
            gameRules.blockBreaking();
            gameRules.setBallMovement(ball.getFlyingDirectionX(), ball.getFlyingDirectionY());

            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }




    }
}