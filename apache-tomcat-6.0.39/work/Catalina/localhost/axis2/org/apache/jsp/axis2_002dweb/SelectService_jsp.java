package org.apache.jsp.axis2_002dweb;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.axis2.Constants;
import org.apache.axis2.description.AxisService;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public final class SelectService_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/adminheader.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("  ");

      String action ="";
      String buttonName="" ;
      String status = (String)request.getSession().getAttribute(Constants.SELECT_SERVICE_TYPE);
      String heading = "";
      String disc = "";
      if(status != null && status.equals("MODULE")) {
          action = "listOperations";
          buttonName = " View Operations";
          heading = "Select a service to view operation specific chains";
          disc = "Select an Axis service from the combo and click on the 'View Operations' button to view operation specific Chains.";
      } else if(status != null && status.equals("VIEW")){
          buttonName = " View ";
          action = "viewServiceHandlers";
          heading = "Select a service to view service handlers";
          disc = "Select an Axis service from the combo and click on the 'View' button to view service handlers.";
      } else if (status != null && status.equals("SERVICE_PARAMETER")){
          buttonName = " Edit Parameters ";
          action = "editServicePara"; // Constants.EDIR_SERVICE_PARA;
          heading = "Select a Service to Edit Parameters";
          disc = "Select an Axis service from the combo and click on the 'Edit Parameters' button to edit parameters.";
      }
  
      out.write("\r\n");
      out.write("<h1>");
      out.print(heading);
      out.write("</h1>\r\n");
      out.write("<p>");
      out.print(disc);
      out.write("</p>\r\n");
      out.write("<form method=\"get\" name=\"selectServiceForm\" action=\"axis2-admin/");
      out.print(action);
      out.write("\">\r\n");
      out.write("<table border=\"0\" width=\"50%\" cellspacing=\"1\" cellpadding=\"1\">\r\n");
      out.write("         <tr>\r\n");
      out.write("        <td width=\"35%\">Select a Service :</td><td width=\"65%\">\r\n");
      out.write("            <select name=\"axisService\">\r\n");
      out.write("            ");

                HashMap services = (HashMap)request.getSession().getAttribute(Constants.SERVICE_MAP);
                Collection serviceCol =  services.values();
                for (Iterator iterator = serviceCol.iterator(); iterator.hasNext();) {
                    AxisService axisService = (AxisService)iterator.next();
                    String serviceName = axisService.getName();
            
      out.write(" <option  align=\"left\" value=\"");
      out.print(serviceName);
      out.write('"');
      out.write('>');
      out.print(serviceName);
      out.write("</option>\r\n");
      out.write("             ");

                }
                request.getSession().setAttribute(Constants.SERVICE_MAP,null);
             
      out.write("\r\n");
      out.write("           </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("\t<tr><td colspan=\"2\">&nbsp;</td></tr>\r\n");
      out.write("        <tr><td>&nbsp;</td>\r\n");
      out.write("             <td colspan=\"2\" align=\"left\">\r\n");
      out.write("                <input name=\"submit\" type=\"submit\" value=\"");
      out.print(buttonName);
      out.write("\" >\r\n");
      out.write("             </td>\r\n");
      out.write("         </tr>\r\n");
      out.write("      </table>\r\n");
      out.write("   </form>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/adminfooter.inc", out, false);
      out.write('\r');
      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
