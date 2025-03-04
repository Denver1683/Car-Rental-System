package carrentalsystem;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class ReturnCar extends javax.swing.JFrame {
    public ReturnCar() {
        initComponents();
        DisplayCars();
        DateFormat();  
        DelayedDaysTf.setEditable(false);
        FineTf.setEditable(false);
    }

private void DateFormat(){
    ReturnDateTf.setText("MMM dd, yyyy");
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ReturnDateTf = new javax.swing.JTextField();
        CarIdTf = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        CarId = new javax.swing.JLabel();
        DelayedDaysTf = new javax.swing.JTextField();
        Return = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        RentCar = new javax.swing.JLabel();
        ViewRentalCars = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        Menu = new javax.swing.JLabel();
        Logout = new javax.swing.JLabel();
        Exit = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        ClearTxt = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CarsOnRent = new javax.swing.JTable();
        FineTf = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        GenerateFine = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel13.setText("Delayed Days");
        jLabel13.setToolTipText("");

        CarId.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        CarId.setText("Car Id");
        CarId.setToolTipText("");

        Return.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Return.setText("Return");
        Return.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReturnMouseClicked(evt);
            }
        });
        Return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        RentCar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        RentCar.setForeground(new java.awt.Color(102, 102, 102));
        RentCar.setText("Rent Car");
        RentCar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RentCarMouseClicked(evt);
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

        jLabel16.setFont(new java.awt.Font("MV Boli", 1, 36)); // NOI18N
        jLabel16.setText("CRS");

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel12)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(Menu)
                        .addGap(87, 87, 87)
                        .addComponent(ViewRentalCars)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RentCar)
                        .addGap(97, 97, 97)
                        .addComponent(Logout)
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Menu)
                            .addComponent(ViewRentalCars)
                            .addComponent(RentCar)
                            .addComponent(Logout))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)))
                        .addContainerGap())))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(Exit)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        ClearTxt.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ClearTxt.setText("Clear");
        ClearTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearTxtMouseClicked(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 102, 102));
        jLabel19.setText("Return Car");

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel20.setText("Cars On Rent");

        CarsOnRent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "License Plate", "Rent Date", "Return Date", "Fee"
            }
        ));
        CarsOnRent.setRowHeight(25);
        CarsOnRent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CarsOnRentMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CarsOnRent);

        jLabel21.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel21.setText("Fine");
        jLabel21.setToolTipText("");

        jLabel23.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel23.setText("Return Date");
        jLabel23.setToolTipText("");

        GenerateFine.setText("Generate");
        GenerateFine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GenerateFineMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(391, 391, 391))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(ClearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Return, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CarIdTf, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CarId))
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23)
                                    .addComponent(ReturnDateTf, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(62, 62, 62)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DelayedDaysTf, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13))
                                .addGap(62, 62, 62)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FineTf, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(389, 389, 389)
                        .addComponent(jLabel19))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(372, 372, 372)
                        .addComponent(GenerateFine, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(CarId)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(CarIdTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel21)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(FineTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ReturnDateTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DelayedDaysTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(GenerateFine, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ClearTxt)
                    .addComponent(Return))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
        CarRentalSystem.loginUser = null;
        new HomePage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogoutMouseClicked

    private void RentCarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RentCarMouseClicked
        new RentCar().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RentCarMouseClicked

    private void ViewRentalCarsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewRentalCarsMouseClicked
        new ViewRentalCars().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ViewRentalCarsMouseClicked

    private void MenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMouseClicked
        new Menu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuMouseClicked

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        new Exit().setVisible(true);
    }//GEN-LAST:event_ExitMouseClicked

    private void GenerateFineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GenerateFineMouseClicked
        if(CarIdTf.getText().isEmpty() || ReturnDateTf.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please fill in car id & return date!");
        }else{
            try{
                int day;
                int interest;
                String id = CarIdTf.getText();
                String returnDate = ReturnDateTf.getText();
                Customer owner = CarRentalSystem.loginUser;
                Car c = DataIO.verifyID(id);
                SimpleDateFormat formatter = new SimpleDateFormat("MMM dd, yyyy");
                Date newDate = formatter.parse(returnDate);
                if(returnDate.equals("MMM dd, yyyy")){
                    JOptionPane.showMessageDialog(this, "Invalid Input!");
                }else if(id.equals(c.getId())&&owner.equals(c.getOwner())){
                    Date oldDate = formatter.parse(c.getReturnDate());
                    if(newDate.compareTo(oldDate)>0){  
                        long diff = newDate.getTime() - oldDate.getTime();
                        long diffDays = diff / (24 * 60 * 60 * 1000) + 1;
                        day = (int)diffDays;
                        DelayedDaysTf.setText(String.valueOf(day-1));
                        interest = (day-1)*c.getFees();
                        FineTf.setText(String.valueOf(interest));
                    }else if(newDate.compareTo(oldDate)<=0){
                        DelayedDaysTf.setText("0");
                        FineTf.setText("0");
                    }
                }  
            }catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Invalid Input!");
            }
            
        }
    }//GEN-LAST:event_GenerateFineMouseClicked

    private void ReturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnMouseClicked
        if(CarIdTf.getText().isEmpty() || ReturnDateTf.getText().isEmpty() || DelayedDaysTf.getText().isEmpty() || FineTf.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please fill in all information!");
        }else{
            try {
                int day;
                int interest = 0;
                String id = CarIdTf.getText();
                String returnDate = ReturnDateTf.getText();
                int delayedDays = Integer.parseInt(DelayedDaysTf.getText());
                int fine = Integer.parseInt(FineTf.getText());
                Customer owner = CarRentalSystem.loginUser;
                String collect = "Uncollected";
                Car c = DataIO.verifyID(id);
                SimpleDateFormat formatter = new SimpleDateFormat("MMM dd, yyyy");
                Date newDate = formatter.parse(returnDate);
                int size = owner.getMyCar().size();
                Date oldDate = formatter.parse(c.getReturnDate());
                if(newDate.compareTo(oldDate)>=0){  
                    long diff = newDate.getTime() - oldDate.getTime();
                    long diffDays = diff / (24 * 60 * 60 * 1000) + 1;
                    day = (int)diffDays;
                    interest = (day-1)*c.getFees();
                }
                if(returnDate.equals("MMM dd, yyyy")){
                    JOptionPane.showMessageDialog(this, "Wrong date format!");
                }else if(fine != interest){
                    JOptionPane.showMessageDialog(this, "Wrong fine amount!");
                }else if(id.equals(c.getId()) && delayedDays == interest/c.getFees() && newDate.compareTo(oldDate)>=0 && "Verified".equals(c.getStatus())){
                    String rentDate = c.getRentDate();
                    int fees = c.getFees();
                    String payment = JOptionPane.showInputDialog(this, "Your fine is: "+fine +". Please pay the exact amount");
                    int paid = Integer.parseInt(payment);
                    if(paid==fine){
                        CarReturn cr = new CarReturn(owner,id,rentDate,returnDate,fees,delayedDays,fine,collect);
                        DataIO.allCarsReturned.add(cr);
                        DataIO.allCars.remove(c);
                        DataIO.writeToTextFile();
                        JOptionPane.showMessageDialog(this, "Car returned successfully!");
                        new FeedbackPage().setVisible(true);
                        this.dispose();
                    }
                    else if(paid>fine){
                        CarReturn cr = new CarReturn(owner,id,rentDate,returnDate,fees,delayedDays,fine,collect);
                        DataIO.allCarsReturned.add(cr);
                        DataIO.allCars.remove(c);
                        DataIO.writeToTextFile();
                        JOptionPane.showMessageDialog(this, "Car returned successfully!");
                        int change = paid-fine;
                        JOptionPane.showMessageDialog(this,"You have a change of RM "+ change);
                        new FeedbackPage().setVisible(true);
                        this.dispose();
                    }
                    else{
                        JOptionPane.showMessageDialog(this,"Please pay full amount");
                        new Menu().setVisible(true);
                        this.dispose();
                    }
                }else if(newDate.compareTo(oldDate)<0){
                    JOptionPane.showMessageDialog(this, "Invalid date!");
                }else if(delayedDays != interest/c.getFees()){
                    JOptionPane.showMessageDialog(this, "Wrong number of delayed days!");
                }
            } catch (Exception ex){
                JOptionPane.showMessageDialog(this, "Invalid Input!");
            }
        }
    }//GEN-LAST:event_ReturnMouseClicked

    private void ClearTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearTxtMouseClicked
        CarIdTf.setText(null);
        ReturnDateTf.setText(null);
        DelayedDaysTf.setText(null);
        FineTf.setText(null);
    }//GEN-LAST:event_ClearTxtMouseClicked

    private void CarsOnRentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CarsOnRentMouseClicked
        DefaultTableModel model = (DefaultTableModel)CarsOnRent.getModel();
        int car = CarsOnRent.getSelectedRow();
        CarIdTf.setText(model.getValueAt(car, 0).toString());
        ReturnDateTf.setText(model.getValueAt(car, 2).toString());
    }//GEN-LAST:event_CarsOnRentMouseClicked

    private void ReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReturnActionPerformed

    private void DisplayCars(){
        String[] columnName = {"License Plate","Rent Date","Return Date","Fees"};
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
                    String id = c.getId();
                    Customer carowner = c.getOwner();
                    String rentdate = c.getRentDate();
                    String returndate = c.getReturnDate();
                    String fee = Integer.toString(c.getFees());
                    String status = c.getStatus();
                    if (carowner.equals(owner)&&"Verified".equals(status)){
                        String[] dataR = {id,rentdate,returndate,fee};
                        car.addRow(dataR);
                        i++;
                    }    
                    else{    
                        i++;
                        continue;
                    }
                }
            }    
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Unknown Error");
            }
        }    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CarId;
    private javax.swing.JTextField CarIdTf;
    private javax.swing.JTable CarsOnRent;
    private javax.swing.JButton ClearTxt;
    private javax.swing.JTextField DelayedDaysTf;
    private javax.swing.JButton Exit;
    private javax.swing.JTextField FineTf;
    private javax.swing.JButton GenerateFine;
    private javax.swing.JLabel Logout;
    private javax.swing.JLabel Menu;
    private javax.swing.JLabel RentCar;
    private javax.swing.JButton Return;
    private javax.swing.JTextField ReturnDateTf;
    private javax.swing.JLabel ViewRentalCars;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}