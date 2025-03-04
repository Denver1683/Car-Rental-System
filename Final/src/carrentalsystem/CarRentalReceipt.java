package carrentalsystem;
public class CarRentalReceipt extends javax.swing.JFrame {
    public CarRentalReceipt(String name,String carId,String brand,String car,String color,String rentDate,String returnDate,int price) {
        initComponents();
        Receipt.setEditable(false);
        Receipt.setText("\n                          Car Rental System                  \n");
        Receipt.setText(Receipt.getText()+"--------------------------------------------------------------\n");
        Receipt.setText(Receipt.getText()+"                     JALAN TEKNOLOGI 5         \n");
        Receipt.setText(Receipt.getText()+"             TAMAN TEKNOLOGI MALAYSIA        \n");
        Receipt.setText(Receipt.getText()+"                   57000 KUALA LUMPUR           \n");
        Receipt.setText(Receipt.getText()+"                         +60121234567                    \n");
        Receipt.setText(Receipt.getText()+"--------------------------------------------------------------\n");
        Receipt.setText(Receipt.getText()+" Name:                                           "+name+"\n");
        Receipt.setText(Receipt.getText()+" License Plate:                             "+carId+"\n");
        Receipt.setText(Receipt.getText()+" Brand:                                           "+brand+"\n");
        Receipt.setText(Receipt.getText()+" Car Name:                                   "+car+"\n");
        Receipt.setText(Receipt.getText()+" Color:                                            "+color+"\n");
        Receipt.setText(Receipt.getText()+" Rent Date:                                    "+rentDate+"\n");
        Receipt.setText(Receipt.getText()+" Return Date:                                "+returnDate+"\n");
        Receipt.setText(Receipt.getText()+" Price:                                             "+price+"\n");
        Receipt.setText(Receipt.getText()+"--------------------------------------------------------------\n");
        Receipt.setText(Receipt.getText()+" Total amount:                             RM "+price+"\n\n");
        Receipt.setText(Receipt.getText()+"**************************************************\n");
        Receipt.setText(Receipt.getText()+"                     Thank you come again                      \n");
        Receipt.setText(Receipt.getText()+"**************************************************\n");
        Receipt.setText(Receipt.getText()+"                 SOFTWARE BY:NETBEANS                 \n");
        Receipt.setText(Receipt.getText()+"          CONTACT: contact@netbeans.com    \n");
        Receipt.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Receipt = new javax.swing.JTextArea();
        Cancel = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setUndecorated(true);

        Receipt.setColumns(20);
        Receipt.setRows(5);
        jScrollPane2.setViewportView(Receipt);

        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(Cancel)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Cancel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        new Menu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JTextArea Receipt;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
