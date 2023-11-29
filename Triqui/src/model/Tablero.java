package model;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JPanel;
import test.Resultado;
import test.Triqui;

public class Tablero extends JPanel{
    private int anchoCI;
    private int alturaCI;
    private int margen;
    private Color colorTablero;
    private Color colorCI;
    private TypePicture actualPlayer;
    private TypePicture gameTurn;
    
    private Player player1;
    private Player player2;
    
    private ArrayList<Cuadro> cuadros;
    private Cuadro cuadroFrontal;
    
    public Tablero(){
        init();
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
        gameTurn = TypePicture.EQUIS;
    }
    
    public void crearTablero(){
        setLayout(null);
        setSize(anchoCI * 3 + margen * 4, alturaCI * 3 + margen * 4);
        setBackground(colorTablero);
        cuadroFrontal = new Cuadro(this.getWidth(),this.getHeight(),Color.RED);
        cuadroFrontal.setLocation(0,0);
        cuadroFrontal.setOpaque(false);
        cuadroFrontal.setEnabled(false);
        add(cuadroFrontal);
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
                cuadro.setI(i);
                cuadro.setJ(j);
                add(cuadro);
                cuadros.add(cuadro);
                crearEventosCuadro(cuadro);
                x += anchoCI + margen;
            }
            y += alturaCI + margen;
        }
    }
    
    public void crearEventosCuadro(Cuadro cuadro){
        actualPlayer = TypePicture.EQUIS;
        MouseListener evento = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }
            @Override
            public void mousePressed(MouseEvent e) {
                if(cuadro.isDrawn()) return;
                
                TypePicture tPictureResult = null;
                if(actualPlayer == TypePicture.EQUIS){
                    cuadro.setTypePicture(TypePicture.EQUIS);
                    player1.getTablero()[cuadro.getI()][cuadro.getJ()] = 1;
                    tPictureResult = player1.tresEnRaya(player2);
                    result (tPictureResult, TypePicture.EQUIS);
                    actualPlayer = TypePicture.CIRCULO;
                    changeStyle(TypePicture.CIRCULO);
                    
                }else if(actualPlayer == TypePicture.CIRCULO){
                    cuadro.setTypePicture(TypePicture.CIRCULO);
                    player2.getTablero()[cuadro.getI()][cuadro.getJ()] = 1;
                    tPictureResult = player2.tresEnRaya(player1);
                    result (tPictureResult, TypePicture.CIRCULO);
                    actualPlayer = TypePicture.EQUIS;
                    changeStyle(TypePicture.EQUIS);
                }
                cuadro.setDrawn(true);
                repaint();
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
    public void changeStyle(TypePicture actualPlayer){
        if (actualPlayer == TypePicture.CIRCULO){
            Triqui.imgEquis.setRuta(Ruta.JUGADORAUXILIAR);
            Triqui.imgEquis.repaint();
            Triqui.nameEquis.setForeground(new Color(240,240,240,100));
            
            Triqui.imgCirculo.setRuta(Ruta.JUGADORCIRCULO);
            Triqui.imgCirculo.repaint();
            Triqui.nameCirculo.setForeground(new Color(255,200,255));
        }else if(actualPlayer == TypePicture.EQUIS){
            Triqui.imgCirculo.setRuta(Ruta.JUGADORAUXILIAR);
            Triqui.imgCirculo.repaint();
            Triqui.nameCirculo.setForeground(new Color(240,240,240,100));
            
            Triqui.imgEquis.setRuta(Ruta.JUGADOREQUIS);
            Triqui.imgEquis.repaint();
            Triqui.nameEquis.setForeground(new Color(180,232,255));
        }
    }
    public void result (TypePicture tPictureResult, TypePicture winner){
        
        if(tPictureResult == TypePicture.TIE){
            System.out.println("Empate");
            Resultado resultado = new Resultado(TypePicture.TIE, this);
            resultado.setVisible(true);
        }else if (tPictureResult != null){
            System.out.println("Hay un ganador");
            Ruta.cambiarRutas(winner);
            cuadroFrontal.setTypePicture(tPictureResult);
            desactivarCuadros(true);
            Resultado resultado = new Resultado(winner, this);
            resultado.setVisible(true);
        }
    }
    public void restart(TypePicture winner1){
        desactivarCuadros(false);
        deletePictures();
        cuadroFrontal.setTypePicture(null);
        if (winner1 == TypePicture.EQUIS){
            int newScore = Integer.parseInt(Triqui.scoreEquis.getText())+1;
            Triqui.scoreEquis.setText(String.valueOf(newScore));
        }else if (winner1 == TypePicture.CIRCULO){
            int newScore = Integer.parseInt(Triqui.scoreCirculo.getText())+1;
            Triqui.scoreCirculo.setText(String.valueOf(newScore));
        }
        if(gameTurn == TypePicture.EQUIS){
            actualPlayer = TypePicture.CIRCULO;
            gameTurn = TypePicture.CIRCULO;
        }else if(gameTurn == TypePicture.CIRCULO){
            actualPlayer = TypePicture.EQUIS;
            gameTurn = TypePicture.EQUIS;
        }
        changeStyle(actualPlayer);
        player1.limpiar();
        player2.limpiar();
        repaint();
    }
    public void desactivarCuadros(boolean valor){
        for(Cuadro cuadro : cuadros){
            cuadro.setDrawn(valor);
            
        }
    }
    public void deletePictures(){
        for(Cuadro cuadro : cuadros){
            cuadro.setTypePicture(null);
        }
    }
    public TypePicture getActualPlayer() {
        return actualPlayer;
    }

    public void setActualPlayer(TypePicture ActualPlayer) {
        this.actualPlayer = ActualPlayer;
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
