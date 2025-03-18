package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.manish.bean.StudentBean;
import com.manish.dao.StudentDAO;

public final class editform_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Edit Form </title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    ");

    //Step1: Fetch Id from the Request 
    int sid = Integer.parseInt(request.getParameter("sid"));
    // Step2: create object of StudentDAO
    StudentDAO sd = new StudentDAO();
    //call findById() method
    StudentBean sb = sd.findById(sid);
    
    
      out.write("\n");
      out.write("    \n");
      out.write("    ");

 
 //step1: Fetch data from the session
 String un=(String)session.getAttribute("user");
 
      out.write("\n");
      out.write(" <hr color=\"green\">\n");
      out.write(" <h1> <font color=\"blue\"> Welcome : ");
      out.print(un );
      out.write("</font></h1>\n");
      out.write(" <hr color=\"red\">\n");
      out.write(" \n");
      out.write("    <form action=\"update.jsp\" method=\"post\">\n");
      out.write("            <table  width=\"60%\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>SID: </td>\n");
      out.write("                    <td><input type=\"text\" name=\"sid\" value=");
      out.print(sb.getSid());
      out.write("></td>\n");
      out.write("                </tr>\n");
      out.write("                 <tr>\n");
      out.write("                    <td>NAME: </td>\n");
      out.write("                    <td><input type=\"text\" name=\"name\" value=");
      out.print(sb.getName());
      out.write("></td>\n");
      out.write("                </tr>\n");
      out.write("                 <tr>\n");
      out.write("                    <td>ENROLLMENT: </td>\n");
      out.write("                    <td><input type=\"text\" name=\"enroll\" value=");
      out.print(sb.getEnroll());
      out.write("></td>\n");
      out.write("                </tr>\n");
      out.write("                 <tr>\n");
      out.write("                    <td>Physics: </td>\n");
      out.write("                    <td><input type=\"text\" name=\"p\" value=");
      out.print(sb.getP());
      out.write("></td>\n");
      out.write("                </tr>\n");
      out.write("                 <tr>\n");
      out.write("                    <td>Chemistry: </td>\n");
      out.write("                    <td><input type=\"text\" name=\"c\" value=");
      out.print(sb.getC());
      out.write("></td> \n");
      out.write("                </tr>\n");
      out.write("                 <tr>\n");
      out.write("                    <td>English: </td>\n");
      out.write("                    <td><input type=\"text\" name=\"e\" value=");
      out.print(sb.getE());
      out.write("></td>\n");
      out.write("                </tr>\n");
      out.write("                 <tr>\n");
      out.write("                    <td>Maths: </td>\n");
      out.write("                    <td><input type=\"text\" name=\"m\" value=");
      out.print(sb.getM());
      out.write("></td>\n");
      out.write("                </tr>\n");
      out.write("                 <tr>\n");
      out.write("                    <td>Hindi: </td>\n");
      out.write("                    <td><input type=\"text\" name=\"h\" value=");
      out.print(sb.getH());
      out.write("></td>\n");
      out.write("                </tr>\n");
      out.write("                 <tr>\n");
      out.write("                     <td></td>\n");
      out.write("                     <td><input type=\"submit\" value=\"Update Student\"></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("    \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
