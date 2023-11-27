package test;

import java.awt.Color;
import java.util.HashSet;
import java.util.Set;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import model.Player;
import model.Ruta;
import model.TypePicture;

public class Resultado extends javax.swing.JFrame {
      
    public Resultado(TypePicture winner) {
        init();
        if(winner == TypePicture.EQUIS){
            imgLeft.setRuta(Ruta.JUGADOREQUIS);
            imgRight.setRuta(Ruta.EQUIS);
            lblname.setText(Triqui.nameEquis.getText());
        }else if(winner == TypePicture.CIRCULO){
            imgLeft.setRuta(Ruta.JUGADORCIRCULO);
            imgRight.setRuta(Ruta.CIRCULO);
            lblname.setText(Triqui.nameCirculo.getText());
        }else if(winner == TypePicture.TIE){
            imgLeft.setRuta(Ruta.JUGADOREQUIS);
            imgRight.setRuta(Ruta.JUGADORCIRCULO);
            lblname.setText("Empate");
        }
    }
    public void init(){
        setUndecorated(true);
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        BackPanel.requestFocus();
        BackPanel.setOpaque(false);
        setBackground(new Color (0,0,0,0));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackPanel = new model.RoundPanel();
        lblClose = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        imgLeft = new model.Picture();
        imgRight = new model.Picture();
        lblname = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BackPanel.setBackground(new java.awt.Color(14, 19, 49));
        BackPanel.setPreferredSize(new java.awt.Dimension(416, 315));

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

        jLabel1.setFont(new java.awt.Font("Cooper Black", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(230, 251, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("¡Victoria!");

        imgLeft.setText("picture1");
        imgLeft.setMaximumSize(new java.awt.Dimension(59, 60));
        imgLeft.setMinimumSize(new java.awt.Dimension(59, 60));
        imgLeft.setPreferredSize(new java.awt.Dimension(59, 60));
        imgLeft.setRuta("/resources/JugadorEquis.png");

        imgRight.setText("picture1");
        imgRight.setRuta("/resources/Equis.png");

        lblname.setFont(new java.awt.Font("Cooper Black", 0, 28)); // NOI18N
        lblname.setForeground(new java.awt.Color(241, 227, 252));
        lblname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblname.setText("Nombre");
        lblname.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout BackPanelLayout = new javax.swing.GroupLayout(BackPanel);
        BackPanel.setLayout(BackPanelLayout);
        BackPanelLayout.setHorizontalGroup(
            BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackPanelLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblClose)
                .addGap(15, 15, 15))
            .addGroup(BackPanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(imgLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lblname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imgRight, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        BackPanelLayout.setVerticalGroup(
            BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblClose, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(imgRight, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblname, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(167, 167, 167))
                    .addGroup(BackPanelLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(imgLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BackPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseExited
        lblClose.setForeground(new Color(240, 192, 255));
    }//GEN-LAST:event_lblCloseMouseExited

    private void lblCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseEntered
        lblClose.setForeground(Color.RED);
    }//GEN-LAST:event_lblCloseMouseEntered

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCloseMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackPanel;
    private model.Picture imgLeft;
    private model.Picture imgRight;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblname;
    // End of variables declaration//GEN-END:variables
}
