package carrentalsystem;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class CEDAdmin extends javax.swing.JFrame {
    public CEDAdmin() {
        initComponents();
        setLocationRelativeTo(null);
        try{
            String[] columnName = {"Username","Password"};
            DefaultTableModel adm = new DefaultTableModel(columnName,0){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
            jTable1.setModel(adm);
            ArrayList<String> alladmin = DataIO.getAllAdmin();
            String[] adminall = alladmin.toArray(new String[0]);
            for(int i=0; i<alladmin.size(); i++){
                Admin c = DataIO.verifyAdmin(adminall[i]);
                    if(adminall[i].equals(c.getUsername())){
                        String username = c.getUsername();
                        String password = c.getPassword();
                        String[] dataRow = {username,password};
                        adm.addRow(dataRow);
                    }
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "There is no registered new admin currently");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        UsernameTf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        PasswordTf = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Create = new javax.swing.JButton();
        Modify = new javax.swing.JButton();
        Exit1 = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        MainMenu = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        SearchTf = new javax.swing.JTextField();
        Search = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("CRS");

        UsernameTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameTfActionPerformed(evt);
            }
        });

        jLabel2.setText("Username:");

        jLabel3.setText("Password:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Username", "Password"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        Create.setText("Create");
        Create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateActionPerformed(evt);
            }
        });

        Modify.setText("Modify");
        Modify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifyActionPerformed(evt);
            }
        });

        Exit1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Exit1.setText("X");
        Exit1.setToolTipText("");
        Exit1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Exit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit1ActionPerformed(evt);
            }
        });

        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        MainMenu.setText("Back to Main Menu");
        MainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainMenuActionPerformed(evt);
            }
        });

        jLabel4.setText("Search Username:");

        SearchTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchTfActionPerformed(evt);
            }
        });

        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UsernameTf)
                            .addComponent(PasswordTf)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Exit1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(MainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Create)
                                .addGap(118, 118, 118)
                                .addComponent(Modify)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Delete))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SearchTf, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Search)
                                .addGap(68, 68, 68))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Exit1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SearchTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Search))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(UsernameTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(PasswordTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(MainMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Create)
                    .addComponent(Modify)
                    .addComponent(Delete))
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Exit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit1ActionPerformed
        new Exit().setVisible(true);
    }//GEN-LAST:event_Exit1ActionPerformed

    private void UsernameTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameTfActionPerformed

    private void CreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateActionPerformed
        if (UsernameTf.getText().isEmpty()||PasswordTf.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Missing Information!");
        }
        else{
            int row = jTable1.getSelectedRow();
            DefaultTableModel adm = (DefaultTableModel) jTable1.getModel();
            String Username = UsernameTf.getText();
            String Password = PasswordTf.getText();
            Admin found = DataIO.verifyAdmin(Username);
            Customer cfound = DataIO.verifyUsername(Username);
            if(found== null && cfound == null){
                Admin c = new Admin (Username,Password);
                DataIO.allAdmin.add(c);
                String[] rowData = {Username,Password};
                adm.addRow(rowData);
                DataIO.writeToTextFile();
                JOptionPane.showMessageDialog(null, "Added new admin sucessfully");
            }
            else{
                JOptionPane.showMessageDialog(null, "Customer/Admin with existing username exists!");
            }
        }
    }//GEN-LAST:event_CreateActionPerformed

    private void ModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifyActionPerformed
        try{
        int row = jTable1.getSelectedRow();
        DefaultTableModel adm = (DefaultTableModel) jTable1.getModel();
        if (UsernameTf.getText().isEmpty()||PasswordTf.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Missing Information!");
        }
        else{
            String username = UsernameTf.getText();
            String password = PasswordTf.getText();
            Customer found = DataIO.verifyUsername(username);
            Admin afound = DataIO.verifyAdmin(username);
            Admin oldadmin = CarRentalSystem.editAdmin;
            //CarRentalSystem.editUser=found;
            String oldusername = oldadmin.getUsername();
            if((found == null && oldusername.equals(username)==false)|| (found != null && oldusername.equals(username)==true)||
                !"Denver".equals(username)||!"ZhenWei".equals(username)||(afound == null && oldusername.equals(username)==false)
                    || (afound != null && oldusername.equals(username)==true)){
                Admin c = new Admin(username,password);
                DataIO.allAdmin.remove(CarRentalSystem.editAdmin);
                DataIO.allAdmin.add(c);
                adm.setValueAt(username,row, 0);
                adm.setValueAt(password, row, 1);
                DataIO.writeToTextFile();
                JOptionPane.showMessageDialog(this,"Modified successfully");
            }
            else{
                if(adm.getRowCount()==0){
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
    }//GEN-LAST:event_ModifyActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        try{
            if (UsernameTf.getText().isEmpty()||PasswordTf.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Missing Information!");
            }
            else{
                int row = jTable1.getSelectedRow();
                DefaultTableModel adm = (DefaultTableModel) jTable1.getModel();
                String username = adm.getValueAt(row,0).toString();
                String password = adm.getValueAt(row,1).toString();
                if(jTable1.getSelectedRowCount()==1){
                    Admin c = new Admin(username,password);
                    Admin found = CarRentalSystem.editAdmin;
                    if(username.equals(found.getUsername())){
                        adm.removeRow(jTable1.getSelectedRow());
                        CarRentalSystem.editAdmin=found;
                        DataIO.allAdmin.remove(CarRentalSystem.editAdmin);
                        JOptionPane.showMessageDialog(this,"Deleted Successfully");
                        DataIO.writeToTextFile();
                    }
                }else{
                    if(jTable1.getRowCount()==0){
                        JOptionPane.showMessageDialog(this,"No record");

                    }else{
                        JOptionPane.showMessageDialog(this, "Please select record you want to delete");
                    }
                }
            }    
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Unknown error, please retry");
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void MainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainMenuActionPerformed
        new MainMenuAdmin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MainMenuActionPerformed

    private void SearchTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchTfActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        String SearchCust = SearchTf.getText();
        Admin c = DataIO.verifyAdmin(SearchCust);
        try{
            if(SearchCust.equals(c.getUsername())){
                CarRentalSystem.editAdmin=c;
                String password = c.getPassword();
                UsernameTf.setText(c.getUsername());
                PasswordTf.setText(password);               
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Admin Not found!");
        }
    }//GEN-LAST:event_SearchActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try{
            int row = jTable1.getSelectedRow();
            DefaultTableModel adm = (DefaultTableModel) jTable1.getModel();
            UsernameTf.setText(adm.getValueAt(row,0).toString());
            PasswordTf.setText(adm.getValueAt(row, 1).toString());
            String username = adm.getValueAt(row, 0).toString();
            Admin found = DataIO.verifyAdmin(username);      
            CarRentalSystem.editAdmin = found;
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(CEDAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CEDAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CEDAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CEDAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CEDAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Create;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Exit1;
    private javax.swing.JButton MainMenu;
    private javax.swing.JButton Modify;
    private javax.swing.JTextField PasswordTf;
    private javax.swing.JButton Search;
    private javax.swing.JTextField SearchTf;
    private javax.swing.JTextField UsernameTf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
