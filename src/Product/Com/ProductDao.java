
package Product.Com;
import Product.Modle.Product;
import java.sql.Connection;
import Product.Modle.User;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProductDao {
    public List<User> getAllUsers(){
        List<User> userproducts = new ArrayList<User>();
            Connection connection = Connection_JDBC.Connection_JDBC();
            String sql = "select * from TaiKhoan";
            try{
                 PreparedStatement preparedStatement = connection.prepareStatement(sql);
                 ResultSet rs = preparedStatement.executeQuery();
                 while(rs.next()){
                       User userProduct  = new User();
                       userProduct.setId_user(rs.getInt("ID_USER"));
                       userProduct.setUsername(rs.getString("username"));
                       userProduct.setEmail(rs.getString("Email"));
                       userProduct.setPassword(rs.getString("password"));
                       userProduct.setSinhNhat(rs.getString("DoB"));
                       userProduct.setCmnd(rs.getString("CMND"));
                       userProduct.setSodt(rs.getString("phone"));
                       userProduct.setDiachi(rs.getString("address"));
                       userProduct.setMoney(rs.getDouble("role"));
                       userproducts.add(userProduct);
                 }
            }
            catch(SQLException e){
                e.printStackTrace();    
    }
            return userproducts;
}
     public void addUser(User user) {
        Connection connection = Connection_JDBC.Connection_JDBC();
        String sql = "insert into TaiKhoan ( username,Email,password,DoB,CMND,phone,address)"
                + "values(?,?,?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, user.getUsername());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getPassword());
            preparedStatement.setString(4, user.getSinhNhat());
            preparedStatement.setString(5, user.getCmnd());
            preparedStatement.setString(6, user.getSodt());
            preparedStatement.setString(7, user.getDiachi());
            int rs = preparedStatement.executeUpdate();
        } catch (SQLException e) {
        }
    }   
    public List<Product> getAllProduct(){
        List<Product> products = new ArrayList<Product>();
            Connection connection = Connection_JDBC.Connection_JDBC();
            String sql = "select * from TableProduct";
            try{
                 PreparedStatement preparedStatement = connection.prepareStatement(sql);
                 ResultSet rs = preparedStatement.executeQuery();
                 while(rs.next()){
                   Product product = new Product();
                       product.setId_product(rs.getInt("ID_PRODUCT"));
                       product.setCategory(rs.getString("Category"));
                       product.setTen_product(rs.getString("NAME_PRODUCT"));
                       product.setMau(rs.getString("Color"));
                       product.setGioiTinh(rs.getString("Gender"));
                       product.setSize(rs.getInt("Size"));
                       product.setSoLuongDat(rs.getInt("NumberOrder"));
                       product.setGia(rs.getString("Price"));
                       product.setThongTin(rs.getString("Description"));
                 products.add(product);
                 }
            }
            catch(SQLException e){
                e.printStackTrace();
    }
            return products;
}
    public void addProduct(Product product){
        Connection connection = Connection_JDBC.Connection_JDBC();
        String sql = "insert into TableProduct(Category,Name_Product,Color,Gender,"
                + "Size,NumberOrder,Price,Description)"
                + "values(?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,product.getCategory());
            preparedStatement.setString(2,product.getTen_product());
            preparedStatement.setString(3,product.getMau());
            preparedStatement.setString(4,product.getGioiTinh());
            preparedStatement.setInt(5,product.getSize());
            preparedStatement.setInt(6,product.getSoLuongDat());
            preparedStatement.setString(7,product.getGia());
            preparedStatement.setString(8,product.getThongTin());
            int rs = preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }
        public Product getProductById(int id) {
        Connection connection = Connection_JDBC.Connection_JDBC();
        String sql = "select * from TableProduct where ID_PRODUCT = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,id);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Product product = new Product();
                product.setId_product(rs.getInt("ID_PRODUCT"));
                product.setCategory(rs.getString("Category"));
                product.setTen_product(rs.getString("Name_Product"));
                product.setMau(rs.getString("Color"));
                product.setGioiTinh(rs.getString("Gender"));
                product.setSize(rs.getInt("Size"));
                product.setSoLuongDat(rs.getInt("NumberOrder"));
                product.setGia(rs.getString("Price"));
                product.setThongTin(rs.getString("Description"));
                return product;
            }
                   } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public void updateProduct(Product product){
        Connection connection = Connection_JDBC.Connection_JDBC();
        String sql = "Update TableProduct set Category = ? , Name_Product = ? , Color = ? , Gender = ? , "
                + " Size = ? , NumberOrder = ? , Price = ? ,Description =? where ID_PRODUCT = ? ";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, product.getCategory());
            preparedStatement.setString(2, product.getTen_product());
            preparedStatement.setString(3, product.getMau());
            preparedStatement.setString(4, product.getGioiTinh());
            preparedStatement.setInt(5, product.getSize());
            preparedStatement.setInt(6, product.getSoLuongDat());
            preparedStatement.setString(7, product.getGia());
            preparedStatement.setString(8, product.getThongTin());
            preparedStatement.setInt(9, product.getId_product());
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public List<Product> getProductByCategory(String category) {
        List<Product> products = new ArrayList<Product>();
        Connection connection = Connection_JDBC.Connection_JDBC();
        String sql = "select * from TableProduct where Category = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,category);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Product product = new Product();
                product.setId_product(rs.getInt("ID_PRODUCT"));
                product.setCategory(rs.getString("Category"));
                product.setTen_product(rs.getString("NAME_PRODUCT"));
                product.setMau(rs.getString("Color"));
                product.setGioiTinh(rs.getString("Gender"));
                product.setSize(rs.getInt("Size"));
                product.setSoLuongDat(rs.getInt("NumberOrder"));
                product.setGia(rs.getString("Price"));
                product.setThongTin(rs.getString("Description"));
                products.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return products;
    }
    
    public void deleteProduct(int ID_PRODUCT) throws SQLException{
        Connection connection = Connection_JDBC.Connection_JDBC();
        String sql = "delete from TableProduct where ID_PRODUCT = ?";
        try{
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, ID_PRODUCT);
        int rs = preparedStatement.executeUpdate();
        System.out.println(rs);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        
    }

}
