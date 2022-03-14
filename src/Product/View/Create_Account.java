
package Product.View;

import Product.Modle.User;
import Product.Service.ProductService;
import javax.swing.JOptionPane;
/**
 *
 * @author ACER
 */
public class Create_Account extends javax.swing.JFrame {
    
    ProductService productService;
    User user ;
    
    public Create_Account() {
        initComponents();
        productService = new ProductService();
        user = new User();
    }
    public static boolean isNumeric(String str) { 
        try {  
          Double.parseDouble(str);  
          return true;
        } catch(NumberFormatException e){  
          return false;  
        } 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        back_create = new javax.swing.JButton();
        password_textfile_ac = new javax.swing.JPasswordField();
        user_textfile_ac = new javax.swing.JTextField();
        Email_textfile = new javax.swing.JTextField();
        cmnd_textfile_ac = new javax.swing.JTextField();
        phone_textfile_ac = new javax.swing.JTextField();
        address_textfile_ac = new javax.swing.JTextField();
        reset_CAccount = new javax.swing.JButton();
        save_crAccount = new javax.swing.JButton();
        showpass = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        date_txt = new javax.swing.JTextField();
        month_txt = new javax.swing.JTextField();
        year_txt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(javax.swing.UIManager.getDefaults().getColor("CheckBox.darkShadow"));
        setName("JAVA_NANG_CAO"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CREATE ACCOUNT");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("USER NAME");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("EMAIL");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("PASSWORD");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("DOB");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("CMND");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("PHONE NUMBER");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("ADDRESS");

        back_create.setBackground(new java.awt.Color(0, 102, 204));
        back_create.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back_create.setForeground(new java.awt.Color(255, 255, 255));
        back_create.setText("BACK");
        back_create.setBorderPainted(false);
        back_create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_createActionPerformed(evt);
            }
        });

        reset_CAccount.setBackground(new java.awt.Color(0, 102, 204));
        reset_CAccount.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        reset_CAccount.setForeground(new java.awt.Color(255, 255, 255));
        reset_CAccount.setText("RESET");
        reset_CAccount.setBorderPainted(false);
        reset_CAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_CAccountActionPerformed(evt);
            }
        });

        save_crAccount.setBackground(new java.awt.Color(0, 102, 204));
        save_crAccount.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        save_crAccount.setForeground(new java.awt.Color(255, 255, 255));
        save_crAccount.setText("SAVE");
        save_crAccount.setBorderPainted(false);
        save_crAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_crAccountActionPerformed(evt);
            }
        });

        showpass.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        showpass.setText("Show");
        showpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpassActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon("D:\\Netbean_Java\\Image_Icon\\man-icon.png")); // NOI18N

        jLabel10.setText("date:");

        jLabel11.setText("month:");

        jLabel12.setText("year:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(back_create, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(1, 1, 1)))
                            .addComponent(jLabel7))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(reset_CAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(save_crAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(user_textfile_ac, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                                        .addComponent(Email_textfile))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(password_textfile_ac, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(showpass, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(date_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(month_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(year_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmnd_textfile_ac, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(phone_textfile_ac, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(address_textfile_ac, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(16, 16, 16))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user_textfile_ac, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Email_textfile, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password_textfile_ac, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showpass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(date_txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(year_txt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(month_txt)
                        .addComponent(jLabel10)
                        .addComponent(jLabel11)
                        .addComponent(jLabel12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmnd_textfile_ac, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(phone_textfile_ac, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(address_textfile_ac, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(save_crAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reset_CAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(back_create, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void back_createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_createActionPerformed
        LoginAccount lg = new LoginAccount();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_back_createActionPerformed

    private void reset_CAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_CAccountActionPerformed
        user_textfile_ac.setText("");
        Email_textfile.setText("");
        password_textfile_ac.setText("");
        phone_textfile_ac.setText("");
        address_textfile_ac.setText("");
        date_txt.setText("");
        month_txt.setText("");
        year_txt.setText("");
        cmnd_textfile_ac.setText("");
    }//GEN-LAST:event_reset_CAccountActionPerformed

    private void save_crAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_crAccountActionPerformed
        
        String usern = user_textfile_ac.getText();
        String emaill = Email_textfile.getText();
        String pass = String.valueOf(password_textfile_ac.getPassword());
        String dateString = date_txt.getText();
        String monthString = month_txt.getText();
        String yearString = year_txt.getText();
        int date = Integer.valueOf(dateString);
        int month = Integer.valueOf(monthString);
        int year = Integer.valueOf(yearString);
        String cmnd = cmnd_textfile_ac.getText();
        String sodt = phone_textfile_ac.getText();
        String diachi = address_textfile_ac.getText();
        StringBuilder sb = new StringBuilder();
        if(usern.equals(""))
           sb.append("Username not empty");
        if(emaill.equals(""))
            sb.append("\nEmail not empty");
        if(pass.equals(""))
            sb.append("\nPass not empty");
        if(dateString.equals(""))
            sb.append("\nDate not empty");
        if(monthString.equals(""))
            sb.append("\nMonth not empty");
        if(yearString.equals(""))
            sb.append("\nYear not empty");
        if(date < 0 || date > 31)
            sb.append("\nDate must be less than 31 and greater than 0.");
        if(month < 0 || month > 12)
            sb.append("\nMonth must be less than 12 and greater than 0.");
        if(year < 0 || year > 2022)
            sb.append("\nYear must be less than now year.");
        if(cmnd.equals(""))
            sb.append("\nCMND not empty.");
        if(sodt.equals(""))
            sb.append("\nPhone not empty.");
        if(diachi.equals(""))
            sb.append("\nAddress not empty.");
        if(isNumeric(sodt)==false)
            sb.append("\nPlease enter the number in Phone number.");
        if(isNumeric(cmnd)==false)
            sb.append("\nPlease enter the number in CMND number.");
        if(sb.length() > 0){
            JOptionPane.showMessageDialog(this, sb.toString(), "Error Message",JOptionPane.ERROR_MESSAGE );
            return;
        }
        user.setUsername(user_textfile_ac.getText());
        user.setEmail(Email_textfile.getText());
        user.setPassword(String.valueOf(password_textfile_ac.getPassword()));
        user.setSinhNhat(date_txt.getText()+"-" + month_txt.getText() + "-" + year_txt.getText());
        user.setCmnd(cmnd_textfile_ac.getText());
        user.setSodt(phone_textfile_ac.getText());
        user.setDiachi(address_textfile_ac.getText());
        productService.addUser(user);
        JOptionPane.showMessageDialog(this, "Dang Ký Thanh Cong");
        LoginAccount ac = new LoginAccount();
        ac.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_save_crAccountActionPerformed

    private void showpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpassActionPerformed
       if(showpass.isSelected()){
           password_textfile_ac.setEchoChar((char) 0);
       }
       else{
           password_textfile_ac.setEchoChar('*');
       }
    }//GEN-LAST:event_showpassActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Create_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Create_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Create_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Create_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Create_Account().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Email_textfile;
    private javax.swing.JTextField address_textfile_ac;
    private javax.swing.JButton back_create;
    private javax.swing.JTextField cmnd_textfile_ac;
    private javax.swing.JTextField date_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField month_txt;
    private javax.swing.JPasswordField password_textfile_ac;
    private javax.swing.JTextField phone_textfile_ac;
    private javax.swing.JButton reset_CAccount;
    private javax.swing.JButton save_crAccount;
    private javax.swing.JCheckBox showpass;
    private javax.swing.JTextField user_textfile_ac;
    private javax.swing.JTextField year_txt;
    // End of variables declaration//GEN-END:variables
}
