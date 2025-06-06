package Preguntas;

import Menu.Juego;
import java.awt.Color;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ET20 - Alumno
 */
public class Ingles5 extends javax.swing.JFrame {

    /**
     * Creates new form Ingles5
     */
    public Ingles5() {
        initComponents();
        setLocationRelativeTo(null); /* Centra la ventana que se abre */
        setResizable(false); /* Le prohibe al usuario editar el tamaño*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Ingles5_Panel = new javax.swing.JPanel();
        Ingles5_Label1 = new javax.swing.JLabel();
        Ingles5_Label2 = new javax.swing.JLabel();
        Ingles5_Boton1 = new javax.swing.JButton();
        Ingles5_Boton2 = new javax.swing.JButton();
        Ingles5_Boton3 = new javax.swing.JButton();
        Ingles5_Boton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Ingles5_Panel.setBackground(new java.awt.Color(0, 0, 0));

        Ingles5_Label1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        Ingles5_Label1.setForeground(new java.awt.Color(255, 215, 0));
        Ingles5_Label1.setText("Ingles");

        Ingles5_Label2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        Ingles5_Label2.setForeground(new java.awt.Color(255, 215, 0));
        Ingles5_Label2.setText("¿Cómo se dice enero en inglés?");

        Ingles5_Boton1.setBackground(new java.awt.Color(0, 0, 0));
        Ingles5_Boton1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        Ingles5_Boton1.setForeground(new java.awt.Color(255, 215, 0));
        Ingles5_Boton1.setText("January");
        Ingles5_Boton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ingles5_Boton1MouseClicked(evt);
            }
        });
        Ingles5_Boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ingles5_Boton1ActionPerformed(evt);
            }
        });

        Ingles5_Boton2.setBackground(new java.awt.Color(0, 0, 0));
        Ingles5_Boton2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        Ingles5_Boton2.setForeground(new java.awt.Color(255, 215, 0));
        Ingles5_Boton2.setText("February");
        Ingles5_Boton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ingles5_Boton2MouseClicked(evt);
            }
        });

        Ingles5_Boton3.setBackground(new java.awt.Color(0, 0, 0));
        Ingles5_Boton3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        Ingles5_Boton3.setForeground(new java.awt.Color(255, 215, 0));
        Ingles5_Boton3.setText("October");
        Ingles5_Boton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ingles5_Boton3MouseClicked(evt);
            }
        });

        Ingles5_Boton4.setBackground(new java.awt.Color(0, 0, 0));
        Ingles5_Boton4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        Ingles5_Boton4.setForeground(new java.awt.Color(255, 215, 0));
        Ingles5_Boton4.setText("April");
        Ingles5_Boton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ingles5_Boton4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Ingles5_PanelLayout = new javax.swing.GroupLayout(Ingles5_Panel);
        Ingles5_Panel.setLayout(Ingles5_PanelLayout);
        Ingles5_PanelLayout.setHorizontalGroup(
            Ingles5_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Ingles5_PanelLayout.createSequentialGroup()
                .addGroup(Ingles5_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Ingles5_PanelLayout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(Ingles5_Label1))
                    .addGroup(Ingles5_PanelLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(Ingles5_Label2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Ingles5_PanelLayout.createSequentialGroup()
                .addGap(0, 58, Short.MAX_VALUE)
                .addGroup(Ingles5_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Ingles5_Boton4, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ingles5_Boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ingles5_Boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ingles5_Boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );
        Ingles5_PanelLayout.setVerticalGroup(
            Ingles5_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Ingles5_PanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(Ingles5_Label1)
                .addGap(53, 53, 53)
                .addComponent(Ingles5_Label2)
                .addGap(111, 111, 111)
                .addComponent(Ingles5_Boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(Ingles5_Boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(Ingles5_Boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(Ingles5_Boton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(247, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Ingles5_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Ingles5_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Ingles5_Boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ingles5_Boton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ingles5_Boton1ActionPerformed

    private void Ingles5_Boton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ingles5_Boton1MouseClicked
        Juego newFrame= new Juego(); 
        newFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Ingles5_Boton1MouseClicked

    private void Ingles5_Boton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ingles5_Boton2MouseClicked
        Ingles5_Boton1.setBackground(Color.GREEN);
        Ingles5_Boton1.setForeground(Color.WHITE);
        Ingles5_Boton2.setBackground(Color.RED);
        Ingles5_Boton2.setForeground(Color.WHITE);
        Ingles5_Boton3.setBackground(Color.RED);
        Ingles5_Boton3.setForeground(Color.WHITE);
        Ingles5_Boton4.setBackground(Color.RED);
        Ingles5_Boton4.setForeground(Color.WHITE);
    }//GEN-LAST:event_Ingles5_Boton2MouseClicked

    private void Ingles5_Boton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ingles5_Boton3MouseClicked
        Ingles5_Boton1.setBackground(Color.GREEN);
        Ingles5_Boton1.setForeground(Color.WHITE);
        Ingles5_Boton2.setBackground(Color.RED);
        Ingles5_Boton2.setForeground(Color.WHITE);
        Ingles5_Boton3.setBackground(Color.RED);
        Ingles5_Boton3.setForeground(Color.WHITE);
        Ingles5_Boton4.setBackground(Color.RED);
        Ingles5_Boton4.setForeground(Color.WHITE);
    }//GEN-LAST:event_Ingles5_Boton3MouseClicked

    private void Ingles5_Boton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ingles5_Boton4MouseClicked
        Ingles5_Boton1.setBackground(Color.GREEN);
        Ingles5_Boton1.setForeground(Color.WHITE);
        Ingles5_Boton2.setBackground(Color.RED);
        Ingles5_Boton2.setForeground(Color.WHITE);
        Ingles5_Boton3.setBackground(Color.RED);
        Ingles5_Boton3.setForeground(Color.WHITE);
        Ingles5_Boton4.setBackground(Color.RED);
        Ingles5_Boton4.setForeground(Color.WHITE);
    }//GEN-LAST:event_Ingles5_Boton4MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ingles5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingles5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingles5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingles5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingles5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ingles5_Boton1;
    private javax.swing.JButton Ingles5_Boton2;
    private javax.swing.JButton Ingles5_Boton3;
    private javax.swing.JButton Ingles5_Boton4;
    private javax.swing.JLabel Ingles5_Label1;
    private javax.swing.JLabel Ingles5_Label2;
    private javax.swing.JPanel Ingles5_Panel;
    // End of variables declaration//GEN-END:variables
}
