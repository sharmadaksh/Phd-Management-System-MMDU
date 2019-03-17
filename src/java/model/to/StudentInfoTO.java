/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.to;
import  java.sql.Date;

public class StudentInfoTO {
    private String studentid;
    private String username;
    private String name;
    private String fname;
    private int sessionbeginmonth;
    private int sessionendmonth;
    private int sessionbeginyear;
    private int sessionendyear;
    private String contact;
    private String aadhar;
    private String pan;
    private String category;
    private String instname;
    private String deptname;
    private Date dob;
    private String  email;
    private String rarea;

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAadhar() {
        return aadhar;
    }

    public void setAadhar(String aadhar) {
        this.aadhar = aadhar;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

   

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getInstname() {
        return instname;
    }

    public void setInstname(String instname) {
        this.instname = instname;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRarea() {
        return rarea;
    }

    public void setRarea(String rarea) {
        this.rarea = rarea;
    }
    
    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public int getSessionbeginmonth() {
        return sessionbeginmonth;
    }

    public void setSessionbeginmonth(int sessionbeginmonth) {
        this.sessionbeginmonth = sessionbeginmonth;
    }

    public int getSessionendmonth() {
        return sessionendmonth;
    }

    public void setSessionendmonth(int sessionendmonth) {
        this.sessionendmonth = sessionendmonth;
    }

    public int getSessionbeginyear() {
        return sessionbeginyear;
    }

    public void setSessionbeginyear(int sessionbeginyear) {
        this.sessionbeginyear = sessionbeginyear;
    }

    public int getSessionendyear() {
        return sessionendyear;
    }

    public void setSessionendyear(int sessionendyear) {
        this.sessionendyear = sessionendyear;
    }

}