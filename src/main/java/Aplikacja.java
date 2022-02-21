import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Aplikacja{
    public static void main(String[] args) throws SQLException {
        try(Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5454/postgres","postgres","podaj hasło")){

            PreparedStatement selectStatement = connection.prepareStatement("SELECT * FROM data");
            ResultSet rs = selectStatement.executeQuery();

            List<User> users = new ArrayList<>();

            while (rs.next()){

                Integer id = rs.getInt("id");
                String first_name = rs.getString("first_name");
                String last_name = rs.getString("last_name");
                String email = rs.getString("email");
                String gender = rs.getString("gender");
                String ip_address = rs.getString("ip_address");
                Integer phone_number = rs.getInt("phone_number");

                User user = new User(id,first_name,last_name,email,gender,ip_address,phone_number);
                users.add(user);
            }
            for(int i = 0; i < users.size(); i++){
                users.get(i).printUser();
            }
        }
    }
}
