import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import javax.swing.JOptionPane;

/*z
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Entry_OR_Exit extends javax.swing.JFrame {

    /**
     * Creates new form Entry_OR_Exit
     */
    int radio_vehicle_check = -99;
    
    public Entry_OR_Exit() {
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

        jLabel2 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        Entry_button = new javax.swing.JButton();
        Exit_button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        logout_button = new javax.swing.JButton();
        wheeler2_radio_button = new javax.swing.JRadioButton();
        wheeler4_radio_button = new javax.swing.JRadioButton();
        Other_radio_button = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Parking Management System");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 400, 50));

        Entry_button.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Entry_button.setText("ENTRY");
        Entry_button.setBorder(null);
        Entry_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Entry_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(Entry_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 90, 40));

        Exit_button.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Exit_button.setText("EXIT");
        Exit_button.setBorder(null);
        Exit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(Exit_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 410, 80, 40));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Welcome To Parking Management System.\nThis Software is made as a DBMS mini-project by students \nof PICT , pune.");
        jTextArea1.setBorder(null);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 540, 180));

        logout_button.setBackground(new java.awt.Color(204, 204, 255));
        logout_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        logout_button.setText("LogOut");
        logout_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(logout_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 90, 32));

        wheeler2_radio_button.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(wheeler2_radio_button);
        wheeler2_radio_button.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        wheeler2_radio_button.setText("2-Wheeler");
        wheeler2_radio_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wheeler2_radio_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(wheeler2_radio_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        buttonGroup1.add(wheeler4_radio_button);
        wheeler4_radio_button.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        wheeler4_radio_button.setText("4-Wheeler");
        wheeler4_radio_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wheeler4_radio_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(wheeler4_radio_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, -1, -1));

        buttonGroup1.add(Other_radio_button);
        Other_radio_button.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Other_radio_button.setText("Other");
        Other_radio_button.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Other_radio_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Other_radio_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(Other_radio_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, 80, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Desktop\\DBMS Project\\Parking_Project\\Images\\oak-wood.jpg")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Entry_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Entry_buttonActionPerformed
        // TODO add your handling code here:
        /*
        setVisible(false);
        new Vehicle_type_check().setVisible(true);
       */
        try
        {
            MongoClient mc = new MongoClient("localhost", 27017);
            DB db = mc.getDB("parking_system");
            DBCollection collection = db.getCollection("vehicle_count");
                
            if(radio_vehicle_check == -99)
                JOptionPane.showMessageDialog(null, "Please Chhose Vehicle Type");
            else
            {
                if(radio_vehicle_check == 2)
                {
                    int count_bike;
                    BasicDBObject query = new BasicDBObject();
                    BasicDBObject field = new BasicDBObject();
                    field.put("wheeler_2", 1);
                    DBCursor cursor = collection.find(query, field);

                    BasicDBObject obj = (BasicDBObject) cursor.next();
                    count_bike = obj.getInt("wheeler_2");
                    System.out.println(count_bike);

                    if (count_bike < 50) 
                    {
                    /*BasicDBObject searchUpdate = new BasicDBObject();
                    searchUpdate.append("wheeler_2", count_bike);

                    BasicDBObject UpdateObject = new BasicDBObject();
                    UpdateObject.append("$set", new BasicDBObject("wheeler_2", count_bike + 1));

                    collection.update(searchUpdate, UpdateObject);
                    */
                        setVisible(false);
                        new Veehicle_entry(radio_vehicle_check).setVisible(true);
                    }
                    else 
                    {
                        JOptionPane.showMessageDialog(null, "No Available Space For Parking 2 Wheelers");
                    }
                }
            
                else if(radio_vehicle_check == 4)
                {
                    int count_car;
            
                    BasicDBObject query = new BasicDBObject();
                    BasicDBObject field = new BasicDBObject();
                    field.put("wheeler_4",1);
                    DBCursor cursor = collection.find(query,field);
        
                    BasicDBObject obj = (BasicDBObject)cursor.next();
                    count_car = obj.getInt("wheeler_4");
                    System.out.println(count_car);
                    
                    if(count_car < 50)
                    {
                    /*
                    BasicDBObject searchUpdate = new BasicDBObject();
                    searchUpdate.append("wheeler_4", count_car);

                    BasicDBObject UpdateObject = new BasicDBObject();
                    UpdateObject.append("$set", new BasicDBObject("wheeler_4",count_car+1));

                    collection.update(searchUpdate, UpdateObject);
                    */
                        setVisible(false);
                        new Veehicle_entry(radio_vehicle_check).setVisible(true);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "No Available Space For Parking 2 Wheelers");
                    }                   
                }
                else
                {
                    int count_other;

                    BasicDBObject query = new BasicDBObject();
                    BasicDBObject field = new BasicDBObject();
                    field.put("other", 1);
                    DBCursor cursor = collection.find(query, field);

                    BasicDBObject obj = (BasicDBObject) cursor.next();
                    count_other = obj.getInt("other");
                    System.out.println(count_other);
                    
                    
                    if (count_other < 50) 
                    {
                    /*
                    BasicDBObject searchUpdate = new BasicDBObject();
                    searchUpdate.append("other", count_other);
                    
                    BasicDBObject UpdateObject = new BasicDBObject();
                    UpdateObject.append("$set", new BasicDBObject("other", count_other + 1));

                    collection.update(searchUpdate, UpdateObject);

                    */
                        setVisible(false);
                        new Veehicle_entry(radio_vehicle_check).setVisible(true);
                    }
                    else 
                    {
                        JOptionPane.showMessageDialog(null, "No Available Space For Parking Trucks");
                    }
                }
            }
        }
        catch(Exception e)
        {
        
        }
    }//GEN-LAST:event_Entry_buttonActionPerformed

    private void Exit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit_buttonActionPerformed
        // TODO add your handling code here:
        
        try
        {
            MongoClient mc = new MongoClient("localhost", 27017);
            DB db = mc.getDB("parking_system");
            DBCollection collection = db.getCollection("vehicle_count");
                
            if(radio_vehicle_check == -99)
                JOptionPane.showMessageDialog(null, "Please Chhose Vehicle Type");
            else
            {
                if(radio_vehicle_check == 2)
                {
                    int count_bike;
                    BasicDBObject query = new BasicDBObject();
                    BasicDBObject field = new BasicDBObject();
                    field.put("wheeler_2", 1);
                    DBCursor cursor = collection.find(query, field);

                    BasicDBObject obj = (BasicDBObject) cursor.next();
                    count_bike = obj.getInt("wheeler_2");
                    System.out.println(count_bike);

                    if (count_bike == 0) 
                    {
                        JOptionPane.showMessageDialog(null,"No 2 Wheelers in the Parking!");
                    }
                    else 
                    {
                        setVisible(false);
                        new Vehicle_exit(radio_vehicle_check).setVisible(true);
                    }
                }
            
                else if(radio_vehicle_check == 4)
                {
                    int count_car;
            
                    BasicDBObject query = new BasicDBObject();
                    BasicDBObject field = new BasicDBObject();
                    field.put("wheeler_4",1);
                    DBCursor cursor = collection.find(query,field);
        
                    BasicDBObject obj = (BasicDBObject)cursor.next();
                    count_car = obj.getInt("wheeler_4");
                    System.out.println(count_car);
                    
                    if(count_car == 0 )
                    {
                        JOptionPane.showMessageDialog(null,"No 4 Wheelers in the Parking!");
                    }
                    else
                    {
                        setVisible(false);
                        new Vehicle_exit(radio_vehicle_check).setVisible(true);
                    }                   
                }
                else
                {
                    int count_other;

                    BasicDBObject query = new BasicDBObject();
                    BasicDBObject field = new BasicDBObject();
                    field.put("other", 1);
                    DBCursor cursor = collection.find(query, field);

                    BasicDBObject obj = (BasicDBObject) cursor.next();
                    count_other = obj.getInt("other");
                    System.out.println(count_other);
                    
                    
                    if (count_other == 0) 
                    {
                        JOptionPane.showMessageDialog(null,"No Others in the Parking!");
                    }
                    else 
                    {
                        setVisible(false);
                        new Vehicle_exit(radio_vehicle_check).setVisible(true);
                    }
                }
            }
        }
        catch(Exception e)
        {
            System.err.println(e);
        }
    }//GEN-LAST:event_Exit_buttonActionPerformed

    private void logout_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_buttonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new login_page().setVisible(true);
    }//GEN-LAST:event_logout_buttonActionPerformed

    private void wheeler2_radio_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wheeler2_radio_buttonActionPerformed
        // TODO add your handling code here:
        radio_vehicle_check = 2;
    }//GEN-LAST:event_wheeler2_radio_buttonActionPerformed

    private void wheeler4_radio_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wheeler4_radio_buttonActionPerformed
        // TODO add your handling code here:
        radio_vehicle_check = 4;
    }//GEN-LAST:event_wheeler4_radio_buttonActionPerformed

    private void Other_radio_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Other_radio_buttonActionPerformed
        // TODO add your handling code here:
        radio_vehicle_check = 6;
    }//GEN-LAST:event_Other_radio_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(Entry_OR_Exit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Entry_OR_Exit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Entry_OR_Exit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Entry_OR_Exit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Entry_OR_Exit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Entry_button;
    private javax.swing.JButton Exit_button;
    private javax.swing.JRadioButton Other_radio_button;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton logout_button;
    private javax.swing.JRadioButton wheeler2_radio_button;
    private javax.swing.JRadioButton wheeler4_radio_button;
    // End of variables declaration//GEN-END:variables
}
