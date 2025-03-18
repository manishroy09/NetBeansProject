package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.manish.bean.StudentBean;
import com.manish.dao.StudentDAO;

public final class update_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Update table</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            //step1: Fetch data from the request
            int sid = Integer.parseInt(request.getParameter("sid"));
            String name = request.getParameter("name");
            String enroll = request.getParameter("enroll");
            int p = Integer.parseInt(request.getParameter("p"));
            int c = Integer.parseInt(request.getParameter("c"));
            int m = Integer.parseInt(request.getParameter("m"));
            int h = Integer.parseInt(request.getParameter("h"));
            int e = Integer.parseInt(request.getParameter("e"));

 //step2:  Create Object of StudentBean and set all data
            StudentBean sb = new StudentBean();
            sb.setC(c);
            sb.setE(e);
            sb.setEnroll(enroll);
            sb.setH(h);
            sb.setM(m);
            sb.setName(name);
            sb.setP(p);
            sb.setSid(sid);
 //step3: Create Object of StudentDAO and call updateStudent()
            StudentDAO sd = new StudentDAO();
            int r = sd.updateStudent(sb);
            if (r > 0) {
                response.sendRedirect("viewstudent.jsp");
            }
        
      out.write("\n");
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
