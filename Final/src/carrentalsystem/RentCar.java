package carrentalsystem;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class RentCar extends javax.swing.JFrame {
    public RentCar() {
        initComponents();
        DateFormat();
        DisplayCars();
        CarIdTf.setEditable(false);
        FeeTf.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ReturnCar = new javax.swing.JLabel();
        ViewRentalCars = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Menu = new javax.swing.JLabel();
        Logout = new javax.swing.JLabel();
        Exit = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        CarIdTf = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CarsList = new javax.swing.JTable();
        FeeTf = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        RentCar = new javax.swing.JButton();
        ClearTxt = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        RentDateTf = new javax.swing.JFormattedTextField();
        ReturnDateTf = new javax.swing.JFormattedTextField();

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

        ViewRentalCars.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ViewRentalCars.setForeground(new java.awt.Color(102, 102, 102));
        ViewRentalCars.setText("View Rental Cars");
        ViewRentalCars.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViewRentalCarsMouseClicked(evt);
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
                        .addGap(78, 78, 78)
                        .addComponent(ViewRentalCars)
                        .addGap(93, 93, 93)
                        .addComponent(ReturnCar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Logout)
                        .addGap(46, 46, 46))
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
                            .addComponent(ViewRentalCars)
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

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Car ID");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 102, 102));
        jLabel9.setText("Cars Rental");

        CarsList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "License Plate", "Brand", "Model", "Color", "Fee"
            }
        ));
        CarsList.setRowHeight(25);
        CarsList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CarsListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CarsList);

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel11.setText("Fee");
        jLabel11.setToolTipText("");

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel12.setText("Rent Date");
        jLabel12.setToolTipText("");

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel13.setText("Return Date");
        jLabel13.setToolTipText("");

        RentCar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        RentCar.setText("Rent");
        RentCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RentCarActionPerformed(evt);
            }
        });

        ClearTxt.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ClearTxt.setText("Clear");
        ClearTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearTxtActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setText("Cars List");

        RentDateTf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        ReturnDateTf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(ClearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(RentCar, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(CarIdTf, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(RentDateTf, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(ReturnDateTf, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FeeTf, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(386, 386, 386)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(406, 406, 406)
                        .addComponent(jLabel10)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CarIdTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FeeTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ReturnDateTf, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(RentDateTf, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(49, 49, 49)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RentCar)
                    .addComponent(ClearTxt))
                .addGap(35, 35, 35))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DateFormat(){
        RentDateTf.setText("MMM dd, yyyy");
        ReturnDateTf.setText("MMM dd, yyyy");
    }
    
    private void RentCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RentCarActionPerformed
        if(CarIdTf.getText().isEmpty() || RentDateTf.getText().isEmpty() || ReturnDateTf.getText().isEmpty() || FeeTf.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please fill in all information!");
        }else{
            try {
                int day;
                int totalAmt;
                String id = CarIdTf.getText();
                String rentDate = RentDateTf.getText();
                String returnDate = ReturnDateTf.getText();
                int fee = Integer.parseInt(FeeTf.getText());
                String status = "Unverified";
                CarRent found = DataIO.findID(id);
                Car allcar = DataIO.verifyID(id);
                SimpleDateFormat formatter = new SimpleDateFormat("MMM dd, yyyy");
                Date rentDate1 = formatter.parse(rentDate);
                Date returnDate1 = formatter.parse(returnDate);
                long diff = returnDate1.getTime() - rentDate1.getTime();
                long diffDays = diff / (24 * 60 * 60 * 1000) + 1;
                day = (int)diffDays;
                totalAmt = (day)*fee;
                if(rentDate.equals("MMM dd, yyyy") || returnDate.equals("MMM dd, yyyy")){
                    JOptionPane.showMessageDialog(this, "Wrong date format!");
                }else if(returnDate1.compareTo(rentDate1)<0){
                    JOptionPane.showMessageDialog(this, "Invalid date");
                }else if(totalAmt != found.getFees()*day){
                    JOptionPane.showMessageDialog(this, "Wrong fee amount!");
                }else if(day<1){
                    JOptionPane.showMessageDialog(this, "Minimum rent duration is 1 day!");
                }else if(allcar == null || (id.equals(found.getId()) && !id.equals(allcar.getId()))){
                    String payment= JOptionPane.showInputDialog("Fee is RM "+totalAmt+". Please pay in full amount.");
                    int paid = Integer.parseInt(payment);
                    if (totalAmt==paid){
                        Car c = new Car(id,CarRentalSystem.loginUser, rentDate, returnDate, totalAmt, status);
                        DataIO.allCars.add(c);
                        CarRentalSystem.loginUser.getMyCar().add(c);
                        DataIO.writeToTextFile();
                        JOptionPane.showMessageDialog(this, "Car rented successfully!");
                        new CarRentalReceipt(CarRentalSystem.loginUser.getUsername(),id,found.getBrand(),found.getModel(),found.getColor(),rentDate,returnDate,totalAmt).setVisible(true);
                        this.dispose();
                    }
                    else if(totalAmt<paid){
                        Car c = new Car(id,CarRentalSystem.loginUser, rentDate, returnDate, totalAmt, status);
                        DataIO.allCars.add(c);
                        CarRentalSystem.loginUser.getMyCar().add(c);
                        DataIO.writeToTextFile();
                        int change = paid-totalAmt;
                        JOptionPane.showMessageDialog(this, "Car rented successfully!");
                        JOptionPane.showMessageDialog(null,"You have a change of RM "+ change);
                        new CarRentalReceipt(CarRentalSystem.loginUser.getUsername(),id,found.getBrand(),found.getModel(),found.getColor(),rentDate,returnDate,totalAmt).setVisible(true);
                        this.dispose();
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Please pay in full amount");
                        new Menu().setVisible(true);
                        this.dispose();
                    }
                }else{
                    JOptionPane.showMessageDialog(this, "This car is rented out!");
                }
            }catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Invalid Input!");
            }
        }
    }//GEN-LAST:event_RentCarActionPerformed

    private void ClearTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearTxtActionPerformed
        CarIdTf.setText(null);
        RentDateTf.setText(null);
        ReturnDateTf.setText(null);
        FeeTf.setText(null);
    }//GEN-LAST:event_ClearTxtActionPerformed

    private void MenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMouseClicked
        new Menu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuMouseClicked

    private void ViewRentalCarsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewRentalCarsMouseClicked
        new ViewRentalCars().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ViewRentalCarsMouseClicked

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

    private void CarsListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CarsListMouseClicked
        DefaultTableModel model = (DefaultTableModel)CarsList.getModel();
        int car = CarsList.getSelectedRow();
        CarIdTf.setText(model.getValueAt(car, 0).toString());
        FeeTf.setText(model.getValueAt(car, 4).toString());
    }//GEN-LAST:event_CarsListMouseClicked

    private void DisplayCars(){
        try{
        String[] columnName = {"Brand","Model","Color","License Plate(ID)","Fee"};
        DefaultTableModel car = new DefaultTableModel(columnName,0){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        CarsList.setModel(car);
        ArrayList<String> allcarsowned = DataIO.getAllCarsOwned();
        String[] carsall = allcarsowned.toArray(new String[0]);
            try{
                int i=0;
                while(i<allcarsowned.size()){  
                CarRent c = DataIO.findID(carsall[i]);
                String id = c.getId();
                String brand = c.getBrand();
                String model = c.getModel();
                String color = c.getColor();
                String fee = Integer.toString(c.getFees());
                Car rented = DataIO.verifyID(id);
                if (rented == null){
                    String[] dataR = {id,brand,model,color,fee};
                    car.addRow(dataR);
                }    
                i++;
                }
            }
            catch(Exception e){
                for(int i=0; i<allcarsowned.size(); i++){
                CarRent c = DataIO.findID(carsall[i]);
                    if(carsall[i].equals(c.getId())){
                        String Brand = c.getBrand();
                        String Model = c.getModel();
                        String Color = c.getColor();
                        String ID = c.getId();
                        int Fee = c.getFees();
                        String[] dataRow = {ID,Brand,Model,Color,Integer.toString(Fee)};
                        car.addRow(dataRow);
                    }
                }
            }  
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "There is no car registered currently");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CarIdTf;
    private javax.swing.JTable CarsList;
    private javax.swing.JButton ClearTxt;
    private javax.swing.JButton Exit;
    private javax.swing.JTextField FeeTf;
    private javax.swing.JLabel Logout;
    private javax.swing.JLabel Menu;
    private javax.swing.JButton RentCar;
    private javax.swing.JFormattedTextField RentDateTf;
    private javax.swing.JLabel ReturnCar;
    private javax.swing.JFormattedTextField ReturnDateTf;
    private javax.swing.JLabel ViewRentalCars;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
