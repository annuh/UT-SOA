package org.apache.jsp.axis2_002dweb;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.axis2.Constants;
import org.apache.axis2.description.AxisModule;
import org.apache.axis2.description.AxisService;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import org.apache.axis2.util.Utils;

public final class engagingtoaservice_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=iso-8859-1");
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
      out.write('\r');
      out.write('\n');

    String status = (String) request.getSession().getAttribute(Constants.ENGAGE_STATUS);

      out.write("\r\n");
      out.write("<h1>Engage Module for a Service</h1>\r\n");
      out.write("\r\n");
      out.write("<p>To engage a module for a axis service,</p>\r\n");
      out.write("\r\n");
      out.write("    <ol>\r\n");
      out.write("        <li>select the module you want to engage</li>\r\n");
      out.write("        <li>select the axis service you like the module to be engaged.</li>\r\n");
      out.write("        <li>click \"Engage\".</li>\r\n");
      out.write("    </ol>\r\n");
      out.write("\r\n");
      out.write("<form method=\"get\" name=\"selectModuleForm\" action=\"axis2-admin/engageToService\">\r\n");
      out.write("    <table border=\"0\" width=\"100%\" cellspacing=\"1\" cellpadding=\"1\">\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td>\r\n");
      out.write("                &nbsp;\r\n");
      out.write("                &nbsp;\r\n");
      out.write("            </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td>Select a Module :</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td>\r\n");
      out.write("                <select name=\"modules\">\r\n");
      out.write("                    ");


                        HashMap moduels = (HashMap)request.getSession().getAttribute(Constants.MODULE_MAP);
                        request.getSession().setAttribute(Constants.MODULE_MAP,null);
                        Collection moduleCol =  moduels.values();
                        for (Iterator iterator = moduleCol.iterator(); iterator.hasNext();) {
                            AxisModule axisOperation = (AxisModule) iterator.next();
                            String modulename = axisOperation.getName();

                    
      out.write("\r\n");
      out.write("                    <option align=\"left\" value=\"");
      out.print(modulename);
      out.write('"');
      out.write('>');
      out.print(modulename);
      out.write("\r\n");
      out.write("                    </option>\r\n");
      out.write("                    ");


                       }

                    
      out.write("\r\n");
      out.write("            </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td>\r\n");
      out.write("                &nbsp;\r\n");
      out.write("                &nbsp;\r\n");
      out.write("            </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td>Select a Service :</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td>\r\n");
      out.write("                <select name=\"axisService\">\r\n");
      out.write("                    ");


                        HashMap services = (HashMap)request.getSession().getAttribute(Constants.SERVICE_MAP);
                        Collection serviceCol =  services.values();
                        for (Iterator iterator = serviceCol.iterator(); iterator.hasNext();) {
                            AxisService axisService = (AxisService)iterator.next();
                            String serviceName = axisService.getName();

                    
      out.write("\r\n");
      out.write("                    <option align=\"left\" value=\"");
      out.print(serviceName);
      out.write('"');
      out.write('>');
      out.print(serviceName);
      out.write("\r\n");
      out.write("                    </option>\r\n");
      out.write("                    ");


                       }
                       request.getSession().setAttribute(Constants.SERVICE_MAP,null);

                    
      out.write("\r\n");
      out.write("            </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td>\r\n");
      out.write("                &nbsp;\r\n");
      out.write("                &nbsp;\r\n");
      out.write("            </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td>\r\n");
      out.write("                <input name=\"submit\" type=\"submit\" value=\" Engage \">\r\n");
      out.write("            </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td>\r\n");
      out.write("                &nbsp;\r\n");
      out.write("                &nbsp;\r\n");
      out.write("            </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td>\r\n");
      out.write("                &nbsp;\r\n");
      out.write("                &nbsp;\r\n");
      out.write("            </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td>\r\n");
      out.write("                <textarea cols=\"50\"  ");

                    if (status == null) {
                
      out.write("\r\n");
      out.write("                          style=\"display:none\"\r\n");
      out.write("                        ");

                            } 
      out.write("\r\n");
      out.write("                        >");
      out.print(Utils.sanitizeWebOutput(status));
      out.write("\r\n");
      out.write("                </textarea>\r\n");
      out.write("            </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("</form>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/adminfooter.inc", out, false);
      out.write("\r\n");
      out.write("\r\n");
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
