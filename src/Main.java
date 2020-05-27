import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/classicmodels";
        String username = "root";
        String password = "123456";
        try {
            Connection connection = DriverManager.getConnection(url,username,password);
            System.out.println("Ket noi thanh cong");
//            Statement statement = connection.createStatement();
//            String sql = "SELECT * FROM khoa_hoc";
//            ResultSet resultSet = statement.executeQuery(sql);
//            while (resultSet.next()) {
//                int id = resultSet.getInt("id");
//                String name = resultSet.getString("name");
//
//                System.out.println(String.format("%s|%s",id,name));
//            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Ket noi that bai");
        }

    }
}
