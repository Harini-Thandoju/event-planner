package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class css_0020menu_0020home_00201_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<body>\n");
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
