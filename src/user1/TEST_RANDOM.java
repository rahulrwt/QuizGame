/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author RAHUL
 */
public class TEST_RANDOM extends javax.swing.JFrame {

    /**
     * Creates new form TEST_RANDOM
     */
    Statement stat;
    Connection con;
    String User="";
    String Correct_opt="";
    int Attempt=0;
            int Correct=0;
            int Incorrect=0;
            int Points=0;
           char Correct_Opt=' ';
           int score=0;
    public TEST_RANDOM(String User) {
        initComponents();
        this.User=User;
        try
        {
          Class.forName("com.mysql.jdbc.Driver");
          
          
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"not connected");
            
        }
        try
        {
            stat=con.createStatement();
            PreparedStatement PR=con.prepareStatement("select * from random_data");
            ResultSet rs=PR.executeQuery();
            while(rs.next())
            {
                if(User.equals(rs.getString(1)))
                {
                    break;
                }
            }
            String User_Name = rs.getString(1);
            Attempt=Integer.parseInt(rs.getString(2));
            Correct=Integer.parseInt(rs.getString(3));
            Incorrect=Integer.parseInt(rs.getString(4));
            Points=Integer.parseInt(rs.getString(5));
            PreparedStatement PR1=con.prepareStatement("select * from random_questions");
            Attempt++;
            ResultSet RS=PR1.executeQuery();
            {
                while(RS.next())
                {
                    if(Attempt==Integer.parseInt(RS.getString(1)))
                        break;
                }
            }
            String Ques_num=RS.getString(1);
            String Question=RS.getString(2);
            String Option_A=RS.getString(3);
            String Option_B=RS.getString(4);
            String Option_C=RS.getString(5);
            String Option_D=RS.getString(6);
            Correct_opt=RS.getString(7);
            ques.setText(Ques_num);
            question.setText(Question);
            option_a.setText(Option_A);
            option_b.setText(Option_B);
            option_c.setText(Option_C);
            option_d.setText(Option_D);
           char Correct_Opt=Correct_opt.charAt(0);
            this.Correct_Opt=Correct_Opt;
           
            this.Attempt=Attempt;
           
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"not selected"+e);
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

