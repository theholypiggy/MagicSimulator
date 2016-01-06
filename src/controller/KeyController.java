package controller;

import domain.Game;

public class KeyController
{
    private Game game;
    
    public KeyController(Game game) {
        this.game = game;
    }
    
    public void keyPressed(int keyCode) {
        System.out.println("KeyController: keyPressed");
    }
    
    public void keyReleased(int keyCode) {
        System.out.println("KeyController: keyReleased");
    }
}
