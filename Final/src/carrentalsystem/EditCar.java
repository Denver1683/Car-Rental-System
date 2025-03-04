package carrentalsystem;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EditCar extends javax.swing.JFrame {
    public EditCar() {
        initComponents();
        setLocationRelativeTo(null);
        IDTf.setEditable(false);
        try{
        String[] columnName = {"Brand","Model","Color","License Plate(ID)","Fee"};
        DefaultTableModel car = new DefaultTableModel(columnName,0){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        jTable1.setModel(car);
        ArrayList<String> allcars = DataIO.getAllCarsOwned();
        String[] carsall = allcars.toArray(new String[0]);
        for(int i=0; i<allcars.size(); i++){
            CarRent c = DataIO.findID(carsall[i]);
            Car d = DataIO.verifyID(carsall[i]);
                if(carsall[i].equals(c.getId()) && d==null){
                    String Brand = c.getBrand();
                    String Model = c.getModel();
                    String Color = c.getColor();
                    String ID = c.getId();
                    int Fee = c.getFees();
                    String[] dataRow = {Brand,Model,Color,ID,Integer.toString(Fee)};
                    car.addRow(dataRow);
                }
        }  
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "There is no car available to edit currently");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        FindID = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BrandTf = new javax.swing.JTextField();
        ModelTf = new javax.swing.JTextField();
        ColorTf = new javax.swing.JTextField();
        IDTf = new javax.swing.JTextField();
        FeeTf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        MainMenu = new javax.swing.JButton();
        Modify = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Exit1 = new javax.swing.JButton();
        Available = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        OnRent = new javax.swing.JButton();
        AllCars = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        FindID.setText("Search");
        FindID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindIDActionPerformed(evt);
            }
        });

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel20.setText(" Drive better with us ");

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel21.setText("as your partner.");

        jLabel22.setFont(new java.awt.Font("MV Boli", 1, 36)); // NOI18N
        jLabel22.setText("CRS");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel20)
                .addGap(0, 28, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(jLabel21))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jLabel22)
                .addGap(18, 18, 18)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Brand", "Model", "Color", "ID", "Fee"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setRowHeight(25);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Brand:");

        jLabel2.setText("Model:");

        jLabel5.setText("Color:");

        jLabel6.setText("License Plate / ID:");

        jLabel7.setText("Fee:");

        MainMenu.setText("Main Menu");
        MainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainMenuActionPerformed(evt);
            }
        });

        Modify.setText("Modify");
        Modify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifyActionPerformed(evt);
            }
        });

        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
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

        Available.setText("Cars Available");
        Available.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AvailableActionPerformed(evt);
            }
        });

        jLabel3.setText("view by:");

        OnRent.setText("Cars On Rent");
        OnRent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnRentActionPerformed(evt);
            }
        });

        AllCars.setText("All Cars");
        AllCars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllCarsActionPerformed(evt);
            }
        });

        jLabel4.setText("*default is cars available");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Available)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(OnRent)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AllCars)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addGap(0, 16, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Exit1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ColorTf)
                            .addComponent(ModelTf)
                            .addComponent(FeeTf)
                            .addComponent(BrandTf)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(IDTf, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(FindID))
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(MainMenu)
                                .addGap(109, 109, 109)
                                .addComponent(Delete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Modify, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1))
                    .addComponent(Exit1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BrandTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(1, 1, 1)
                .addComponent(ModelTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(4, 4, 4)
                .addComponent(ColorTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FindID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(2, 2, 2)
                .addComponent(FeeTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Available)
                    .addComponent(jLabel3)
                    .addComponent(OnRent)
                    .addComponent(AllCars)
                    .addComponent(jLabel4))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MainMenu)
                    .addComponent(Modify)
                    .addComponent(Delete))
                .addContainerGap(15, Short.MAX_VALUE))
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FindIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindIDActionPerformed
        String SearchID = IDTf.getText().toUpperCase();
        CarRent c = DataIO.findID(SearchID);
        try{
            if(SearchID.equals(c.getId())){
                CarRentalSystem.editCar=c;
                String Brand = c.getBrand();
                String Model = c.getModel();
                String Color = c.getColor();
                String ID = c.getId();
                int Fee = c.getFees();
                BrandTf.setText(Brand);
                ModelTf.setText(Model);
                ColorTf.setText(Color);
                IDTf.setText(ID);
                FeeTf.setText(Integer.toString(Fee));
            }    
            else{
                JOptionPane.showMessageDialog(this,"Car Not found!");
            }
        }
        catch(Exception e){
        }
    }//GEN-LAST:event_FindIDActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try{
            int selectedRow = jTable1.getSelectedRow();
            DefaultTableModel cars = (DefaultTableModel)jTable1.getModel();
            BrandTf.setText(cars.getValueAt(selectedRow, 0).toString());
            ModelTf.setText(cars.getValueAt(selectedRow, 1).toString());
            ColorTf.setText(cars.getValueAt(selectedRow, 2).toString());
            IDTf.setText(cars.getValueAt(selectedRow, 3).toString());
            FeeTf.setText(cars.getValueAt(selectedRow, 4).toString());
            String id = cars.getValueAt(selectedRow, 3).toString();
            CarRent found = DataIO.findID(id);      
            CarRentalSystem.editCar= found;
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Invalid Input!");
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void ModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifyActionPerformed
        if( BrandTf.getText().isEmpty() || ModelTf.getText().isEmpty() || ColorTf.getText().isEmpty() || IDTf.getText().isEmpty() || FeeTf.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Missing Information!");
        }else{
            try {
                int row = jTable1.getSelectedRow();
                DefaultTableModel cars = (DefaultTableModel) jTable1.getModel();
                String brand = BrandTf.getText().toUpperCase();
                String model = ModelTf.getText();
                String color = ColorTf.getText();
                String id = IDTf.getText().toUpperCase();
                int fee = Integer.parseInt(FeeTf.getText());
                CarRent found = DataIO.findID(id);
                CarRent oldID = CarRentalSystem.editCar;
                Car d= DataIO.verifyID(id);
                String oldid = oldID.getId();
                if (found != null && oldid.equals(id)==true && d==null) {  
                    if(jTable1.getSelectedRowCount()==1){
                        CarRent c = new CarRent(brand,model,color,id,fee);
                        DataIO.allCarsOwned.remove(CarRentalSystem.editCar);
                        DataIO.allCarsOwned.add(c);
                        cars.setValueAt(BrandTf.getText(),row, 0);
                        cars.setValueAt(ModelTf.getText(), row, 1);
                        cars.setValueAt(ColorTf.getText(), row, 2);
                        cars.setValueAt(IDTf.getText(), row, 3);
                        cars.setValueAt(FeeTf.getText(), row, 4); 
                        DataIO.writeToTextFile();
                        JOptionPane.showMessageDialog(this, "Updated successfully!");
                    }
                    else {
                    JOptionPane.showMessageDialog(this, "Please select row from table!");
                    }
                }
                else {
                    JOptionPane.showMessageDialog(this, "ID has been used or car is currently on rent!");
                }
            }
            catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Invalid Input!");
        }
        }
    }//GEN-LAST:event_ModifyActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        if( BrandTf.getText().isEmpty() || ModelTf.getText().isEmpty() || ColorTf.getText().isEmpty() || IDTf.getText().isEmpty() || FeeTf.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Missing Information!");
        }else{
            try {
                int row = jTable1.getSelectedRow();
                DefaultTableModel cars = (DefaultTableModel) jTable1.getModel();
                String id = IDTf.getText();
                CarRent found = DataIO.findID(id);
                Car d= DataIO.verifyID(id);
                CarRentalSystem.editCar=found;
                if (found != null && d==null) {  
                    if(jTable1.getSelectedRowCount()==1){
                        DataIO.allCarsOwned.remove(CarRentalSystem.editCar);
                        cars.removeRow(jTable1.getSelectedRow());
                        DataIO.writeToTextFile();
                        JOptionPane.showMessageDialog(this, "Updated successfully!");
                    }
                    else {
                    JOptionPane.showMessageDialog(this, "ID has been used!");
                    }
                }
            }
            catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Invalid Input!");
            }
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void MainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainMenuActionPerformed
        new MainMenuAdmin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MainMenuActionPerformed

    private void Exit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit1ActionPerformed
        new Exit().setVisible(true);
    }//GEN-LAST:event_Exit1ActionPerformed

    private void AvailableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AvailableActionPerformed
        try{
        String[] columnName = {"Brand","Model","Color","License Plate(ID)","Fee"};
        DefaultTableModel car = new DefaultTableModel(columnName,0){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        jTable1.setModel(car);
        ArrayList<String> allcars = DataIO.getAllCarsOwned();
        String[] carsall = allcars.toArray(new String[0]);
        for(int i=0; i<allcars.size(); i++){
            CarRent c = DataIO.findID(carsall[i]);
            Car d = DataIO.verifyID(carsall[i]);
                if(carsall[i].equals(c.getId()) && d==null){
                    String Brand = c.getBrand();
                    String Model = c.getModel();
                    String Color = c.getColor();
                    String ID = c.getId();
                    int Fee = c.getFees();
                    String[] dataRow = {Brand,Model,Color,ID,Integer.toString(Fee)};
                    car.addRow(dataRow);
                }
        }  
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "There is no car available currently");
        }
    }//GEN-LAST:event_AvailableActionPerformed

    private void OnRentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnRentActionPerformed
        try{
        String[] columnName = {"Brand","Model","Color","License Plate(ID)","Fee"};
        DefaultTableModel car = new DefaultTableModel(columnName,0){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        jTable1.setModel(car);
        ArrayList<String> allcars = DataIO.getAllCarsOwned();
        String[] carsall = allcars.toArray(new String[0]);
        for(int i=0; i<allcars.size(); i++){
            CarRent c = DataIO.findID(carsall[i]);
            Car d = DataIO.verifyID(carsall[i]);
                if(carsall[i].equals(c.getId()) && d!=null){
                    String Brand = c.getBrand();
                    String Model = c.getModel();
                    String Color = c.getColor();
                    String ID = c.getId();
                    int Fee = c.getFees();
                    String[] dataRow = {Brand,Model,Color,ID,Integer.toString(Fee)};
                    car.addRow(dataRow);
                }
        }  
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "There is no car on rent currently");
        }
    }//GEN-LAST:event_OnRentActionPerformed

    private void AllCarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllCarsActionPerformed
        try{
        String[] columnName = {"Brand","Model","Color","License Plate(ID)","Fee"};
        DefaultTableModel car = new DefaultTableModel(columnName,0){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        jTable1.setModel(car);
        ArrayList<String> allcars = DataIO.getAllCarsOwned();
        String[] carsall = allcars.toArray(new String[0]);
        for(int i=0; i<allcars.size(); i++){
            CarRent c = DataIO.findID(carsall[i]);
                if(carsall[i].equals(c.getId())){
                    String Brand = c.getBrand();
                    String Model = c.getModel();
                    String Color = c.getColor();
                    String ID = c.getId();
                    int Fee = c.getFees();
                    String[] dataRow = {Brand,Model,Color,ID,Integer.toString(Fee)};
                    car.addRow(dataRow);
                }
        }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "There is no car registered currently");
        }
    }//GEN-LAST:event_AllCarsActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditCar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AllCars;
    private javax.swing.JButton Available;
    private javax.swing.JTextField BrandTf;
    private javax.swing.JTextField ColorTf;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Exit1;
    private javax.swing.JTextField FeeTf;
    private javax.swing.JButton FindID;
    private javax.swing.JTextField IDTf;
    private javax.swing.JButton MainMenu;
    private javax.swing.JTextField ModelTf;
    private javax.swing.JButton Modify;
    private javax.swing.JButton OnRent;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
