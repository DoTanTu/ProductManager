
package Product.Modle;
public class Product {
    private int id_product;
    private String Category;
    private String ten_product;
    private String mau;
    private String GioiTinh;
    private int size;
    private int SoLuongDat;
    private String gia;
    private String thongTin;
    

    public Product() {
    }

    public Product(int id_product, String Category, String ten_product, String mau, String GioiTinh, int size, int SoLuongDat, String gia, String thongTin) {
        this.id_product = id_product;
        this.Category = Category;
        this.ten_product = ten_product;
        this.mau = mau;
        this.GioiTinh = GioiTinh;
        this.size = size;
        this.SoLuongDat = SoLuongDat;
        this.gia = gia;
        this.thongTin = thongTin;
    }

    public int getId_product() {
        return id_product;
    }

    public void setId_product(int id_product) {
        this.id_product = id_product;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public String getTen_product() {
        return ten_product;
    }

    public void setTen_product(String ten_product) {
        this.ten_product = ten_product;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSoLuongDat() {
        return SoLuongDat;
    }

    public void setSoLuongDat(int SoLuongDat) {
        this.SoLuongDat = SoLuongDat;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getThongTin() {
        return thongTin;
    }

    public void setThongTin(String thongTin) {
        this.thongTin = thongTin;
    }
    
}
