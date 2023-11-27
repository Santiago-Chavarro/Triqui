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
    private int i;
    private int j;
    
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
        else if(typePicture == TypePicture.LINE1)
            imagen = new ImageIcon(getClass().getResource(Ruta.LINE1));
        else if(typePicture == TypePicture.LINE2)
            imagen = new ImageIcon(getClass().getResource(Ruta.LINE2));
        else if(typePicture == TypePicture.LINE3)
            imagen = new ImageIcon(getClass().getResource(Ruta.LINE3));
        else if(typePicture == TypePicture.LINE4)
            imagen = new ImageIcon(getClass().getResource(Ruta.LINE4));
        else if(typePicture == TypePicture.LINE5)
            imagen = new ImageIcon(getClass().getResource(Ruta.LINE5));
        else if(typePicture == TypePicture.LINE6)
            imagen = new ImageIcon(getClass().getResource(Ruta.LINE6));
        else if(typePicture == TypePicture.LINE7)
            imagen = new ImageIcon(getClass().getResource(Ruta.LINE7));
        else if(typePicture == TypePicture.LINE8)
            imagen = new ImageIcon(getClass().getResource(Ruta.LINE8));
        
        g.drawImage(imagen.getImage(), 0,0,this.getWidth(), this.getHeight(), null);
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
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
