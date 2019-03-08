/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.to;

public class StudentInfoTO {
    private String studentid;
    private String username;
    private String name;
    private String fname;
    private int sessionbeginmonth;
    private int sessionendmonth;
    private int sessionbeginyear;
    private int sessionendyear;
    private String streamid;

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

    public String getStreamid() {
        return streamid;
    }

    public void setStreamid(String streamid) {
        this.streamid = streamid;
    }
}
