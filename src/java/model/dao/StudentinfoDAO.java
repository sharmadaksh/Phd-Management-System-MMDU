/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.to.StudentInfoTO;
import utility.ErrorHandler;

public class StudentinfoDAO extends DAO{
        public boolean insertRecord(StudentInfoTO record) {
        try {
            String query = "insert into studentinfo ";
            query += " (studentid,username,name,fname,sessionbeginmonth,sessionendmonth,sessionbeginyear,sessionendyear,contactno,aadhar,pan,category,instname,deptname,dob,email,resarea) ";
            query += " values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = DataConnection.getStatement(query);
            stmt.setString(1, record.getStudentid());
            stmt.setString(2, record.getUsername());
            stmt.setString(3, record.getName());
            stmt.setString(4, record.getFname());
            stmt.setInt(5, record.getSessionbeginmonth());
            stmt.setInt(6, record.getSessionendmonth());
            stmt.setInt(7, record.getSessionbeginyear());
            stmt.setInt(8, record.getSessionendyear());
            stmt.setString(9,record.getContact());
            stmt.setString(10,record.getAadhar());
            stmt.setString(11, record.getPan());
            stmt.setString(12, record.getCategory());
            stmt.setString(13, record.getInstname());
            stmt.setString(14, record.getDeptname());
            stmt.setDate(15, record.getDob());
            stmt.setString(16, record.getEmail());
            stmt.setString(17, record.getRarea());
            
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
            String query = "select  * ";
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
                result.setContact((rs.getString("contactno")));
                 result.setAadhar(rs.getString("aadhar"));
                 result.setPan(rs.getString("pan"));
                 result.setCategory(rs.getString("category"));
                 result.setInstname(rs.getString("instname"));
                 result.setDeptname(rs.getString("deptname"));
               
                 result.setDob(rs.getDate("dob"));
                 result.setEmail(rs.getString("email"));
                 result.setRarea(rs.getString("resarea"));
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
    public List<StudentInfoTO> getAllRecord() {
        try {
            String query = "select *";
            query += " from studentinfo ";

            PreparedStatement stmt = DataConnection.getStatement(query);

            List<StudentInfoTO> result = null;
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                result = new ArrayList<>();
                do {
                    StudentInfoTO record = new StudentInfoTO();
                    record.setStudentid(rs.getString("studentid"));
                    record.setUsername(rs.getString("username"));
                    record.setName(rs.getString("name"));
                    record.setFname(rs.getString("fname"));
                    record.setSessionbeginmonth(rs.getInt("sessionbeginmonth")); 
                    record.setSessionendmonth(rs.getInt("sessionendmonth"));
                    record.setSessionbeginyear(rs.getInt("sessionbeginyear"));
                    record.setSessionendyear(rs.getInt("sessionendyear"));
                    record.setContact(rs.getString("contactno"));
                    record.setAadhar(rs.getString("aadhar"));
                    record.setPan(rs.getString("pan"));
                    record.setCategory(rs.getString("category"));
                    record.setInstname(rs.getString("instname"));
                    record.setDeptname(rs.getString("deptname"));
                    record.setDob(rs.getDate("dob"));
                    record.setRarea(rs.getString("resarea"));
                    result.add(record);
                } while (rs.next());
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
