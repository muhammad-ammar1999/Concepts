/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopms;

import java.sql.*;
/**
 *
 * @author muhammadammar
 */
public class ShopMS {

    /**
     * @param args the command line arguments
     */

     static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost/ShopMS";

      static final String USER = "root";
   static final String PASS = "";
   
   public static void main(String[] args) {
   Connection conn = null;
   Statement statement = null;
   try{
       Class.forName("com.mysql.jdbc.Driver");

       System.out.println("Connecting to database...");
      conn = DriverManager.getConnection(DB_URL,USER,PASS);

      System.out.println("Creating statement...");
      statement = (Statement) conn.createStatement();
      String sql;
      sql = "select id from Expense ";
         try (ResultSet resultSet = statement.executeQuery(sql)) {
           while(resultSet.next()){
               int id  = resultSet.getInt("id");
               
               //Display values
               System.out.print("ID: " + id);
            }
       
       }
      statement.close();
      conn.close();
   }catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
      //finally block used to close resources
      try{
         if(statement!=null)
            statement.close();
      }catch(SQLException se2){
      }
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }
   }
   System.out.println("Goodbye!");
}
}


