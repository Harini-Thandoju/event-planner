package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;

public final class admin_0020compare_0020password_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

Connection con;
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/connection admin password.jsp");
  }

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

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("          \n");
      out.write(" \n");
      out.write(" ");
      out.write('\n');
      out.write(' ');
Class.forName ("com.mysql.jdbc.Driver");
 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/adminpassword","root","root");
out.println("connected");

      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            Statement st=con.createStatement();
            String AdminID=request.getParameter("ad");
            String Password=request.getParameter("pswd");
            String Newpassword=request.getParameter("nwpswd");
            String Confirmpassword=request.getParameter("conpswd");
            session.setAttribute("sPassword",Password);
            ResultSet rs=st.executeQuery("select AdminID,Password,Newpassword,Confirmpassword from userpassword where Password='"+Password+"'");
            if(rs.next())
            {
                String a=rs.getString(1);
                 String p=rs.getString(2);
                  String n=rs.getString(3);
                   String c=rs.getString(4);
                   
if(a.equals(AdminID)&&p.equals(Password)&&n.equals(Newpassword)&&c.equals(Confirmpassword))
{

      out.write('\n');
      if (true) {
        _jspx_page_context.forward("password.jsp");
        return;
      }
      out.write("\n");
      out.write("        ");

}
else
            {
      out.write("\n");
      out.write("            ");
      if (true) {
        _jspx_page_context.forward("password.jsp");
        return;
      }
      out.write("\n");
      out.write("            ");

            }
            }
                else
                {
                    
      out.write("\n");
      out.write("                    ");
      if (true) {
        _jspx_page_context.forward("invalid.jsp");
        return;
      }
      out.write("\n");
      out.write("                    ");

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
