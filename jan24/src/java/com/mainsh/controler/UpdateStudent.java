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
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author manis
 */
public class UpdateStudent extends HttpServlet {

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
            out.println("<title>Servlet UpdateStudent</title>");            
            out.println("</head>");
            out.println("<body>");
            //Step1:  fetch data from the request
            int sid=Integer.parseInt(request.getParameter("sid"));
            String name= request.getParameter("name");
            String enroll= request.getParameter("enroll");
            int p=Integer.parseInt(request.getParameter("p"));
            int c=Integer.parseInt(request.getParameter("c"));
            int e=Integer.parseInt(request.getParameter("e"));
            int h=Integer.parseInt(request.getParameter("h"));
            int m=Integer.parseInt(request.getParameter("m"));
            
            //Step2: create an object of studentBean
            StudentBean sb = new StudentBean();
            sb.setSid(sid);
            sb.setName(name);
            sb.setEnroll(enroll);
            sb.setP(p);
            sb.setC(c);
            sb.setE(e);
            sb.setH(h);
            sb.setM(m);
           //Step3: create an object of studentDAo
           StudentDAO sd = new StudentDAO();
           int r = sd.updateStudent(sb);
            if(r>0){
                response.sendRedirect("ViewStudent");
            }
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
