package org.example;

import java.sql.*;

public class StudentDAO {

    public Student getStudent(int roll) throws ClassNotFoundException,SQLException{
        Student s = new Student();

        String url = "jdbc:mysql://localhost:3306/jdbc_demo";
        String uname = "root";
        String passw = "root";
        String query = "Select name from students where rollno=1";


        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,uname,passw);
        Statement st = con.createStatement();
        ResultSet rs  = st.executeQuery(query);

        rs.next();
        String ans = rs.getString(1);
        // No of columns in the final answer not in the actual table
        System.out.println("The output we got " + ans);

        s.name = ans;
        s.roll = roll;

        return s;
    }
}
