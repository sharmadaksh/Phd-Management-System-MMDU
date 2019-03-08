/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.to.LogininfoTO;
import utility.ErrorHandler;

public class LogininfoDAO extends DAO {

    public boolean insertRecord(LogininfoTO record) {
        try {
            String query = "insert into logininfo ";
            query += " (username,password,rolename,emailid,secque,secans) ";
            query += " values(?,?,?,?,?,?)";
            PreparedStatement stmt = DataConnection.getStatement(query);
            stmt.setString(1, record.getUsername());
            stmt.setString(2, record.getPassword());
            stmt.setString(3, record.getRolename());
            stmt.setString(4, record.getEmailid());
            stmt.setString(5, record.getSecque());
            stmt.setString(6, record.getSecans());
            boolean result = stmt.executeUpdate() > 0;
            stmt.close();
            return result;
        } catch (Exception ex) {
            error_message = ex.toString();
            ErrorHandler.showStackTrace(ex);
            return false;
        }
    }

    public boolean updateRecord(LogininfoTO record) {
        try {
            String query = "update logininfo ";
            query += " set password=?,rolename=?,emailid=?,secque=?,secans=?";
            query += " where username = ?";
            PreparedStatement stmt = DataConnection.getStatement(query);
            stmt.setString(1, record.getPassword());
            stmt.setString(2, record.getRolename());
            stmt.setTimestamp(3, record.getLastlogin());
            stmt.setString(4, record.getUsername());
            stmt.setString(5, record.getEmailid());
            stmt.setString(6, record.getSecque());
            stmt.setString(7, record.getSecans());
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
            String query = "delete from logininfo ";
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

    public LogininfoTO getRecord(String username) {
        try {
            String query = "select username,password,rolename,lastlogin,emailid,secque,secans ";
            query += " from logininfo ";
            query += " where username=?";

            PreparedStatement stmt = DataConnection.getStatement(query);
stmt.setString(1,username);
            LogininfoTO result = null;
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                result = new LogininfoTO();
                result.setUsername(rs.getString("username"));
                result.setPassword(rs.getString("password"));
                result.setRolename(rs.getString("rolename"));
                result.setLastlogin(rs.getTimestamp("lastlogin"));
                result.setEmailid(rs.getString("emailid"));
                result.setSecque(rs.getString("secque"));
                result.setSecans(rs.getString("secans"));
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

    public List<LogininfoTO> getAllRecord() {
        try {
            String query = "select username,password,rolename,lastlogin,emailid,secque,secans ";
            query += " from logininfo ";

            PreparedStatement stmt = DataConnection.getStatement(query);

            List<LogininfoTO> result = null;
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                result = new ArrayList<>();
                do {
                    LogininfoTO record = new LogininfoTO();
                    record.setUsername(rs.getString("username"));
                    record.setPassword(rs.getString("password"));
                    record.setRolename(rs.getString("rolename"));
                    record.setLastlogin(rs.getTimestamp("lastlogin"));
                    record.setEmailid(rs.getString("emailid"));
                    record.setSecque(rs.getString("secque"));
                    record.setSecans(rs.getString("secans"));
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