        option_c = new javax.swing.JTextField();
        finish = new javax.swing.JButton();
        ques = new javax.swing.JTextField();
        b = new javax.swing.JRadioButton();
        option_d = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        c = new javax.swing.JRadioButton();
        answer = new javax.swing.JTextField();
        d = new javax.swing.JRadioButton();
        question = new javax.swing.JTextField();
        submit4 = new javax.swing.JButton();
        answer_correct = new javax.swing.JTextField();
        option_a = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        option_b = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        a = new javax.swing.JRadioButton();
        next = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        option_c.setEditable(false);
        getContentPane().add(option_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 110, -1));

        finish.setText("FINISH");
        finish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishActionPerformed(evt);
            }
        });
        getContentPane().add(finish, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, -1, -1));

        ques.setEditable(false);
        getContentPane().add(ques, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 23, -1));

        b.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        b.setText("B");
        getContentPane().add(b, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, -1, -1));

        option_d.setEditable(false);
        getContentPane().add(option_d, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 110, -1));

        jLabel9.setFont(new java.awt.Font("Team MT", 1, 18)); // NOI18N
        jLabel9.setText("qMAINA");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("QUES");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        c.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        c.setText("C");
        getContentPane().add(c, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        answer.setEditable(false);
        getContentPane().add(answer, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 69, -1));

        d.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        d.setText("D");
        getContentPane().add(d, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, -1, -1));

        question.setEditable(false);
        getContentPane().add(question, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 275, 41));

        submit4.setText("SUBMIT");
        submit4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit4ActionPerformed(evt);
            }
        });
        getContentPane().add(submit4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, -1));

        answer_correct.setEditable(false);
        getContentPane().add(answer_correct, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 23, -1));

        option_a.setEditable(false);
        getContentPane().add(option_a, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 110, -1));

        jTextField1.setEditable(false);
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 38, -1));

        option_b.setEditable(false);
        option_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                option_bActionPerformed(evt);
            }
        });
        getContentPane().add(option_b, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 110, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("TIMER");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, -1));

        a.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a.setText("A");
        getContentPane().add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        next.setText("NEXT");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        getContentPane().add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 70, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ADMIN/PicsArt_07-13-05.16.23.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submit4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit4ActionPerformed
        // TODO add your handling code here:
        try{
        PreparedStatement PR1=con.prepareStatement("select * from rank");
        ResultSet RS1=PR1.executeQuery();
        while(RS1.next())
        {
           if(User.equals(RS1.getString(1)))
           {
               break;
           }
        }
        int score=Integer.parseInt(RS1.getString(2));
        this.score=score;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"error in score"+e);
        }
        char selected_ans=' ';
        this.Points=Points;
        if(a.isSelected())
        {
            selected_ans='A';
        }
        else if(b.isSelected())
        {
            selected_ans='B';
            
        }
        else if(c.isSelected())
        {
            selected_ans='C';
        }
        else if(d.isSelected())
        {
            selected_ans='D';
        }
        else
        {
          JOptionPane.showMessageDialog(null,"SELECT ANY OPTION");
        }
        if(Correct_Opt==selected_ans)
        {
            
            Correct++;
            Points=Points+5;
            score=score+5;
            answer.setText("CORRECT");
            answer_correct.setText(String.valueOf(Correct_opt));
            this.Correct=Correct;
         
        }
        else
        {
            
            Incorrect++;
            Points=Points-2;
            score=score-2;
            
            answer.setText("Correct answer is");
            answer_correct.setText(Correct_opt);
        }
        if(selected_ans!=' ')
        {
            try
        {
            
             stat.executeUpdate("update random_data set User Name='"+User+"',Attempted_Question='"+Attempt+"',Correct='"+Correct+"',Incorrect='"+Incorrect+"',Points='"+Points+"' where User Name='"+User+"'");
             stat.executeUpdate("update rank set username='"+User+"',score='"+score+"'where username='"+User+"'");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"not inserted data"+e);
        }
        }
        submit4.setVisible(false);
        next.setVisible(true);
    }//GEN-LAST:event_submit4ActionPerformed

    private void option_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_option_bActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_option_bActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        // TODO add your handling code here:
         try
        {
          Class.forName("com.mysql.jdbc.Driver");
          con=DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz","root","");
          
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"not connected");
            
        }
        try
        {
            stat=con.createStatement();
            PreparedStatement PR=con.prepareStatement("select * from science_data");
            ResultSet rs=PR.executeQuery();
            while(rs.next())
            {
                if(User.equals(rs.getString(1)))
                {
                    break;
                }
            }
            String User_Name = rs.getString(1);
            Attempt=Integer.parseInt(rs.getString(2));
            Correct=Integer.parseInt(rs.getString(3));
            Incorrect=Integer.parseInt(rs.getString(4));
            Points=Integer.parseInt(rs.getString(5));
            Attempt++;
            PreparedStatement PR1=con.prepareStatement("select * from science_questions");
            
            ResultSet RS=PR1.executeQuery();
            {
                while(RS.next())
                {
                    if(Attempt==Integer.parseInt(RS.getString(1)))
                        break;
                }
            }
            String Ques_num=RS.getString(1);
            String Question=RS.getString(2);
            String Option_A=RS.getString(3);
            String Option_B=RS.getString(4);
            String Option_C=RS.getString(5);
            String Option_D=RS.getString(6);
            Correct_opt=RS.getString(7);
            ques.setText(Ques_num);
            question.setText(Question);
            option_a.setText(Option_A);
            option_b.setText(Option_B);
            option_c.setText(Option_C);
            option_d.setText(Option_D);
           char Correct_Opt=Correct_opt.charAt(0);
            this.Correct_Opt=Correct_Opt;
           
            this.Attempt=Attempt;
            answer.setText(" ");
            answer_correct.setText(" ");
           submit4.setVisible(true);
           next.setVisible(false);
           
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"not selected"+e);
        }
    }//GEN-LAST:event_nextActionPerformed

    private void finishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishActionPerformed
        // TODO add your handling code here:
        try{
        FACT obj1=new FACT(User);
        obj1.setVisible(true);
        dispose();}
        catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_finishActionPerformed

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
            java.util.logging.Logger.getLogger(TEST_RANDOM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TEST_RANDOM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TEST_RANDOM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TEST_RANDOM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String User="";
                new TEST_RANDOM(User).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton a;
    private javax.swing.JTextField answer;
    private javax.swing.JTextField answer_correct;
    private javax.swing.JRadioButton b;
    private javax.swing.JRadioButton c;
    private javax.swing.JRadioButton d;
    private javax.swing.JButton finish;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton next;
    private javax.swing.JTextField option_a;
    private javax.swing.JTextField option_b;
    private javax.swing.JTextField option_c;
    private javax.swing.JTextField option_d;
    private javax.swing.JTextField ques;
    private javax.swing.JTextField question;
    private javax.swing.JButton submit4;
    // End of variables declaration//GEN-END:variables
}
