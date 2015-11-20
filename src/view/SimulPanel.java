package view;
import javax.swing.JPanel;

import controller.KeyController;
import controller.MouseController;
import domain.Game;

import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.KeyEvent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;

@SuppressWarnings("unused")
public class SimulPanel extends JPanel implements MouseListener, MouseMotionListener, KeyListener
{
    private static final long serialVersionUID = 3332707163650954981L;
    private MouseController mc;
    private KeyController   kc;
    private int             width;
    private int             height;
    
    public SimulPanel(Game game, int width, int height) {
        mc = new MouseController(game);
        kc = new KeyController();
        this.width = width;
        this.height = height;
        
        setFocusable(true);
        addKeyListener(this);
        addMouseListener(this);
        addMouseMotionListener(this);
        setVisible(true);
    }
    
    //----PAINT METHODS----
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        
        drawBackground(g2);
    }
    
    public void drawBackground(Graphics2D g2) {
        g2.setColor(Color.white);
        g2.fillRect(0, 0, width, height);
    }
    //----END PAINT METHODS----
    
    //----MOUSE METHODS----
    public void mousePressed(MouseEvent e) {
        int button = e.getButton();
        
        switch(button) {
            case MouseEvent.BUTTON1:
                mc.leftMousePressed(e.getX(), e.getY());
                break;
            case MouseEvent.BUTTON3:
                mc.rightMousePressed(e.getX(), e.getY());
                break;
        }
    }
    
    public void mouseReleased(MouseEvent e) {
        int button = e.getButton();
        
        switch(button) {
            case MouseEvent.BUTTON1:
                mc.leftMouseReleased(e.getX(), e.getY());
                break;
            case MouseEvent.BUTTON3:
                mc.rightMouseReleased(e.getX(), e.getY());
                break;
        }
    }
    
    public void mouseClicked(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    //----END MOUSE METHODS----
    
    //----KEY METHODS----
    public void keyPressed(KeyEvent e) {
        kc.keyPressed(e.getKeyCode());
    }
    
    public void keyReleased(KeyEvent e) {
        kc.keyReleased(e.getKeyCode());
    }
    
    public void keyTyped(KeyEvent e) {}
    //----END KEY METHODS----
    
    //----MOUSE MOTION METHODS----
    public void mouseMoved(MouseEvent e) {
        mc.mouseMoved(e.getX(), e.getY());
    }
    
    public void mouseDragged(MouseEvent e) {
        mc.mouseDragged(e.getX(), e.getY());
    }
    //----END MOUSE MOTION METHODS----
}
