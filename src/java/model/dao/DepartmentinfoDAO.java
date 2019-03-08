/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.to.DepartmentinfoTO;
import utility.ErrorHandler;

/**
 *
 * @author Daksh
 */
public class DepartmentinfoDAO extends DAO{
    public boolean insertRecord(DepartmentinfoTO record) {
        try {
            String query = "insert into department ";
            query += " (deptid,deptname,instid) ";
            query += " values(?,?,?)";
            PreparedStatement stmt = DataConnection.getStatement(query);
            stmt.setInt(1, record.getDeptid());
            stmt.setString(2, record.getDeptname());
            stmt.setInt(1, record.getInstid());
            boolean result = stmt.executeUpdate() > 0;
            stmt.close();
            return result;
        } catch (Exception ex) {
            error_message = ex.toString();
            ErrorHandler.showStackTrace(ex);
            return false;
        }
    }
    public boolean updateRecord(DepartmentinfoTO record) {
        try {
            String query = "update department ";
            query += " set deptname=?";
            query += " where deptid = ?";
            PreparedStatement stmt = DataConnection.getStatement(query);
            stmt.setInt(1, record.getDeptid());
            stmt.setString(2, record.getDeptname());
            
            boolean result = stmt.executeUpdate() > 0;
            stmt.close();
            return result;
        } catch (Exception ex) {
            error_message = ex.toString();
            ErrorHandler.showStackTrace(ex);
            return false;
        }
    }
    public boolean deleteRecord(String deptid) {
        try {
            String query = "delete from department ";            
            query += " where deptid = ?";
            PreparedStatement stmt = DataConnection.getStatement(query);
            stmt.setString(1, deptid);
            boolean result = stmt.executeUpdate() > 0;
            stmt.close();
            return result;
        } catch (Exception ex) {
            error_message = ex.toString();
            ErrorHandler.showStackTrace(ex);
            return false;
        }
    }
    public DepartmentinfoTO getRecord(int deptid) {
        try {
            String query = "select deptname ";
            query += " from department ";            
            query += " where deptid = ?";
            PreparedStatement stmt = DataConnection.getStatement(query);
            stmt.setInt(1, deptid);
            DepartmentinfoTO result = null;
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                result = new DepartmentinfoTO();
                result.setDeptid(rs.getInt("deptid"));
                result.setDeptname(rs.getString("deptname"));
                result.setInstid(rs.getInt("instid"));
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
    public List<DepartmentinfoTO> getAllRecord() {
        try {
            String query = "select deptid,deptname,instid";
            query += " from department ";

            PreparedStatement stmt = DataConnection.getStatement(query);

            List<DepartmentinfoTO> result = null;
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                result = new ArrayList<>();
                do {
                    DepartmentinfoTO record = new DepartmentinfoTO();
                    record.setDeptid(rs.getInt("deptid"));
                    record.setDeptname(rs.getString("deptname"));
                    record.setInstid(rs.getInt("instid"));
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

