package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class event_0020offer_0020packages_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("         <style>\n");
      out.write("   body\n");
      out.write("   {\n");
      out.write("    background-color:lightskyblue;\n");
      out.write("   }\n");
      out.write("   h1\n");
      out.write("   {\n");
      out.write("    color: navy;\n");
      out.write("   }\n");
      out.write("   h2{\n");
      out.write("    color:green;\n");
      out.write("   }\n");
      out.write("   h3{\n");
      out.write("    color:darkred;\n");
      out.write("   }\n");
      out.write("     .sidenav\n");
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
      out.write("   <li> <a class=\"active\" href=\"business hall.jsp\">business halls</a></li>\n");
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
      out.write("  <center>\n");
      out.write("   <h1>EVENT OFFERS AND PACKAGES </h1> \n");
      out.write("    <img src=\"e pic 1.jpg\"\n");
      out.write("       alt=\"basic html\" style=\"width: 1000px;\n");
      out.write("       height:400px\"> \n");
      out.write("  \n");
      out.write(" <h3> <U>MEETING OFFERS</u></h3><br>\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  <h3><i>PRICES</i></h3><BR>\n");
      out.write(" <hr>\n");
      out.write("  <img src=\"e pic 2.jpg\"\n");
      out.write("       alt=\"ImageAlignment\" align=\"right\" style=\"width: 400px;\n");
      out.write("       height:200px\"> \n");
      out.write(" <ul><h3>Monday</h3></ul>\n");
      out.write("  <li>Day: 7:30 – 8:30<li>\n");
      out.write("  <li> prices: £280 per person<li>\n");
      out.write("  <li>Evening: 8:30 – 22:00<li>\n");
      out.write("  <li>prices: £280 hire fee<li>\n");
      out.write("<hr>\n");
      out.write("<img src=\"e pic 3.jpg\"\n");
      out.write("       alt=\"ImageAlignment\" align=\"left\" style=\"width: 400px;\n");
      out.write("       height:200px\"> \n");
      out.write("  <ul><h3>Tuesday</h3></ul>\n");
      out.write("  <li>Day: 7:30 – 8:30<li> \n");
      out.write("<li>prices: £280 per person<li>\n");
      out.write("<li>Evening: 8:30 – 22:00<li> \n");
      out.write("<li>prices: £280 hire fee<li> \n");
      out.write("<hr>\n");
      out.write("<img src=\"e pic 4.jpg\"\n");
      out.write("       alt=\"ImageAlignment\" align=\"right\" style=\"width: 400px;\n");
      out.write("       height:200px\"> \n");
      out.write(" <ul><h3>Wednesday</h3></ul>\n");
      out.write("<li>Day: 7:30 – 8:30<li> \n");
      out.write("<li>prices: £280 per person<li> \n");
      out.write("<li>Evening: 8:30 – 22:00<li> \n");
      out.write("<li>prices: £280 hire fee<li> \n");
      out.write("<hr><img src=\"e pic 5.jpg\"\n");
      out.write("       alt=\"ImageAlignment\" align=\"left\" style=\"width: 400px;\n");
      out.write("       height:200px\"> \n");
      out.write(" <ul><h3>Thursday</h3></ul>\n");
      out.write("<li>Day: 7:30 – 8:30<li> \n");
      out.write("<li>prices: £280 per person <li>\n");
      out.write("<li>Evening: 8:30 – 22:00 <li>\n");
      out.write("<li>prices: £280 hire fee <li>\n");
      out.write("<hr><img src=\"e pic 6.webp\"\n");
      out.write("       alt=\"ImageAlignment\" align=\"right\" style=\"width: 400px;\n");
      out.write("       height:200px\"> \n");
      out.write("<ul><h3>Friday</h3></ul>\n");
      out.write("<li>Day: 7:30 – 8:30 <li>\n");
      out.write("<li>prices: £280 per person <li>\n");
      out.write("<li>Evening:8:30 – 22:00<li> \n");
      out.write("<li>prices: £400 hire fee <li>\n");
      out.write("<hr>\n");
      out.write("<img src=\"e pic 7.webp\"\n");
      out.write("       alt=\"ImageAlignment\" align=\"left\" style=\"width: 400px;\n");
      out.write("       height:200px\"> \n");
      out.write(" <ul><h3>Saturday</h3></ul>\n");
      out.write("<li>Day: 7:30 – 8:30 <li>\n");
      out.write("<li>prices: £280 per person <li>\n");
      out.write("<li>Evening: 8:30 – 22:00<li> \n");
      out.write("<li>prices: £400 hire fee <li>\n");
      out.write("<hr>\n");
      out.write("<img src=\"e pic 8.jpg\"\n");
      out.write("       alt=\"ImageAlignment\" align=\"right\" style=\"width: 400px;\n");
      out.write("       height:200px\"> \n");
      out.write(" <ul><h3>Sunday</h3></ul>\n");
      out.write("<li>Day: 7:30 – 8:30<li> \n");
      out.write("<li>prices: £280 per person <li>\n");
      out.write("<li>Evening: 8:30 – 22:00 <li>\n");
      out.write("<li>prices: £400 hire fee <li>\n");
      out.write("<hr>\n");
      out.write("<img src=\"e pic 9.jpg\"\n");
      out.write("       alt=\"ImageAlignment\" align=\"left\" style=\"width: 400px;\n");
      out.write("       height:200px\"> \n");
      out.write("</li>\n");
      out.write("<h4>About Studio 249 - Liberté Concept</h4> \n");
      out.write("<h4>-Meeting Rooms<br>\n");
      out.write("    -Conference<br>\n");
      out.write("    -Private Party<br>\n");
      out.write("    -Team Building<br>\n");
      out.write("    -Group Activity<br>\n");
      out.write("    -Exhibition<br>\n");
      out.write("    -Talks<br></h4>\n");
      out.write("  </center>\n");
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
