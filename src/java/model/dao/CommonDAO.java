/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

/**
 *
 * @author Daksh
 */
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import utility.ErrorHandler;

public class CommonDAO {

    public static int getLastInsertID() {
        try {
            String query = "select last_insert_id()";
            PreparedStatement stmt = DataConnection.getStatement(query);
            int id = 0;
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                id = rs.getInt(1);
            }
            rs.close();
            stmt.close();
            return id;
        } catch (Exception ex) {
            ErrorHandler.showStackTrace(ex);
            return 0;
        }
    }

}
