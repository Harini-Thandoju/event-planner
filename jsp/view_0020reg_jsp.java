package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;

public final class view_0020reg_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

Connection con;
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/connection reg.jsp");
    _jspx_dependants.add("/css menu admin 1.jsp");
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
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write(" <head>\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("  <title>JSP Page</title>\n");
      out.write(" </head>\n");
      out.write(" <body>\n");
      out.write(" \n");
      out.write(" \n");
      out.write(" ");
      out.write('\n');
      out.write(' ');
Class.forName ("com.mysql.jdbc.Driver");
 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/reg","root","root");
out.println("connected");

      out.write("\n");
      out.write(" </body>\n");
      out.write("</html>\n");
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" dir=\"ltr\">\n");
      out.write("<head>\n");
      out.write("\t<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("\t<title>css3menu.com</title>\n");
      out.write("\t\t<!-- Start css3menu.com HEAD section -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"CSS3 Menu Admin 1_files/css3menu1/style.css\" type=\"text/css\" /><style type=\"text/css\">._css3m{display:none}</style>\n");
      out.write("\t<!-- End css3menu.com HEAD section -->\n");
      out.write("\n");
      out.write("\t\n");
      out.write("</head>\n");
      out.write("<body >\n");
      out.write("<!-- Start css3menu.com BODY section -->\n");
      out.write("<ul id=\"css3menu1\" class=\"topmenu\">\n");
      out.write("\t<li class=\"topfirst\"><a href=\"add event.jsp\" style=\"height:24px;line-height:24px;\">Add Event</a></li>\n");
      out.write("        <li class=\"topfirst\"><a href=\"view add event.jsp\" style=\"height:24px;line-height:24px;\">View Event</a></li>\n");
      out.write("\t<li class=\"topmenu\"><a href=\"Modify event.jsp\" style=\"height:24px;line-height:24px;\">Modify Event</a></li>\n");
      out.write("\t<li class=\"topmenu\"><a href=\"view reg.jsp\" style=\"height:24px;line-height:24px;\">View User Details</a></li>\n");
      out.write("\t<li class=\"topmenu\"><a href=\"event 2.jsp\" style=\"height:24px;line-height:24px;\">Event</a></li>\n");
      out.write("        <li class=\"toplast\"><a href=\"log out.jsp\" style=\"height:24px;line-height:24px;\">Log Out</a></li>\n");
      out.write("</ul><p class=\"_css3m\"><a href=\"http://css3menu.com/\">CSS Drop Down Menus</a> by Css3Menu.com</p>\n");
      out.write("<!-- End css3menu.com BODY section -->\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write(" <head>\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("  <title>JSP Page</title>\n");
      out.write("  <style>\n");
      out.write("      body{\n");
      out.write("          background-color: palevioletred;\n");
      out.write("      }\n");
      out.write("  </style>\n");
      out.write(" </head>\n");
      out.write(" <body>\n");
      out.write("       <center>\n");
      out.write("        <h1>VIEW USER DETAILS</h1>\n");
      out.write("        <table border=\"1\">\n");
      out.write("            <tr>\n");
      out.write("                <td>Firstname</td>\n");
      out.write("                <td>Lastname</td>\n");
      out.write("                <td>Mobile</td>\n");
      out.write("                <td>Email</td>\n");
      out.write("                <td>Password</td>\n");
      out.write("                <td>DOB</td>\n");
      out.write("            </tr>\n");
      out.write("            <tbody>\n");
      out.write("                ");

                    Statement st=con.createStatement();
                    ResultSet rs=st.executeQuery("select * from reg");
                    while(rs.next())
                    {
                        
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print(rs.getString(1));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rs.getString(3));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rs.getString(4));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rs.getString(5));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rs.getString(6));
      out.write("</td>\n");
      out.write("                                                     \n");
      out.write("                        </tr>\n");
      out.write("                        ");
}
                    
      out.write("\n");
      out.write("                        \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("            </tbody>\n");
      out.write("    </table>\n");
      out.write("                    </center>\n");
      out.write(" \n");
      out.write("  \n");
      out.write(" </body>\n");
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
