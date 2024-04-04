package com.iRatherFear.Gaming.game;

public class MarioGame implements GamingConsole {

    public void up() {
        System.out.println("Jump");
    }

    public void down() {
        System.out.println("Go into hold");
    }

    public void left() {
        System.out.println("Go back");
    }

    public void right() {
        System.out.println("Go ahead");
    }
}
