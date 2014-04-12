package org.apache.jsp.axis2_002dweb;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.axis2.Constants;
import org.apache.axis2.description.AxisOperation;
import org.apache.axis2.description.AxisService;
import org.apache.axis2.description.Parameter;
import java.util.ArrayList;
import java.util.Iterator;

public final class ServiceParaEdit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/adminheader.jsp", out, false);
      out.write("\n");
      out.write("<h1>Edit Service Parameters</h1>\n");
      out.write("  <form method=\"get\" name=\"editServicepara\" action=\"axis2-admin/editServicepara\">\n");
      out.write("   ");

            AxisService axisService = (AxisService)request.getSession().
                    getAttribute(Constants.SERVICE);
             if(axisService != null ){
   
      out.write("     <table width=\"100%\">\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                 <td colspan=\"2\" ><b>\n");
      out.write("           ");

                 String servicName =  axisService.getName();
                 
      out.write("Service Parameters :: ");
      out.print(servicName);
      out.write("\n");
      out.write("                 </b></td>\n");
      out.write("             </tr>\n");
      out.write("             <tr>\n");
      out.write("             <td colspan=\"2\" ><input style=\"display:none\"  name=\"axisService\" value=\"");
      out.print(servicName);
      out.write("\"></td>\n");
      out.write("            </tr>\n");
      out.write("             ");

                 ArrayList service_para = axisService.getParameters();
                 for (int i = 0; i < service_para.size(); i++) {
                     Parameter parameter = (Parameter) service_para.get(i);
                     if (parameter.getParameterType()==Parameter.OM_PARAMETER) {
                         continue;
                     }
                     
      out.write("\n");
      out.write("                     <tr>\n");
      out.write("                     <td>");
      out.print(parameter.getName());
      out.write("</td>\n");
      out.write("                     <td><input type=\"text\" value=\"");
      out.print(parameter.getValue());
      out.write("\"\n");
      out.write("                           name=\"");
      out.print((servicName + "_" + parameter.getName()));
      out.write("\" size=\"50\">\n");
      out.write("                           </td>\n");
      out.write("                     </tr>\n");
      out.write("                     ");

                 }
                Iterator operations =  axisService.getOperations();
                if(operations.hasNext()){
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                      <td>&nbsp;&nbsp;&nbsp;&nbsp;</td>\n");
      out.write("                      <td>&nbsp;&nbsp;&nbsp;&nbsp;</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                       <td colspan=\"2\" > <b>Operation Paramaters :: </b>\n");
      out.write("                       </td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                }

                 ArrayList op_paras ;
                        operations = axisService.getOperations();
                 while (operations.hasNext()) {
                     AxisOperation axisOperation = (AxisOperation) operations.next();
                     String operationName = axisOperation.getName().getLocalPart();
                     
      out.write("\n");
      out.write("                     <tr>\n");
      out.write("                       <td colspan=\"2\" > &nbsp;&nbsp;&nbsp;&nbsp;</td>\n");
      out.write("                     </tr>\n");
      out.write("                     <tr>\n");
      out.write("                       <td colspan=\"2\" ><b>Operation : ");
      out.print(operationName);
      out.write("</b></td>\n");
      out.write("                     </tr>\n");
      out.write("                    ");

                     op_paras = axisOperation.getParameters();
                     for (int i = 0; i < op_paras.size(); i++) {
                         Parameter parameter = (Parameter) op_paras.get(i);
                         if (parameter.getParameterType()==Parameter.OM_PARAMETER) {
                             continue;
                         }
                     
      out.write("\n");
      out.write("                     <tr>\n");
      out.write("                     <td>");
      out.print(parameter.getName());
      out.write("</td>\n");
      out.write("                     <td><input type=\"text\" value=\"");
      out.print(parameter.getValue());
      out.write("\"\n");
      out.write("                           name=\"");
      out.print((operationName + "_" + parameter.getName()));
      out.write("\" size=\"50\">\n");
      out.write("                           </td>\n");
      out.write("                     </tr>\n");
      out.write("                     ");

                  }
                 }
                 
      out.write("\n");
      out.write("                 <tr>\n");
      out.write("                    <td>&nbsp;</td>\n");
      out.write("                <td>\n");
      out.write("                     <input name=\"changePara\" type=\"submit\" value=\" Change \" >\n");
      out.write("               </td>\n");
      out.write("               </tr>\n");
      out.write("                 </table>\n");
      out.write("                 ");

             } else {
            	
      out.write("\n");
      out.write("            \t<p>");
      out.print(request.getAttribute("status"));
      out.write("</p>\n");
      out.write("            \t");

             }

       
      out.write("\n");
      out.write("       <form>\n");
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
