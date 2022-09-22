import com.mysql.cj.jdbc.Driver;

import java.util.Scanner;
import java.sql.*;

public class main {
    public static void main(String[] args) {
        Connection conn=null;
        Statement stmt =null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mobileshop","root","");
            System.out.println("connection created");
            stmt=(Statement) conn.createStatement();

            Scanner input =new Scanner(System.in);
            System.out.println("enter produduct table ");
            System.out.println("enter model ");
            String model = input.next();
            System.out.println("enter release_year ");
            String release_year = input.next();
            System.out.println("enter brand ");
            String brand = input.next();
            System.out.println("enter price ");
            int price = input.nextInt();
            System.out.println("enter seller name ");
            String seller_name = input.next();
            System.out.println("enter color ");
            String color = input.next();
            System.out.println("enter manufacture date ");
            String manufacture_date = input.next();



            String querry="INSERT INTO `products`( `model`, `release_year`, `brand`, `price`, `seller_name`, `color`, `manufacture_date`) VALUES ('"+model+"','"+ release_year+"', '"+brand+"', "+price+", '"+seller_name+"', '"+color+"', '"+manufacture_date+"')";
           //String querry ="INSERT INTO `temperature`(`tempertaure`) VALUES ("+userName+")";
            System.out.println(querry);
            stmt.executeUpdate(querry);
            System.out.println("Temperature is: " + model );


        }
        catch (Exception e){
            System.out.println("check connection!!!!");
            System.out.println(e);
        }


    }
}
