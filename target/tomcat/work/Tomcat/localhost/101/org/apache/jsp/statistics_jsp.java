/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-10-09 07:46:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class statistics_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                <li><a href=\"index.html\">添加</a></li>\r\n");
      out.write("                <li class=\"active\"><a href=\"statistics.html\">统计</a></li>\r\n");
      out.write("                <li><a href=\"vote.html\">投票</a></li>\r\n");
      out.write("                <li><a href=\"score.html\">作业要求</a></li>                                                                                \r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-6\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"panel panel-default\">\r\n");
      out.write("                    <div class=\"panel-heading\">历史记录</div>\r\n");
      out.write("\r\n");
      out.write("                    <!-- Table -->\r\n");
      out.write("                    <table class=\"table table-bordered table-hover\">\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th>序号</th>\r\n");
      out.write("                            <th>\r\n");
      out.write("                                品级&emsp;\r\n");
      out.write("                                <button type=\"button\" class=\"btn btn-link btn-default btn-xs\" onclick=\"loadTea1(1)\">\r\n");
      out.write("                                    <span class=\"glyphicon glyphicon-triangle-top\" aria-hidden=\"true\"></span>\r\n");
      out.write("                                </button>\r\n");
      out.write("                                <button type=\"button\" class=\"btn btn-link btn-default btn-xs\" onclick=\"loadTea1(2)\">\r\n");
      out.write("                                    <span class=\"glyphicon glyphicon-triangle-bottom\" aria-hidden=\"true\"></span>\r\n");
      out.write("                                </button>\r\n");
      out.write("                            </th>\r\n");
      out.write("                            <th>\r\n");
      out.write("                                添加时间&emsp;\r\n");
      out.write("                                <button type=\"button\" class=\"btn btn-link btn-default btn-xs\" onclick=\"loadTea1(3)\">\r\n");
      out.write("                                        <span class=\"glyphicon glyphicon-triangle-top\" aria-hidden=\"true\"></span>\r\n");
      out.write("                                </button>\r\n");
      out.write("                                <button type=\"button\" class=\"btn btn-link btn-default btn-xs\" onclick=\"loadTea1(4)\">\r\n");
      out.write("                                        <span class=\"glyphicon glyphicon-triangle-bottom\" aria-hidden=\"true\"></span>\r\n");
      out.write("                                </button>\r\n");
      out.write("\r\n");
      out.write("                            </th>\r\n");
      out.write("                            <th>详情</th>\r\n");
      out.write("                        </tr>\r\n");
      out.write("    \r\n");
      out.write("                    </table>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"panel-footer\">\r\n");
      out.write("                        <nav aria-label=\"Page navigation pagination-sm\">\r\n");
      out.write("                            <ul class=\"pagination\" style=\"margin:0%\">\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <a href=\"#\" aria-label=\"Previous\">\r\n");
      out.write("                                          <span aria-hidden=\"true\">&laquo;</span>\r\n");
      out.write("                                        </a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li><a href=\"#\">1</a></li>\r\n");
      out.write("                                <li><a href=\"#\">2</a></li>\r\n");
      out.write("                                <li><a href=\"#\">3</a></li>\r\n");
      out.write("                                <li><a href=\"#\">4</a></li>\r\n");
      out.write("                                <li><a href=\"#\">5</a></li>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <a href=\"#\" aria-label=\"Next\">\r\n");
      out.write("                                          <span aria-hidden=\"true\">&raquo;</span>\r\n");
      out.write("                                        </a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </nav>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-6\">\r\n");
      out.write("                <div class=\"panel panel-default\">\r\n");
      out.write("                    <div class=\"panel-heading\">\r\n");
      out.write("                        <h3 class=\"panel-title\">茶叶品级分布图</h3>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"panel-body\">\r\n");
      out.write("\r\n");
      out.write("                        <!-- 茶叶总体分布图 -->\r\n");
      out.write("                        <div id=\"chart1\" style=\"height:425px;\">\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- 弹出框 -->\r\n");
      out.write("    <div class=\"modal fade\" id=\"teaInfoModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"teaInfoModalLabel\">\r\n");
      out.write("        <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("            <div class=\"modal-content\">\r\n");
      out.write("                <div class=\"modal-header\">\r\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\r\n");
      out.write("                    <h4 class=\"modal-title\" id=\"teaInfoModalLabel\">茶叶得分情况</h4>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"modal-body\">\r\n");
      out.write("\r\n");
      out.write("                    <!-- 茶叶得分雷达图 -->\r\n");
      out.write("                    <div id=\"chart2\" style=\"width:568px; height:392px;\">\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"modal-footer\">\r\n");
      out.write("                    <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">确定</button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
      out.write("        var chart1 = null;// 饼状图\r\n");
      out.write("        var chart2 = null;// 茶叶得分图\r\n");
      out.write("        var p1=1;\r\n");
      out.write("        var s1=0;\r\n");
      out.write("        \r\n");
      out.write("        var pies=null;\r\n");
      out.write("        \t\t\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("        $(document).ready(function () {\r\n");
      out.write("\r\n");
      out.write("            // 获取两个图表\r\n");
      out.write("            chart1 = echarts.init(document.getElementById('chart1'));\r\n");
      out.write("            chart2 = echarts.init(document.getElementById('chart2'));\r\n");
      out.write("            loadTea(p1,s1);\r\n");
      out.write("            loadPie();\r\n");
      out.write("        })\r\n");
      out.write("        // 加载饼状图，自己使用 ajax 获取数据\r\n");
      out.write("        function loadPie() {\r\n");
      out.write("            \r\n");
      out.write("            var pie=new Array();\r\n");
      out.write("\r\n");
      out.write("                    $.ajax({\r\n");
      out.write("\r\n");
      out.write("                            type : 'POST',\r\n");
      out.write("                            url : 'http://localhost:8080/101/getpie',\r\n");
      out.write("\r\n");
      out.write("                            async : true,\r\n");
      out.write("\r\n");
      out.write("                            contentType : 'application/json;charset=utf-8',\r\n");
      out.write("\r\n");
      out.write("                            data : JSON.stringify({\r\n");
      out.write("\r\n");
      out.write("                                \r\n");
      out.write("\r\n");
      out.write("                            }),\r\n");
      out.write("\r\n");
      out.write("                            dataType : 'json',\r\n");
      out.write("\r\n");
      out.write("                            success : function(data) {\r\n");
      out.write("\r\n");
      out.write("                                pie=data.data;\r\n");
      out.write("                                option = {\r\n");
      out.write("                                        title : {\r\n");
      out.write("                                            text : '茶叶品级统计图',\r\n");
      out.write("                                            x : 'center'\r\n");
      out.write("                                        },\r\n");
      out.write("                                        tooltip : {// 鼠标放上展示的提示信息格式，a, b, c, d 不改\r\n");
      out.write("                                            trigger : 'item',\r\n");
      out.write("                                            formatter : \"{b} <br/>总数 : {c} ({d}%)\"\r\n");
      out.write("                                        },\r\n");
      out.write("                                        legend : {// 底部说明\r\n");
      out.write("                                            x : 'center',\r\n");
      out.write("                                            y : 'bottom',\r\n");
      out.write("                                            data : [ '特一级', '特二级', '特三级', '一级', '二级', '三级',\r\n");
      out.write("                                                    '四级' ]\r\n");
      out.write("                                        },\r\n");
      out.write("                                        toolbox : {// 右上角工具栏\r\n");
      out.write("                                            show : true,\r\n");
      out.write("                                            feature : {\r\n");
      out.write("                                                mark : {\r\n");
      out.write("                                                    show : true\r\n");
      out.write("                                                },\r\n");
      out.write("                                                dataView : {\r\n");
      out.write("                                                    show : true,\r\n");
      out.write("                                                    readOnly : false\r\n");
      out.write("                                                },\r\n");
      out.write("                                                magicType : {\r\n");
      out.write("                                                    show : true,\r\n");
      out.write("                                                    type : [ 'pie', 'funnel' ]\r\n");
      out.write("                                                },\r\n");
      out.write("                                                restore : {\r\n");
      out.write("                                                    show : true\r\n");
      out.write("                                                },\r\n");
      out.write("                                                saveAsImage : {\r\n");
      out.write("                                                    show : true\r\n");
      out.write("                                                }\r\n");
      out.write("                                            }\r\n");
      out.write("                                        },\r\n");
      out.write("                                        calculable : true,\r\n");
      out.write("                                        series : [ {\r\n");
      out.write("                                            // name: '数据',// 对应 tooltip 中的 a\r\n");
      out.write("                                            type : 'pie',\r\n");
      out.write("                                            center : [ '50%', '50%' ],\r\n");
      out.write("                                            roseType : 'area',\r\n");
      out.write("                                            data : [// =============请求结果替换 value 的值\r\n");
      out.write("                                            {\r\n");
      out.write("                                                value : pie[0],\r\n");
      out.write("                                                name : '特一级'\r\n");
      out.write("                                            }, {\r\n");
      out.write("                                                value : pie[1],\r\n");
      out.write("                                                name : '特二级'\r\n");
      out.write("                                            }, {\r\n");
      out.write("                                                value : pie[2],\r\n");
      out.write("                                                name : '特三级'\r\n");
      out.write("                                            }, {\r\n");
      out.write("                                                value : pie[3],\r\n");
      out.write("                                                name : '一级'\r\n");
      out.write("                                            }, {\r\n");
      out.write("                                                value : pie[4],\r\n");
      out.write("                                                name : '二级'\r\n");
      out.write("                                            }, {\r\n");
      out.write("                                                value : pie[5],\r\n");
      out.write("                                                name : '三级'\r\n");
      out.write("                                            }, {\r\n");
      out.write("                                                value : pie[6],\r\n");
      out.write("                                                name : '四级'\r\n");
      out.write("                                            }, ]\r\n");
      out.write("                                        // 填写每一个等级的个数\r\n");
      out.write("                                        } ]\r\n");
      out.write("                                    };\r\n");
      out.write("                                \r\n");
      out.write("                             // 使用指定的配置项和数据显示图表。\r\n");
      out.write("                                chart1.setOption(option);\r\n");
      out.write("\r\n");
      out.write("                            },\r\n");
      out.write("                            error : function(msg) {\r\n");
      out.write("\r\n");
      out.write("                                alert(JSON.stringify(msg));\r\n");
      out.write("                            }\r\n");
      out.write("                        });\r\n");
      out.write("\r\n");
      out.write("                        // 指定图表的配置项和数据\r\n");
      out.write("                        \r\n");
      out.write("\r\n");
      out.write("                        \r\n");
      out.write("                    }\r\n");
      out.write("\r\n");
      out.write("                    // 展示茶叶得分的雷达图，自己使用 ajax 获取数据\r\n");
      out.write("                    function loadTeaInfo(objId) {\r\n");
      out.write("                    \t\r\n");
      out.write("                    \talert(objId);\r\n");
      out.write("                    \t\r\n");
      out.write("                    \t$.ajax({\r\n");
      out.write("\r\n");
      out.write("                            type : 'POST',\r\n");
      out.write("                            url : 'http://localhost:8080/101/getTea',\r\n");
      out.write("\r\n");
      out.write("                            async : true,\r\n");
      out.write("\r\n");
      out.write("                            contentType : 'application/json;charset=utf-8',\r\n");
      out.write("\r\n");
      out.write("                            data : JSON.stringify({\r\n");
      out.write("\r\n");
      out.write("                                \"id\":objId\r\n");
      out.write("\r\n");
      out.write("                            }),\r\n");
      out.write("\r\n");
      out.write("                            dataType : 'json',\r\n");
      out.write("\r\n");
      out.write("                            success : function(data) {\r\n");
      out.write("                            \t\r\n");
      out.write("                            \tvar obj=data.data;\r\n");
      out.write("                            \t\r\n");
      out.write("                            \t // 展示弹出框\r\n");
      out.write("                                $('#teaInfoModal').modal();\r\n");
      out.write("                                // 展示图表\r\n");
      out.write("                                option = {\r\n");
      out.write("                                    title : {\r\n");
      out.write("                                        text : obj.gradeName,\r\n");
      out.write("                                    },\r\n");
      out.write("                                    radar : {\r\n");
      out.write("                                        name : {\r\n");
      out.write("                                            textStyle : {\r\n");
      out.write("                                                color : '#fff',\r\n");
      out.write("                                                backgroundColor : '#999',\r\n");
      out.write("                                                borderRadius : 3,\r\n");
      out.write("                                                padding : [ 3, 5 ]\r\n");
      out.write("                                            }\r\n");
      out.write("                                        },\r\n");
      out.write("                                        indicator : [ {\r\n");
      out.write("                                            text : '形状',\r\n");
      out.write("                                            max : 1\r\n");
      out.write("                                        }, {\r\n");
      out.write("                                            text : '色泽',\r\n");
      out.write("                                            max : 1\r\n");
      out.write("                                        }, {\r\n");
      out.write("                                            text : '净度',\r\n");
      out.write("                                            max : 1\r\n");
      out.write("                                        }, {\r\n");
      out.write("                                            text : '汤色',\r\n");
      out.write("                                            max : 1\r\n");
      out.write("                                        }, {\r\n");
      out.write("                                            text : '香气',\r\n");
      out.write("                                            max : 1\r\n");
      out.write("                                        }, {\r\n");
      out.write("                                            text : '滋味',\r\n");
      out.write("                                            max : 1\r\n");
      out.write("                                        }, {\r\n");
      out.write("                                            text : '叶底',\r\n");
      out.write("                                            max : 1\r\n");
      out.write("                                        } ],\r\n");
      out.write("                                    },\r\n");
      out.write("                                    series : [ {\r\n");
      out.write("                                        itemStyle : {\r\n");
      out.write("                                            normal : {\r\n");
      out.write("                                                areaStyle : {\r\n");
      out.write("                                                    type : 'default'\r\n");
      out.write("                                                }\r\n");
      out.write("                                            }\r\n");
      out.write("                                        },\r\n");
      out.write("                                        type : 'radar',\r\n");
      out.write("                                        data : [ {// ===========修改 value 的值为茶叶的数据\r\n");
      out.write("                                            value : [ obj.shape, obj.color, obj.purity,\r\n");
      out.write("                                                    obj.soupColor, obj.sweetSmell,\r\n");
      out.write("                                                    obj.smell, obj.leafButtom ],\r\n");
      out.write("                                            name : '茶叶得分图'\r\n");
      out.write("                                        } ]\r\n");
      out.write("                                    } ]\r\n");
      out.write("                                };\r\n");
      out.write("\r\n");
      out.write("                                // 使用指定的配置项和数据显示图表。\r\n");
      out.write("                                chart2.setOption(option);\r\n");
      out.write("\r\n");
      out.write("                               \r\n");
      out.write("                            },\r\n");
      out.write("                            error : function(msg) {\r\n");
      out.write("\r\n");
      out.write("                                alert(JSON.stringify(msg));\r\n");
      out.write("                            }\r\n");
      out.write("                        });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                       \r\n");
      out.write("                    }\r\n");
      out.write("\r\n");
      out.write("                    //===========================================================================================\r\n");
      out.write("\r\n");
      out.write("                    function loadTea(pageIndex, sort) {\r\n");
      out.write("\r\n");
      out.write("                        p1 = pageIndex;\r\n");
      out.write("                        s1 = sort;\r\n");
      out.write("\r\n");
      out.write("                        $\r\n");
      out.write("                                .ajax({\r\n");
      out.write("\r\n");
      out.write("                                    type : 'POST',\r\n");
      out.write("\r\n");
      out.write("                                    url : 'http://localhost:8080/101/list',\r\n");
      out.write("                                    async : true,\r\n");
      out.write("\r\n");
      out.write("                                    contentType : 'application/json;charset=utf-8',\r\n");
      out.write("\r\n");
      out.write("                                    data : JSON.stringify({\r\n");
      out.write("                                        \"pageIndex\" : pageIndex,\r\n");
      out.write("                                        \"sort\" : sort\r\n");
      out.write("                                    }),\r\n");
      out.write("\r\n");
      out.write("                                    dataType : 'json',\r\n");
      out.write("\r\n");
      out.write("                                    success : function(data) {\r\n");
      out.write("\r\n");
      out.write("                                        $(\".content\").empty();\r\n");
      out.write("\r\n");
      out.write("                                        //alert(data.data.listCourses)\r\n");
      out.write("\r\n");
      out.write("                                        //datas=data;\r\n");
      out.write("                                        \r\n");
      out.write("                                        var pageIndex=data.page;\r\n");
      out.write("                                        \r\n");
      out.write("                                        var count=data.count;\r\n");
      out.write("\r\n");
      out.write("                                        list = data.data;\r\n");
      out.write("\r\n");
      out.write("                                        $\r\n");
      out.write("                                                .each(\r\n");
      out.write("                                                        list,\r\n");
      out.write("                                                        function(index, obj) {\r\n");
      out.write("\r\n");
      out.write("                                                            //alert(obj.id);\r\n");
      out.write("\r\n");
      out.write("                                                            $(\".table\")\r\n");
      out.write("                                                                    .append(\r\n");
      out.write("                                                                            \"<tr class='content'><td>\"\r\n");
      out.write("                                                                                    + (index + 1)\r\n");
      out.write("                                                                                    +\r\n");
      out.write("\r\n");
      out.write("                                                                                    \"</td><td>\"\r\n");
      out.write("                                                                                    + obj.gradeName\r\n");
      out.write("                                                                                    + \"</td><td>\"\r\n");
      out.write("                                                                                    + obj.createTime\r\n");
      out.write("                                                                                    + \"</td><td>\"\r\n");
      out.write("                                                                                    + \"<button class='btn btn-default' type='button' onclick='loadTeaInfo(\"\r\n");
      out.write("                                                                                    + obj.id\r\n");
      out.write("                                                                                    + \")'>得分情况</button>\"\r\n");
      out.write("                                                                                    + \"</td></tr>\");\r\n");
      out.write("                                                        });\r\n");
      out.write("\r\n");
      out.write("                                        //分页\r\n");
      out.write("                                        $(\".pagination\").empty(\"\");\r\n");
      out.write("\r\n");
      out.write("                                        // 2.2 向分页标签中追加页码\r\n");
      out.write("\r\n");
      out.write("                                        // 2.2.1 追加上一页按钮，第一页禁用掉，pageIndex - 1\r\n");
      out.write("                                        $(\".pagination\")\r\n");
      out.write("                                                .append(\r\n");
      out.write("                                                        \"<li \"\r\n");
      out.write("                                                                + (count == 1\r\n");
      out.write("                                                                        || pageIndex == 1 ? \"class='disabled'\"\r\n");
      out.write("                                                                        : '')\r\n");
      out.write("                                                                + \"><a aria-label='Previous' onclick='loadTea2(\"\r\n");
      out.write("                                                                + (pageIndex - 1)\r\n");
      out.write("                                                                + \")'><span aria-hidden='true'>&laquo;</span></a></li>\");\r\n");
      out.write("\r\n");
      out.write("                                        // 2.2.2 追加每一个页码\r\n");
      out.write("                                        for (var i = 1; i <= count; i++) {\r\n");
      out.write("                                            $(\".pagination\")\r\n");
      out.write("                                                    .append(\r\n");
      out.write("                                                            \"<li \"\r\n");
      out.write("                                                                    + (pageIndex == i ? \"class='active'\"\r\n");
      out.write("                                                                            : '')\r\n");
      out.write("                                                                    + \"><a aria-label='Previous' onclick='loadTea2(\"\r\n");
      out.write("                                                                    + i\r\n");
      out.write("                                                                    + \")'>\"\r\n");
      out.write("                                                                    + i\r\n");
      out.write("                                                                    + \"</a></li>\");\r\n");
      out.write("                                        }\r\n");
      out.write("\r\n");
      out.write("                                        // 2.2.3 追加下一页按钮，最后一页禁用掉，pageIndex + 1\r\n");
      out.write("                                        $(\".pagination\")\r\n");
      out.write("                                                .append(\r\n");
      out.write("                                                        \"<li \"\r\n");
      out.write("                                                                + (count == 1\r\n");
      out.write("                                                                        || pageIndex == count? \"class='disabled'\"\r\n");
      out.write("                                                                        : '')\r\n");
      out.write("                                                                + \"><a aria-label='Next' onclick='loadTea2(\"\r\n");
      out.write("                                                                + (pageIndex + 1)\r\n");
      out.write("                                                                + \")'><span aria-hidden='true'>&raquo;</span></a></li>\");\r\n");
      out.write("\r\n");
      out.write("                                    },\r\n");
      out.write("\r\n");
      out.write("                                    error : function(msg) {\r\n");
      out.write("\r\n");
      out.write("                                        alert(JSON.stringify(msg));\r\n");
      out.write("                                    }\r\n");
      out.write("                                });\r\n");
      out.write("\r\n");
      out.write("                    }\r\n");
      out.write("\r\n");
      out.write("                    function loadTea1(sort) {\r\n");
      out.write("\r\n");
      out.write("                        loadTea(p1, sort);\r\n");
      out.write("\r\n");
      out.write("                    }\r\n");
      out.write("\r\n");
      out.write("                    function loadTea2(pageIndex) {\r\n");
      out.write("\r\n");
      out.write("                        loadTea(pageIndex, s1);\r\n");
      out.write("\r\n");
      out.write("                    }\r\n");
      out.write("                </script>\r\n");
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
