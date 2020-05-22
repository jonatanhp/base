/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package igu.princ;

import data.Conn;
import igu.clientes.ClientesPanel;
import igu.ventas.VentasPanel;
import igu.compras.ComprasPanel;
import java.awt.Color;
import java.awt.Font;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Asullom
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        
        initComponents();
        Conn.connectSQLite();
        this.setIconImage(new ImageIcon(getClass().getResource("/igu/imgs/img/market.png")).getImage());

        this.setExtendedState(MAXIMIZED_BOTH);
        this.setLocationRelativeTo(this);
        this.comprasButton.setSelected(true);
        if (new Validate().comprobar()) {
            new CambiaPanel(pnlPrincipal, new ComprasPanel());
        } else {
            new CambiaPanel(pnlPrincipal, new PinPanel());
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        comprasButton = new igu.buttons.ASIconButton();
        ventasButton = new igu.buttons.ASIconButton();
        clientesButton = new igu.buttons.ASIconButton();
        ventaButton2 = new igu.buttons.ASIconButton();
        pnlCentro = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnlPrincipal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel2.setBackground(new java.awt.Color(239, 238, 244));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setPreferredSize(new java.awt.Dimension(893, 67));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        comprasButton.setForeground(new java.awt.Color(128, 128, 131));
        comprasButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/igu/imgs/img/market.png"))); // NOI18N
        comprasButton.setText("COMPRAS");
        comprasButton.setColorHover(new java.awt.Color(204, 204, 204));
        comprasButton.setColorNormal(new java.awt.Color(204, 204, 204));
        comprasButton.setColorPressed(new java.awt.Color(204, 204, 204));
        comprasButton.setColorTextHover(new java.awt.Color(128, 128, 131));
        comprasButton.setColorTextNormal(new java.awt.Color(128, 128, 131));
        comprasButton.setColorTextPressed(new java.awt.Color(128, 128, 131));
        comprasButton.setFocusable(false);
        comprasButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        comprasButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        comprasButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                comprasButtonMousePressed(evt);
            }
        });
        comprasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprasButtonActionPerformed(evt);
            }
        });

        ventasButton.setBackground(new java.awt.Color(239, 238, 244));
        ventasButton.setForeground(new java.awt.Color(128, 128, 131));
        ventasButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/igu/imgs/img/collection.png"))); // NOI18N
        ventasButton.setText("VENTAS");
        ventasButton.setColorHover(new java.awt.Color(204, 204, 204));
        ventasButton.setColorNormal(new java.awt.Color(239, 238, 244));
        ventasButton.setColorPressed(new java.awt.Color(204, 204, 204));
        ventasButton.setColorTextHover(new java.awt.Color(128, 128, 131));
        ventasButton.setColorTextNormal(new java.awt.Color(128, 128, 131));
        ventasButton.setColorTextPressed(new java.awt.Color(128, 128, 131));
        ventasButton.setFocusable(false);
        ventasButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ventasButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ventasButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ventasButtonMousePressed(evt);
            }
        });
        ventasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventasButtonActionPerformed(evt);
            }
        });

        clientesButton.setBackground(new java.awt.Color(239, 238, 244));
        clientesButton.setForeground(new java.awt.Color(128, 128, 131));
        clientesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/igu/imgs/img/collection.png"))); // NOI18N
        clientesButton.setText("CLIENTES");
        clientesButton.setColorHover(new java.awt.Color(204, 204, 204));
        clientesButton.setColorNormal(new java.awt.Color(239, 238, 244));
        clientesButton.setColorPressed(new java.awt.Color(204, 204, 204));
        clientesButton.setColorTextHover(new java.awt.Color(128, 128, 131));
        clientesButton.setColorTextNormal(new java.awt.Color(128, 128, 131));
        clientesButton.setColorTextPressed(new java.awt.Color(128, 128, 131));
        clientesButton.setFocusable(false);
        clientesButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        clientesButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        clientesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                clientesButtonMousePressed(evt);
            }
        });
        clientesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientesButtonActionPerformed(evt);
            }
        });

        ventaButton2.setBackground(new java.awt.Color(239, 238, 244));
        ventaButton2.setForeground(new java.awt.Color(128, 128, 131));
        ventaButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/igu/imgs/img/collection.png"))); // NOI18N
        ventaButton2.setText("VENTAS");
        ventaButton2.setColorHover(new java.awt.Color(204, 204, 204));
        ventaButton2.setColorNormal(new java.awt.Color(239, 238, 244));
        ventaButton2.setColorPressed(new java.awt.Color(204, 204, 204));
        ventaButton2.setColorTextHover(new java.awt.Color(128, 128, 131));
        ventaButton2.setColorTextNormal(new java.awt.Color(128, 128, 131));
        ventaButton2.setColorTextPressed(new java.awt.Color(128, 128, 131));
        ventaButton2.setFocusable(false);
        ventaButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ventaButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ventaButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ventaButton2MousePressed(evt);
            }
        });
        ventaButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventaButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(comprasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ventasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clientesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ventaButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(640, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ventaButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ventasButton, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(clientesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comprasButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.ipady = 16;
        gridBagConstraints.weightx = 0.2;
        jPanel1.add(jPanel2, gridBagConstraints);

        pnlCentro.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBorder(null);

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlPrincipal.setLayout(new javax.swing.BoxLayout(pnlPrincipal, javax.swing.BoxLayout.LINE_AXIS));
        jScrollPane1.setViewportView(pnlPrincipal);

        javax.swing.GroupLayout pnlCentroLayout = new javax.swing.GroupLayout(pnlCentro);
        pnlCentro.setLayout(pnlCentroLayout);
        pnlCentroLayout.setHorizontalGroup(
            pnlCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1089, Short.MAX_VALUE)
        );
        pnlCentroLayout.setVerticalGroup(
            pnlCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.4;
        gridBagConstraints.weighty = 0.1;
        jPanel1.add(pnlCentro, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1089, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed

    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged

    }//GEN-LAST:event_jPanel2MouseDragged

    private void ventasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventasButtonActionPerformed
        new CambiaPanel(pnlPrincipal, new VentasPanel());
        if (this.ventasButton.isSelected()) {
            this.ventasButton.setColorNormal(new Color(204, 204, 204));
            this.ventasButton.setColorHover(new Color(204, 204, 204));
            this.ventasButton.setColorPressed(new Color(204, 204, 204));

            this.comprasButton.setColorNormal(new Color(239, 238, 244));
            this.comprasButton.setColorHover(new Color(204, 204, 204));
            this.comprasButton.setColorPressed(new Color(204, 204, 204));
            
            this.clientesButton.setColorNormal(new Color(239, 238, 244));
            this.clientesButton.setColorHover(new Color(204, 204, 204));
            this.clientesButton.setColorPressed(new Color(204, 204, 204));

        } else {
            this.ventasButton.setColorNormal(new Color(239, 238, 244));
            this.ventasButton.setColorHover(new Color(204, 204, 204));
            this.ventasButton.setColorPressed(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_ventasButtonActionPerformed

    private void comprasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprasButtonActionPerformed
        new CambiaPanel(pnlPrincipal, new ComprasPanel());
        if(new Validate().comprobar()){
            
        }else{
            new CambiaPanel(pnlPrincipal, new PinPanel());
        }
        
        if (this.comprasButton.isSelected()) {
            this.comprasButton.setColorNormal(new Color(204, 204, 204));
            this.comprasButton.setColorHover(new Color(204, 204, 204));
            this.comprasButton.setColorPressed(new Color(204, 204, 204));

            this.ventasButton.setColorNormal(new Color(239, 238, 244));
            this.ventasButton.setColorHover(new Color(204, 204, 204));
            this.ventasButton.setColorPressed(new Color(204, 204, 204));
            
            this.clientesButton.setColorNormal(new Color(239, 238, 244));
            this.clientesButton.setColorHover(new Color(204, 204, 204));
            this.clientesButton.setColorPressed(new Color(204, 204, 204));

        } else {
            this.comprasButton.setColorNormal(new Color(239, 238, 244));
            this.comprasButton.setColorHover(new Color(204, 204, 204));
            this.comprasButton.setColorPressed(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_comprasButtonActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_formMousePressed

    private void comprasButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comprasButtonMousePressed
        // TODO add your handling code here:
        this.comprasButton.setSelected(true);
        this.ventasButton.setSelected(false);
        this.clientesButton.setSelected(false);
    }//GEN-LAST:event_comprasButtonMousePressed

    private void ventasButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ventasButtonMousePressed
        // TODO add your handling code here:
        this.ventasButton.setSelected(true);
        this.comprasButton.setSelected(false);
        this.clientesButton.setSelected(false);
    }//GEN-LAST:event_ventasButtonMousePressed

    private void clientesButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientesButtonMousePressed
        // TODO add your handling code here:
        this.clientesButton.setSelected(true);
        this.ventasButton.setSelected(false);
        this.comprasButton.setSelected(false);
    }//GEN-LAST:event_clientesButtonMousePressed

    private void clientesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientesButtonActionPerformed
        new CambiaPanel(pnlPrincipal, new ClientesPanel());
        if(new Validate().comprobar()){
            
        }else{
            new CambiaPanel(pnlPrincipal, new PinPanel());
        }
        
        if (this.clientesButton.isSelected()) {
            this.clientesButton.setColorNormal(new Color(204, 204, 204));
            this.clientesButton.setColorHover(new Color(204, 204, 204));
            this.clientesButton.setColorPressed(new Color(204, 204, 204));
            
            this.comprasButton.setColorNormal(new Color(239, 238, 244));
            this.comprasButton.setColorHover(new Color(204, 204, 204));
            this.comprasButton.setColorPressed(new Color(204, 204, 204));

            this.ventasButton.setColorNormal(new Color(239, 238, 244));
            this.ventasButton.setColorHover(new Color(204, 204, 204));
            this.ventasButton.setColorPressed(new Color(204, 204, 204));

        } else {
            this.clientesButton.setColorNormal(new Color(239, 238, 244));
            this.clientesButton.setColorHover(new Color(204, 204, 204));
            this.clientesButton.setColorPressed(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_clientesButtonActionPerformed

    private void ventaButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ventaButton2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_ventaButton2MousePressed

    private void ventaButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventaButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ventaButton2ActionPerformed

    /**
     * @param args the command line arguments
     
    public static void main(String args[]) {
        //Create and display the form 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private igu.buttons.ASIconButton clientesButton;
    private igu.buttons.ASIconButton comprasButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlCentro;
    private javax.swing.JPanel pnlPrincipal;
    private igu.buttons.ASIconButton ventaButton2;
    private igu.buttons.ASIconButton ventasButton;
    // End of variables declaration//GEN-END:variables
}
