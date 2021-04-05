package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class art_0020gallery_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("         <style>\n");
      out.write("   body{\n");
      out.write("  background-color: lightcoral;\n");
      out.write("   }\n");
      out.write("   .sidenav\n");
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
      out.write("     \n");
      out.write("  </style>\n");
      out.write(" </head>\n");
      out.write(" <body background=\"pic 6.png\">\n");
      out.write("   <div id=\"mySidenav\" class=\"sidenav\">\n");
      out.write("   <a href=\"javascript:void(0)\"\n");
      out.write("      class=\"closebtn\"\n");
      out.write("      onclick=\"closeNav()\">&times;</a>\n");
      out.write(" <ul>\n");
      out.write("   <li> <a class=\"active\" href=\"hotels.jsp\">Hotels</a></li>\n");
      out.write("   <li> <a class=\"active\" href=\"event offer packages.jsp\">Event Offer Packages</a></li>\n");
      out.write("   <li> <a class=\"active\" href=\"business hall.jsp\">business halls</a></li>\n");
      out.write("   <li> <a class=\"active\" href=\" conference.jsp\">Conference</a></li>\n");
      out.write("   <li> <a class=\"active\" href=\"stadium.jsp\">Stadium</a></li>\n");
      out.write("   <li> <a class=\"active\" href=\"restaurant.jsp\">restaurant</a></li>\n");
      out.write("   <li> <a class=\"active\" href=\"academic venue.jsp\">acadamic venue</a></li>\n");
      out.write("  </ul>\n");
      out.write("  </div>\n");
      out.write("     <span style=\"font-size: 30px;cursor: pointer\"onclick=\"openNav()\">\n");
      out.write("         <div></div>\n");
      out.write("         <div></div>\n");
      out.write("         <div></div>\n");
      out.write("  </span>\n");
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
      out.write("  \n");
      out.write(" <center>\n");
      out.write("  <h1>ART GALLERY</h1>\n");
      out.write("  <h2>j/M Gallery space at J/M ART Gallery</h2>\n");
      out.write("    <img src=\"A pic 7.jpg\"\n");
      out.write("       alt=\"ImageAlignment\" align=\"center\" style=\"width: 1000px;\n");
      out.write("       height:500px\"> \n");
      out.write("    <h2><p> <b>LOCATION</b>:\n");
      out.write("   <b><u>Portobello Road, 200, London, W11 1LJ -Ladbroke Grove Station </u> </b></h2>\n");
      out.write("    <hr>\n");
      out.write("    \n");
      out.write("    <img src=\"A pic 1.jpg\"\n");
      out.write("       alt=\"ImageAlignment\" align=\"right\" style=\"width: 500px;\n");
      out.write("       height:200px\"> \n");
      out.write("    \n");
      out.write("    \n");
      out.write("  <ul><h3> Monday</h3></ul>\n");
      out.write("  <li>Day: 7:30 – 8:30<li>\n");
      out.write("  <li> prices: £280 per person<li>\n");
      out.write("  <li>Evng: 8:30 – 22:00<li>\n");
      out.write("  <li>prices: £280 hire fee<li>SEARCH MODULE\n");
      out.write("   <hr> \n");
      out.write("\n");
      out.write("<img src=\"A pic 2.jpg\"\n");
      out.write("       alt=\"ImageAlignment\" align=\"left\" style=\"width: 500px;\n");
      out.write("       height:200px\"> \n");
      out.write("\n");
      out.write("\n");
      out.write("  <ul><h3>Tuesday</h3></ul>\n");
      out.write("<li>Day: 7:30 – 8:30<li> \n");
      out.write("<li>prices: £280 per person<li>\n");
      out.write("<li>Evng: 8:30 – 22:00<li> \n");
      out.write("<li>prices: £280 hire fee<li> \n");
      out.write(" \n");
      out.write(" \n");
      out.write("<hr>\n");
      out.write("\n");
      out.write("<img src=\"A pic 3.jpg\"\n");
      out.write("       alt=\"ImageAlignment\" align=\"right\" style=\"width: 500px;\n");
      out.write("       height:200px\"> \n");
      out.write("\n");
      out.write("\n");
      out.write(" <ul><h3>Wednesday</h3></ul>\n");
      out.write("<li>Day: 7:30 – 8:30<li> \n");
      out.write("<li>prices: £280 per person<li> \n");
      out.write("<li>Evng: 8:30 – 22:00<li> \n");
      out.write("<li>prices: £280 hire fee<li> \n");
      out.write("<hr>\n");
      out.write("\n");
      out.write("<img src=\"A pic 4.jpg\"\n");
      out.write("       alt=\"ImageAlignment\" align=\"left\" style=\"width: 500px;\n");
      out.write("       height:200px\"> \n");
      out.write("\n");
      out.write("\n");
      out.write(" <ul><h3>Thursday</h3></ul>\n");
      out.write("<li>Day: 7:30 – 8:30<li> \n");
      out.write("<li>prices: £280 per person <li>\n");
      out.write("<li>Evng: 8:30 – 22:00 <li>\n");
      out.write("<li>prices: £280 hire fee <li>\n");
      out.write("<hr>\n");
      out.write("\n");
      out.write("<img src=\"A pic 5.jpg\"\n");
      out.write("       alt=\"ImageAlignment\" align=\"right\" style=\"width: 500px;\n");
      out.write("       height:200px\"> \n");
      out.write("\n");
      out.write("\n");
      out.write("<ul><h3>Friday</h3></ul>\n");
      out.write("<li>Day: 7:30 – 8:30 <li>\n");
      out.write("<li>prices: £280 per person <li>\n");
      out.write("<li>Evng:8:30 – 22:00<li> \n");
      out.write("<li>prices: £500 hire fee <li>\n");
      out.write("<hr> \n");
      out.write("\n");
      out.write("<img src=\"A pic 6.jpg\"\n");
      out.write("       alt=\"ImageAlignment\" align=\"left\" style=\"width: 500px;\n");
      out.write("       height:200px\"> \n");
      out.write("\n");
      out.write("\n");
      out.write(" <ul><h3>Saturday</h3></ul>\n");
      out.write("<li>Day: 7:30 – 8:30 <li>\n");
      out.write("<li>prices: £280 per person <li>\n");
      out.write("<li>Evng: 8:30 – 22:00<li> \n");
      out.write("<li>prices: £500 hire fee <li>\n");
      out.write("<hr> \n");
      out.write("\n");
      out.write("<img src=\"A pic 7.jpg\"\n");
      out.write("       alt=\"ImageAlignment\" align=\"right\" style=\"width: 500px;\n");
      out.write("       height:200px\"> \n");
      out.write("\n");
      out.write("\n");
      out.write(" <ul><h3>Sunday</h3></ul>\n");
      out.write("<li>Day: 7:30 – 8:30<li> \n");
      out.write("<li>prices: £280 per person <li>\n");
      out.write("<li>Evng: 8:30 – 22:00 <li>\n");
      out.write("<li>prices: £500 hire fee <li>\n");
      out.write("  </center>\n");
      out.write("  </body>\n");
      out.write("\n");
      out.write("        </body>\n");
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
