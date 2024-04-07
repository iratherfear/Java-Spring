package com.iRatherFear.Gaming.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperControGameQualifier")
public class SuperControGame implements GamingConsole {
    @Override
    public void up() {
        System.out.println("Jump");
    }

    @Override
    public void down() {
        System.out.println("Shoot");
    }

    @Override
    public void left() {
        System.out.println("Go back");
    }

    @Override
    public void right() {
        System.out.println("Go ahead");
    }
}
