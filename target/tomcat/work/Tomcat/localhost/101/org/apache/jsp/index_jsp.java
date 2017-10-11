/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-10-09 06:11:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"zh-CN\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->\r\n");
      out.write("    <title>茶叶管理系统</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap -->\r\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("      <script src=\"https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\r\n");
      out.write("      <script src=\"https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    <nav class=\"navbar navbar-default\">\r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\">茶叶品级管理系统</a>\r\n");
      out.write("            <ul class=\"nav navbar-nav\">\r\n");
      out.write("                <li class=\"active\"><a href=\"index.html\">添加</a></li>\r\n");
      out.write("                <li><a href=\"statistics.jsp\">统计</a></li>\r\n");
      out.write("                <li><a href=\"vote.html\">投票</a></li>               \r\n");
      out.write("                <li><a href=\"score.html\">作业要求</a></li>                                                                \r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-6\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"panel panel-default\">\r\n");
      out.write("                    <div class=\"panel-heading\">\r\n");
      out.write("                        <h3 class=\"panel-title\">添加茶叶</h3>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"panel-body\">\r\n");
      out.write("                        <form class=\"form-horizontal\">\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label for=\"input1\" class=\"col-sm-2 control-label\">形状</label>\r\n");
      out.write("                                <div class=\"col-sm-10\">\r\n");
      out.write("                                    <input type=\"number\" class=\"form-control\" id=\"input1\" max=\"1\" min=\"0\" step=\"0.1\" placeholder=\"形状\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label for=\"input2\" class=\"col-sm-2 control-label\">色泽</label>\r\n");
      out.write("                                <div class=\"col-sm-10\">\r\n");
      out.write("                                    <input type=\"number\" class=\"form-control\" id=\"input2\" max=\"1\" min=\"0\" step=\"0.1\" placeholder=\"色泽\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label for=\"input3\" class=\"col-sm-2 control-label\">净度</label>\r\n");
      out.write("                                <div class=\"col-sm-10\">\r\n");
      out.write("                                    <input type=\"number\" class=\"form-control\" id=\"input3\" max=\"1\" min=\"0\" step=\"0.1\" placeholder=\"净度\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label for=\"input4\" class=\"col-sm-2 control-label\">汤色</label>\r\n");
      out.write("                                <div class=\"col-sm-10\">\r\n");
      out.write("                                    <input type=\"number\" class=\"form-control\" id=\"input4\" max=\"1\" min=\"0\" step=\"0.1\" placeholder=\"汤色\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label for=\"input5\" class=\"col-sm-2 control-label\">香气</label>\r\n");
      out.write("                                <div class=\"col-sm-10\">\r\n");
      out.write("                                    <input type=\"number\" class=\"form-control\" id=\"input5\" max=\"1\" min=\"0\" step=\"0.1\" placeholder=\"香气\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label for=\"input6\" class=\"col-sm-2 control-label\">滋味</label>\r\n");
      out.write("                                <div class=\"col-sm-10\">\r\n");
      out.write("                                    <input type=\"number\" class=\"form-control\" id=\"input6\" max=\"1\" min=\"0\" step=\"0.1\" placeholder=\"滋味\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label for=\"input7\" class=\"col-sm-2 control-label\">叶底</label>\r\n");
      out.write("                                <div class=\"col-sm-10\">\r\n");
      out.write("                                    <input type=\"number\" class=\"form-control\" id=\"input7\" max=\"1\" min=\"0\" step=\"0.1\" placeholder=\"叶底\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <div class=\"col-sm-offset-2 col-sm-10\">\r\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-default\" onclick=\"loadRate()\">提交</button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-6\">\r\n");
      out.write("                <div class=\"panel panel-default\">\r\n");
      out.write("                    <div class=\"panel-heading\">\r\n");
      out.write("                        <h3 class=\"panel-title\">茶叶品级相似度</h3>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"panel-body\">\r\n");
      out.write("\r\n");
      out.write("                        <!-- 图表要绘制到这里，设定宽度和高度 -->\r\n");
      out.write("                        <div id=\"chart1\" style=\"height:392px;\">\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\r\n");
      out.write("    <script src=\"js/jquery.js\"></script>\r\n");
      out.write("    <!-- Include all compiled plugins (below), or include individual files as needed -->\r\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- 图表 js 库 -->\r\n");
      out.write("    <script src=\"js/echarts.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        // 设置图表为全局变量\r\n");
      out.write("        var chart1 = null;\r\n");
      out.write("\r\n");
      out.write("        $(document).ready(function () {\r\n");
      out.write("\r\n");
      out.write("            // 基于准备好的 dom，初始化echarts实例，并设置全局变量 chart1\r\n");
      out.write("            chart1 = echarts.init(document.getElementById('chart1'));\r\n");
      out.write("        })\r\n");
      out.write("\r\n");
      out.write("        // 提交评分\r\n");
      out.write("        function loadRate() {\r\n");
      out.write("        \t\r\n");
      out.write("        \t\r\n");
      out.write("        \t\r\n");
      out.write("        \t$.ajax({\r\n");
      out.write("                \r\n");
      out.write("                type:'POST',\r\n");
      out.write("                url:'http://localhost:8080/101/getchart',\r\n");
      out.write("               \r\n");
      out.write("                async:true,\r\n");
      out.write("                \r\n");
      out.write("                contentType : 'application/json;charset=utf-8',\r\n");
      out.write("\r\n");
      out.write("                data : JSON.stringify({\r\n");
      out.write("                    \r\n");
      out.write("                    \"shape\":$(\"#input1\").val(),\r\n");
      out.write("                    \"color\":$(\"#input2\").val(),\r\n");
      out.write("                    \"purity\":$(\"#input3\").val(),\r\n");
      out.write("                    \"soupColor\":$(\"#input4\").val(),\r\n");
      out.write("                    \"sweetSmell\":$(\"#input5\").val(),\r\n");
      out.write("                    \"smell\":$(\"#input6\").val(),\r\n");
      out.write("                    \"leafButtom\":$(\"#input7\").val(),\r\n");
      out.write("                  \t\r\n");
      out.write("                }),\r\n");
      out.write("\r\n");
      out.write("                dataType : 'json',\r\n");
      out.write("\r\n");
      out.write("                success : function(data) {\r\n");
      out.write("                \t\r\n");
      out.write("                \tvar array=new Array();\r\n");
      out.write("                \t\r\n");
      out.write("                \tarray=data.data;\r\n");
      out.write("                \t\r\n");
      out.write("                \tvar name=data.grade;\r\n");
      out.write("                \t\r\n");
      out.write("                \t\r\n");
      out.write("                \t// 指定图表的配置项和数据\r\n");
      out.write("                    var option = {\r\n");
      out.write("                        title: {\r\n");
      out.write("                            text: name\r\n");
      out.write("                        },\r\n");
      out.write("                        tooltip: {},\r\n");
      out.write("                        legend: {\r\n");
      out.write("                            data: ['相似度']\r\n");
      out.write("                        },\r\n");
      out.write("                        xAxis: {\r\n");
      out.write("                            data: [\"特一级\", \"特二级\", \"特三级\", \"一级\", \"二级\", \"三级\", \"四级\"]\r\n");
      out.write("                        },\r\n");
      out.write("                        yAxis: {},\r\n");
      out.write("                        series: [{\r\n");
      out.write("                            type: 'bar',// ==========请求成功，替换 data 中的数字\r\n");
      out.write("                            data: [array[0], array[1], array[2], array[3], array[4], array[5], array[6]],\r\n");
      out.write("                            itemStyle: {\r\n");
      out.write("                                normal: {\r\n");
      out.write("                                    color: function (param) {\r\n");
      out.write("                                        var colorList = [\r\n");
      out.write("                                            '#C1232B', '#B5C334', '#FCCE10', '#E87C25', '#27727B',\r\n");
      out.write("                                            '#FE8463', '#9BCA63'\r\n");
      out.write("                                        ];\r\n");
      out.write("                                        return colorList[param.dataIndex]\r\n");
      out.write("                                    }\r\n");
      out.write("                                }\r\n");
      out.write("                            }\r\n");
      out.write("                        }]\r\n");
      out.write("                    };\r\n");
      out.write("\r\n");
      out.write("                    // 使用指定的配置项和数据显示图表。\r\n");
      out.write("                    chart1.setOption(option);\r\n");
      out.write("                \t\r\n");
      out.write("                \t\r\n");
      out.write("                \t\r\n");
      out.write("                },\r\n");
      out.write("                error : function(msg) {\r\n");
      out.write("\r\n");
      out.write("                    alert(JSON.stringify(msg));\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("           \r\n");
      out.write("            \t\r\n");
      out.write("            \t\r\n");
      out.write("            \t\r\n");
      out.write("            \t\r\n");
      out.write("           \r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
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