/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class updatecomplaint extends javax.swing.JFrame {
    Connection conn=null;
        ResultSet rs=null;
        PreparedStatement pst=null;
        static String bb1,bb2,bb3,bb4,bb5,bb,bb6,bb7,bb8,bb9,bb10,bb11,bb12,bb13,bb14,bb15,bb16;

    /**
     * Creates new form updatecomplaint
     */
    public updatecomplaint() {
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

        k = new javax.swing.JTextField();
        j = new javax.swing.JTextField();
        d = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        e = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        f = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        ac = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        l = new javax.swing.JTextField();
        a = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        b = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cc = new javax.swing.JTextField();
        h = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        bc = new javax.swing.JTextField();
        dc = new javax.swing.JTextField();
        g = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        k.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kActionPerformed(evt);
            }
        });
        k.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                kKeyReleased(evt);
            }
        });
        getContentPane().add(k);
        k.setBounds(710, 340, 283, 20);

        j.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jActionPerformed(evt);
            }
        });
        j.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jKeyReleased(evt);
            }
        });
        getContentPane().add(j);
        j.setBounds(710, 300, 283, 20);

        d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dActionPerformed(evt);
            }
        });
        d.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dKeyReleased(evt);
            }
        });
        getContentPane().add(d);
        d.setBounds(166, 295, 283, 20);

        jLabel15.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel15.setText("Product Under");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(530, 340, 160, 23);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setText("Customer Id");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(49, 64, 130, 23);

        e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eActionPerformed(evt);
            }
        });
        e.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                eKeyReleased(evt);
            }
        });
        getContentPane().add(e);
        e.setBounds(166, 382, 283, 20);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(200, 64, 370, 20);

        f.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fActionPerformed(evt);
            }
        });
        f.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fKeyReleased(evt);
            }
        });
        getContentPane().add(f);
        f.setBounds(166, 423, 283, 111);

        jLabel19.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel19.setText("Location");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(530, 220, 120, 23);
        getContentPane().add(ac);
        ac.setBounds(166, 224, 283, 20);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(591, 478, 83, 25);

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel5.setText("Customer");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(32, 183, 110, 23);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Update Complain");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(12, 0, 453, 55);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Cancel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(752, 478, 77, 25);

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel6.setText("City");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(32, 224, 76, 23);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel4.setText("Sl_No.");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(32, 142, 76, 23);

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel7.setText("Email");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(32, 259, 76, 23);

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel11.setText("Phone");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(530, 260, 110, 23);

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel8.setText("Product");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(32, 295, 100, 23);

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel12.setText("Other Contacts");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(530, 300, 170, 23);

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel9.setText("Category");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(30, 340, 110, 23);

        jLabel20.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel20.setText("Sub-Category");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(530, 380, 140, 23);

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel10.setText("Problem");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(32, 382, 122, 23);

        jLabel18.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel18.setText("Remarks");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(32, 423, 110, 23);

        l.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lActionPerformed(evt);
            }
        });
        getContentPane().add(l);
        l.setBounds(710, 420, 283, 20);

        a.setEditable(false);
        a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aActionPerformed(evt);
            }
        });
        a.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                aKeyReleased(evt);
            }
        });
        getContentPane().add(a);
        a.setBounds(166, 142, 283, 20);

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel13.setText("Solved By");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(530, 420, 140, 23);

        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActionPerformed(evt);
            }
        });
        b.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bKeyReleased(evt);
            }
        });
        getContentPane().add(b);
        b.setBounds(166, 183, 283, 20);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel3.setText("Date");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(530, 180, 110, 23);
        getContentPane().add(cc);
        cc.setBounds(710, 220, 283, 20);

        h.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hActionPerformed(evt);
            }
        });
        h.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                hKeyReleased(evt);
            }
        });
        getContentPane().add(h);
        h.setBounds(710, 260, 283, 20);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(166, 259, 283, 20);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("Find");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(646, 62, 61, 25);
        getContentPane().add(bc);
        bc.setBounds(166, 341, 283, 20);
        getContentPane().add(dc);
        dc.setBounds(710, 380, 283, 20);

        g.setEditable(false);
        getContentPane().add(g);
        g.setBounds(710, 180, 275, 20);

        setSize(new java.awt.Dimension(1071, 665));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void kActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kActionPerformed

    private void kKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kKeyReleased
        // TODO add your handling code here:
        int key=evt.getKeyCode();
        if(key==10)
        {
            dc.requestFocus();// TODO add your handling code here:
        }
    }//GEN-LAST:event_kKeyReleased

    private void jActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jActionPerformed

    private void jKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jKeyReleased
        // TODO add your handling code here:
        int key=evt.getKeyCode();
        if(key==10)
        {
            k.requestFocus();// TODO add your handling code here:
        }

    }//GEN-LAST:event_jKeyReleased

    private void dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dActionPerformed

    private void dKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dKeyReleased
        // TODO add your handling code here:
        int key=evt.getKeyCode();
        if(key==10)
        {
            bc.requestFocus();// TODO add your handling code here:
        }
    }//GEN-LAST:event_dKeyReleased

    private void eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eActionPerformed

    private void eKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eKeyReleased
        // TODO add your handling code here:
        int key=evt.getKeyCode();
        if(key==10)
        {
            f.requestFocus();// TODO add your handling code here:
        }
    }//GEN-LAST:event_eKeyReleased

    private void fActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fActionPerformed

    private void fKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fKeyReleased
        // TODO add your handling code here:
        int key=evt.getKeyCode();
        if(key==10)
        {
            g.requestFocus();// TODO add your handling code here:
        }

    }//GEN-LAST:event_fKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     try
        {
            Class.forName("com.mysql.jdbc.Driver");
            
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mis","root","");
            bb1=jTextField1.getText();
            bb2=a.getText();
            bb3=b.getText();
            bb4=ac.getText();
            bb5=jTextField3.getText();
            bb6=d.getText();
            bb7=bc.getText();
            bb8=e.getText();
            bb9=f.getText();
            bb10=g.getText();
            bb11=cc.getText();
            bb12=h.getText();
            bb13=j.getText();
            bb14=k.getText();
            bb15=dc.getText();
            bb16=l.getText();
            String sql;
            sql="UPDATE complaint set Sl='"+bb2+"',Customer='"+bb3+"',City='"+bb4+"',Email='"+bb5+"',Product='"+bb6+"',Category='"+bb7+"',Problem='"+bb8+"',Remarks='"+bb9+"',Location='"+bb11+"',Phone='"+bb12+"',Other_Contact='"+bb13+"',Product_Under='"+bb14+"',Sub_Category='"+bb15+"',Solved_By='"+bb16+"' where Customer_Id='"+bb1+"'";
             pst=conn.prepareStatement(sql);
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"updated");
        }
        
        catch(Exception e)
        {
             JOptionPane.showMessageDialog(null,"PLEASE CHECK THE FIELDS AGAIN");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void lActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lActionPerformed

    private void aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aActionPerformed

    private void aKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aKeyReleased
        // TODO add your handling code here:
        int key=evt.getKeyCode();
        if(key==10)
        {
            b.requestFocus();// TODO add your handling code here:
        }
    }//GEN-LAST:event_aKeyReleased

    private void bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bActionPerformed

    private void bKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bKeyReleased
        // TODO add your handling code here:
        int key=evt.getKeyCode();
        if(key==10)
        {
            ac.requestFocus();// TODO add your handling code here:
        }
    }//GEN-LAST:event_bKeyReleased

    private void hActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hActionPerformed

    private void hKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hKeyReleased
        // TODO add your handling code here:

        int key=evt.getKeyCode();
        if(key==10)
        {
            j.requestFocus();// TODO add your handling code here:
        }

    }//GEN-LAST:event_hKeyReleased

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased
        // TODO add your handling code here:
        int key=evt.getKeyCode();
        if(key==10)
        {
            d.requestFocus();// TODO add your handling code here:
        }

    }//GEN-LAST:event_jTextField3KeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
          Connection conn=null;
        ResultSet rs=null;
        PreparedStatement pst=null;
         try{
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mis","root","");
    String sql="select * from complaint where Customer_Id=?";
     pst=conn.prepareStatement(sql);
    pst.setString(1,jTextField1.getText());
      rs=pst.executeQuery();
        if(rs.next())
        {
           a.setText(rs.getString("Sl"));
           b.setText(rs.getString("Customer"));
           ac.setText(rs.getString("City"));
           jTextField3.setText(rs.getString("Email"));
           d.setText(rs.getString("Product"));
           bc.setText(rs.getString("Category"));
           e.setText(rs.getString("Problem"));
           f.setText(rs.getString("Remarks"));
           g.setText(rs.getString("Date"));
           cc.setText(rs.getString("Location"));
           h.setText(rs.getString("Phone"));
           j.setText(rs.getString("Other_Contact"));
           k.setText(rs.getString("Product_Under"));
           dc.setText(rs.getString("Sub_Category"));
           l.setText(rs.getString("Solved_By"));
        
        }
    
    
     }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(updatecomplaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updatecomplaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updatecomplaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updatecomplaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updatecomplaint().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a;
    private javax.swing.JTextField ac;
    private javax.swing.JTextField b;
    private javax.swing.JTextField bc;
    private javax.swing.JTextField cc;
    private javax.swing.JTextField d;
    private javax.swing.JTextField dc;
    private javax.swing.JTextField e;
    private javax.swing.JTextField f;
    private javax.swing.JTextField g;
    private javax.swing.JTextField h;
    private javax.swing.JTextField j;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField k;
    private javax.swing.JTextField l;
    // End of variables declaration//GEN-END:variables
}
