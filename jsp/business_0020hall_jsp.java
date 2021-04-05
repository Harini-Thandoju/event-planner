package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class business_0020hall_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/css menu user 1.jsp");
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
      out.write("\t<link rel=\"stylesheet\" href=\"CSS3 Menu User 1_files/css3menu1/style.css\" type=\"text/css\" /><style type=\"text/css\">._css3m{display:none}</style>\n");
      out.write("\t<!-- End css3menu.com HEAD section -->\n");
      out.write("\n");
      out.write("\t\n");
      out.write("</head>\n");
      out.write("<body >\n");
      out.write("<!-- Start css3menu.com BODY section -->\n");
      out.write("<ul id=\"css3menu1\" class=\"topmenu\">\n");
      out.write("\t<li class=\"topfirst\"><a href=\"event.jsp\" style=\"height:26px;line-height:26px;\">Event</a></li>\n");
      out.write("\t<li class=\"toplast\"><a href=\"log out.jsp\" style=\"height:26px;line-height:26px;\">Log Out</a></li>\n");
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
      out.write("  <title></title>\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("  <style>\n");
      out.write("   body{\n");
      out.write("    background-color: darkorange;\n");
      out.write("   }\n");
      out.write("    .sidenav\n");
      out.write("   {\n");
      out.write("    height: 100%;\n");
      out.write("   width: 0;\n");
      out.write("    position: fixed;\n");
      out.write("    z-index: 1;\n");
      out.write("    top:0;\n");
      out.write("    left:0;\n");
      out.write("     overflow-x: hidden;\n");
      out.write("    background-color: lightblue;\n");
      out.write("   overflow-y: hidden;\n");
      out.write("    transition: 0.5s;\n");
      out.write("    padding-top: 60px;\n");
      out.write("   }\n");
      out.write("   .sidenav a\n");
      out.write("   {\n");
      out.write("   padding: 8px 8px 8px 32px;\n");
      out.write("   text-decoration: none;\n");
      out.write("   font-size: 25px;\n");
      out.write("   color: brown;\n");
      out.write("   display:block;\n");
      out.write("   transition: 0.3s;\n");
      out.write("   }\n");
      out.write("   .sidenav a:hover, .offcanvas a:focus{\n");
      out.write("    color:grey;\n");
      out.write(" \n");
      out.write("   }\n");
      out.write("   .sidenav .closebtn\n");
      out.write("   {\n");
      out.write("    position: absolute;\n");
      out.write("    top: 0;\n");
      out.write("    right: 25px;\n");
      out.write("    font-size: 36px;\n");
      out.write("    margin-left: 50px;\n");
      out.write(" \n");
      out.write("   }\n");
      out.write("   @media screen and(max-height:450px){\n");
      out.write("    .sidenav{padding-top: 15px;}\n");
      out.write("    .sidenav a{font-size: 18px;}\n");
      out.write("   }\n");
      out.write("    div{\n");
      out.write("       width: 35px;\n");
      out.write("       height: 5px;\n");
      out.write("      background-color: black;\n");
      out.write("      margin: 6px 0;\n");
      out.write("       }\n");
      out.write("      \n");
      out.write("  </style>\n");
      out.write(" </head>\n");
      out.write(" <body>\n");
      out.write("     <div id=\"mySidenav\" class=\"sidenav\">\n");
      out.write("   <a href=\"javascript:void(0)\"\n");
      out.write("      class=\"closebtn\"\n");
      out.write("      onclick=\"closeNav()\">&times;</a>\n");
      out.write(" <ul>\n");
      out.write("   <li> <a class=\"active\" href=\"art gallery.jsp\">Art Gallery</a></li>\n");
      out.write("   <li> <a class=\"active\" href=\"hotels.jsp\">Hotels</a></li>\n");
      out.write("   <li> <a class=\"active\" href=\"event offer packages.jsp\">Event Offer Packages</a></li>\n");
      out.write("   <li> <a class=\"active\" href=\" conference.jsp\">Conference</a></li>\n");
      out.write("   <li> <a class=\"active\" href=\"stadium.jsp\">Stadium</a></li>\n");
      out.write("   <li> <a class=\"active\" href=\"restaurant.jsp\">restaurant</a></li>\n");
      out.write("   <li> <a class=\"active\" href=\"academic venue.jsp\">acadamic venue</a></li>\n");
      out.write("  </ul>\n");
      out.write("  </div>\n");
      out.write("   \n");
      out.write("     <span style=\"font-size: 30px;cursor: pointer\"onclick=\"openNav()\"><div></div><div></div><div></div>\n");
      out.write("  </span>\n");
      out.write("  \n");
      out.write("  <script>\n");
      out.write("  \n");
      out.write("  /* set the width of the side navigation to 250px */\n");
      out.write("  \n");
      out.write("  function openNav()\n");
      out.write("  {\n");
      out.write("  document.getElementById(\"mySidenav\")\n");
      out.write("  .style.width=\"250px\";\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  function closeNav()\n");
      out.write("  {\n");
      out.write("  document.getElementById(\"mySidenav\")\n");
      out.write("  .style.width=\"0\";\n");
      out.write(" }\n");
      out.write(" </script>\n");
      out.write("<center>\n");
      out.write("  <h1><b>BUSINESS LOCATIONS</b></h1>\n");
      out.write("    <hr>\n");
      out.write(" <img src=\"B pic 1.jpg\"\n");
      out.write("       alt=\"ImageAlignment\" align=\"right\" style=\"width: 350px;\n");
      out.write("       height:175px\"> \n");
      out.write("    <ul><h3>•\tLocations</h3> </ul>\n");
      out.write("<li>o\tBirmingham Business Park</li> \n");
      out.write("<li>o\tBrentford </li>\n");
      out.write("<li>o\tCirencester </li>\n");
      out.write("<li>o\tFleet </li>\n");
      out.write("<li>o\tHenley-in-Arden</li> \n");
      out.write("<li>o\tSouthampton </li>\n");
      out.write("<li>o\tWarrington Birchwood</li>\n");
      out.write(" <img src=\"B pic 3.jpg\"\n");
      out.write("       alt=\"ImageAlignment\" align=\"left\" style=\"width: 350px;\n");
      out.write("       height:200px\">\n");
      out.write("<ul><h3>•\tOffice Space</h3> </ul> \n");
      out.write("<li>o\tServiced Office </li>\n");
      out.write("<li>o\tShared Workspace </li>\n");
      out.write("<li>o\tCorporate Solutions </li>\n");
      out.write("<li>o\tInformation for Building owners </li>\n");
      out.write("<li>o\tInformation for Property Agents </li>\n");
      out.write("<li>o\tBusiness Growth Space </li>\n");
      out.write("<li>o\tBusiness Growth Space </li>\n");
      out.write(" <img src=\"B pic 4.jpg\"\n");
      out.write("       alt=\"ImageAlignment\" align=\"right\" style=\"width: 350px;\n");
      out.write("       height:200px\"> \n");
      out.write(" <ul><h3>•\tVirtual Office</h3> </ul>\n");
      out.write("<li>o\tBirmingham Business Park</li> \n");
      out.write("<li>o\tBrentford </li>\n");
      out.write("<li>o\tCirencester </li>\n");
      out.write("<li>o\tFleet </li>\n");
      out.write("<li>o\tHenley-in-Arden </li>\n");
      out.write("<li>o\tSouthampton </li>\n");
      out.write("<li>o\tWarrington </li>\n");
      out.write("<img src=\"B pic 5.jpg\"\n");
      out.write("       alt=\"ImageAlignment\" align=\"left\" style=\"width: 350px;\n");
      out.write("       height:250px\"> \n");
      out.write(" <ul><h3>•\tMeeting Rooms</h3></ul>\n");
      out.write("<li>o\tBirmingham Business</li>\n");
      out.write("<li>cess Park</li>   \n");
      out.write("<li>o\tBrentford </li>\n");
      out.write("<li>o\tCirencester </li>\n");
      out.write("<li>o\tFleet </li>\n");
      out.write("<li>o\tHenley-in-Arden </li>\n");
      out.write("<li>o\tSouthampton</li> \n");
      out.write("<li>o\tWarrington-Birchwood </li>\n");
      out.write("</center>\n");
      out.write(" </body> \n");
      out.write("</html>");
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
