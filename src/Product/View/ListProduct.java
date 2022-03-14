
package Product.View;
import Product.Modle.Product;
import Product.Modle.User;
import Product.Service.ProductService;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ListProduct extends javax.swing.JFrame {
    ProductService productService;
    DefaultTableModel defaultTableModel;
    public ListProduct() {
        initComponents();
        productService = new ProductService();
       defaultTableModel= new DefaultTableModel(){
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        tableProduct.setModel(defaultTableModel);
        
        defaultTableModel.addColumn("ID_PRODUCT");
        defaultTableModel.addColumn("CATEGORY");
        defaultTableModel.addColumn("NAME PRODUCT");
        defaultTableModel.addColumn("COLOR");
        defaultTableModel.addColumn("GENDER");
        defaultTableModel.addColumn("SIZE");
        defaultTableModel.addColumn("NUMBER_ORDER");
        defaultTableModel.addColumn("PRICE");
        defaultTableModel.addColumn("DSCRIPTION");
        
        List<Product> products = productService.getAllProduct();
        for(Product product : products){
            defaultTableModel.addRow(new Object[]{product.getId_product(),product.getCategory(),product.getTen_product(),product.getMau(),product.getGioiTinh(),product.getSize(),product.getSoLuongDat(),product.getGia(), product.getThongTin()
                    });
        }
    }
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableProduct = new javax.swing.JTable();
        BackForm = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        DeleteProduct = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        managercategory = new javax.swing.JComboBox<>();
        RESET = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 255));

        tableProduct.setBackground(new java.awt.Color(204, 255, 255));
        tableProduct.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 204, 255), 2));
        tableProduct.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tableProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableProduct.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tableProduct);

        BackForm.setBackground(new java.awt.Color(51, 51, 255));
        BackForm.setFont(new java.awt.Font("Harrington", 1, 14)); // NOI18N
        BackForm.setForeground(new java.awt.Color(255, 255, 255));
        BackForm.setText("Back");
        BackForm.setBorder(new javax.swing.border.MatteBorder(null));
        BackForm.setBorderPainted(false);
        BackForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackFormActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 51, 255));
        jButton2.setFont(new java.awt.Font("Harrington", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Add");
        jButton2.setBorder(new javax.swing.border.MatteBorder(null));
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Update.setBackground(new java.awt.Color(51, 51, 255));
        Update.setFont(new java.awt.Font("Harrington", 1, 14)); // NOI18N
        Update.setForeground(new java.awt.Color(255, 255, 255));
        Update.setText("Update");
        Update.setBorder(new javax.swing.border.MatteBorder(null));
        Update.setBorderPainted(false);
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        DeleteProduct.setBackground(new java.awt.Color(51, 51, 255));
        DeleteProduct.setFont(new java.awt.Font("Harrington", 1, 14)); // NOI18N
        DeleteProduct.setForeground(new java.awt.Color(255, 255, 255));
        DeleteProduct.setText("Delete ");
        DeleteProduct.setBorder(new javax.swing.border.MatteBorder(null));
        DeleteProduct.setBorderPainted(false);
        DeleteProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteProductActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Harrington", 1, 14)); // NOI18N
        jLabel3.setText("CATEGORY");

        managercategory.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        managercategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Casual Shoes", "Dress Shoes", "Boots" }));
        managercategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managercategoryActionPerformed(evt);
            }
        });

        RESET.setBackground(new java.awt.Color(51, 51, 255));
        RESET.setFont(new java.awt.Font("Harrington", 1, 14)); // NOI18N
        RESET.setForeground(new java.awt.Color(255, 255, 255));
        RESET.setText("RESET");
        RESET.setBorder(new javax.swing.border.MatteBorder(null));
        RESET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESETActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LIST PRODUCT");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 51, 255)));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 20, 211, 48));

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\Netbean_Java\\Image_Icon\\User-Group-icon.png")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 20, 73, -1));

        jMenuBar1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(0, 0, 0)));
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenu1.setText("MENU");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu1.setMinimumSize(new java.awt.Dimension(40, 25));
        jMenu1.setName(""); // NOI18N
        jMenu1.setPreferredSize(new java.awt.Dimension(55, 25));

        jMenuItem1.setText("SIGN OUT");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(BackForm, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(DeleteProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(RESET, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(managercategory, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(managercategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackForm, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RESET, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackFormActionPerformed
        LoginAccount lg = new LoginAccount();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackFormActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        AddProduct ad = new AddProduct();
        ad.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void DeleteProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteProductActionPerformed
        int row = tableProduct.getSelectedRow();
        if(row ==-1){
            JOptionPane.showMessageDialog(this,"Please choose product firts","Error Message",JOptionPane.ERROR_MESSAGE);
            
        }
        else{
            int confirm = JOptionPane.showConfirmDialog(this,"You definitely want to delete this product? ");
            if(confirm == JOptionPane.YES_OPTION){
                try {
                    int userId = Integer.valueOf(String.valueOf(tableProduct.getValueAt(row,0)));
                    productService.deleteProduct(userId);
                    defaultTableModel.setRowCount(0);
                    defaultTableModel.setRowCount(0);
                    List<Product> products = productService.getAllProduct();
                    for(Product pro : products){
                        defaultTableModel.addRow(new Object[]{pro.getId_product(),
                            pro.getCategory(),pro.getTen_product(),pro.getMau(),
                            pro.getGioiTinh(),pro.getSize(),pro.getSoLuongDat(),pro.getGia(),
                            pro.getThongTin()}); 
                    }           } catch (SQLException ex) {
                    Logger.getLogger(ListProduct.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_DeleteProductActionPerformed

    private void managercategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managercategoryActionPerformed
        defaultTableModel.setRowCount(0);
        String gategory = managercategory.getSelectedItem().toString();
        System.out.println("day la gategory " + gategory );
        List<Product> products = productService.getProductByCategory(gategory);
        for(Product product : products){
            defaultTableModel.addRow(new Object[]{product.getId_product(),product.getCategory(),
                product.getTen_product(),product.getMau(),product.getGioiTinh(),product.getSize(),
                product.getSoLuongDat(),product.getGia(), product.getThongTin()
                    });
        }
    }//GEN-LAST:event_managercategoryActionPerformed

    private void RESETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESETActionPerformed
        defaultTableModel.setRowCount(0);
        List<Product> products = productService.getAllProduct();
        for(Product product : products){
            defaultTableModel.addRow(new Object[]{product.getId_product(),product.getCategory(),
                product.getTen_product(),product.getMau(),product.getGioiTinh(),product.getSize(),
                product.getSoLuongDat(),product.getGia(), product.getThongTin()
                    });
        }
    }//GEN-LAST:event_RESETActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        int row = tableProduct.getSelectedRow();
        if(row ==-1){
            JOptionPane.showMessageDialog(this,"Please choose first Product","Error Message",JOptionPane.ERROR_MESSAGE); 
        }
        else{
                int productId = Integer.valueOf(String.valueOf(tableProduct.getValueAt(row,0)));
                defaultTableModel.setRowCount(0);
                List<Product> products = productService.getAllProduct();
                for(Product product : products ){
                defaultTableModel.addRow(new Object[]{product.getId_product(),product.getCategory(),
                product.getTen_product(),product.getMau(),product.getGioiTinh(),product.getSize(),
                product.getSoLuongDat(),product.getGia(), product.getThongTin()
                    });
            }                                           
                new EditProduct(productId).setVisible(true);
                this.dispose();
        }
    }//GEN-LAST:event_UpdateActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       LoginAccount l = new LoginAccount();
       l.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
//            java.util.logging.Logger.getLogger(ListProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ListProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ListProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ListProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ListProduct().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackForm;
    private javax.swing.JButton DeleteProduct;
    private javax.swing.JToggleButton RESET;
    private javax.swing.JButton Update;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> managercategory;
    private javax.swing.JTable tableProduct;
    // End of variables declaration//GEN-END:variables
}
