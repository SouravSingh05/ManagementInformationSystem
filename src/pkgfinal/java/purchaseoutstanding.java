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
import net.proteanit.sql.DbUtils;

/**
 *
 * @author DELL
 */
public class purchaseoutstanding extends javax.swing.JFrame {
    Connection conn=null;
        ResultSet rs=null;
        PreparedStatement pst=null;

    /**
     * Creates new form purchaseoutstanding
     */
    public purchaseoutstanding() {
        initComponents();
    }
   /*   private void view_table(){
    try{
        conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sales","root","");
        String sql;
        sql="select * from sales where Date_of_Entry=?";
        pst=conn.prepareStatement(sql);
        pst.setString(1,ac.getText());
        rs=pst.executeQuery();
        tb.setModel(DbUtils.resultSetToTableModel(rs));;
    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null,e);
    }
     }*/


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        a = new javax.swing.JTextField();
        b = new javax.swing.JTextField();
        c = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        ac = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setText("UPDATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(153, 270, 91, 54);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel4.setText("Payment Made");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 176, 140, 23);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton2.setText("CLEAR");
        jButton2.setToolTipText("");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(298, 270, 73, 54);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton3.setText("CANCEL");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(430, 270, 81, 54);

        a.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                aKeyReleased(evt);
            }
        });
        getContentPane().add(a);
        a.setBounds(210, 140, 218, 20);

        b.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bKeyReleased(evt);
            }
        });
        getContentPane().add(b);
        b.setBounds(210, 180, 218, 20);

        c.setEditable(false);
        c.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cKeyReleased(evt);
            }
        });
        getContentPane().add(c);
        c.setBounds(210, 220, 218, 20);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Purchase Outstanding");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 24, 256, 29);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setText("Customer Id");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 94, 130, 23);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel3.setText("Amount Due");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 135, 130, 23);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("New Due");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(30, 217, 116, 25);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setText("Find");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(470, 90, 109, 25);
        getContentPane().add(ac);
        ac.setBounds(210, 90, 214, 20);

        setSize(new java.awt.Dimension(688, 529));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        a.setText("  ");
        b.setText("  ");
        c.setText("  ");
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void aKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aKeyReleased
        // TODO add your handling code here:
        int key=evt.getKeyCode();
    if(key==10)
    {
    b.requestFocus();// TODO add your handling code here:
    }
    }//GEN-LAST:event_aKeyReleased

    private void bKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bKeyReleased
        // TODO add your handling code here:
        int key=evt.getKeyCode();
    if(key==10)
    {
    c.requestFocus();// TODO add your handling code here:
    }
    }//GEN-LAST:event_bKeyReleased

    private void cKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cKeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String ad= a.getText();
        String as= ad.trim();
        
        int d= Integer.parseInt(as);
        int e= Integer.parseInt(b.getText());
        int f=d-e;
        c.setText(f+" ");
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         Connection conn=null;
        ResultSet rs=null;
        PreparedStatement pst=null;
        try{
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mis","root","");
    String sql="select New_Due from purchase where Customer_Id=?";
    
    pst=conn.prepareStatement(sql);
    pst.setString(1,ac.getText());
        rs=pst.executeQuery();
        if(rs.next())
        {
            int ad=rs.getInt("New_Due");
            a.setText(ad+" ");
                    
        }
    
    
     }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         Connection conn=null;
        ResultSet rs=null;
        PreparedStatement pst=null;
    try{
        conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/purchase","root","");
        String sql;
        sql="update purchase set New_Due=? where Party_Name=?";
        pst=conn.prepareStatement(sql);
        pst.setString(1,c.getText());
        pst.setString(2,ac.getText());
        pst.executeUpdate();
          JOptionPane.showMessageDialog(null,"Updated");
        
    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null,e);
    }
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
            java.util.logging.Logger.getLogger(purchaseoutstanding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(purchaseoutstanding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(purchaseoutstanding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(purchaseoutstanding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new purchaseoutstanding().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a;
    private javax.swing.JTextField ac;
    private javax.swing.JTextField b;
    private javax.swing.JTextField c;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
