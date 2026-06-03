package qlsp;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDB {

    public Connection createCon() {
        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/QLSP"
                   + "?useUnicode=true"
                   + "&characterEncoding=utf8"
                   + "&useSSL=false"
                   + "&serverTimezone=UTC";
        String user = "root";
        String password = "";
        String driver = "com.mysql.cj.jdbc.Driver";
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Ket noi that bai");
        }
        return con;
    }

    public static void main(String[] args) {
        ConnectDB db = new ConnectDB();
        db.createCon();
    }
}