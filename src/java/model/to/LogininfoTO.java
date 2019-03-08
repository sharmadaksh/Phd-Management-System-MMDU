/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.to;

import java.sql.Timestamp;

public class LogininfoTO {
   private String username;
   private String password;
   private String rolename;
   private Timestamp lastlogin;
   private String emailid;
   private String secque;
   private String secans;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public Timestamp getLastlogin() {
        return lastlogin;
    }

    public void setLastlogin(Timestamp lastlogin) {
        this.lastlogin = lastlogin;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getSecque() {
        return secque;
    }

    public void setSecque(String secque) {
        this.secque = secque;
    }

    public String getSecans() {
        return secans;
    }

    public void setSecans(String secans) {
        this.secans = secans;
    }
    
   
}
