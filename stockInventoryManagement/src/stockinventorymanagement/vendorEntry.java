/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockinventorymanagement;

import java.awt.Color;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.ImageIcon;

/**
 *
 * @author Anish
 */
public class vendorEntry extends javax.swing.JFrame {

    /**
     * Creates new form partyEntry
     */
    public vendorEntry() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/images/logo.png")).getImage());
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
        txtvname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtadd = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        txtcity = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtmn = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtln = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtp1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtp2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txttin = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtgst = new javax.swing.JTextField();
        btnsave = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Vendor Entry");
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(62, 53, 171));
        jLabel2.setText("Vendor Name :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        getContentPane().add(txtvname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 420, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(62, 53, 171));
        jLabel3.setText("Address :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 100, -1));

        txtadd.setColumns(20);
        txtadd.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtadd.setRows(5);
        jScrollPane1.setViewportView(txtadd);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 420, 60));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(62, 53, 171));
        jLabel4.setText("City :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 114, -1));
        getContentPane().add(txtcity, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 420, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(62, 53, 171));
        jLabel5.setText("Mobile No. :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));
        getContentPane().add(txtmn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 150, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(62, 53, 171));
        jLabel6.setText("Landline No. :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, -1, -1));
        getContentPane().add(txtln, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 130, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(62, 53, 171));
        jLabel7.setText("Person(1) :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));
        getContentPane().add(txtp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 420, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(62, 53, 171));
        jLabel8.setText("Person(2) :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));
        getContentPane().add(txtp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 420, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(62, 53, 171));
        jLabel9.setText("Email :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        getContentPane().add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 420, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(62, 53, 171));
        jLabel10.setText("Tin No. :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));
        getContentPane().add(txttin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 150, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(62, 53, 171));
        jLabel11.setText("GST No. :");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, -1, -1));

        txtgst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtgstActionPerformed(evt);
            }
        });
        getContentPane().add(txtgst, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 150, -1));

        btnsave.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 130, -1));

        btncancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btncancel.setText("Cancel");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });
        getContentPane().add(btncancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, 130, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 51, 0));
        jLabel16.setText("*");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 18, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 51, 0));
        jLabel17.setText("*");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, 18, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 51, 0));
        jLabel18.setText("*");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 18, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 51, 0));
        jLabel19.setText("*");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 330, 18, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 51, 0));
        jLabel12.setText("* = Required Fields");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nisarg600.jpeg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
        String vname="",add="",city="",mns="",lns="",p1="",p2="",email="",tin="",gst="";
        vname=txtvname.getText();
        add=txtadd.getText();
        city=txtcity.getText();
        mns=txtmn.getText();
        lns=txtln.getText();
        p1=txtp1.getText();
        p2=txtp2.getText();
        email=txtemail.getText();
        tin=txttin.getText();
        gst=txtgst.getText();
        if(vname.equals("")||city.equals("")||tin.equals("")||gst.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Fill in the required fields!");
        }
        else
        {
            int x,c=0;
                        int mnslength = mns.length();
                        for(x=0;x<mnslength;x++)
                        {
                            char a = mns.charAt(x);
                            if(a<=57&&a>=48)
                            {
                                continue;
                            }
                            else
                            {
                                c++;
                            }
                        }
                        int lnslength = lns.length();
                        for(x=0;x<lnslength;x++)
                        {
                            char a = lns.charAt(x);
                            if(a<=57&&a>=48)
                            {
                                continue;
                            }
                            else
                            {
                                c++;
                            }
                        }
                        if(c!=0)
                        {
                            JOptionPane.showMessageDialog(null,"Enter digits in Mobile Number and Landline Number!");
                        }
                        else
                        {                            
                            if(mns.equals(""))
                            {                            
                                if(lnslength>10)
                            {
                                JOptionPane.showMessageDialog(null,"Landline Number must not exceed 10 digits!");
                            }                                
                            else
                            {                                
                                try
                                {
                                    Class.forName("java.sql.Driver");
                                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost/stockinventorymanagement","root","tabla10a");
                                    Statement stmt = con.createStatement();                                    
                                    String insert = "INSERT INTO vendorMaster values('"+vname+"','"+add+"','"+city+"','"+mns+"','"+lns+"','"+p1+"','"+p2+"','"+email+"','"+tin+"','"+gst+"');";                                    
                                    stmt.executeUpdate(insert);
                                    JOptionPane.showMessageDialog(null,"Record Saved successfully.");
                                    txtvname.setText("");
                                    txtadd.setText("");
                                    txtcity.setText("");
                                    txtmn.setText("");
                                    txtln.setText("");
                                    txtp1.setText("");
                                    txtp2.setText("");
                                    txtemail.setText("");
                                    txttin.setText("");
                                    txtgst.setText("");
                                    stmt.close();
                                    con.close();
                                }
                                catch(Exception e)
                                {
                                    JOptionPane.showMessageDialog(null,e);
                                }
                            }                                
                        }
                            else
                            {
                                if(mns.length()!=10)
                                {
                                    JOptionPane.showMessageDialog(null,"Mobile Number must be of 10 digits only!");
                                }
                                else if(lns.length()>10)
                                {
                                    JOptionPane.showMessageDialog(null,"Landline Number must not exceed 10 digits!");
                                }
                                else
                                {
                                    try
                                {
                                    Class.forName("java.sql.Driver");
                                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost/stockinventorymanagement","root","tabla10a");
                                    Statement stmt = con.createStatement();                                    
                                    String insert = "INSERT INTO vendorMaster values('"+vname+"','"+add+"','"+city+"','"+mns+"','"+lns+"','"+p1+"','"+p2+"','"+email+"','"+tin+"','"+gst+"');";                                    
                                    stmt.executeUpdate(insert);
                                    JOptionPane.showMessageDialog(null,"Record Saved successfully.");
                                    txtvname.setText("");
                                    txtadd.setText("");
                                    txtcity.setText("");
                                    txtmn.setText("");
                                    txtln.setText("");
                                    txtp1.setText("");
                                    txtp2.setText("");
                                    txtemail.setText("");
                                    txttin.setText("");
                                    txtgst.setText("");
                                    stmt.close();
                                    con.close();
                                }
                                catch(Exception e)
                                {
                                    JOptionPane.showMessageDialog(null,e);
                                }
                                }
                            }                                
        }        
        }
                            
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        // TODO add your handling code here:
        txtvname.setText("");
        txtadd.setText("");
        txtcity.setText("");
        txtmn.setText("");
        txtln.setText("");
        txtp1.setText("");
        txtp2.setText("");
        txtemail.setText("");
        txttin.setText("");
        txtgst.setText("");
    }//GEN-LAST:event_btncancelActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        Color c= new Color(140,170,230);
        this.getContentPane().setBackground(c);
    }//GEN-LAST:event_formWindowOpened

    private void txtgstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtgstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtgstActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vendorEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vendorEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vendorEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vendorEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vendorEntry().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btnsave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtadd;
    private javax.swing.JTextField txtcity;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtgst;
    private javax.swing.JTextField txtln;
    private javax.swing.JTextField txtmn;
    private javax.swing.JTextField txtp1;
    private javax.swing.JTextField txtp2;
    private javax.swing.JTextField txttin;
    private javax.swing.JTextField txtvname;
    // End of variables declaration//GEN-END:variables
}
