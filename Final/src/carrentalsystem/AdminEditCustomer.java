/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrentalsystem;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author flore
 */
public class AdminEditCustomer extends javax.swing.JFrame {

    /**
     * Creates new form ListCust_Admin
     */
    public AdminEditCustomer() {
        initComponents();
        setLocationRelativeTo(null);
        UsernameTf.setEditable(false);
        try{
        String[] columnName = {"Username","Password","Gender","Age","Phone","Email","Address"};
        DefaultTableModel cust = new DefaultTableModel(columnName,0){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        jTable1.setModel(cust);
        ArrayList<String> allcust = DataIO.getAllCustomers();
        String[] custall = allcust.toArray(new String[0]);
        for(int i=0; i<allcust.size(); i++){
            Customer c = DataIO.verifyUsername(custall[i]);
                if(custall[i].equals(c.getUsername())){
                    String username = c.getUsername();
                    String password = c.getPassword();
                    String gender = c.getGender();
                    String age = Integer.toString(c.getAge());
                    String phone = Integer.toString(c.getPhoneNum());
                    String email = c.getEmail();
                    String address = c.getAddress();
                    String[] dataRow = {username,password,gender,age,phone,email,address};
                    cust.addRow(dataRow);
                }
        }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "There is no registered customer currently");
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

        jLabel1 = new javax.swing.JLabel();
        Exit1 = new javax.swing.JButton();
        MainMenu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        UsernameTf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        AgeTf = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        PhoneTf = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        EmailTf = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        AddressTf = new javax.swing.JTextField();
        Save = new javax.swing.JButton();
        PasswordTf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Delete = new javax.swing.JButton();
        GenderTf = new javax.swing.JComboBox<>();
        SearchTf = new javax.swing.JTextField();
        Search = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("CRS");

        Exit1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Exit1.setText("X");
        Exit1.setToolTipText("");
        Exit1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Exit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit1ActionPerformed(evt);
            }
        });

        MainMenu.setText("Main Menu");
        MainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainMenuActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Password", "Gender", "Age", "Number Phone", "Email", "Address"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("ADD/EDIT CUSTOMER INFORMATION");

        jLabel3.setText("Username: ");

        UsernameTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameTfActionPerformed(evt);
            }
        });

        jLabel5.setText("Gender:");

        jLabel6.setText("Age:");

        jLabel7.setText("Phone Number:");

        jLabel8.setText("Email:");

        jLabel9.setText("Address:");

        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        jLabel4.setText("Password:");

        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        GenderTf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        GenderTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenderTfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(Delete)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                                    .addComponent(Save))
                                .addComponent(AddressTf, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(EmailTf, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(PhoneTf, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(AgeTf, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(UsernameTf, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(GenderTf, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PasswordTf))
                        .addGap(125, 125, 125))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UsernameTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PasswordTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GenderTf, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AgeTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PhoneTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EmailTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddressTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        SearchTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchTfActionPerformed(evt);
            }
        });
        SearchTf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SearchTfKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchTfKeyReleased(evt);
            }
        });

        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        jLabel10.setText("Drive better with us as your partner");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SearchTf, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Search))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(MainMenu)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Exit1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(layout.createSequentialGroup()
                .addComponent(Exit1)
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MainMenu)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainMenuActionPerformed
        new MainMenuAdmin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MainMenuActionPerformed

    private void SearchTfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchTfKeyPressed
     
    }//GEN-LAST:event_SearchTfKeyPressed

    private void SearchTfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchTfKeyReleased
       
    }//GEN-LAST:event_SearchTfKeyReleased

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        String SearchCust = SearchTf.getText();
        Customer c = DataIO.verifyUsername(SearchCust);
        int check = 0;
        try{
            if(SearchCust.equals(c.getUsername())){
                CarRentalSystem.editUser=c;
                String password = c.getPassword();
                String gender = c.getGender();
                int age = c.getAge();
                int phone = c.getPhoneNum();
                String email = c.getEmail();
                String address = c.getAddress();
                check = 1;
                UsernameTf.setText(c.getUsername());
                PasswordTf.setText(password);
                GenderTf.setSelectedItem(gender);
                AgeTf.setText(Integer.toString(age));
                PhoneTf.setText(Integer.toString(phone));
                EmailTf.setText(email);
                AddressTf.setText(address);
                
                if(check == 0){
                    JOptionPane.showMessageDialog(this,"Customer Not found!");
                    setVisible(false);
                    dispose();
                    new AdminEditCustomer().setVisibile(true);
                }
            }
        }
        catch(Exception e){
        }
    }//GEN-LAST:event_SearchActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        try{
        int row = jTable1.getSelectedRow();
        DefaultTableModel cust = (DefaultTableModel) jTable1.getModel();
        if (UsernameTf.getText().isEmpty()||PasswordTf.getText().isEmpty()||GenderTf.getSelectedItem()==null||AgeTf.getText().isEmpty()||PhoneTf.getText().isEmpty()||EmailTf.getText().isEmpty()||AddressTf.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Missing Information!");
        }
        else{
            String username = UsernameTf.getText();
            String password = PasswordTf.getText();
            String gender = GenderTf.getSelectedItem().toString();
            int age = Integer.parseInt(AgeTf.getText());
            int phone = Integer.parseInt(PhoneTf.getText());
            String email = EmailTf.getText();
            String address = AddressTf.getText();
            Customer found = DataIO.verifyUsername(username);
            Admin afound = DataIO.verifyAdmin(username);
            Customer olduser = CarRentalSystem.editUser;
            String oldusername = olduser.getUsername();
            if((found == null && oldusername.equals(username)==false)|| (found != null && oldusername.equals(username)==true)||
                !"Denver".equals(username)||!"ZhenWei".equals(username)||(afound == null && oldusername.equals(username)==false)
                    || (afound != null && oldusername.equals(username)==true)){
                Customer c = new Customer(username,password,gender,age,phone,email,address);
                DataIO.allCustomers.remove(CarRentalSystem.editUser);
                DataIO.allCustomers.add(c);
                cust.setValueAt(username,row, 0);
                cust.setValueAt(password, row, 1);
                cust.setValueAt(gender, row, 2);
                cust.setValueAt(age, row, 3);
                cust.setValueAt(phone, row, 4);
                cust.setValueAt(email, row, 5);
                cust.setValueAt(address, row, 6);
                DataIO.writeToTextFile();
                JOptionPane.showMessageDialog(this,"Modifying successfully");
            }
            else{
                if(cust.getRowCount()==0){
                    JOptionPane.showMessageDialog(this,"No record");
                }
                else{
                    JOptionPane.showMessageDialog(this, "Please select record you want to modify");
                }
            }
        }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Invalid input");
        }
    }//GEN-LAST:event_SaveActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try{
            int row = jTable1.getSelectedRow();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            UsernameTf.setText(model.getValueAt(row,0).toString());
            PasswordTf.setText(model.getValueAt(row, 1).toString());
            GenderTf.setSelectedItem(model.getValueAt(row, 2).toString());
            AgeTf.setText(model.getValueAt(row, 3).toString());
            PhoneTf.setText(model.getValueAt(row, 4).toString());
            EmailTf.setText(model.getValueAt(row, 5).toString());
            AddressTf.setText(model.getValueAt(row, 6).toString());
            String username = model.getValueAt(row, 0).toString();
            Customer found = DataIO.verifyUsername(username);      
            CarRentalSystem.editUser = found;
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        try{
            if (UsernameTf.getText().isEmpty()||PasswordTf.getText().isEmpty()||GenderTf.getSelectedItem()==null||AgeTf.getText().isEmpty()||PhoneTf.getText().isEmpty()||EmailTf.getText().isEmpty()||AddressTf.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Missing Information!");
            }
            else{
                DefaultTableModel cust = (DefaultTableModel) jTable1.getModel();
                String username = UsernameTf.getText();
                Customer found = CarRentalSystem.editUser;
                Car OnRent = DataIO.UserOnRent(username);
                if(username.equals(found.getUsername())&& OnRent == null){
                    cust.removeRow(jTable1.getSelectedRow());
                    CarRentalSystem.editUser=found;
                    DataIO.allCustomers.remove(CarRentalSystem.editUser);
                    JOptionPane.showMessageDialog(this,"Deleted Successfully");
                    DataIO.writeToTextFile();
                }
                else{
                    JOptionPane.showMessageDialog(null, "User Not Found / User still have car on rent");
                }
            }    
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Unknown error, please retry!");
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void UsernameTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameTfActionPerformed

    private void Exit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit1ActionPerformed
        new Exit().setVisible(true);
    }//GEN-LAST:event_Exit1ActionPerformed

    private void GenderTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenderTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenderTfActionPerformed

    private void SearchTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchTfActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(AdminEditCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminEditCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminEditCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminEditCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminEditCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddressTf;
    private javax.swing.JTextField AgeTf;
    private javax.swing.JButton Delete;
    private javax.swing.JTextField EmailTf;
    private javax.swing.JButton Exit1;
    private javax.swing.JComboBox<String> GenderTf;
    private javax.swing.JButton MainMenu;
    private javax.swing.JTextField PasswordTf;
    private javax.swing.JTextField PhoneTf;
    private javax.swing.JButton Save;
    private javax.swing.JButton Search;
    private javax.swing.JTextField SearchTf;
    private javax.swing.JTextField UsernameTf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void setVisibile(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
