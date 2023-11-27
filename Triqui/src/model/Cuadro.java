package model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Cuadro extends JPanel{
    private int ancho;
    private int altura;
    private Color color;
    private TypePicture typePicture;
    private boolean drawn;
    
    public Cuadro(int ancho, int altura, Color color){
        this.ancho = ancho;
        this.altura = altura;
        this.color = color;
        drawn = false;
        init();
    }
    
    private void init(){
        setSize(ancho, altura);
        setBackground(color);
    }

    @Override
    protected void paintComponent(Graphics gg) {
        super.paintComponent(gg);
        Graphics2D g = (Graphics2D)gg;
        
        ImageIcon imagen  = new ImageIcon();
        if(typePicture == TypePicture.CIRCULO)
            imagen = new ImageIcon(getClass().getResource(Ruta.CIRCULO));
        else if(typePicture == TypePicture.EQUIS)
            imagen = new ImageIcon(getClass().getResource(Ruta.EQUIS));
        
        g.drawImage(imagen.getImage(), 0,0,this.getWidth(), this.getHeight(), null);
    }

    public boolean isDrawn() {
        return drawn;
    }

    public void setDrawn(boolean drawn) {
        this.drawn = drawn;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public TypePicture getTypePicture() {
        return typePicture;
    }

    public void setTypePicture(TypePicture typePicture) {
        this.typePicture = typePicture;
    }
    
    
    
}
