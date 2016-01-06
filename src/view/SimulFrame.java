package view;
import javax.swing.JFrame;

import domain.Game;

public class SimulFrame extends JFrame
{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private SimulPanel simulPanel;
    
    public SimulFrame(Game game, int width, int height) {  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(width, height);
        setLocation(0, 0);
        simulPanel = new SimulPanel(game, width, height);
        add(simulPanel);
        setVisible(true);
    }
    
    public void start() {
        simulPanel.start();
    }
}
