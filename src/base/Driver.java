package base;

import domain.Game;
import view.SimulFrame;

public class Driver
{
    public static void main(String[] args) {
        Game game = new Game(2);
        SimulFrame simulFrame = new SimulFrame(game, 1000, 800);
        
        
    }
}
