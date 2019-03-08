/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.to.PhdstepTO;
import utility.ErrorHandler;

public class PhdstepDAO extends DAO{
    public boolean insertRecord(PhdstepTO record) {
        try {
            String query = "insert into phdstep ";
            query += " (stepid,stepname) ";
            query += " values(?,?)";
            PreparedStatement stmt = DataConnection.getStatement(query);
            stmt.setInt(1, record.getStepid());
            stmt.setString(2, record.getStepname());
            boolean result = stmt.executeUpdate() > 0;
            stmt.close();
            return result;
        } catch (Exception ex) {
            error_message = ex.toString();
            ErrorHandler.showStackTrace(ex);
            return false;
        }
    }
    public boolean updateRecord(PhdstepTO record) {
        try {
            String query = "update phdstep ";
            query += " set stepname=?";
            query += " where stepid = ?";
            PreparedStatement stmt = DataConnection.getStatement(query);
            stmt.setInt(1, record.getStepid());
            stmt.setString(2, record.getStepname());
            
            boolean result = stmt.executeUpdate() > 0;
            stmt.close();
            return result;
        } catch (Exception ex) {
            error_message = ex.toString();
            ErrorHandler.showStackTrace(ex);
            return false;
        }
    }
    public boolean deleteRecord(String streamid) {
        try {
            String query = "delete from phdstep ";            
            query += " where stepid = ?";
            PreparedStatement stmt = DataConnection.getStatement(query);
            stmt.setString(1, streamid);
            boolean result = stmt.executeUpdate() > 0;
            stmt.close();
            return result;
        } catch (Exception ex) {
            error_message = ex.toString();
            ErrorHandler.showStackTrace(ex);
            return false;
        }
    }
    public PhdstepTO getRecord(int stepid) {
        try {
            String query = "select stepname ";
            query += " from phdstep ";            
            query += " where stepid = ?";
            PreparedStatement stmt = DataConnection.getStatement(query);
            stmt.setInt(1, stepid);
            PhdstepTO result = null;
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                result = new PhdstepTO();
                result.setStepid(rs.getInt("stepid"));
                result.setStepname(rs.getString("stepname"));
                
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
    public List<PhdstepTO> getAllRecord() {
        try {
            String query = "select stepid,stepname";
            query += " from phdstep ";

            PreparedStatement stmt = DataConnection.getStatement(query);

            List<PhdstepTO> result = null;
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                result = new ArrayList<>();
                do {
                    PhdstepTO record = new PhdstepTO();
                    record.setStepid(rs.getInt("stepid"));
                    record.setStepname(rs.getString("stepname"));
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
