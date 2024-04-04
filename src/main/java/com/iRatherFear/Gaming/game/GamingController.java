package com.iRatherFear.Gaming.game;

public class GamingController {
    private GamingConsole game;
    public GamingController(GamingConsole game) {
        this.game = game;
    }

    public void run() {
        this.game.up();
        this.game.down();
        this.game.left();
        this.game.right();
    }
}
