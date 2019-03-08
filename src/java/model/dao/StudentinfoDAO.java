/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;
import java.sql.*;
import model.to.StudentInfoTO;
import utility.ErrorHandler;

public class StudentinfoDAO extends DAO{
        public boolean insertRecord(StudentInfoTO record) {
        try {
            String query = "insert into studentinfo ";
            query += " (studentid,username,name,fname,sessionbeginmonth,sessionendmonth,sessionbeginyear,sessionendyear,streamid) ";
            query += " values(?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = DataConnection.getStatement(query);
            stmt.setString(1, record.getStudentid());
            stmt.setString(2, record.getUsername());
            stmt.setString(3, record.getName());
            stmt.setString(4, record.getFname());
            stmt.setInt(5, record.getSessionbeginmonth());
            stmt.setInt(6, record.getSessionendmonth());
            stmt.setInt(7, record.getSessionbeginyear());
            stmt.setInt(8, record.getSessionendyear());
            stmt.setString(4, record.getStreamid());
            boolean result = stmt.executeUpdate() > 0;
            stmt.close();
            return result;
        } catch (Exception ex) {
            error_message = ex.toString();
            ErrorHandler.showStackTrace(ex);
            return false;
        }
    }
    public boolean updateRecord(StudentInfoTO record) {
        try {
            String query = "update studentinfo ";
            query += " set studentid=?,name=?,fname=? ,sessionbeginmonth=?,sessionendmonth=?,sessionbeginyear=?,sessionendyear=?,streamid=?";
            query += " where username = ?";
            PreparedStatement stmt = DataConnection.getStatement(query);
            stmt.setString(1, record.getStudentid());
            stmt.setString(2, record.getUsername());
            stmt.setString(3, record.getName());
            stmt.setString(4, record.getFname());
            stmt.setInt(5, record.getSessionbeginmonth());
            stmt.setInt(6, record.getSessionendmonth());
            stmt.setInt(7, record.getSessionbeginyear());
            stmt.setInt(8, record.getSessionendyear());
            stmt.setString(9, record.getStreamid());
            boolean result = stmt.executeUpdate() > 0;
            stmt.close();
            return result;
        } catch (Exception ex) {
            error_message = ex.toString();
            ErrorHandler.showStackTrace(ex);
            return false;
        }
    }
    public boolean deleteRecord(String username) {
        try {
            String query = "delete from studentinfo ";            
            query += " where username = ?";
            PreparedStatement stmt = DataConnection.getStatement(query);
            stmt.setString(1, username);
            boolean result = stmt.executeUpdate() > 0;
            stmt.close();
            return result;
        } catch (Exception ex) {
            error_message = ex.toString();
            ErrorHandler.showStackTrace(ex);
            return false;
        }
    }
    public StudentInfoTO getRecord(String username) {
        try {
            String query = "select studentid,username,name,fname,sessionbeginmonth,sessionendmonth,sessionbeginyear,sessionendyear,streamid ";
            query += " from studentinfo ";            
            query += " where username = ?";
            PreparedStatement stmt = DataConnection.getStatement(query);
            stmt.setString(1, username);
            StudentInfoTO result = null;
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                result = new   StudentInfoTO();
                result.setStudentid(rs.getString("studentid"));
                result.setUsername(rs.getString("username"));
                result.setName(rs.getString("name"));
                result.setFname(rs.getString("fname"));
                result.setSessionbeginmonth(rs.getInt("sessionbeginmonth"));
                result.setSessionendmonth(rs.getInt("sessionendmonth"));
                result.setSessionbeginyear(rs.getInt("sessionbeginyear"));
                result.setSessionendyear(rs.getInt("sessionendyear"));
                result.setStreamid(rs.getString("streamid"));
            }
            rs.close();
            stmt.close();
            return result;
        } catch (Exception ex) {
            error_message = ex.toString();
            ErrorHandler.showStackTrace(ex);
            return null;
        }
}
}
