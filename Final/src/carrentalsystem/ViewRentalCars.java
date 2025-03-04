package carrentalsystem;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class ViewRentalCars extends javax.swing.JFrame {
    public ViewRentalCars() {
        initComponents();
        DisplayCarsOnRent();
        DisplayReturnedCars();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ReturnCar = new javax.swing.JLabel();
        RentCar = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Menu = new javax.swing.JLabel();
        Logout = new javax.swing.JLabel();
        Exit = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ReturnedCars = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        CarsOnRent = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        ReturnCar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ReturnCar.setForeground(new java.awt.Color(102, 102, 102));
        ReturnCar.setText("Return Car");
        ReturnCar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReturnCarMouseClicked(evt);
            }
        });

        RentCar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        RentCar.setForeground(new java.awt.Color(102, 102, 102));
        RentCar.setText("Rent Car");
        RentCar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RentCarMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("MV Boli", 1, 36)); // NOI18N
        jLabel8.setText("CRS");

        Menu.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Menu.setForeground(new java.awt.Color(102, 102, 102));
        Menu.setText("Menu");
        Menu.setToolTipText("");
        Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuMouseClicked(evt);
            }
        });

        Logout.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Logout.setForeground(new java.awt.Color(102, 102, 102));
        Logout.setText("Logout");
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutMouseClicked(evt);
            }
        });

        Exit.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Exit.setText("X");
        Exit.setToolTipText("");
        Exit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(Menu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RentCar)
                        .addGap(118, 118, 118)
                        .addComponent(ReturnCar)
                        .addGap(118, 118, 118)
                        .addComponent(Logout)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Menu)
                            .addComponent(RentCar)
                            .addComponent(ReturnCar)
                            .addComponent(Logout))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4))
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Exit)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 102, 102));
        jLabel9.setText("View Rental Car");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setText("Cars On Rent");

        ReturnedCars.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "License Plate", "Brand", "Model", "Color", "Rent Date", "Return Date", "Fee", "Delayed Days", "Fine"
            }
        ));
        ReturnedCars.setRowHeight(25);
        ReturnedCars.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReturnedCarsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ReturnedCars);

        CarsOnRent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "License Plate", "Brand", "Model", "Color", "Rent Date", "Return Date", "Fee"
            }
        ));
        CarsOnRent.setRowHeight(25);
        CarsOnRent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CarsOnRentMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(CarsOnRent);

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setText("Returned Cars");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(262, 262, 262)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(298, 298, 298)
                                .addComponent(jLabel10))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(389, 389, 389)
                        .addComponent(jLabel11)))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addGap(24, 24, 24)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMouseClicked
        new Menu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuMouseClicked

    private void RentCarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RentCarMouseClicked
        new RentCar().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RentCarMouseClicked

    private void ReturnCarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnCarMouseClicked
        new ReturnCar().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ReturnCarMouseClicked

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
        CarRentalSystem.loginUser = null;
        new HomePage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogoutMouseClicked

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        new Exit().setVisible(true);
    }//GEN-LAST:event_ExitMouseClicked

    private void CarsOnRentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CarsOnRentMouseClicked
        DefaultTableModel model = (DefaultTableModel)CarsOnRent.getModel();
        int car = CarsOnRent.getSelectedRow();
        int fee = Integer.valueOf(model.getValueAt(car, 6).toString());
        new CarRentalReceipt(CarRentalSystem.loginUser.getUsername(),model.getValueAt(car, 0).toString(),model.getValueAt(car, 1).toString(),model.getValueAt(car, 2).toString(),model.getValueAt(car, 3).toString(),model.getValueAt(car, 4).toString(),model.getValueAt(car, 5).toString(),fee).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CarsOnRentMouseClicked

    private void ReturnedCarsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnedCarsMouseClicked
        DefaultTableModel model = (DefaultTableModel)ReturnedCars.getModel();
        int car = ReturnedCars.getSelectedRow();
        int fee = Integer.valueOf(model.getValueAt(car, 6).toString());
        int delayedDays= Integer.valueOf(model.getValueAt(car, 7).toString());
        int fine = Integer.valueOf(model.getValueAt(car, 8).toString());
        String RentDate = model.getValueAt(car, 4).toString();
        String status = DataIO.verifyCarwDate(model.getValueAt(car, 0).toString(),RentDate).getCollect();
        if(status.equals("Collected")){
            new FineReceipt(CarRentalSystem.loginUser.getUsername(),model.getValueAt(car, 0).toString(),model.getValueAt(car, 1).toString(),model.getValueAt(car, 2).toString(),model.getValueAt(car, 3).toString(),fee,model.getValueAt(car, 4).toString(),model.getValueAt(car, 5).toString(),delayedDays,fine).setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "You must returned your key to get receipt");
        }
    }//GEN-LAST:event_ReturnedCarsMouseClicked

    private void DisplayCarsOnRent(){
        String[] columnName = {"License Plate","Brand","Model","Color","Rent Date","Return Date","Fees"};
        DefaultTableModel car = new DefaultTableModel(columnName,0){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        CarsOnRent.setModel(car);
        Customer owner = CarRentalSystem.loginUser;
        ArrayList<String> allcars = DataIO.getAllCars();
        String[] carsall = allcars.toArray(new String[0]);
            try{
                int i=0;
                while(i<allcars.size()){  
                    Car c = DataIO.verifyID(carsall[i]);
                    CarRent d = DataIO.findID(carsall[i]);
                    Customer carowner = c.getOwner();
                    String id = c.getId();
                    String brand = d.getBrand();
                    String model = d.getModel();
                    String color = d.getColor();
                    String rentdate = c.getRentDate();
                    String returndate = c.getReturnDate();
                    String fee = Integer.toString(c.getFees());
                    String status = c.getStatus();
                    if (carowner.equals(owner)&&"Verified".equals(status)){
                        String[] dataR = {id,brand,model,color,rentdate,returndate,fee};
                        car.addRow(dataR);
                        i++;
                    }    
                    else{    
                        i++;
                    }
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Unknown Error");
            }
    }
    
    private void DisplayReturnedCars(){
        String[] columnName = {"License Plate","Brand","Model","Color","Rent Date","Return Date","Fees","Delayed Days","Fine"};
        DefaultTableModel car = new DefaultTableModel(columnName,0){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        ReturnedCars.setModel(car);
        Customer owner = CarRentalSystem.loginUser;
        ArrayList<String> allcarsreturned = DataIO.getAllCarsReturned();
        String[] carsreturnedall = allcarsreturned.toArray(new String [0]);
        ArrayList<String> alldate = DataIO.getAllCarsReturnedDate();
        String[] dateall = alldate.toArray(new String[0]);
        try{
            int i=0;
            while(i<allcarsreturned.size()){  
            CarReturn c = DataIO.verifyCarwDate(carsreturnedall[i],dateall[i]);
            CarRent d = DataIO.findID(carsreturnedall[i]);
            String id = c.getId();
            String brand = d.getBrand();
            String model = d.getModel();
            Customer carowner = c.getOwner();
            String color = d.getColor();
            String rentdate = c.getRentDate();
            String returndate = c.getReturnDate();
            String fee = Integer.toString(c.getFees());
            String delayedDays = Integer.toString(c.getDelayedDays());
            String fine = Integer.toString(c.getFine());
            if(carowner.equals(owner)){
                String[] dataR = {id,brand,model,color,rentdate,returndate,fee,delayedDays,fine};
                car.addRow(dataR);  
                i++;
            }
            else{
                i++;
            }
            }     
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Unknown Error");
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CarsOnRent;
    private javax.swing.JButton Exit;
    private javax.swing.JLabel Logout;
    private javax.swing.JLabel Menu;
    private javax.swing.JLabel RentCar;
    private javax.swing.JLabel ReturnCar;
    private javax.swing.JTable ReturnedCars;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
