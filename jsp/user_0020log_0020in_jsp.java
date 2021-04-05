package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class user_0020log_0020in_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/css menu home 1.jsp");
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" dir=\"ltr\">\n");
      out.write("<head>\n");
      out.write("\t<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("\t<title>css3menu.com</title>\n");
      out.write("\t\t<!-- Start css3menu.com HEAD section -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"CSS3 Menu home 1_files/css3menu1/style.css\" type=\"text/css\" /><style type=\"text/css\">._css3m{display:none}</style>\n");
      out.write("\t<!-- End css3menu.com HEAD section -->\n");
      out.write("\n");
      out.write("\t\n");
      out.write("</head>\n");
      out.write("<body >\n");
      out.write("<!-- Start css3menu.com BODY section -->\n");
      out.write("<ul id=\"css3menu1\" class=\"topmenu\">\n");
      out.write("\t<li class=\"topfirst\"><a href=\"home.jsp\" style=\"height:35px;line-height:35px;\"><img src=\"CSS3 Menu home 1_files/css3menu1/home.png\" alt=\"\"/>Home</a></li>\n");
      out.write("\t<li class=\"topmenu\"><a href=\"about.jsp\" style=\"height:35px;line-height:35px;\"><img src=\"CSS3 Menu home 1_files/css3menu1/contact.png\" alt=\"\"/>About </a></li>\n");
      out.write("\t<li class=\"topmenu\"><a href=\"contact.jsp\" style=\"height:35px;line-height:35px;\"><img src=\"CSS3 Menu home 1_files/css3menu1/blue_circle - save.png\" alt=\"\"/>Contact</a></li>\n");
      out.write("\t<li class=\"topmenu\"><a href=\"reg form.jsp\" style=\"height:35px;line-height:35px;\"><img src=\"CSS3 Menu home 1_files/css3menu1/info.png\" alt=\"\"/>Registration Form</a></li>\n");
      out.write("\t<li class=\"toplast\"><a href=\"#\" style=\"height:35px;line-height:35px;\"><span><img src=\"CSS3 Menu home 1_files/css3menu1/blue_circle - lock open.png\" alt=\"\"/>Log in</span></a>\n");
      out.write("\t<ul>\n");
      out.write("\t\t<li><a href=\"Admin log in.jsp\"><img src=\"CSS3 Menu home 1_files/css3menu1/blue_circle - user.png\" alt=\"\"/>Admin Log In</a></li>\n");
      out.write("\t\t<li><a href=\"user log in.jsp\"><img src=\"CSS3 Menu home 1_files/css3menu1/blue_circle - users.png\" alt=\"\"/>User Log In</a></li>\n");
      out.write("\t</ul></li>\n");
      out.write("</ul><p class=\"_css3m\"><a href=\"http://css3menu.com/\">CSS Drop Down Menus</a> by Css3Menu.com</p>\n");
      out.write("<!-- End css3menu.com BODY section -->\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                background-color: lightblue;\n");
      out.write("                top-alignment:center;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <h1>USER LOG IN </h1>\n");
      out.write("        <table>\n");
      out.write("            <form action=\"user compare form_action.jsp\">\n");
      out.write("        <tr><td>Firstname:</td><td><input type=\"text\" name=\"fn\"></td></tr>\n");
      out.write("        <tr><td>Password:</td><td><input type=\"password\" name=\"pswd\"></td></tr>\n");
      out.write("           \n");
      out.write("            <tr> <td><input type=\"submit\" value=\"submit\">\n");
      out.write("            <input type=\"reset\" value=\"cancel\"></td></tr>\n");
      out.write("            </form>\n");
      out.write("        </table>\n");
      out.write("    </center>\n");
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
