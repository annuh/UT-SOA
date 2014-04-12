package org.apache.jsp.axis2_002dweb;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.axis2.Constants;
import org.apache.axis2.description.AxisModule;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;

public final class listModules_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write(' ');
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/adminheader.jsp", out, false);
      out.write("\r\n");
      out.write("  <h1>Available Modules</h1>\r\n");
      out.write("     ");

         boolean foundModules = false;
	boolean wroteUL = false;
         HashMap moduleMap = (HashMap)request.getSession().getAttribute(Constants.MODULE_MAP);
         request.getSession().setAttribute(Constants.MODULE_MAP,null);
         Hashtable errornesModules =(Hashtable)request.getSession().getAttribute(Constants.ERROR_MODULE_MAP);
         if (moduleMap!=null && !moduleMap.isEmpty()){
             String modulename ;
             String moduleDescription ;
             Collection moduleNames = moduleMap.values();
             for (Iterator iterator = moduleNames.iterator(); iterator.hasNext();) {
                 foundModules = true;
                 AxisModule  moduleQName = (AxisModule) iterator.next();
                 modulename = moduleQName.getName();
                 moduleDescription = moduleQName.getModuleDescription();
                 if(moduleDescription==null){
                     moduleDescription = "[ --  No module description found  --]";
                 }
        if (!wroteUL){
			wroteUL = true;

      out.write("\r\n");
      out.write("\t<ul>\r\n");

		}
     
      out.write("<li><b>");
      out.print(modulename);
      out.write("</b> : ");
      out.print(moduleDescription);
      out.write("</li>\r\n");
      out.write("      ");

             }
		if (wroteUL){

      out.write("\r\n");
      out.write("\t</ul>\r\n");

		}
        }
      
      out.write("\r\n");
      out.write("      ");
if(errornesModules.size()>0){
          
      out.write("\r\n");
      out.write("      <h3><font color=\"red\">Faulty Modules</font></h3>\r\n");
      out.write("             ");

             Enumeration faultyModules = errornesModules.keys();
             while (faultyModules.hasMoreElements()) {
                 foundModules = true;
                 String faultyModuleName = (String) faultyModules.nextElement();
             
      out.write("<a href=\"errorModule.jsp?moduleName=");
      out.print(faultyModuleName);
      out.write("\">\r\n");
      out.write("                    ");
      out.print(faultyModuleName);
      out.write("</a>\r\n");
      out.write("                    ");

             }
      }
             if(! foundModules) {
                 
      out.write("\r\n");
      out.write("                 <h2><font color=\"blue\">There are no modules deployed in the system.</font></h2>\r\n");
      out.write("                 ");

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
