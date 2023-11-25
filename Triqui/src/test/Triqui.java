package test;

import java.awt.Color;
import model.Player;
import model.Tablero;

public class Triqui extends javax.swing.JFrame {
    
    private Player player1;
    private Player player2;
    private Tablero tablero;
    
    public Triqui(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        init();
    }
    
    public void init(){
        setUndecorated(true);
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        
        lblNombreJ1.setText(player1.getName());
        lblNombreJ2.setText(player2.getName());
        
        tablero = new Tablero();
        tablero.setPlayer1(player1);
        tablero.setPlayer2(player2);
        tablero.setAlturaCI(100);
        tablero.setAnchoCI(100);
        tablero.setMargen(5);
        tablero.setColorCI(new Color(14,19,43));
        tablero.setColorTablero(new Color(229, 180, 255));
        tablero.setLocation(40, 150);
        tablero.crearTablero();
        tablero.setVisible(true);
        panelFondo.add(tablero);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        lblClose = new javax.swing.JLabel();
        picture1 = new model.Picture();
        picture2 = new model.Picture();
        lblNombreJ2 = new javax.swing.JLabel();
        lblNombreJ1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblPuntajeJ1 = new javax.swing.JLabel();
        lblPuntajeJ2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelFondo.setBackground(new java.awt.Color(14, 19, 43));
        panelFondo.setPreferredSize(new java.awt.Dimension(400, 500));
        panelFondo.setLayout(null);

        lblClose.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        lblClose.setForeground(new java.awt.Color(240, 192, 255));
        lblClose.setText("x");
        lblClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCloseMouseExited(evt);
            }
        });
        panelFondo.add(lblClose);
        lblClose.setBounds(370, 0, 16, 30);

        picture1.setText("picture1");
        picture1.setRuta("/resources/JugadorCirculo.png");
        panelFondo.add(picture1);
        picture1.setBounds(275, 50, 50, 50);

        picture2.setText("picture1");
        picture2.setRuta("/resources/JugadorEquis.png");
        panelFondo.add(picture2);
        picture2.setBounds(75, 50, 50, 50);

        lblNombreJ2.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        lblNombreJ2.setForeground(new java.awt.Color(255, 200, 255));
        lblNombreJ2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreJ2.setText("Name");
        panelFondo.add(lblNombreJ2);
        lblNombreJ2.setBounds(245, 100, 110, 30);

        lblNombreJ1.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        lblNombreJ1.setForeground(new java.awt.Color(180, 232, 255));
        lblNombreJ1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreJ1.setText("Name");
        panelFondo.add(lblNombreJ1);
        lblNombreJ1.setBounds(45, 100, 110, 30);

        jLabel1.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("-");
        panelFondo.add(jLabel1);
        jLabel1.setBounds(190, 50, 20, 60);

        lblPuntajeJ1.setFont(new java.awt.Font("Cooper Black", 0, 36)); // NOI18N
        lblPuntajeJ1.setForeground(new java.awt.Color(255, 255, 255));
        lblPuntajeJ1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPuntajeJ1.setText("0");
        panelFondo.add(lblPuntajeJ1);
        lblPuntajeJ1.setBounds(130, 50, 60, 60);

        lblPuntajeJ2.setFont(new java.awt.Font("Cooper Black", 0, 36)); // NOI18N
        lblPuntajeJ2.setForeground(new java.awt.Color(255, 255, 255));
        lblPuntajeJ2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPuntajeJ2.setText("0");
        panelFondo.add(lblPuntajeJ2);
        lblPuntajeJ2.setBounds(210, 50, 60, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCloseMouseClicked

    private void lblCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseEntered
        lblClose.setForeground(Color.RED);
    }//GEN-LAST:event_lblCloseMouseEntered

    private void lblCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseExited
        lblClose.setForeground(new Color(240, 192, 255));
    }//GEN-LAST:event_lblCloseMouseExited

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

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblNombreJ1;
    private javax.swing.JLabel lblNombreJ2;
    private javax.swing.JLabel lblPuntajeJ1;
    private javax.swing.JLabel lblPuntajeJ2;
    private javax.swing.JPanel panelFondo;
    private model.Picture picture1;
    private model.Picture picture2;
    // End of variables declaration//GEN-END:variables
}
