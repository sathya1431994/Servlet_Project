/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-07-26 11:38:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Log_005fError_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("   <html>\r\n");
      out.write("   <head>\r\n");
      out.write("<title>Login</title>\r\n");
      out.write("<meta charset='utf-8'>\r\n");
      out.write("\t<link rel='shortcut icon' href='fav.jpg' type='image' />\r\n");
      out.write("\t<meta name='viewport' content='width=device-width, initial-scale=1'>\r\n");
      out.write("\t<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css'>\r\n");
      out.write("\t<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js'></script>\r\n");
      out.write("\t<script src='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js'></script>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write(".login{\r\n");
      out.write("    \r\n");
      out.write("    border: 10px solid skyblue;\r\n");
      out.write("    margin-top:150px;\r\n");
      out.write("    margin-left:400px;\r\n");
      out.write("    padding:50px;\r\n");
      out.write("    width:600px;\r\n");
      out.write("    background-color:white;\r\n");
      out.write("}\r\n");
      out.write(".bt{\r\n");
      out.write("    width:150px;\r\n");
      out.write("}\r\n");
      out.write("body {\r\n");
      out.write("    background-image: url(\"http://www.whizjuniors.com/Content/img/banner.jpg\");\r\n");
      out.write("}\r\n");
      out.write("select{\r\n");
      out.write("    width:150px;\r\n");
      out.write("}\r\n");
      out.write("h5{color:red;}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("   </head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"login\" align=\"center\">\r\n");
      out.write("\r\n");
      out.write("    <form action=\"eventregister.jsp\" method=\"post\">  \r\n");
      out.write("    <label for=\"username\">User Name:</label>\r\n");
      out.write("   <input type=\"text\" name=\"username\" id=\"username\"/><br/><br/> \r\n");
      out.write("   <label for=\"username\">Password:</label> \r\n");
      out.write("    <input type=\"password\" name=\"userpass\"/><br/><br/>  \r\n");
      out.write("<h5 >User Name or password error</h5>\r\n");
      out.write("    <br/><br/>\r\n");
      out.write("      <button type=\"submit\" class=\"btn btn-primary bt\">Sign in</button> \r\n");
      out.write("    \r\n");
      out.write("    </form>  \r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    </body>\r\n");
      out.write("    </html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
