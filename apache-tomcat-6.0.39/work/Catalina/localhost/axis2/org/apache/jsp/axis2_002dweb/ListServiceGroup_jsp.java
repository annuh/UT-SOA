package org.apache.jsp.axis2_002dweb;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.axis2.Constants;
import org.apache.axis2.description.AxisModule;
import org.apache.axis2.description.AxisService;
import org.apache.axis2.description.AxisServiceGroup;
import java.util.Collection;
import java.util.Iterator;

public final class ListServiceGroup_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/adminheader.jsp", out, false);
      out.write("\n");
      out.write("<h1>Available Service Groups</h1>\n");

    Iterator axisServiceGroupIter = (Iterator) request.getSession().getAttribute(
            Constants.SERVICE_GROUP_MAP);
    request.getSession().setAttribute(Constants.SERVICE_GROUP_MAP,null);
    while (axisServiceGroupIter.hasNext()) {
        AxisServiceGroup axisServiceGroup = (AxisServiceGroup) axisServiceGroupIter.next();
        String groupName = axisServiceGroup.getServiceGroupName();
        Collection modules = axisServiceGroup.getEngagedModules();
        Iterator axisServiceIter = axisServiceGroup.getServices();

      out.write("\n");
      out.write("<h2>");
      out.print(groupName);
      out.write("</h2><ul>\n");
      out.write("    ");

        while (axisServiceIter.hasNext()){
            AxisService axisService = (AxisService) axisServiceIter.next();
            String serviceName = axisService.getName();
    
      out.write("\n");
      out.write("    <li><font color=\"blue\"><a href=\"axis2-admin/ListSingleService?serviceName=");
      out.print(serviceName);
      out.write("\">\n");
      out.write("        ");
      out.print(serviceName);
      out.write("</a></font></li>\n");
      out.write("    ");

        }
    
      out.write("\n");
      out.write("</ul>\n");

    if (modules.size() > 0) {

      out.write("\n");
      out.write("<I>Engaged modules</I><ul>\n");
      out.write("    ");

        for (Iterator iterator = modules.iterator(); iterator.hasNext();) {
            AxisModule axisOperation = (AxisModule) iterator.next();
            String modulDesc = axisOperation.getName();
    
      out.write("\n");
      out.write("    <li>");
      out.print(modulDesc);
      out.write("</li>\n");
      out.write("    ");

        }
    
      out.write("</ul>");

        }
    }

      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/adminfooter.inc", out, false);
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
