package org.apache.jsp.axis2_002dweb;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.axis2.context.ConfigurationContext;
import org.apache.axis2.context.ServiceGroupContext;
import java.util.Iterator;

public final class viewServiceGroupContext_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/adminheader.jsp", out, false);
      out.write("\r\n");
      out.write("<h1>Runing Context hierachy</h1>\r\n");

    String type = (String) request.getSession().getAttribute("TYPE");
    ConfigurationContext configCtx = (ConfigurationContext) request.getSession().getAttribute("ConfigurationContext");
    ServiceGroupContext sgContext = (ServiceGroupContext) request.getSession().getAttribute("ServiceGroupContext");
    if (sgContext != null) {
        if (type != null) {
            if ("VIEW".equals(type)) {
              Iterator propertyNames = sgContext.getPropertyNames();

      out.write("\r\n");
      out.write("             <h4>Persistance properties</h4><ul>\r\n");
      out.write("             ");

                 while (propertyNames.hasNext()) {
                     String key = (String) propertyNames.next();
                     Object property =  sgContext.getProperty(key);
              
      out.write("\r\n");
      out.write("                   <li>");
      out.print(key);
      out.write(' ');
      out.write(':');
      out.write(' ');
      out.print(property.toString());
      out.write("</li>\r\n");
      out.write("              ");

                 }
                 
      out.write("</ul>\r\n");
      out.write("                 ");

            }   else if("DELETE".equals(type)){
                 configCtx.removeServiceGroupContext(sgContext.getId());
                 
      out.write("Removed the context");

            }
        }
    } else {

      out.write(" <h4>No service group context found</h4>");

    }

      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/adminfooter.inc", out, false);
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
