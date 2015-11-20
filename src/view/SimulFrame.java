package view;
import javax.swing.JFrame;

import domain.Game;

public class SimulFrame extends JFrame
{
    private SimulPanel simulPanel;
    private int width;
    private int height;
    
    public SimulFrame(Game game, int width, int height) {
        this.width = width;
        this.height = height;
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(width, height);
        setLocation(0, 0);
        simulPanel = new SimulPanel(game, width, height);
        add(simulPanel);
        setVisible(true);
    }
}
