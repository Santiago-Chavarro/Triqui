package model;

import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;

public class RoundPanel extends JPanel{
    private double arcWidth = 50;
    private double arcHeight = 50;
    private Color borderColor = new Color (165, 40, 174);
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        RoundRectangle2D.Double roundForm = new RoundRectangle2D.Double(
        0,0,this.getWidth()-1, this.getHeight()-1, arcWidth, arcHeight);
        
        g2.setColor(this.getBackground());
        g2.fill(roundForm);
        g2.setColor(borderColor);
        g2.draw(roundForm);
        
        g2.dispose();
    }
}
