package controller;

import domain.Game;

public class MouseController
{
    private Game game;
    private int  x;
    private int  y;
    
    public MouseController(Game game) {
        this.game = game;
    }
    
    public void leftMousePressed(int x, int y) {
        System.out.println("MouseController: leftMousePressed");
    }
    
    public void rightMousePressed(int x, int y) {
        System.out.println("MouseController: rightMousePressed");
    }
    
    public void leftMouseReleased(int x, int y) {
        System.out.println("MouseController: leftMouseReleased");
    }
    
    public void rightMouseReleased(int x, int y) {
        System.out.println("MouseController: rightMouseReleased");
    }
    
    public void mouseMoved(int x, int y) {
        System.out.println("MouseController: mouseMoved");
    }
    
    public void mouseDragged(int x, int y) {
        System.out.println("MouseController: mouseDragged");
    }
}
