/**Write a Java program to display all records from a table using Java Database Connectivity
(JDBC).**/


import java.sql.*;
class Cycle_9_qn_1
{
    public static void main(String[] args)
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/data?autoReconnect=true&useSSL=false","root","root");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from studentdetails");
            System.out.println("No \t Name \t\t Age \t\t Place" );
            while(rs.next())
                System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t\t"+rs.getInt(3)+"\t\t"+rs.getString(4));

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}