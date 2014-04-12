package org.apache.jsp.axis2_002dweb;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.axis2.Constants;
import org.apache.axis2.context.ConfigurationContext;
import org.apache.axis2.context.ServiceContext;
import org.apache.axis2.context.ServiceGroupContext;
import java.util.Iterator;

public final class ViewContexts_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/adminheader.jsp", out, false);
      out.write("\r\n");
      out.write("<h1>Running Context Hierarchy</h1>\r\n");

    ConfigurationContext configContext = (ConfigurationContext) request.getSession().getAttribute(
            Constants.CONFIG_CONTEXT);

    String[] serviceGroupIds = configContext.getServiceGroupContextIDs();
    if (serviceGroupIds.length > 0) {

      out.write("\r\n");
      out.write("<ul>\r\n");
      out.write("    ");


   for (int i = 0; i < serviceGroupIds.length; i++) {
        String groupContextID = serviceGroupIds[i];
        ServiceGroupContext groupContext = configContext.getServiceGroupContext(groupContextID);
        
      out.write("\r\n");
      out.write("           <li>");
      out.print(groupContextID);
      out.write("<font color=\"blue\"><a href=\"axis2-admin/viewServiceGroupConetxt?TYPE=VIEW&ID=");
      out.print(groupContextID);
      out.write("\">\r\n");
      out.write("                    View</a></font>  <font color=\"red\"><a href=\"axis2-admin/viewServiceGroupConetxt?TYPE=DELETE&ID=");
      out.print(groupContextID);
      out.write("\">\r\n");
      out.write("                    Remove</a> </font></li>\r\n");
      out.write("        ");

        Iterator serviceContextItr = groupContext.getServiceContexts();
            
      out.write("<ul>");

        while (serviceContextItr.hasNext()) {
            ServiceContext serviceContext = (ServiceContext)serviceContextItr.next();
             String serviceConID = serviceContext.getAxisService().getName();
        
      out.write("\r\n");
      out.write("            <li>");
      out.print(serviceConID);
      out.write("<font color=\"blue\"><a href=\"axis2-admin/viewServiceContext?TYPE=VIEW&ID=");
      out.print(serviceConID);
      out.write("&PID=");
      out.print(groupContextID);
      out.write("\">\r\n");
      out.write("                    View</a></font></li>\r\n");
      out.write("        ");

        }
                
      out.write("</ul><hr>");

    }
    
      out.write("  </ul>\r\n");
      out.write("        ");

            } else {
      out.write("\r\n");
      out.write("\t<p>No running contexts were found on the system.</p>\r\n");
      out.write("            ");
}

      out.write('\r');
      out.write('\n');
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
