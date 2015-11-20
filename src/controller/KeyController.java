package controller;

public class KeyController
{
    public KeyController() {
        
    }
    
    public void keyPressed(int keyCode) {
        System.out.println("KeyController: keyPressed");
    }
    
    public void keyReleased(int keyCode) {
        System.out.println("KeyController: keyReleased");
    }
}
