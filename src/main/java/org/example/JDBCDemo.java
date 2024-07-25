package org.example;

import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) throws ClassNotFoundException,SQLException{

        JDBCDemo jdbcDemo = new JDBCDemo();
        jdbcDemo.QueryExecute();
        jdbcDemo.getMultipleVal();
//        jdbcDemo.insertVal();
    }

    public void QueryExecute() throws ClassNotFoundException,SQLException{

        String url = "jdbc:mysql://localhost:3306/jdbc_demo";
        String uname = "root";
        String passw = "root";
        String query = "select name from students where RollNo = 3;";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,uname,passw);
        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery(query);

        rs.next();
        String name = rs.getString("name");

        System.out.println(name);
        System.out.println("Original output => "+rs);

        st.close();
        con.close();

    }

    public void getMultipleVal() throws ClassNotFoundException,SQLException{

        String url = "jdbc:mysql://localhost:3306/jdbc_demo";
        String name = "root";
        String passw = "root";
        String query = "Select * from students";

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(url,name,passw);

        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery(query);

        while (rs.next()){

            String rsData = rs.getString(1)
                    + ":" + rs.getString(2);
            System.out.println(rsData);
        }

        st.close();
        con.close();
    }

    public void insertVal() throws ClassNotFoundException,SQLException{
        String url = "jdbc:mysql://localhost:3306/jdbc_demo";
        String name = "root";
        String passw = "root";
        String query = "Insert into students values(5,'Ahana');";

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(url,name,passw);

        Statement st = con.createStatement();

        int count = st.executeUpdate(query);

        System.out.println(count);
    }

    public void insertDynamicVal() throws ClassNotFoundException,SQLException{

        String mysql_url = "jdbc:mysql://localhost:3306/jdbc_demo";
        String uname = "root";
        String upassw = "root";

        String name = "Megha";
        int roll = 6;

        String query = "insert into students values (?,?);";

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(mysql_url,uname,upassw);

        PreparedStatement st = con.prepareStatement(query);

        st.setInt(1,roll);
        st.setString(2,name);

        int cnt = st.executeUpdate();

        System.out.println(cnt + "row(s) affected");

        st.close();
        con.close();

    }
}
