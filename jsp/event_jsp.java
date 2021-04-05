package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class event_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \n");
      out.write("   \n");
      out.write("        <style>\n");
      out.write("   body{\n");
      out.write("    background-color: lightgray;\n");
      out.write("    font-family:\"lato\",sans-serif;\n");
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
      out.write("   \n");
      out.write("    \n");
      out.write("   }\n");
      out.write("   h2{\n");
      out.write("    color:darkblue;\n");
      out.write("   }\n");
      out.write("    div{\n");
      out.write("       width: 35px;\n");
      out.write("       height: 5px;\n");
      out.write("      background-color: black;\n");
      out.write("      margin: 6px 0;\n");
      out.write("       }\n");
      out.write("      \n");
      out.write("     \n");
      out.write("      \n");
      out.write("  </style>\n");
      out.write(" </head>\n");
      out.write(" <body img src=\"document.png.jpg\">\n");
      out.write("  <div id=\"mySidenav\" class=\"sidenav\">\n");
      out.write("   <a href=\"javascript:void(0)\"\n");
      out.write("      class=\"closebtn\"\n");
      out.write("      onclick=\"closeNav()\">&times;</a>\n");
      out.write(" <ul>\n");
      out.write("   <li> <a class=\"active\" href=\"art gallery.jsp\">Art Gallery</a></li>\n");
      out.write("   <li> <a class=\"active\" href=\"hotels.jsp\">Hotels</a></li>\n");
      out.write("   <li> <a class=\"active\" href=\"event offer packages.jsp\">Event Offer Packages</a></li>\n");
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
      out.write(" <CENTER>\n");
      out.write("     <h2>CENTRALISED EVENT PLANNER ACROSS SOCIAL MEDIA SITES</h2>\n");
      out.write("   <h3>VIEW EVENTS ACROSS SOCIAL MEDIA SITES</h3></CENTER>\n");
      out.write("<h4>EVENT MANAGEMENT</h4>\n");
      out.write("<img src=\"planning.jpg\"\n");
      out.write("       alt=\"ImageAlignment\" align=\"center\" style=height:\"400px\"> \n");
      out.write("\n");
      out.write("<p>\n");
      out.write("An event can be described as a public assembly for the purpose of celebration, education, marketing or reunion. Events can be classified on the basis of their size, type and context (event education, 2020).\n");
      out.write("There are three main categories which events go under. These events are private, corporate and charity which are explained below.\n");
      out.write("PRIVATE\n");
      out.write("Private events are used for individuals who can book venues such as</p>\n");
      out.write("<ul>\n");
      out.write("<li>\tWedding</li>\n");
      out.write("<li>\tWedding receptions</li>\n");
      out.write("<li>\tBirthday parties</li>\n");
      out.write("<li>\tFestival gatherings</li></ul>\n");
      out.write("\n");
      out.write("<p>The private events industry is not diverse due to events being aimed at wedding receptions Naylor (2019) suggests that private event rooms are booked for celebrations mainly wedding events this is due to the hosts wanting privacy for their event and can afford a private venue unlike other organisations such as:</p> \n");
      out.write("<ul>\n");
      out.write(" <li>\tBusiness</li>\n");
      out.write("<li>\tSchools</li>\n");
      out.write("<li>\tManufacturers</li></ul>\n");
      out.write(" \n");
      out.write("<p>\n");
      out.write(" Private events are used for individuals who want certain guests to arrive at the venue. Private events will have a guest list to ensure the venue is not open to the public.\n");
      out.write(" There are a large number of private sector oganisations involved in commercial activities in the events management business. Clients who are looking for a suitable venue for their event can do so themselves, which can be time consuming, or they can place their enquiry with an agency such as Inntel, which will lessen their effort and possibly benefit them by obtaining more competitive rates for venue (Shone and Parry, 2016). \n");
      out.write("CORPORATE \n");
      out.write("Corporate events are used for a business to promote their companies brand and products such as</p> \n");
      out.write("<ul>\n");
      out.write(" <li>\tEnsuring team building exercises</li>\n");
      out.write("<li>\tBusiness dinners</li>\n");
      out.write("<li>\t Conferences</li>\n");
      out.write("<li>\tNetworking events</li>\n");
      out.write("<li>\t Seminars </li>\n");
      out.write("<li>\tProduct launches</li>\n");
      out.write("<li>\tMeetings</li>\n");
      out.write("</ul>\n");
      out.write("<p>\n");
      out.write("The corporate events industry is not a diverse event due to events being aimed at business' Bowdin, Allen,  Harris, McDonnell and O'Toole (2019) suggests that corporate and business events supports business objectives including management functions, corporate communications and to improve company morals and business procedures to increase profitability and income this is due to individuals and companies promoting a product or business by expanding their brand meaning other organisations will not use this type of event for these reasons.\n");
      out.write(" A business will use corporate events to help build professional relationships between employees which will benefit staff communication to make a business expand.\n");
      out.write(" Corporate events can be used by businesses of all sizes to solicit new business, create a corporate or brand image, and retain and build loyalty with existing suppliers and customers. They can also be used \n");
      out.write("effectively to elicit suppliers and customers. They can furthermore be used effectively to elicit peak performance from employees and produce camaraderie and teamwork among co-workers. The corporate bar has been raised dramatically and the competition to craft something original that will help a business create public awareness as well as industry and media buzz is fierce (Allen, 2009).\tCHARITY/FUNDRAISING\n");
      out.write("Charity events are used for individuals to raise money for a charity of their choice by events such as</p>\n");
      out.write("<ul>\n");
      out.write(" <li>\tSociety balls</li>\n");
      out.write("<li>\tSports events</li>\n");
      out.write("<li>\tCharitable actions</li>\n");
      out.write("some charity events may ask for sponsors for an individual partaking in an event to raise money for charity these events range from\n");
      out.write("<li>\tSponsored runs</li>\n");
      out.write("<li>\tSponsored cycling</li>\n");
      out.write("<li>\tSponsored skydiving</li>\n");
      out.write("<li>\tSponsored walks</li>\n");
      out.write("  and much more.</ul>\n");
      out.write("  <p>\n");
      out.write("The charity events industry is a very diverse industry due to any one can go to a charity venue, contribute to a charity event or even run one Stephenson and\n");
      out.write("Mintzer (2017) suggests that supporting the community that supports your local business by picking a worthable local charity or charitable event you can gain \n");
      out.write("much goodwill by contributing to a charity within your community and over the long run it will benefit your business through the contacts you make and the \n");
      out.write("relationships you build this is due to the public and community getting involved to help raise money for charity such as </p>\n");
      out.write("  <ul><li>\tSchools</li>\n");
      out.write("<li>\tBusiness</li>\n");
      out.write("<li>\tManufacturers</li></ul>\n");
      out.write("  <p>\n");
      out.write(" Sponsorship represents a give and take between a non-profit and a business. The business donates money toward costs associated with a charity event, and in \n");
      out.write(" return, the charity event affords the business low cost public exposure and marketing. A charities sponsorship success rate is strongly dependant on the perks \n");
      out.write(" that it can offer potential business partners(Lyons, 2018). \n");
      out.write("Below are the types of events under each classification in which they mainly relate too.\n");
      out.write("PRIVATE<ul>\n");
      out.write("<li>\tExhibitions and trade shows\tCORPORATE</li>\n");
      out.write("<li>\tConference and meeting</li>\n");
      out.write("<li>\tCorporate hospitality</li>\n");
      out.write("<li>\tIncentive travel\tCHARITY</li>\n");
      out.write("<li>\tOutdoor events\tLIVE</li>\n");
      out.write("<li>\tMusic events</li>\n");
      out.write("<li>\tSporting events</li>\n");
      out.write("<li>\tFestivals</li>\n");
      out.write("  </ul>\n");
      out.write("    </body>\n");
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
