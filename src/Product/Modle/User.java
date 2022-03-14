
package Product.Modle;

public class User {
    private Integer id_user;
    private String username;
    private String email;
    private String password;
    private String sinhNhat;
    private String cmnd;
    private String sodt;
    private String diachi;
    private Double money;

    public User() {
    }

    public User(Integer id_user, String username, String email, String password, String sinhNhat, String cmnd, String sodt, String diachi, Double money) {
        this.id_user = id_user;
        this.username = username;
        this.email = email;
        this.password = password;
        this.sinhNhat = sinhNhat;
        this.cmnd = cmnd;
        this.sodt = sodt;
        this.diachi = diachi;
        this.money = money;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSinhNhat() {
        return sinhNhat;
    }

    public void setSinhNhat(String sinhNhat) {
        this.sinhNhat = sinhNhat;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getSodt() {
        return sodt;
    }

    public void setSodt(String sodt) {
        this.sodt = sodt;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    
}
