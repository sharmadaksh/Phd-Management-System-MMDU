/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.admin.insert;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.Part;
import model.dao.CommonDAO;
import model.dao.LogininfoDAO;
import model.dao.StudentPhotoDAO;

import model.to.StudentInfoTO;
import model.dao.StudentinfoDAO;
import model.to.LogininfoTO;
import model.to.StudentPhotoTO;
import utility.Validations;

/**
 *
 * @author HP PAVILION
 */
@MultipartConfig
public class AddStudentDetails extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Part studentid_part = request.getPart("studentid");
        System.out.println(" YES DONES ");
        Part uname_part = request.getPart("uname");
        Part name_part = request.getPart("name");
        Part fname_part = request.getPart("fname");
        Part sessbegmnth_part = request.getPart("sessbegmnth");
        Part sessendmnth_part = request.getPart("sessendmnth");
        Part sessbegyr_part = request.getPart("sessbegyr");
        Part sessendyr_part = request.getPart("sessendyr");
        Part contact_part = request.getPart("contact");
        Part aadhar_part = request.getPart("aadhar");
        Part pan_part = request.getPart("pan");
        Part category_part = request.getPart("category");
        Part instname_part = request.getPart("instname");
        Part deptname_part = request.getPart("deptname");
        Part dob_part = request.getPart("dob");
        Part email_part = request.getPart("email");
        Part rarea_part = request.getPart("rarea");
        Part sphoto_part = request.getPart("sphoto");
        System.out.println("uname_part" + uname_part);
        HttpSession session = request.getSession();
        boolean failure = true;
        String message = "";
        if (studentid_part != null && uname_part != null && name_part != null && fname_part != null && sessbegmnth_part != null && sessendmnth_part != null && sessbegyr_part != null && sessendyr_part != null && contact_part != null && aadhar_part != null && pan_part != null && category_part != null && instname_part != null && deptname_part != null && dob_part != null && email_part != null && rarea_part != null && sphoto_part != null) {
            Scanner studentid_scanner = new Scanner(studentid_part.getInputStream());
            System.out.println(" 111111111111111111111111111111 ");
            Scanner uname_scanner = new Scanner(uname_part.getInputStream());
            Scanner name_scanner = new Scanner(name_part.getInputStream());
            Scanner fname_scanner = new Scanner(fname_part.getInputStream());
            Scanner sessbegmnth_scanner = new Scanner(sessbegmnth_part.getInputStream());
            Scanner sessendmnth_scanner = new Scanner(sessendmnth_part.getInputStream());
            Scanner sessbegyr_scanner = new Scanner(sessbegyr_part.getInputStream());
            Scanner sessendyr_scanner = new Scanner(sessendyr_part.getInputStream());
            Scanner contact_scanner = new Scanner(contact_part.getInputStream());
            Scanner aadhar_scanner = new Scanner(aadhar_part.getInputStream());
            Scanner pan_scanner = new Scanner(pan_part.getInputStream());
            Scanner category_scanner = new Scanner(category_part.getInputStream());
            Scanner instname_scanner = new Scanner(instname_part.getInputStream());
            Scanner deptname_scanner = new Scanner(deptname_part.getInputStream());
            Scanner dob_scanner = new Scanner(dob_part.getInputStream());
            Scanner email_scanner = new Scanner(email_part.getInputStream());
            Scanner rarea_scanner = new Scanner(rarea_part.getInputStream());
            System.out.println("++++++++++++++++++++++++++++++++++++");
            boolean allvalid = true;
            if (!studentid_scanner.hasNext()) {
                allvalid = false;
                message += "Please Valid Student ID<br>";
                System.out.println("++++++++++++++++++++++++++++++++++++" + allvalid);
            }
            if (!uname_scanner.hasNext()) {
                allvalid = true;
                message += "Please Valid Student Username<br>";
                System.out.println("++++++++++++++++++++++++++++++++++++" + allvalid);
            }
            if (!name_scanner.hasNext()) {
                allvalid = false;
                message += "Please Valid Student name<br>";
                System.out.println("++++++++++++++++++++++++++++++++++++" + allvalid);
            }
            if (!fname_scanner.hasNext()) {
                allvalid = false;
                message += "Please Valid Father Name<br>";
                System.out.println("++++++++++++++++++++++++++++++++++++" + allvalid);
            }
            if (!sessbegmnth_scanner.hasNextInt()) {
                allvalid = false;
                message += "Please Valid Session Begin Month<br>";
                System.out.println("++++++++++++++++++++++++++++++++++++" + allvalid);
            }
            if (!sessendmnth_scanner.hasNextInt()) {
                allvalid = false;
                message += "Please Valid Session End Month<br>";
                System.out.println("++++++++++++++++++++++++++++++++++++" + allvalid);
            }
            if (!sessbegyr_scanner.hasNextInt()) {
                allvalid = false;
                message += "Please Valid Session Begin Year<br>";
                System.out.println("++++++++++++++++++++++++++++++++++++" + allvalid);
            }
            if (!sessendyr_scanner.hasNextInt()) {
                allvalid = false;
                message += "Please Valid Session End Year<br>";
                System.out.println("++++++++++++++++++++++++++++++++++++" + allvalid);
            }
            if (!contact_scanner.hasNext()) {
                allvalid = false;
                message += "Please Valid Contact<br>";
                System.out.println("++++++++++++++++++++++++++++++++++++" + allvalid);
            }
            if (!aadhar_scanner.hasNext()) {
                allvalid = false;
                message += "Please Valid Aadhar<br>";
                System.out.println("++++++++++++++++++++++++++++++++++++" + allvalid);
            }
            if (!pan_scanner.hasNext()) {
                allvalid = false;
                message += "Please Valid Pan<br>";
                System.out.println("++++++++++++++++++++++++++++++++++++" + allvalid);
            }
            if (!category_scanner.hasNext()) {
                allvalid = false;
                message += "Please Valid Category<br>";
                System.out.println("++++++++++++++++++++++++++++++++++++" + allvalid);
            }
            if (!instname_scanner.hasNext()) {
                allvalid = false;
                message += "Please Valid Institute Name<br>";
                System.out.println("++++++++++++++++++++++++++++++++++++" + allvalid);
            }
            if (!deptname_scanner.hasNext()) {
                allvalid = false;
                message += "Please Valid Department Name<br>";
                System.out.println("++++++++++++++++++++++++++++++++++++" + allvalid);
            }
            if (!dob_scanner.hasNext()) {
                allvalid = false;
                message += "Please Valid DOB<br>";
                System.out.println("++++++++++++++++++++++++++++++++++++" + allvalid);
            }
            if (!email_scanner.hasNext()) {
                allvalid = false;
                message += "Please Valid Email ID<br>";
                System.out.println("++++++++++++++++++++++++++++++++++++" + allvalid);
            }
            if (!rarea_scanner.hasNext()) {
                allvalid = false;
                message += "Please Valid Research Area<br>";
                System.out.println("++++++++++++++++++++++++++++++++++++1111111111111111111" + allvalid);
            }
            String filename = "";
            String extension = "";
            if (sphoto_part.getInputStream() instanceof FileInputStream) {
                System.out.println("++++++++++++++++++++++++++++++++++++2222222222222222222" + allvalid);
                filename = getFileName(sphoto_part);
                extension = filename.substring(filename.lastIndexOf(".") + 1);

                if (!Validations.isValidImage(extension)) {
                    System.out.println("++++++++++++++++++++++++++++++++++++333333333333333333333" + allvalid);
                    allvalid = false;
                    message += "Invalid Format of Photo is Uploaded<br>";
                }
            } else {
                System.out.println("++++++++++++++++++++++++++++++++++++4444444444444444" + allvalid);
                allvalid = false;
                message += "Please Choose Any File<br>";
            }
            System.out.println("qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq" + allvalid);
            if (allvalid) {
                System.out.println("55555555555555555555555555555555555555555555555");
                String studentid = studentid_scanner.next();
                String uname = uname_scanner.next();
                String name = name_scanner.next();
                String fname = fname_scanner.next();
                int sessbegmnth = sessbegmnth_scanner.nextInt();
                int sessendmnth = sessendmnth_scanner.nextInt();
                int sessbegyr = sessbegyr_scanner.nextInt();
                int sessendyr = sessendyr_scanner.nextInt();
                String contact = contact_scanner.next();
                String aadhar = aadhar_scanner.next();
                String pan = pan_scanner.next();
                String category = category_scanner.next();
                String instname = instname_scanner.next();
                String deptname = deptname_scanner.next();
                String dob = dob_scanner.next();
                String email = email_scanner.next();
                String rarea = rarea_scanner.next();

                StudentInfoTO record = new StudentInfoTO();
                record.setStudentid(studentid);
                record.setUsername(uname);
                record.setName(name);
                record.setFname(fname);
                record.setSessionbeginmonth(sessbegmnth);
                record.setSessionendmonth(sessendmnth);
                record.setSessionbeginyear(sessbegyr);
                record.setSessionendyear(sessendyr);
                record.setContact(contact);
                record.setAadhar(aadhar);
                record.setPan(pan);
                record.setCategory(category);
                record.setInstname(instname);
                record.setDeptname(deptname);
                record.setDob(Date.valueOf(dob));
                record.setEmail(email);
                record.setRarea(rarea);

                LogininfoTO rec = new LogininfoTO();
                rec.setUsername(uname);
                rec.setPassword(uname);
                rec.setRolename("scholar");
                rec.setEmailid(email);
                rec.setSecque("What is your name?");
                rec.setSecans(name);

                LogininfoDAO lid = new LogininfoDAO();

                if (lid.insertRecord(rec)) {
                    StudentinfoDAO sid = new StudentinfoDAO();
                    if (sid.insertRecord(record)) {
                        message = "Student Information is Added in System";
                        failure = false;
                        String phototype = sphoto_part.getContentType();
                        int photosize = sphoto_part.getInputStream().available();

                        StudentPhotoTO sp = new StudentPhotoTO();
                        sp.setStudentid(studentid);
                        sp.setPhotoname(filename);
                        sp.setPhotosize(photosize);
                        sp.setPhototype(phototype);
                        System.out.println(message);

                        StudentPhotoDAO spd = new StudentPhotoDAO();
                        if (spd.insertRecord(sp)) {
                            CommonDAO cd = new CommonDAO();
                            int photoid = 0;
                            photoid = CommonDAO.getLastInsertID();
                            if (photoid != 0) {
                                String path =  photoid + "." + extension;
                                System.out.println(path);
                                path = getServletContext().getRealPath("/sphotos") + "/" + path;
                                //path = this.getClass().getResource("/").getPath() + path;
                                System.out.println(path);
                                FileOutputStream fout = new FileOutputStream(path);
                                InputStream is = sphoto_part.getInputStream();
                                int data = is.read();
                                while (data != -1) {
                                    fout.write(data);
                                    data = is.read();
                                }
                                fout.close();
                                message = "Photo is Successfully uploaded in system";
                                failure = false;
                            }
                        }
                    } else {
                        message = "Insertion Failure : " + sid.getError_message();
                        System.out.println(sid.getError_message());
                    }
                } else {
                    System.out.println(lid.getError_message());
                }
            } else {
                System.out.println(" INvalid Numbers ");
            }
        } else {
            message = "Not Enough Details";
        }

        if (failure) {
            session.setAttribute("error", "yes");
        }
        session.setAttribute("message", message);
        response.sendRedirect("addstudent.jsp");
    }

    private String getFileName(Part part) {
        String filename = "";
        filename = part.getHeader("content-disposition");
        filename = filename.substring(filename.lastIndexOf("=") + 1);
        filename = filename.replace("\"", "");
        return filename;
    }
}
