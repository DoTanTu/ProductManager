
package Product.Service;

import Product.Com.ProductDao;
import Product.Modle.Product;
import Product.Modle.User;
import java.sql.SQLException;
import java.util.List;


public class ProductService {
    private ProductDao productDao;
    
    public ProductService(){
        productDao = new ProductDao();
    }
    
    public List<User> getAllUsers(){
        return productDao.getAllUsers();
    }
    public List<Product> getAllProduct(){
        return productDao.getAllProduct();
    }
    public void addUser(User user){
        productDao.addUser(user);
    }
    public void addProduct(Product product){
        productDao.addProduct(product);
    }
    public void deleteProduct(int ID_PRODUCT) throws SQLException{
        productDao.deleteProduct(ID_PRODUCT);
    }
    public void updateProduct(Product product){
        productDao.updateProduct(product);
    }
        public List<Product> getProductByCategory(String category){
        return productDao.getProductByCategory(category);
    }
    public Product getProductById(int id){
        
        return productDao.getProductById(id);
    }
}