/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;
import java.sql.*;
import config.Configuration;
/**
 * 
 *
 * @author HP PAVILION
 */
public class DataConnection implements Configuration 
{
    private static Connection con=null;
    
    private DataConnection()
    {
        
    }
    public static Connection getConnection() throws Exception
    {
        if(con==null)
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/phdmanagement","root","root");
        }
        return con;
    }
    public static void closeConnection() throws Exception
    {
        if(con!=null)
        {
            con.close();
        }
        con=null;
    }
    public static PreparedStatement getStatement(String query) throws Exception 
    {
        return getConnection().prepareStatement(query);
    }
}
