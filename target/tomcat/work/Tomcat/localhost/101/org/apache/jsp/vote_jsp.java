/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-10-11 14:53:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class vote_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                <li><a href=\"statistics.html\">统计</a></li>\r\n");
      out.write("                <li class=\"active\"><a href=\"vote.html\">投票</a></li>\r\n");
      out.write("                <li><a href=\"score.html\">作业要求</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-7\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"panel panel-default\">\r\n");
      out.write("                    <div class=\"panel-heading\">\r\n");
      out.write("                        <h3 class=\"panel-title\">群众最喜欢的茶叶</h3>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"panel-body\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-md-3\">\r\n");
      out.write("                                <div style=\"background-color:burlywood; padding:10px;margin-top:5px\">\r\n");
      out.write("                                    <img src=\"img/ahhc.gif\" class=\"img-thumbnail\">\r\n");
      out.write("                                    <button class=\"btn btn-default\" type=\"button\" onclick=\"loadVote(1)\" style=\"width:100%; margin-top:10px;\"><span id=\"tea1\">投票(10000)</span></button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-3\">\r\n");
      out.write("                                <div style=\"background-color:burlywood; padding:10px;margin-top:5px\">\r\n");
      out.write("\r\n");
      out.write("                                    <img src=\"img/ajbc.gif\" class=\"img-thumbnail\">\r\n");
      out.write("                                    <button class=\"btn btn-default\" type=\"button\" onclick=\"loadVote(2)\" style=\"width:100%; margin-top:10px;\"><span id=\"tea2\">投票(10000)</span></button>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-3\">\r\n");
      out.write("                                <div style=\"background-color:burlywood; padding:10px;margin-top:5px\">\r\n");
      out.write("\r\n");
      out.write("                                    <img src=\"img/axtgy.gif\" class=\"img-thumbnail\">\r\n");
      out.write("                                    <button class=\"btn btn-default\" type=\"button\" onclick=\"loadVote(3)\" style=\"width:100%; margin-top:10px;\"><span id=\"tea3\">投票(10000)</span></button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-3\">\r\n");
      out.write("                                <div style=\"background-color:burlywood; padding:10px;margin-top:5px\">\r\n");
      out.write("\r\n");
      out.write("                                    <img src=\"img/hsmf.gif\" class=\"img-thumbnail\">\r\n");
      out.write("                                    <button class=\"btn btn-default\" type=\"button\" onclick=\"loadVote(4)\" style=\"width:100%; margin-top:10px;\"><span id=\"tea4\">投票(10000)</span></button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-3\">\r\n");
      out.write("                                <div style=\"background-color:burlywood; padding:10px;margin-top:5px\">\r\n");
      out.write("\r\n");
      out.write("                                    <img src=\"img/jsyz.gif\" class=\"img-thumbnail\">\r\n");
      out.write("                                    <button class=\"btn btn-default\" type=\"button\" onclick=\"loadVote(5)\" style=\"width:100%; margin-top:10px;\"><span id=\"tea5\">投票(10000)</span></button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-3\">\r\n");
      out.write("                                <div style=\"background-color:burlywood; padding:10px;margin-top:5px\">\r\n");
      out.write("\r\n");
      out.write("                                    <img src=\"img/lagp.gif\" class=\"img-thumbnail\">\r\n");
      out.write("                                    <button class=\"btn btn-default\" type=\"button\" onclick=\"loadVote(6)\" style=\"width:100%; margin-top:10px;\"><span id=\"tea6\">投票(10000)</span></button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-3\">\r\n");
      out.write("                                <div style=\"background-color:burlywood; padding:10px;margin-top:5px\">\r\n");
      out.write("\r\n");
      out.write("                                    <img src=\"img/lsywc.gif\" class=\"img-thumbnail\">\r\n");
      out.write("                                    <button class=\"btn btn-default\" type=\"button\" onclick=\"loadVote(7)\" style=\"width:100%; margin-top:10px;\"><span id=\"tea7\">投票(10000)</span></button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-3\">\r\n");
      out.write("                                <div style=\"background-color:burlywood; padding:10px;margin-top:5px\">\r\n");
      out.write("\r\n");
      out.write("                                    <img src=\"img/mlhc.gif\" class=\"img-thumbnail\">\r\n");
      out.write("                                    <button class=\"btn btn-default\" type=\"button\" onclick=\"loadVote(8)\" style=\"width:100%; margin-top:10px;\"><span id=\"tea8\">投票(10000)</span></button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-3\">\r\n");
      out.write("                                <div style=\"background-color:burlywood; padding:10px;margin-top:5px\">\r\n");
      out.write("\r\n");
      out.write("                                    <img src=\"img/mtcy.gif\" class=\"img-thumbnail\">\r\n");
      out.write("                                    <button class=\"btn btn-default\" type=\"button\" onclick=\"loadVote(9)\" style=\"width:100%; margin-top:10px;\"><span id=\"tea9\">投票(10000)</span></button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-3\">\r\n");
      out.write("                                <div style=\"background-color:burlywood; padding:10px;margin-top:5px\">\r\n");
      out.write("\r\n");
      out.write("                                    <img src=\"img/pec.gif\" class=\"img-thumbnail\">\r\n");
      out.write("                                    <button class=\"btn btn-default\" type=\"button\" onclick=\"loadVote(10)\" style=\"width:100%; margin-top:10px;\"><span id=\"tea10\">投票(10000)</span></button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-3\">\r\n");
      out.write("                                <div style=\"background-color:burlywood; padding:10px;margin-top:5px\">\r\n");
      out.write("\r\n");
      out.write("                                    <img src=\"img/wysdhp.gif\" class=\"img-thumbnail\">\r\n");
      out.write("                                    <button class=\"btn btn-default\" type=\"button\" onclick=\"loadVote(11)\" style=\"width:100%; margin-top:10px;\"><span id=\"tea11\">投票(10000)</span></button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-3\">\r\n");
      out.write("                                <div style=\"background-color:burlywood; padding:10px;margin-top:5px\">\r\n");
      out.write("\r\n");
      out.write("                                    <img src=\"img/xymj.gif\" class=\"img-thumbnail\">\r\n");
      out.write("                                    <button class=\"btn btn-default\" type=\"button\" onclick=\"loadVote(12)\" style=\"width:100%; margin-top:10px;\"><span id=\"tea12\">投票(10000)</span></button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-5\">\r\n");
      out.write("                <div class=\"panel panel-default\">\r\n");
      out.write("                    <div class=\"panel-heading\">\r\n");
      out.write("                        <h3 class=\"panel-title\">排行榜 2017-09-30 09:00:00</h3>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"panel-body\">\r\n");
      out.write("\r\n");
      out.write("                        <!-- 图表要绘制到这里，设定宽度和高度 -->\r\n");
      out.write("                        <div id=\"chart1\" style=\"height:370px;\">\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"modal fade\" id=\"loginModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"loginModalLabel\">\r\n");
      out.write("            <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("              <div class=\"modal-content\">\r\n");
      out.write("                <div class=\"modal-header\">\r\n");
      out.write("                  <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\r\n");
      out.write("                  <h4 class=\"modal-title\" id=\"loginModalLabel\">登录</h4>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"modal-body\">\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                      <input type=\"text\" id=\"phonenumber\" class=\"form-control\" placeholder=\"请输入手机号\" onblur=\"upperCase()\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div id=\"tips\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"modal-footer\">\r\n");
      out.write("                  <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\r\n");
      out.write("                  <button type=\"button\" class=\"btn btn-primary\" onclick=\"loadUser()\">登录</button>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
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
      out.write("        \t\r\n");
      out.write("        \tlistVotes();\r\n");
      out.write("\r\n");
      out.write("            // 基于准备好的 dom，初始化echarts实例，并设置全局变量 chart1\r\n");
      out.write("            chart1 = echarts.init(document.getElementById('chart1'));\r\n");
      out.write("\r\n");
      out.write("            // 加载完毕页面就加载排行榜\r\n");
      out.write("            loadRank();\r\n");
      out.write("\r\n");
      out.write("            // 然后每两秒更新一次排行榜，自己修改为 30 s\r\n");
      out.write("            setInterval('loadRank()', 2000);\r\n");
      out.write("        })\r\n");
      out.write("\r\n");
      out.write("        // 投票\r\n");
      out.write("        function loadVote(id) {\r\n");
      out.write("        \t\r\n");
      out.write("          $.ajax({\r\n");
      out.write("                \r\n");
      out.write("                type:'POST',\r\n");
      out.write("                url:'http://localhost:8080/101/vote',\r\n");
      out.write("               \r\n");
      out.write("                async:true,\r\n");
      out.write("                \r\n");
      out.write("                contentType : 'application/json;charset=utf-8',\r\n");
      out.write("\r\n");
      out.write("                data : JSON.stringify({\r\n");
      out.write("                    \"id\":id\r\n");
      out.write("                    \r\n");
      out.write("                }),\r\n");
      out.write("\r\n");
      out.write("                dataType : 'json',\r\n");
      out.write("\r\n");
      out.write("                success : function(data) {\r\n");
      out.write("                    \r\n");
      out.write("                \tif(data.errorCode==-1000){\r\n");
      out.write("                \t\t\r\n");
      out.write("                \t\talert(\"你还没有登录，请登录\");\r\n");
      out.write("                \t\t\r\n");
      out.write("                \t\t$('#loginModal').modal();\r\n");
      out.write("                \t\t\r\n");
      out.write("                \t}else{\r\n");
      out.write("                \t\t\r\n");
      out.write("                \t\tif(data.message==null){\r\n");
      out.write("                \t\t\tvar votes=new Array();\r\n");
      out.write("                            \r\n");
      out.write("                            votes=data.data;\r\n");
      out.write("                            \r\n");
      out.write("                            alert(votes[0]);\r\n");
      out.write("                            \r\n");
      out.write("                            alert(\"投票成功\");\r\n");
      out.write("                            \r\n");
      out.write("                            $(\"#tea1\").replaceWith(votes[0]);\r\n");
      out.write("                            $(\"#tea2\").replaceWith(votes[1]);\r\n");
      out.write("                            $(\"#tea3\").replaceWith(votes[2]);\r\n");
      out.write("                            $(\"#tea4\").html(votes[3]);\r\n");
      out.write("                            $(\"#tea5\").html(votes[4]);\r\n");
      out.write("                            $(\"#tea6\").html(votes[5]);\r\n");
      out.write("                            $(\"#tea7\").html(votes[6]);\r\n");
      out.write("                            $(\"#tea8\").html(votes[7]);\r\n");
      out.write("                            $(\"#tea9\").html(votes[8]);\r\n");
      out.write("                            $(\"#tea10\").html(votes[9]);\r\n");
      out.write("                            $(\"#tea11\").html(votes[10]);\r\n");
      out.write("                            $(\"#tea12\").html(votes[11]);\r\n");
      out.write("                \t\t}else{\r\n");
      out.write("                \t\t\talert(data.message);\r\n");
      out.write("                \t\t}\r\n");
      out.write("                \t\t\r\n");
      out.write("                \t\t\r\n");
      out.write("                \t}\r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                },\r\n");
      out.write("                error : function(msg) {\r\n");
      out.write("\r\n");
      out.write("                    alert(JSON.stringify(msg));\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("        \t\r\n");
      out.write("        \t\r\n");
      out.write("            \r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        //手机号验证\r\n");
      out.write("        function upperCase(){\r\n");
      out.write("        \tvar phoneStyle=/^1[0-9]{10}$/;\r\n");
      out.write("            \r\n");
      out.write("            var chinaNet=/(^1(33|53|77|8[019])\\d{8}$)|(^1700\\d{7}$)/;\r\n");
      out.write("            \r\n");
      out.write("            var chinaMobile=/(^1(3[4-9]|4[7]|5[0-27-9]|7[8]|8[2-478])\\d{8}$)|(^1705\\d{7}$)/;\r\n");
      out.write("            \r\n");
      out.write("            var chinaUnicom=/(^1(3[0-2]|4[5]|5[56]|7[6]|8[56])\\d{8}$)|(^1709\\d{7}$)/;\r\n");
      out.write("            \r\n");
      out.write("            var phone=$(\"#phonenumber\").val();\r\n");
      out.write("            \r\n");
      out.write("            //alert(phone);\r\n");
      out.write("                \r\n");
      out.write("                if(phoneStyle.test(phone)){\r\n");
      out.write("                    if(chinaNet.test(phone)){\r\n");
      out.write("                        \r\n");
      out.write("                    \t$(\"#tips\").empty();\r\n");
      out.write("                    \t\r\n");
      out.write("                        $(\"#tips\").append(\"中国电信\");\r\n");
      out.write("                        \r\n");
      out.write("                    }else if(chinaMobile.test(phone)){\r\n");
      out.write("                    \t$(\"#tips\").empty();\r\n");
      out.write("                        $(\"#tips\").append(\"中国移动\");\r\n");
      out.write("                        \r\n");
      out.write("                    }else if(chinaUnicom.test(phone)){\r\n");
      out.write("                    \t$(\"#tips\").empty();\r\n");
      out.write("                        $(\"#tips\").append(\"中国联通\");\r\n");
      out.write("                    }\r\n");
      out.write("                    \r\n");
      out.write("                }else{\r\n");
      out.write("                \t$(\"#tips\").empty();\r\n");
      out.write("                    $(\"#tips\").append(\"非法手机号\");\r\n");
      out.write("                    \r\n");
      out.write("                    alert(\"非法手机号\");\r\n");
      out.write("                }\r\n");
      out.write("        \t\r\n");
      out.write("        }\r\n");
      out.write("        //登录\r\n");
      out.write("        \r\n");
      out.write("        function loadUser(){\r\n");
      out.write("        \t\r\n");
      out.write("            $.ajax({\r\n");
      out.write("                \r\n");
      out.write("                type:'POST',\r\n");
      out.write("                url:'http://localhost:8080/101/loadUser',\r\n");
      out.write("               \r\n");
      out.write("                async:true,\r\n");
      out.write("                \r\n");
      out.write("                contentType : 'application/json;charset=utf-8',\r\n");
      out.write("\r\n");
      out.write("                data : JSON.stringify({\r\n");
      out.write("                    \"number\":$(\"#phonenumber\").val()\r\n");
      out.write("                    \r\n");
      out.write("                }),\r\n");
      out.write("\r\n");
      out.write("                dataType : 'json',\r\n");
      out.write("\r\n");
      out.write("                success : function(data) {\r\n");
      out.write("                    \r\n");
      out.write("                \talert(data.message);\r\n");
      out.write("                \t\r\n");
      out.write("                \t$('#loginModal').modal('hide');\r\n");
      out.write("                    \r\n");
      out.write("                },\r\n");
      out.write("                error : function(msg) {\r\n");
      out.write("\r\n");
      out.write("                    alert(JSON.stringify(msg));\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("        \t\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        function listVotes(){\r\n");
      out.write("           $.ajax({\r\n");
      out.write("                \r\n");
      out.write("                type:'GET',\r\n");
      out.write("                url:'http://localhost:8080/101/listvote',\r\n");
      out.write("               \r\n");
      out.write("                async:true,\r\n");
      out.write("                \r\n");
      out.write("                contentType : 'application/json;charset=utf-8',\r\n");
      out.write("\r\n");
      out.write("                dataType : 'json',\r\n");
      out.write("\r\n");
      out.write("                success : function(data) {\r\n");
      out.write("                \tvar votes=new Array();\r\n");
      out.write("                    \r\n");
      out.write("                    votes=data.data;\r\n");
      out.write("                    \r\n");
      out.write("                    alert(votes[0]);\r\n");
      out.write("                    \r\n");
      out.write("                $(\"#tea1\").replaceWith(votes[0]);\r\n");
      out.write("                $(\"#tea2\").replaceWith(votes[1]);\r\n");
      out.write("                $(\"#tea3\").replaceWith(votes[2]);\r\n");
      out.write("                $(\"#tea4\").html(votes[3]);\r\n");
      out.write("                $(\"#tea5\").html(votes[4]);\r\n");
      out.write("                $(\"#tea6\").html(votes[5]);\r\n");
      out.write("                $(\"#tea7\").html(votes[6]);\r\n");
      out.write("                $(\"#tea8\").html(votes[7]);\r\n");
      out.write("                $(\"#tea9\").html(votes[8]);\r\n");
      out.write("                $(\"#tea10\").html(votes[9]);\r\n");
      out.write("                $(\"#tea11\").html(votes[10]);\r\n");
      out.write("                $(\"#tea12\").html(votes[11]);\r\n");
      out.write("                           \r\n");
      out.write("                },\r\n");
      out.write("                error : function(msg) {\r\n");
      out.write("\r\n");
      out.write("                    alert(JSON.stringify(msg));\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        \t\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("        // 获取排行榜\r\n");
      out.write("        function loadRank() {\r\n");
      out.write("\r\n");
      out.write("        \t $.ajax({\r\n");
      out.write("                 \r\n");
      out.write("                 type:'GET',\r\n");
      out.write("                 url:'http://localhost:8080/101/chart',\r\n");
      out.write("                \r\n");
      out.write("                 async:true,\r\n");
      out.write("                 \r\n");
      out.write("                 contentType : 'application/json;charset=utf-8',\r\n");
      out.write("\r\n");
      out.write("                 dataType : 'json',\r\n");
      out.write("\r\n");
      out.write("                 success : function(data) {\r\n");
      out.write("                     var votes=new Array();\r\n");
      out.write("                     \r\n");
      out.write("                     votes=data.data;\r\n");
      out.write("                    \r\n");
      out.write("                  // 指定图表的配置项和数据\r\n");
      out.write("                     var option = {\r\n");
      out.write("                         title: {\r\n");
      out.write("                             text: '得票数'\r\n");
      out.write("                         },\r\n");
      out.write("                         tooltip: {// 鼠标放上展示的提示信息格式\r\n");
      out.write("                             trigger: 'item',\r\n");
      out.write("                             formatter: \"信阳毛尖 <br/>得票数 : {c}\" // 设置茶叶名称\r\n");
      out.write("                         },\r\n");
      out.write("                         xAxis: {\r\n");
      out.write("                             type: 'value',\r\n");
      out.write("                         },\r\n");
      out.write("                         yAxis: {\r\n");
      out.write("                             type: 'category',\r\n");
      out.write("                             data: [\"第8名\", \"第7名\", \"第6名\", \"第5名\", \"第4名\", \"第3名\", \"第2名\", \"第1名\"]\r\n");
      out.write("                         },\r\n");
      out.write("                         series: [{\r\n");
      out.write("                             type: 'bar',//==============使用得票数填充 data\r\n");
      out.write("                             data: [votes[0], votes[1], votes[2], votes[3], votes[4], votes[5], votes[6], votes[7]],\r\n");
      out.write("                             itemStyle: {\r\n");
      out.write("                                 normal: {\r\n");
      out.write("                                     color: function (param) {\r\n");
      out.write("                                         var colorList = [\r\n");
      out.write("                                             '#C1232B', '#B5C334', '#FCCE10', '#E87C25', '#27727B',\r\n");
      out.write("                                             '#FE8463', '#9BCA63'\r\n");
      out.write("                                         ];\r\n");
      out.write("                                         return colorList[param.dataIndex]\r\n");
      out.write("                                     }\r\n");
      out.write("                                 }\r\n");
      out.write("                             }\r\n");
      out.write("                         }]\r\n");
      out.write("                     };\r\n");
      out.write("\r\n");
      out.write("                     // 使用指定的配置项和数据显示图表。\r\n");
      out.write("                     chart1.setOption(option);\r\n");
      out.write("              \r\n");
      out.write("                            \r\n");
      out.write("                 },\r\n");
      out.write("                 error : function(msg) {\r\n");
      out.write("\r\n");
      out.write("                     alert(JSON.stringify(msg));\r\n");
      out.write("                 }\r\n");
      out.write("             });\r\n");
      out.write("        \t\r\n");
      out.write("        \t\r\n");
      out.write("            \r\n");
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