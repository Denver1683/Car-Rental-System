package carrentalsystem;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CollectPayment extends javax.swing.JFrame {
    public CollectPayment() {
        initComponents();
        setLocationRelativeTo(null);
        try{
        String[] columnName = {"Name","License Plate","Rent Date","Return Date","Fees","Delayed Days","Fine"};
        DefaultTableModel cust = new DefaultTableModel(columnName,0);
        jTable1.setModel(cust);
        ArrayList<String> allhist = DataIO.getAllCarsReturned();
        String[] histall = allhist.toArray(new String[0]);
        ArrayList<String> alldate = DataIO.getAllCarsReturnedDate();
        String[] dateall = alldate.toArray(new String[0]);
        for(int i=0; i<allhist.size(); i++){
            CarReturn c = DataIO.verifyCarwDate(histall[i],dateall[i]);
                if(histall[i].equals(c.getId())&& "Uncollected".equals(c.getCollect())){
                    String username = c.getOwner().getUsername();
                    String id = c.getId();
                    String RentDate = c.getRentDate();
                    String ReturnDate = c.getReturnDate();
                    String fees = Integer.toString(c.getFees());
                    String delay = Integer.toString(c.getDelayedDays());
                    String fine = Integer.toString(c.getFine());
                    String[] dataRow = {username,id,RentDate,ReturnDate,fees,delay,fine};
                    cust.addRow(dataRow);
                }
        }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "There is no payment to collect currently");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Exit1 = new javax.swing.JButton();
        MainMenu = new javax.swing.JButton();
        Collect = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        NameTf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        IDTf = new javax.swing.JTextField();
        RentTf = new javax.swing.JTextField();
        ReturnTf = new javax.swing.JTextField();
        FeeTf = new javax.swing.JTextField();
        DelayTf = new javax.swing.JTextField();
        FineTf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "License Plate", "Rent Date", "Return Date", "Fees", "Delayed Days", "Fine"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

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

        Collect.setText("Collect Payment");
        Collect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CollectActionPerformed(evt);
            }
        });

        jLabel1.setText("Name:");

        jLabel2.setText("License Plate:");

        ReturnTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnTfActionPerformed(evt);
            }
        });

        jLabel3.setText("Rent Date:");

        jLabel4.setText("Return Date:");

        jLabel5.setText("Fee:");

        jLabel6.setText("Delayed Days:");

        jLabel7.setText("Fine:");

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel8.setText("CRS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(NameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(IDTf, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RentTf, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ReturnTf, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FeeTf, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DelayTf, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FineTf, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 785, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(MainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Collect))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 1064, Short.MAX_VALUE)
                    .addComponent(Exit1)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NameTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(IDTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(5, 5, 5)
                        .addComponent(RentTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(4, 4, 4)
                        .addComponent(ReturnTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(2, 2, 2)
                        .addComponent(FeeTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(2, 2, 2)
                        .addComponent(DelayTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FineTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MainMenu)
                    .addComponent(Collect))
                .addGap(13, 13, 13))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(Exit1)
                    .addGap(0, 463, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainMenuActionPerformed
        new MainMenuAdmin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MainMenuActionPerformed

    private void CollectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CollectActionPerformed
        try{
            if (NameTf.getText().isEmpty()||IDTf.getText().isEmpty()||RentTf.getText().isEmpty()||ReturnTf.getText().isEmpty()||FeeTf.getText().isEmpty()||DelayTf.getText().isEmpty()||FineTf.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Missing Information!");
            }
            else{
                int row = jTable1.getSelectedRow();
                DefaultTableModel adm = (DefaultTableModel) jTable1.getModel();
                Customer name = DataIO.verifyUsername(NameTf.getText());
                String id = IDTf.getText();
                String RentDate = RentTf.getText();
                String ReturnDate = ReturnTf.getText();
                int fee = Integer.parseInt(FeeTf.getText());
                int Delay = Integer.parseInt(DelayTf.getText());
                int fine = Integer.parseInt(FineTf.getText()); 
                String collect = "Collected";
                if(jTable1.getSelectedRowCount()==1){
                    CarReturn c = new CarReturn(name,id,RentDate,ReturnDate,fee,Delay,fine,collect);
                    CarReturn found = DataIO.verifyCar(id);
                    if(id.equals(found.getId())){
                        adm.removeRow(jTable1.getSelectedRow());
                        DataIO.allCarsReturned.remove(CarRentalSystem.editReturnedCar);
                        DataIO.allCarsReturned.add(c);
                        DataIO.writeToTextFile();
                        CarRent d = DataIO.findID(id);
                        String brand = d.getBrand();
                        String model = d.getModel();
                        String color = d.getColor();
                        JOptionPane.showMessageDialog(this,"Payment Taken Successfully");
                        new FineReceipt(name.getUsername(),id,brand,model,color,fee,RentDate,ReturnDate,Delay,fine).setVisible(true);
//                        JOptionPane.showMessageDialog(null,"System needs to restart to refresh database, please re-run manually");
//                        System.exit(0);
                    }
                    else{
                        JOptionPane.showMessageDialog(this,"Customer registration not found");
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
            JOptionPane.showMessageDialog(null, "Unknown error, please retry!");
        }
    }//GEN-LAST:event_CollectActionPerformed

    private void ReturnTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReturnTfActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try{            
            int row = jTable1.getSelectedRow();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            NameTf.setText(model.getValueAt(row,0).toString());
            IDTf.setText(model.getValueAt(row, 1).toString());
            RentTf.setText(model.getValueAt(row, 2).toString());
            ReturnTf.setText(model.getValueAt(row, 3).toString());
            FeeTf.setText(model.getValueAt(row, 4).toString());
            DelayTf.setText(model.getValueAt(row, 5).toString());
            FineTf.setText(model.getValueAt(row, 6).toString());
            String id = model.getValueAt(row, 1).toString();
            String RentDate = model.getValueAt(row, 2).toString();
            CarReturn found = DataIO.verifyCarwDate(id,RentDate); 
            CarRentalSystem.editReturnedCar = found;
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void Exit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit1ActionPerformed
        new Exit().setVisible(true);
    }//GEN-LAST:event_Exit1ActionPerformed

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
            java.util.logging.Logger.getLogger(CollectPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CollectPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CollectPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CollectPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CollectPayment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Collect;
    private javax.swing.JTextField DelayTf;
    private javax.swing.JButton Exit1;
    private javax.swing.JTextField FeeTf;
    private javax.swing.JTextField FineTf;
    private javax.swing.JTextField IDTf;
    private javax.swing.JButton MainMenu;
    private javax.swing.JTextField NameTf;
    private javax.swing.JTextField RentTf;
    private javax.swing.JTextField ReturnTf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
