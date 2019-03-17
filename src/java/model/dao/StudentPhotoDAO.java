/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.to.DepartmentinfoTO;
import model.to.StudentPhotoTO;
import utility.ErrorHandler;

public class StudentPhotoDAO extends DAO {

    public boolean insertRecord(StudentPhotoTO record) {
        try {
            String query = "insert into studentphoto ";
            query += " (studentid,photoname,photosize,phototype) ";
            query += " values(?,?,?,?)";
            PreparedStatement stmt = DataConnection.getStatement(query);
            stmt.setString(1, record.getStudentid());
            stmt.setString(2, record.getPhotoname());
            stmt.setInt(3, record.getPhotosize());
            stmt.setString(4, record.getPhototype());

            boolean result = stmt.executeUpdate() > 0;
            stmt.close();
            return result;
        } catch (Exception ex) {
            error_message = ex.toString();
            ErrorHandler.showStackTrace(ex);
            return false;
        }
    }/*

    public boolean updateRecord(StudentPhotoTO record) {
        try {
            String query = "update studentphoto ";
            query += " set studentid=?,photodata=? ";
            query += " where photoid=?";
            PreparedStatement stmt = DataConnection.getStatement(query);
            stmt.setInt(1, record.getStudentid());
            stmt.setBinaryStream(2, record.getPhotodata());
            stmt.setInt(3, record.getPhotoid());
            boolean result = stmt.executeUpdate() > 0;
            stmt.close();
            return result;
        } catch (Exception ex) {
            error_message = ex.toString();
            ErrorHandler.showStackTrace(ex);
            return false;
        }
    }

    public boolean deleteRecord(int photoid) {
        try {
            String query = "delete from studentphoto ";
            query += " where photoid = ?";
            PreparedStatement stmt = DataConnection.getStatement(query);
            stmt.setInt(1, photoid);
            boolean result = stmt.executeUpdate() > 0;
            stmt.close();
            return result;
        } catch (Exception ex) {
            error_message = ex.toString();
            ErrorHandler.showStackTrace(ex);
            return false;
        }
    }
     */
    public StudentPhotoTO getRecord(int photoid) {
        try {
            String query = "select studentid,photoid,photoname,photosize,photoype ";
            query += " from studentphoto ";
            query += " where photoid = ?";
            PreparedStatement stmt = DataConnection.getStatement(query);
            stmt.setInt(1, photoid);
            StudentPhotoTO result = null;
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                result = new StudentPhotoTO();
                result.setStudentid(rs.getString("studentid"));
                result.setPhotoid(rs.getInt("photoid"));
                result.setPhotoname(rs.getString("photoname"));
                result.setPhotosize(rs.getInt("photosize"));
                result.setPhototype(rs.getString("phototype"));
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

    public List<StudentPhotoTO> getAllRecord() {
        try {
            String query = "select studentid,photoid,photoname,photosize,phototype ";
            query += " from studentphoto ";
            PreparedStatement stmt = DataConnection.getStatement(query);
            List<StudentPhotoTO> result = null;
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                result = new ArrayList<>();
                do {
                    StudentPhotoTO res = new StudentPhotoTO();
                    res.setStudentid(rs.getString("studentid"));
                    res.setPhotoid(rs.getInt("photoid"));
                    res.setPhotoname(rs.getString("photoname"));
                    res.setPhotosize(rs.getInt("photosize"));
                    res.setPhototype(rs.getString("phototype"));
                    result.add(res);
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
