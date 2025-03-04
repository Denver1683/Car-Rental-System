package carrentalsystem;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ViewBook extends javax.swing.JFrame {
    public ViewBook() {
        initComponents();
        setLocationRelativeTo(null);
        try{
        String[] columnName = {"ID","Owner","Rent Date","Return Date","Estimated Fee","Status"};
        DefaultTableModel car = new DefaultTableModel(columnName,0){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        jTable1.setModel(car);
        ArrayList<String> allcars = DataIO.getAllCars();
        String[] carsall = allcars.toArray(new String[0]);
        for(int i=0; i<allcars.size(); i++){
            Car c = DataIO.verifyID(carsall[i]);
                if(carsall[i].equals(c.getId())&&"Unverified".equals(c.getStatus())){
                    String ID = c.getId();
                    String Owner = c.getOwner().getUsername();
                    String RentDate = c.getRentDate();
                    String ReturnDate= c.getReturnDate();
                    int Fee = c.getFees();
                    String Status = c.getStatus();
                    String[] dataRow = {ID,Owner,RentDate,ReturnDate,Integer.toString(Fee),Status};
                    car.addRow(dataRow);
                }
        }  
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "There is no car rent request currently");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        MainMenu = new javax.swing.JButton();
        SendConfirmation = new javax.swing.JButton();
        IDTf = new javax.swing.JTextField();
        OwnerTf = new javax.swing.JTextField();
        RentTf = new javax.swing.JTextField();
        ReturnTf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        FeeTf = new javax.swing.JTextField();
        StatusTf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Exit1 = new javax.swing.JButton();
        Delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel20.setText(" Drive better with us ");

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel21.setText("as your partner.");

        jLabel22.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        jLabel22.setText("CRS");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel21))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Owner", "Rent Date", "Return Date", "Estimated Fee", "Status"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        MainMenu.setText("Main Menu");
        MainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainMenuActionPerformed(evt);
            }
        });

        SendConfirmation.setText("Send Confirmation");
        SendConfirmation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendConfirmationActionPerformed(evt);
            }
        });

        ReturnTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnTfActionPerformed(evt);
            }
        });

        jLabel1.setText("ID:");

        jLabel2.setText("Owner:");

        jLabel3.setText("Rent Date:");

        jLabel4.setText("Return Date:");

        jLabel5.setText("Estimated Fee:");

        jLabel6.setText("Status:");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 80, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(Delete, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(SendConfirmation))
                                    .addComponent(OwnerTf, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(RentTf)
                                    .addComponent(ReturnTf, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(IDTf)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(FeeTf)
                                    .addComponent(StatusTf))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(642, Short.MAX_VALUE)
                    .addComponent(MainMenu)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 714, Short.MAX_VALUE)
                    .addComponent(Exit1)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(IDTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(OwnerTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RentTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ReturnTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FeeTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(StatusTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SendConfirmation)
                    .addComponent(Delete))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(374, Short.MAX_VALUE)
                    .addComponent(MainMenu)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(Exit1)
                    .addGap(0, 378, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainMenuActionPerformed
        new MainMenuAdmin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MainMenuActionPerformed

    private void SendConfirmationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendConfirmationActionPerformed
        try{
            if(IDTf.getText().isEmpty()||OwnerTf.getText().isEmpty()||RentTf.getText().isEmpty()||ReturnTf.getText().isEmpty()||FeeTf.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Please fill all columns");
            }
            else{
                int row = jTable1.getSelectedRow();
                DefaultTableModel book = (DefaultTableModel) jTable1.getModel();
                String ID = IDTf.getText();
                Customer Owner = DataIO.verifyUsername(OwnerTf.getText());
                String RentDate = RentTf.getText();
                String ReturnDate = ReturnTf.getText();
                int Fee = Integer.parseInt(FeeTf.getText());
                String Status = "Verified";
                String message = "Hello "+Owner.getUsername()+". Your car rent has been verified by the admin";
                if(jTable1.getSelectedRowCount()==1){
                    if(RentDate.equals(ReturnDate)){
                        JOptionPane.showMessageDialog(this, "Minimum rent duration is 1 day!");
                    }
                    else{
                        Car c = new Car(ID,Owner,RentDate,ReturnDate,Fee,Status);
                        Car found = CarRentalSystem.editRentedCar;
                        NotificationService d = new NotificationService(Owner.getUsername(),message);
                        if(ID.equals(found.getId())){
                            book.removeRow(jTable1.getSelectedRow());
                            CarRentalSystem.editRentedCar=found;
                            DataIO.allNotifications.add(d);
                            DataIO.allCars.remove(CarRentalSystem.editRentedCar);
                            DataIO.allCars.add(c);
                            JOptionPane.showMessageDialog(this,"Verified Successfully");
                            DataIO.writeToTextFile();
                            new MainMenuAdmin().setVisible(true);
                            this.dispose();
                        }
                        else{
                            if(jTable1.getRowCount()==0){
                                JOptionPane.showMessageDialog(this,"No record");

                            }else{
                                JOptionPane.showMessageDialog(this, "Please select record you want to delete");
                            }
                        }    
                    }
                }
            }    
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Booking not found");
        }
    }//GEN-LAST:event_SendConfirmationActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try{
            int row = jTable1.getSelectedRow();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            IDTf.setText(model.getValueAt(row,0).toString());
            OwnerTf.setText(model.getValueAt(row, 1).toString());
            RentTf.setText(model.getValueAt(row, 2).toString());
            ReturnTf.setText(model.getValueAt(row, 3).toString());
            FeeTf.setText(model.getValueAt(row, 4).toString());
            StatusTf.setText(model.getValueAt(row,5).toString());
            String ID = model.getValueAt(row,0).toString();
            Car found = DataIO.verifyID(ID);
            CarRentalSystem.editRentedCar = found;
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void ReturnTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReturnTfActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        try{
        int row = jTable1.getSelectedRow();
        DefaultTableModel book = (DefaultTableModel) jTable1.getModel();
        String ID = IDTf.getText();
        Customer Owner = DataIO.verifyUsername(OwnerTf.getText());
        String RentDate = RentTf.getText();
        String ReturnDate = ReturnTf.getText();
        int Fee = Integer.parseInt(FeeTf.getText());
        String Status = "Verified";
            if(jTable1.getSelectedRowCount()==1){
                Car c = new Car(ID,Owner,RentDate,ReturnDate,Fee,Status);
                Car found = CarRentalSystem.editRentedCar;
                if(ID.equals(found.getId())){
                    book.removeRow(jTable1.getSelectedRow());
                    CarRentalSystem.editRentedCar=found;
                    DataIO.allCars.remove(CarRentalSystem.editRentedCar);
                    JOptionPane.showMessageDialog(this,"Deleted Successfully");
                    DataIO.writeToTextFile();
                }
                else{
                    if(jTable1.getRowCount()==0){
                        JOptionPane.showMessageDialog(this,"No record");

                    }else{
                        JOptionPane.showMessageDialog(this, "Please select record you want to delete");
                    }
                }    
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Booking not found");
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void Exit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit1ActionPerformed
        new Exit().setVisible(true);
    }//GEN-LAST:event_Exit1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete;
    private javax.swing.JButton Exit1;
    private javax.swing.JTextField FeeTf;
    private javax.swing.JTextField IDTf;
    private javax.swing.JButton MainMenu;
    private javax.swing.JTextField OwnerTf;
    private javax.swing.JTextField RentTf;
    private javax.swing.JTextField ReturnTf;
    private javax.swing.JButton SendConfirmation;
    private javax.swing.JTextField StatusTf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
