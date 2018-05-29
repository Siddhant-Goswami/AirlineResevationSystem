import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vishal
 */
public class ticket extends javax.swing.JInternalFrame {

    /**
     * Creates new form bookingFrame
     */
   
    Connection con;
    Statement smt;
    ResultSet rs;
   
    String flno="";
    String frm="";
    String to="";
    String cls="";
    String chrg="";
    
   
    public ticket() {
        initComponents();
        try
        {
            Class .forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/a_r_s","root","admin");
            
           
        }
        catch(Exception e)
        {
         System.out.println(e.getMessage());
        }
        
    }
    
    public void select()
    {DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        
        model.setRowCount(0);
            try{
            flno=jTextField1.getText();
            String sql="Select * from ticket;",u,u1,u2,u4,u5,u6;
             int i,u7,u9,u10;
             long u3;
             double u8,u11;
             Date dt;
             Time t;
            System.out.println(sql);
            smt=con.createStatement();
            ResultSet rs =smt.executeQuery(sql);
            
            if(!rs.isBeforeFirst())
                   JOptionPane.showMessageDialog(this, "Sorry, No tickets are there ", "No data",JOptionPane.INFORMATION_MESSAGE);
            else
             {
            while(rs.next())
            {
             
             u=rs.getString("first_name");
             u1=rs.getString("last_name");
             
             i=rs.getInt("age");
             u2=rs.getString("gender");
           
             u3=rs.getLong("pnr");
             u4=rs.getString("flight_no");
             dt=rs.getDate("journey_date");
             t=rs.getTime("departure_time");
             u5=rs.getString("source");
             u6=rs.getString("destination");
             u7=rs.getInt("fare");
             u8=rs.getDouble("gst");
             u9=rs.getInt("fuelcharge");
             u10=rs.getInt("meal_cost");
             u11=rs.getDouble("total_fare");
             
             
             
             
             model.addRow(new Object[] {u,u1,i,u2,u3,u4,dt,t,u5,u6,u7,u8,u9,u10,u11});
            }
             }
            //JOptionPane.showMessageDialog(this, "Data updated succesfully ", "Succesful",JOptionPane.INFORMATION_MESSAGE);
            System.out.println("SUCCESFULL");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error",JOptionPane.ERROR_MESSAGE);
            System.out.println("Error: "+e);
        }
    }
    
        
    public void checkgetData()
    {
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.setRowCount(0);
            try{
            flno=jTextField1.getText();
            String sql="Select * from ticket where first_name='"+flno+"';";
            String u,u1,u2,u4,u5,u6;
             int i,u7,u9,u10;
             long u3;
             double u8,u11;
             Date dt;
             Time t;
            System.out.println(sql);
            smt=con.createStatement();
            ResultSet rs =smt.executeQuery(sql);
            
            if(!rs.isBeforeFirst())
                   JOptionPane.showMessageDialog(this, "Sorry, No user are there ", "No data",JOptionPane.INFORMATION_MESSAGE);
            else
             {
            while(rs.next())
            {
             
             u=rs.getString("first_name");
             u1=rs.getString("last_name");
             
             i=rs.getInt("age");
             u2=rs.getString("gender");
           
             u3=rs.getLong("pnr");
             u4=rs.getString("flight_no");
             dt=rs.getDate("journey_date");
             t=rs.getTime("departure_time");
             u5=rs.getString("source");
             u6=rs.getString("destination");
             u7=rs.getInt("fare");
             u8=rs.getDouble("gst");
             u9=rs.getInt("fuelcharge");
             u10=rs.getInt("meal_cost");
             u11=rs.getDouble("total_fare");
             
             
             
             
             model.addRow(new Object[] {u,u1,i,u2,u3,u4,dt,t,u5,u6,u7,u8,u9,u10,u11});
            }
             }
            //JOptionPane.showMessageDialog(this, "Data updated succesfully ", "Succesful",JOptionPane.INFORMATION_MESSAGE);
            System.out.println("SUCCESFULL");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error",JOptionPane.ERROR_MESSAGE);
            System.out.println("Error: "+e);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setTitle("Java Airways - Booking Process");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(200, 17, 27));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Airline Reservation System");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ticket Detail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(153, 0, 0))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 153));
        jLabel2.setText("First name");

        jButton1.setText("Search all");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First name", "last name", "age", "gender", "pnr", "flight", "journey date", "departure time", "source", "destination", "fare", "gst", "fuel charge", "meal cost", "total fare"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton3.setText("cancel ticket");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(33, 33, 33)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addGap(584, 584, 584)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(12, 12, 12)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel4)))
                .addGap(11, 11, 11)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      select();
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         checkgetData();
        

    }//GEN-LAST:event_jButton2ActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
       
    }//GEN-LAST:event_formInternalFrameOpened

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        nav_Frame.jdpDesktop.remove(this);
    }//GEN-LAST:event_formInternalFrameClosing

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        
            smt=con.createStatement();
           
            if(!jTextField1.getText().isEmpty())
            {
            String sql="delete from ticket where first_name = '"+jTextField1.getText() +"';";
            
            smt.executeUpdate(sql);
            
            //javax.swing.table.AbstractTableModel
            select();
          
            JOptionPane.showMessageDialog(this, "Data updated succesfully ", "Succesful",JOptionPane.INFORMATION_MESSAGE);
            
            }
            else
                 JOptionPane.showMessageDialog(this, "Enter correct first name ", "Error",JOptionPane.ERROR_MESSAGE);
            
            //System.out.println("SUCCESFULL");
         }
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(this, e.getMessage(), "Error",JOptionPane.ERROR_MESSAGE);
              System.out.println("ERROR :" + e);
             
         }
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        try{
        if(jTable1.getSelectedRow()!=-1)
            {
            String r =  (String)jTable1.getValueAt(jTable1.getSelectedRow(), 0);
            
            jTextField1.setText(""+ r);
            }
        else
        { JOptionPane.showMessageDialog(this, "Table is empty ", "empty",JOptionPane.INFORMATION_MESSAGE);
            System.out.print("empty");
        }
        }
        catch(Exception e)
        {
             System.out.print(e);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
