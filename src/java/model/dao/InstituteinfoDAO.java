/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.to.InstituteinfoTO;
import utility.ErrorHandler;

/**
 *
 * @author Daksh
 */
public class InstituteinfoDAO extends DAO {
     public boolean insertRecord(InstituteinfoTO record) {
        try {
            String query = "insert into institute ";
            query += " (instid,instname) ";
            query += " values(?,?)";
            PreparedStatement stmt = DataConnection.getStatement(query);
            stmt.setInt(1, record.getInstid());
            stmt.setString(2, record.getInstname());
            boolean result = stmt.executeUpdate() > 0;
            stmt.close();
            return result;
        } catch (Exception ex) {
            error_message = ex.toString();
            ErrorHandler.showStackTrace(ex);
            return false;
        }
    }
    public boolean updateRecord(InstituteinfoTO record) {
        try {
            String query = "update institute ";
            query += " set instid=?";
            query += " where instname = ?";
            PreparedStatement stmt = DataConnection.getStatement(query);
            stmt.setInt(1, record.getInstid());
            stmt.setString(2, record.getInstname());
            
            boolean result = stmt.executeUpdate() > 0;
            stmt.close();
            return result;
        } catch (Exception ex) {
            error_message = ex.toString();
            ErrorHandler.showStackTrace(ex);
            return false;
        }
    }
    public boolean deleteRecord(String instid) {
        try {
            String query = "delete from institute ";            
            query += " where instid = ?";
            PreparedStatement stmt = DataConnection.getStatement(query);
            stmt.setString(1, instid);
            boolean result = stmt.executeUpdate() > 0;
            stmt.close();
            return result;
        } catch (Exception ex) {
            error_message = ex.toString();
            ErrorHandler.showStackTrace(ex);
            return false;
        }
    }
    public InstituteinfoTO getRecord(int instid) {
        try {
            String query = "select instname ";
            query += " from institute ";            
            query += " where instid = ?";
            PreparedStatement stmt = DataConnection.getStatement(query);
            stmt.setInt(1, instid);
            InstituteinfoTO result = null;
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                result = new InstituteinfoTO();
                result.setInstid(rs.getInt("instid"));
                result.setInstname(rs.getString("instname"));
                
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
    public List<InstituteinfoTO> getAllRecord() {
        try {
            String query = "select instid,instname";
            query += " from institute ";

            PreparedStatement stmt = DataConnection.getStatement(query);

            List<InstituteinfoTO> result = null;
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                result = new ArrayList<>();
                do {
                    InstituteinfoTO record = new InstituteinfoTO();
                    record.setInstid(rs.getInt("instid"));
                    record.setInstname(rs.getString("instname"));
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
