/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import Negocio.uso_Candidato;

/**
 *
 * @author Daniel
 */
public class Votar extends javax.swing.JFrame {
  uso_Candidato u=new uso_Candidato();

  
    /**
     * Creates new form Votar
     */
    public Votar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        CInfluencia = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        Sexo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        edad = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        candidato = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vote Bien");
        setAutoRequestFocus(false);
        setLocation(new java.awt.Point(450, 80));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/votar.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        CInfluencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Television", "Radio", "Internet" }));
        getContentPane().add(CInfluencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 174, 193, -1));

        jLabel1.setText("Tipo de Influencia en el voto:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 179, -1, -1));

        Sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino" }));
        getContentPane().add(Sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 206, 193, -1));

        jLabel3.setText("Sexo: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 211, -1, -1));

        jLabel4.setText("Edad:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 248, -1, -1));

        edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edadActionPerformed(evt);
            }
        });
        getContentPane().add(edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 244, 83, -1));

        jButton1.setText("Votar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 280, -1, -1));

        candidato.setText("Candidato 1");
        candidato.setEnabled(false);
        candidato.setOpaque(true);
        getContentPane().add(candidato, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 360, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edadActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
//         Principal p=new Principal();
//        if(candidato.getText()=="Candidato Uno"){
//            
//             if(CInfluencia.getSelectedItem().toString()=="Television"){
//            u.votar(1, p.c1);
//            p.costecamp1.setText(p.c1.getCampana()+"");
//        p.numvot1.setText(p.c1.getCvotos()+"");
//        p.pvotos1.setText(p.c1.getPvotos()+"");
//        }else if(CInfluencia.getSelectedItem().toString()=="Radio"){
//            u.votar(2, p.c1);
//            p.costecamp1.setText(p.c1.getCampana()+"");
//        p.numvot1.setText(p.c1.getCvotos()+"");
//        p.pvotos1.setText(p.c1.getPvotos()+"");
//        }else if(CInfluencia.getSelectedItem().toString()=="Internet"){
//            u.votar(3, p.c1);
//            p.costecamp1.setText(p.c1.getCampana()+"");
//        p.numvot1.setText(p.c1.getCvotos()+"");
//        p.pvotos1.setText(p.c1.getPvotos()+"");
//        }
//            
//        }
//        this.setVisible(false);
//        p.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Votar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Votar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Votar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Votar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Votar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CInfluencia;
    private javax.swing.JComboBox<String> Sexo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    public javax.swing.JLabel candidato;
    private javax.swing.JTextField edad;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}