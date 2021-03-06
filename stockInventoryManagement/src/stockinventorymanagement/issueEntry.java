/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stockinventorymanagement;
import javax.swing.JOptionPane;
import java.sql.*;
import java.text.SimpleDateFormat;
import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.Color;
import java.text.ParseException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import java.util.Date;
/**
 *
 * @author Arnav
 */
public class issueEntry extends javax.swing.JFrame {

    /** Creates new form issueEntry */
    public issueEntry() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/images/logo.png")).getImage());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btncat = new javax.swing.ButtonGroup();
        btndept = new javax.swing.ButtonGroup();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txten = new javax.swing.JTextField();
        cbitem = new javax.swing.JComboBox<>();
        calissue = new com.toedter.calendar.JDateChooser();
        rbt = new javax.swing.JRadioButton();
        rbot = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        rbg = new javax.swing.JRadioButton();
        rbl = new javax.swing.JRadioButton();
        rbo = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnsave = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        cbbatch = new javax.swing.JComboBox<>();
        cbiq = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 51, 0));
        jLabel10.setText("(*)");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Issue Entry");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(62, 53, 171));
        jLabel1.setText("Item Name :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(62, 53, 171));
        jLabel2.setText("Batch No. :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(62, 53, 171));
        jLabel3.setText("Issue Qty. :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(62, 53, 171));
        jLabel4.setText("Employee Name :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 160, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(62, 53, 171));
        jLabel5.setText("Issue Date :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(62, 53, 171));
        jLabel6.setText("Department :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 289, -1, -1));

        txten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtenActionPerformed(evt);
            }
        });
        getContentPane().add(txten, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 330, -1));

        cbitem.setBorder(null);
        cbitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbitemActionPerformed(evt);
            }
        });
        getContentPane().add(cbitem, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 330, 30));
        getContentPane().add(calissue, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 241, 330, -1));

        btncat.add(rbt);
        rbt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rbt.setForeground(new java.awt.Color(62, 53, 171));
        rbt.setText("Trauma");
        rbt.setOpaque(false);
        getContentPane().add(rbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 285, -1, -1));

        btncat.add(rbot);
        rbot.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rbot.setForeground(new java.awt.Color(62, 53, 171));
        rbot.setText("O.T.");
        rbot.setOpaque(false);
        rbot.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbotItemStateChanged(evt);
            }
        });
        getContentPane().add(rbot, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 285, -1, -1));

        jPanel1.setBackground(new java.awt.Color(141, 230, 247));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Select a Department"));

        btndept.add(rbg);
        rbg.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rbg.setForeground(new java.awt.Color(62, 53, 171));
        rbg.setText("Gynaec");
        rbg.setEnabled(false);
        rbg.setOpaque(false);

        btndept.add(rbl);
        rbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rbl.setForeground(new java.awt.Color(62, 53, 171));
        rbl.setText("Labor");
        rbl.setEnabled(false);
        rbl.setOpaque(false);

        btndept.add(rbo);
        rbo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rbo.setForeground(new java.awt.Color(62, 53, 171));
        rbo.setText("Ortho");
        rbo.setEnabled(false);
        rbo.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbg)
                    .addComponent(rbl)
                    .addComponent(rbo))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(rbg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbo)
                .addGap(7, 7, 7))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(347, 285, -1, 120));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 0));
        jLabel8.setText("* = Required Fields");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 386, 148, 29));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 51, 0));
        jLabel11.setText("(*)");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, 28, 29));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 0));
        jLabel9.setText("*");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 131, 14, 33));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 51, 0));
        jLabel12.setText("*");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 80, 14, 33));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 51, 0));
        jLabel13.setText("*");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 16, 14, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 51, 0));
        jLabel14.setText("*");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 234, 14, 33));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 51, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("*");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, 10, 33));

        btnsave.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnsave.setText("Save");
        btnsave.setEnabled(false);
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 410, 110, -1));

        btncancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btncancel.setText("Cancel");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });
        getContentPane().add(btncancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, 100, -1));

        cbbatch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a Batch No." }));
        cbbatch.setBorder(null);
        cbbatch.setEnabled(false);
        cbbatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbatchActionPerformed(evt);
            }
        });
        getContentPane().add(cbbatch, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 330, 30));

        cbiq.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Issue Quantity" }));
        cbiq.setBorder(null);
        cbiq.setEnabled(false);
        cbiq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbiqActionPerformed(evt);
            }
        });
        getContentPane().add(cbiq, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 330, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nisarg600.jpeg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtenActionPerformed

    private void cbitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbitemActionPerformed
        // TODO add your handling code here:
        if(cbitem.getSelectedItem().toString().equals("Select an Item"))
        {
            btnsave.setEnabled(false);
            cbbatch.setEnabled(false);                  
            cbiq.setEnabled(false);
            cbbatch.setSelectedIndex(0);
            cbiq.setSelectedIndex(0);
        }
        else
        {
            cbbatch.setEnabled(true);
            String item = cbitem.getSelectedItem().toString();                  
            cbbatch.removeAllItems();
            cbbatch.addItem("Select a Batch No.");           
            try
            {
                Class.forName("java.sql.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/stockinventorymanagement","root","tabla10a");
                Statement stm = conn.createStatement();
                String query = "SELECT BATCHNO FROM STOCKMASTER WHERE ITEMNAME = '"+item+"' ORDER BY EXP;";
                ResultSet rs = stm.executeQuery(query);
                while(rs.next())
                {
                    String batch = rs.getString("batchno");
                    cbbatch.addItem(batch);
                }
                rs.close();
                stm.close();
                conn.close();
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_cbitemActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        cbitem.removeAllItems();
        cbitem.addItem("Select an Item");
        try
        {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/stockinventorymanagement","root","tabla10a");
            Statement stmt = con.createStatement();
            String query = "SELECT itemName from itemMaster order by itemname;";
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next())
            {
                String in = rs.getString(1);
                cbitem.addItem(in);
            }
            rs.next();
            stmt.close();
            con.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        JTextFieldDateEditor editor = (JTextFieldDateEditor) calissue.getDateEditor();
        editor.setEnabled(false);
        editor.setBackground(Color.white);
        editor.setDisabledTextColor(Color.black);
        String curdate = java.time.LocalDate.now().toString();
        String cm = curdate.substring(5,7);
        String cy = curdate.substring(0,4);
        String cd = curdate.substring(8,10);
        String mon="";
        if(cm.equals("01"))
        {
            mon="Jan";
        }
        else if(cm.equals("02"))
        {
            mon="Feb";
        }
        else if(cm.equals("03"))
        {
            mon="Mar";
        }
        else if(cm.equals("04"))
        {
            mon="Apr";
        }
        else if(cm.equals("05"))
        {
            mon="May";
        }
        else if(cm.equals("06"))
        {
            mon="Jun";
        }
        else if(cm.equals("07"))
        {
            mon="Jul";
        }
        else if(cm.equals("08"))
        {
            mon="Aug";
        }
        else if(cm.equals("09"))
        {
            mon="Sep";
        }
        else if(cm.equals("10"))
        {
            mon="Oct";
        }
        else if(cm.equals("11"))
        {
            mon="Nov";
        }
        else if(cm.equals("12"))
        {
            mon="Dec";
        }
        String date = cd+" "+mon+", "+cy;
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("d MMM, yyyy");
        try
        {
            cal.setTime(sdf.parse(date));
            calissue.setCalendar(cal);
            calissue.setMaxSelectableDate(new Date());
        } 
        catch (ParseException ex) 
        {
            Logger.getLogger(issueEntry.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        // TODO add your handling code here:
        cbitem.setSelectedIndex(0);
        cbbatch.setSelectedIndex(0);
        cbiq.setSelectedIndex(0);
        txten.setText("");
        btncat.clearSelection();
        btndept.clearSelection();
    }//GEN-LAST:event_btncancelActionPerformed

    private void rbotItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbotItemStateChanged
        // TODO add your handling code here:
        if(rbot.isSelected())
        {
            rbg.setEnabled(true);
            rbl.setEnabled(true);
            rbo.setEnabled(true);
        }
        else
        {
            rbg.setEnabled(false);
            rbl.setEnabled(false);
            rbo.setEnabled(false);
            btndept.clearSelection();
        }
    }//GEN-LAST:event_rbotItemStateChanged

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formWindowActivated

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
        String item, batch, en, idate, dept="";
        int oq=0, iq, oql;
        item = cbitem.getSelectedItem().toString();
        batch = cbbatch.getSelectedItem().toString();
        iq = Integer.parseInt(cbiq.getSelectedItem().toString());
        try
        {
            Class.forName("java.sql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/stockinventorymanagement","root","tabla10a");
            Statement stm = conn.createStatement();
            String query = "SELECT OPENQTY FROM STOCKMASTER WHERE ITEMNAME = '"+item+"' AND BATCHNO ='"+batch+"' ORDER BY EXP;";
            ResultSet rs = stm.executeQuery(query);
            if(rs.next())
            {
                oq = rs.getInt("openqty");
            }
            rs.close();
            stm.close();
            conn.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        oql = oq-iq;
        en = txten.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("d MMM, yyyy");
        idate = sdf.format(calissue.getDate());
        String date = idate.substring(0,2);
        String d,month,year;
        if(date.substring(1,2).equals(" "))
        {
            d = "0"+date.substring(0,1);
            month = idate.substring(2,5);
            year = idate.substring(7,11);
        }
        else
        {
            d = date;
            month = idate.substring(3,6);
            year = idate.substring(8,12);
        }
        String mon="";
        if(month.equals("Jan"))
        { 
            mon="01";
        }
        else if(month.equals("Feb"))
        {
            mon="02";
        }
        else if(month.equals("Mar"))
        {
            mon="03";
        }
        else if(month.equals("Apr"))
        {
            mon="04";
        }
        else if(month.equals("May"))
        {
            mon="05";
        }
        else if(month.equals("Jun"))
        {
            mon="06";
        }
        else if(month.equals("Jul"))
        {
            mon="07";
        }
        else if(month.equals("Aug"))
        {
            mon="08";
        }
        else if(month.equals("Sep"))
        {
            mon="09";
        }
        else if(month.equals("Oct"))
        {
            mon="10";
        }
        else if(month.equals("Nov"))
        {
            mon="11";
        }
        else if(month.equals("Dec"))
        {
            mon="12";
        }
        idate = year+"-"+mon+"-"+d;
        if(rbt.isSelected())
        {
            dept = "Trauma";
        }
        else if(rbot.isSelected())
        {
            if(rbg.isSelected())
            {
                dept = "Gynaec";
            }
            else if(rbl.isSelected())
            {
                dept = "Labor";
            }
            else if(rbo.isSelected())
            {
                dept = "Ortho";
            }
        }
        if(en.equals("")||dept.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Fill in all the required fields.");
        }
        else
        {
            try
            {
                Class.forName("java.sql.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/stockinventorymanagement","root","tabla10a");
                Statement stm = conn.createStatement();
                String insert = "INSERT INTO ISSUEMASTER VALUES('"+item+"','"+batch+"',"+iq+",'"+en+"','"+idate+"','"+dept+"');";
                String update;
                if(oql==0)
                {
                    update ="DELETE FROM STOCKMASTER WHERE ITEMNAME='"+item+"' AND BATCHNO='"+batch+"';";
                }
                else
                {
                    update ="UPDATE STOCKMASTER SET OPENQTY="+oql+" WHERE ITEMNAME='"+item+"' AND BATCHNO='"+batch+"';";
                }
                stm.executeUpdate(insert);
                stm.executeUpdate(update);
                JOptionPane.showMessageDialog(null, "Record Saved successfully.");
                cbitem.setSelectedIndex(0);
                cbbatch.setSelectedIndex(0);
                cbiq.setSelectedIndex(0);
                txten.setText("");
                btncat.clearSelection();
                JTextFieldDateEditor editor= (JTextFieldDateEditor) calissue.getDateEditor();            
                editor.setEnabled(false);
                editor.setBackground(Color.white);
                editor.setDisabledTextColor(Color.black);
                stm.close();
                conn.close();
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void cbbatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbatchActionPerformed
        // TODO add your handling code here:
        String item = cbitem.getSelectedItem().toString();         
        if(cbbatch.getItemCount()==0||cbbatch.getSelectedIndex()==0)
        {
            btnsave.setEnabled(false);
            cbiq.setEnabled(false);
            cbiq.setSelectedIndex(0);
        }
        else
        {
            String batch = cbbatch.getSelectedItem().toString();
            cbiq.setEnabled(true);            
            cbiq.removeAllItems();
            cbiq.addItem("Select Issue Quantity");
            try
            {
                Class.forName("java.sql.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/stockinventorymanagement","root","tabla10a");
                Statement stm = conn.createStatement();
                String query = "SELECT OPENQTY FROM STOCKMASTER WHERE ITEMNAME = '"+item+"' AND BATCHNO ='"+batch+"' ORDER BY EXP;";
                ResultSet rs = stm.executeQuery(query);
                while(rs.next())
                {
                    int openqty = rs.getInt("openqty");
                    int i;
                    for(i =1;i<=openqty;i++)
                    {
                        String i1 = ""+i;
                        cbiq.addItem(i1);
                    }
                }
                rs.close();
                stm.close();
                conn.close();
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_cbbatchActionPerformed

    private void cbiqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbiqActionPerformed
        // TODO add your handling code here:
        if(cbiq.getSelectedIndex()==0)
        {
            btnsave.setEnabled(false);
        }
        else
        {
            btnsave.setEnabled(true);
        }
    }//GEN-LAST:event_cbiqActionPerformed

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
            java.util.logging.Logger.getLogger(issueEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(issueEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(issueEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(issueEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new issueEntry().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancel;
    private javax.swing.ButtonGroup btncat;
    private javax.swing.ButtonGroup btndept;
    private javax.swing.JButton btnsave;
    private com.toedter.calendar.JDateChooser calissue;
    private javax.swing.JComboBox<String> cbbatch;
    private javax.swing.JComboBox<String> cbiq;
    private javax.swing.JComboBox<String> cbitem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rbg;
    private javax.swing.JRadioButton rbl;
    private javax.swing.JRadioButton rbo;
    private javax.swing.JRadioButton rbot;
    private javax.swing.JRadioButton rbt;
    private javax.swing.JTextField txten;
    // End of variables declaration//GEN-END:variables

}
