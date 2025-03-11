/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mainsh.controler;


import com.manish.bean.StudentBean;
import com.manish.dao.StudentDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author manis
 */
public class ViewStudent extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ViewStudent</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>All Student Data</h1>");
           out.println("<h1><a href='addStudent.html'>Add Student</a></h1>");
            out.println("<table border='1' align='center'>");
            out.println("<tr>");
            out.println("<th>SID</th>");
            out.println("<th>NAME</th>");
            out.println("<th>ENROLL</th>");
            out.println("<th>P</th>");
            out.println("<th>C</th>");
            out.println("<th>M</th>");
            out.println("<th>H</th>");
            out.println("<th>E</th>");
            out.println("<th>Total</th>");
            out.println("<th>Percentage</th>");
            out.println("<th>EDIT</th>");
            out.println("<th>DELETE</th>");
             out.println("</tr>");
             StudentDAO sd = new StudentDAO();
           ArrayList<StudentBean> all = sd.findAll();
           for(StudentBean s: all){
            out.println("<tr>");
            out.println(" <td>"+s.getSid()+"</td>");
            out.println("<td>"+s.getName()+"</td>");
            out.println("<td>"+s.getEnroll()+"</td>");
            out.println("<td>"+s.getP()+"</td>");
            out.println("<td>"+s.getC()+"</td>");
            out.println("<td>"+s.getM()+"</td>");
            out.println(" <td>"+s.getH()+"</td>");
            out.println("<td>"+s.getE()+"</td>");
            out.println("<td>"+s.getTotal()+"/</td>");
            out.println("<td>"+s.getPer()+"</td>");
            out.println(" <td><a href='EditForm?sid="+s.getSid()+"'>EDIT</a></td>");
            out.println("<th><a href='DeleteController?sid="+s.getSid()+"'>DELETE</a></th>");

            out.println("</tr>");
           }

            out.println("</table>");

            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
