package user1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RAHUL
 */
public class TOP extends javax.swing.JFrame {

    /**
     * Creates new form TOP
     */
    Statement stat;
    Connection con;
    String Name="";
    int rank=1;
    String Points="";
    public TOP() {
        initComponents();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz","root","");
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        try{
        stat=con.createStatement();
        PreparedStatement pr=con.prepareStatement("select * from rank  ORDER by score desc");
        
        ResultSet rs=pr.executeQuery();
        rs.first();
        name_1.setText(rs.getString(1));
        score_1.setText(rs.getString(2));
        rs.next();
        name_2.setText(rs.getString(1));
        score_2.setText(rs.getString(2));
        rs.next();
        name_3.setText(rs.getString(1));
        score_3.setText(rs.getString(2));
        rs.next();
        name_4.setText(rs.getString(1));
        score_4.setText(rs.getString(2));
        rs.next();
        name_5.setText(rs.getString(1));
        score_5.setText(rs.getString(2));
        rs.next();
        name_6.setText(rs.getString(1));
        score_6.setText(rs.getString(2));
        rs.next();
        name_7.setText(rs.getString(1));
        score_7.setText(rs.getString(2));
        rs.next();
        name_8.setText(rs.getString(1));
        score_8.setText(rs.getString(2));
        rs.next();
        name_9.setText(rs.getString(1));
        score_9.setText(rs.getString(2));
        rs.next();
        name_10.setText(rs.getString(1));
        score_10.setText(rs.getString(2));
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"");
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        name_1 = new javax.swing.JTextField();
        name_2 = new javax.swing.JTextField();
        name_3 = new javax.swing.JTextField();
        name_4 = new javax.swing.JTextField();
        name_5 = new javax.swing.JTextField();
        name_6 = new javax.swing.JTextField();
        name_7 = new javax.swing.JTextField();
        name_8 = new javax.swing.JTextField();
        name_9 = new javax.swing.JTextField();
        name_10 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        score_2 = new javax.swing.JTextField();
        score_3 = new javax.swing.JTextField();
        score_4 = new javax.swing.JTextField();
        score_5 = new javax.swing.JTextField();
        score_6 = new javax.swing.JTextField();
        score_7 = new javax.swing.JTextField();
        score_8 = new javax.swing.JTextField();
        score_9 = new javax.swing.JTextField();
        score_10 = new javax.swing.JTextField();
        score_1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("1.");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel3.setText("2.");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel4.setText("3.");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel5.setText("9");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        jLabel6.setText("4.");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel7.setText("5.");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel8.setText("6.");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel9.setText("7.");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLabel10.setText("8.");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jLabel11.setText("10.");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        name_1.setEditable(false);
        getContentPane().add(name_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 80, -1));

        name_2.setEditable(false);
        name_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_2ActionPerformed(evt);
            }
        });
        getContentPane().add(name_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 80, -1));

        name_3.setEditable(false);
        name_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_3ActionPerformed(evt);
            }
        });
        getContentPane().add(name_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 80, -1));

        name_4.setEditable(false);
        name_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_4ActionPerformed(evt);
            }
        });
        getContentPane().add(name_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 80, -1));

        name_5.setEditable(false);
        getContentPane().add(name_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 80, -1));

        name_6.setEditable(false);
        name_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_6ActionPerformed(evt);
            }
        });
        getContentPane().add(name_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 80, -1));

        name_7.setEditable(false);
        name_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_7ActionPerformed(evt);
            }
        });
        getContentPane().add(name_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 80, -1));

        name_8.setEditable(false);
        getContentPane().add(name_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 80, -1));

        name_9.setEditable(false);
        name_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_9ActionPerformed(evt);
            }
        });
        getContentPane().add(name_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 80, -1));

        name_10.setEditable(false);
        getContentPane().add(name_10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 80, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jLabel12.setText("TOP RANKS");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 110, -1));

        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel13.setFont(new java.awt.Font("Team MT", 1, 18)); // NOI18N
        jLabel13.setText("qMAINA");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 0, -1, -1));

        score_2.setEditable(false);
        score_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                score_2ActionPerformed(evt);
            }
        });
        getContentPane().add(score_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 60, -1));

        score_3.setEditable(false);
        score_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                score_3ActionPerformed(evt);
            }
        });
        getContentPane().add(score_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 60, -1));

        score_4.setEditable(false);
        score_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                score_4ActionPerformed(evt);
            }
        });
        getContentPane().add(score_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 60, -1));

        score_5.setEditable(false);
        score_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                score_5ActionPerformed(evt);
            }
        });
        getContentPane().add(score_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 60, -1));

        score_6.setEditable(false);
        score_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                score_6ActionPerformed(evt);
            }
        });
        getContentPane().add(score_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 60, -1));

        score_7.setEditable(false);
        score_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                score_7ActionPerformed(evt);
            }
        });
        getContentPane().add(score_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 60, -1));

        score_8.setEditable(false);
        score_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                score_8ActionPerformed(evt);
            }
        });
        getContentPane().add(score_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 60, -1));

        score_9.setEditable(false);
        score_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                score_9ActionPerformed(evt);
            }
        });
        getContentPane().add(score_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 60, -1));

        score_10.setEditable(false);
        score_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                score_10ActionPerformed(evt);
            }
        });
        getContentPane().add(score_10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 60, -1));

        score_1.setEditable(false);
        score_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                score_1ActionPerformed(evt);
            }
        });
        getContentPane().add(score_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 60, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ADMIN/PicsArt_07-13-05.16.23.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void name_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_3ActionPerformed

    private void name_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_6ActionPerformed

    private void name_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_7ActionPerformed

    private void name_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_9ActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        USER obj=new USER();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_backActionPerformed

    private void name_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_2ActionPerformed

    private void name_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_4ActionPerformed

    private void score_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_score_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_score_2ActionPerformed

    private void score_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_score_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_score_3ActionPerformed

    private void score_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_score_4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_score_4ActionPerformed

    private void score_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_score_5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_score_5ActionPerformed

    private void score_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_score_6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_score_6ActionPerformed

    private void score_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_score_7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_score_7ActionPerformed

    private void score_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_score_8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_score_8ActionPerformed

    private void score_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_score_9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_score_9ActionPerformed

    private void score_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_score_10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_score_10ActionPerformed

    private void score_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_score_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_score_1ActionPerformed

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
            java.util.logging.Logger.getLogger(TOP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TOP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TOP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TOP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TOP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField name_1;
    private javax.swing.JTextField name_10;
    private javax.swing.JTextField name_2;
    private javax.swing.JTextField name_3;
    private javax.swing.JTextField name_4;
    private javax.swing.JTextField name_5;
    private javax.swing.JTextField name_6;
    private javax.swing.JTextField name_7;
    private javax.swing.JTextField name_8;
    private javax.swing.JTextField name_9;
    private javax.swing.JTextField score_1;
    private javax.swing.JTextField score_10;
    private javax.swing.JTextField score_2;
    private javax.swing.JTextField score_3;
    private javax.swing.JTextField score_4;
    private javax.swing.JTextField score_5;
    private javax.swing.JTextField score_6;
    private javax.swing.JTextField score_7;
    private javax.swing.JTextField score_8;
    private javax.swing.JTextField score_9;
    // End of variables declaration//GEN-END:variables
}