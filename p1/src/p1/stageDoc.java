/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package p1;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author szaoi
 */
public class stageDoc extends javax.swing.JFrame {
    public Integer CNE;

    /**
     * Creates new form stageDoc
     */
    public stageDoc(Integer CNE) {
        initComponents();
        this.CNE = CNE;
        System.out.println(CNE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TextNom_entre = new javax.swing.JTextField();
        TextSecteur = new javax.swing.JTextField();
        TextEmail_entre = new javax.swing.JTextField();
        TextTele_entre = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        TextEncadr_entre = new javax.swing.JTextField();
        TextEmail_encadr = new javax.swing.JTextField();
        TextEncadr_ensa = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        Textdebut_stage = new javax.swing.JTextField();
        Textfin_stage = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jLabel12.setText("jLabel12");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Information de Stage :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 200, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Secteur de l'entreprise");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 15, 149, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Raison sociale de l'entreprise");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 16, 192, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Email de l'entrprise");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 133, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Téléphone de l'entreprise");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 167, -1));

        TextNom_entre.setCaretColor(new java.awt.Color(0, 51, 255));
        TextNom_entre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextNom_entreActionPerformed(evt);
            }
        });
        jPanel2.add(TextNom_entre, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 47, 182, -1));

        TextSecteur.setCaretColor(new java.awt.Color(25, 118, 211));
        jPanel2.add(TextSecteur, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 47, 149, -1));

        TextEmail_entre.setCaretColor(new java.awt.Color(25, 118, 211));
        jPanel2.add(TextEmail_entre, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, 133, -1));

        TextTele_entre.setCaretColor(new java.awt.Color(25, 118, 211));
        TextTele_entre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextTele_entreActionPerformed(evt);
            }
        });
        jPanel2.add(TextTele_entre, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, 167, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 940, 100));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Encadrant de l'entreprise");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 0, 174, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Email de l'encadarnt de l'entreprise");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 0, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Encadrant de l'ENSA");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, -1, -1));
        jPanel3.add(TextEncadr_entre, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 26, 187, -1));

        TextEmail_encadr.setCaretColor(new java.awt.Color(25, 118, 211));
        jPanel3.add(TextEmail_encadr, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 26, 219, -1));

        TextEncadr_ensa.setCaretColor(new java.awt.Color(25, 118, 211));
        jPanel3.add(TextEncadr_ensa, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, 206, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 940, 100));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Sujet de stage");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 93, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Stage au :");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 70, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Stage du : ");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 70, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setCaretColor(new java.awt.Color(25, 118, 211));
        jScrollPane1.setViewportView(jTextArea1);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        Textdebut_stage.setCaretColor(new java.awt.Color(25, 118, 211));
        jPanel4.add(Textdebut_stage, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 170, -1));

        Textfin_stage.setCaretColor(new java.awt.Color(25, 118, 211));
        jPanel4.add(Textfin_stage, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, 170, -1));

        jLabel15.setForeground(new java.awt.Color(153, 153, 153));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel15.setText("JJ/MM/AAAA");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, -1, 20));

        jLabel16.setForeground(new java.awt.Color(153, 153, 153));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel16.setText("JJ/MM/AAAA");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, -1, 20));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 940, 130));

        jButton1.setBackground(new java.awt.Color(25, 118, 211));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Enregistrer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 420, -1, 40));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("X");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 0, 20, -1));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("__");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 0, 20, -1));

        jButton2.setBackground(new java.awt.Color(25, 118, 211));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Enregistrer");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 420, -1, 40));

        jButton3.setBackground(new java.awt.Color(25, 118, 211));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Enregistrer");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 420, -1, 40));

        jButton4.setBackground(new java.awt.Color(25, 118, 211));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Annuler");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 420, 130, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 500));

        setSize(new java.awt.Dimension(950, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Loginstudent1 choicedoc = new Loginstudent1(CNE);
        choicedoc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void TextNom_entreActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_TextNom_entreActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_TextNom_entreActionPerformed

    private void TextTele_entreActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_TextTele_entreActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_TextTele_entreActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        String Surl, Suser, Spass, doctype, msg, query;
        Surl = "jdbc:mysql://localhost:3306/gl";
        Suser = "root";
        Spass = "";
        // check if all the fields are filled
        if (TextNom_entre.getText().equals("") || TextSecteur.getText().equals("")
                || TextEmail_entre.getText().equals("") || TextTele_entre.getText().equals("")
                || TextEncadr_entre.getText().equals("") || TextEmail_encadr.getText().equals("")
                || TextEncadr_ensa.getText().equals("") || Textdebut_stage.getText().equals("")
                || Textfin_stage.getText().equals("") || jTextArea1.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Veuillez remplir tous les champs");
        } else {
            // date string to date using parsing
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate debut = LocalDate.parse(Textdebut_stage.getText(), formatter);
            LocalDate fin = LocalDate.parse(Textfin_stage.getText(), formatter);
            // check if the date is valid
            if (debut.isAfter(fin)) {
                JOptionPane.showMessageDialog(null, "Veuillez vérifier les dates");
            } else {
                // every things is good we can insert the data
                try {
                    java.sql.Date sqlDebut = java.sql.Date.valueOf(debut);
                    java.sql.Date sqlFin = java.sql.Date.valueOf(fin);
                    Connection con = DriverManager.getConnection(Surl, Suser, Spass);
                    query = "INSERT INTO `stage`( `user_id`, `nom_entreprise`, `secteur`, `email_entreprise`, `tel_entreprise`, `encadrant_entreprise`, `email_encadrant`, `encadrant_ensa`, `debut_stage`, `fin_stage`, `sujet_stage`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
                    PreparedStatement ps = con.prepareStatement(query);
                    ps.setInt(1, CNE);
                    ps.setString(2, TextNom_entre.getText());
                    ps.setString(3, TextSecteur.getText());
                    ps.setString(4, TextEmail_entre.getText());
                    ps.setString(5, TextTele_entre.getText());
                    ps.setString(6, TextEncadr_entre.getText());
                    ps.setString(7, TextEmail_encadr.getText());
                    ps.setString(8, TextEncadr_ensa.getText());
                    ps.setDate(9, sqlDebut);
                    ps.setDate(10, sqlFin); 
                    ps.setString(11, jTextArea1.getText());
                    ps.executeUpdate();
                    System.out.println("done");
                    JOptionPane.showMessageDialog(null, "Stage ajouté avec succés");
                    
                    Loginstudent1 choicedoc = new Loginstudent1(CNE);
                    choicedoc.setVisible(true);
                    this.dispose();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }

            }
        }
    }// GEN-LAST:event_jButton1ActionPerformed

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }// GEN-LAST:event_jLabel13MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }// GEN-LAST:event_jLabel14MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(stageDoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(stageDoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(stageDoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(stageDoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new stageDoc(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextEmail_encadr;
    private javax.swing.JTextField TextEmail_entre;
    private javax.swing.JTextField TextEncadr_ensa;
    private javax.swing.JTextField TextEncadr_entre;
    private javax.swing.JTextField TextNom_entre;
    private javax.swing.JTextField TextSecteur;
    private javax.swing.JTextField TextTele_entre;
    private javax.swing.JTextField Textdebut_stage;
    private javax.swing.JTextField Textfin_stage;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
