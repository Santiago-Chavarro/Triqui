package model;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JPanel;

public class Tablero extends JPanel{
    private int anchoCI;
    private int alturaCI;
    private int margen;
    private Color colorTablero;
    private Color colorCI;
    
    private Player player1;
    private Player player2;
    
    private ArrayList<Cuadro> cuadros;
    
    
    public Tablero(){
    
    }
    
    private void init(){
        anchoCI = 80;
        alturaCI = 80;
        colorCI = Color.BLUE;
        colorTablero = Color.RED;
        margen = 6;
        player1 = new Player();
        player2 = new Player();
        cuadros = new ArrayList<>();
    }
    
    public void crearTablero(){
        setLayout(null);
        setSize(anchoCI * 3 + margen * 4, alturaCI * 3 + margen * 4);
        setBackground(colorTablero);
        crearCI();
    }
    
    private void crearCI(){
        if(cuadros == null){
            cuadros = new ArrayList<>();
        }
        int x = margen;
        int y = margen;
        
        for (int i = 0; i < 3; i++){
            x = margen;
            for (int j = 0; j < 3; j++){
                Cuadro cuadro = new Cuadro(anchoCI, alturaCI, colorCI);
                cuadro.setCursor(new Cursor(Cursor.HAND_CURSOR));
                cuadro.setLocation(x, y);
                add(cuadro);
                cuadros.add(cuadro);
                crearEventosCuadro(cuadro);
                x += anchoCI + margen;
            }
            y += alturaCI + margen;
        }
    }
    
    public void crearEventosCuadro(Cuadro cuadro){
        MouseListener evento = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
                cuadro.setTypePicture(TypePicture.CIRCULO);
                cuadro.repaint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        };
        
        cuadro.addMouseListener(evento);
        
    }

    public ArrayList<Cuadro> getCuadros() {
        return cuadros;
    }

    public void setCuadros(ArrayList<Cuadro> cuadros) {
        this.cuadros = cuadros;
    }
    
    
    
    public int getAnchoCI() {
        return anchoCI;
    }

    public void setAnchoCI(int anchoCI) {
        this.anchoCI = anchoCI;
    }

    public int getAlturaCI() {
        return alturaCI;
    }

    public void setAlturaCI(int alturaCI) {
        this.alturaCI = alturaCI;
    }

    public int getMargen() {
        return margen;
    }

    public void setMargen(int margen) {
        this.margen = margen;
    }

    public Color getColorTablero() {
        return colorTablero;
    }

    public void setColorTablero(Color colorTablero) {
        this.colorTablero = colorTablero;
    }

    public Color getColorCI() {
        return colorCI;
    }

    public void setColorCI(Color colorCI) {
        this.colorCI = colorCI;
    }

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }
   
    
}
