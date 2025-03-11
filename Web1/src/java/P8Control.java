/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class P8Control extends HttpServlet {

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
            out.println("<title>Servlet P8Control</title>");            
            out.println("</head>");
            out.println("<body>");
            
            out.println(" <h1> Your Register Informtion : </h1>");
            String fname = request.getParameter("fname");
            String lname = request.getParameter("lname");
            String fullname = fname + " " + lname;
            out.println("<h3> Full name : "+fullname+"</h3>");
            String ps = request.getParameter("ps");
            out.println("<h3> Password : "+ps+"</h3>");
              String cps = request.getParameter("cps");
            out.println("<h3> Confirm Password : "+cps+"</h3>");
              String email = request.getParameter("email");
            out.println("<h3> Email I'd  : "+email+"</h3>");
              String no = request.getParameter("no");
            out.println("<h3> Mobile number : "+no+"</h3>");
              String add = request.getParameter("add");
            out.println("<h3> Address  : "+add+"</h3>");
              String gen = request.getParameter("gen");
            out.println("<h3> Gender  : "+gen+"</h3>");
            String sp[] = request.getParameterValues("sp");
            out.print("</h3> Loved sports : </h3> ");
            for(String s : sp){
                out.print("<h3>"+s+"</h3>");
            }
              String dob = request.getParameter("dob");
            out.println("<h3> Date of Birth  : "+dob+"</h3>");
            
              String con = request.getParameter("con");
            out.println("<h1> Country  : "+con+"</h1>");
          
           
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
