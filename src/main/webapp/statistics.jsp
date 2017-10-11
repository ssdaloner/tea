<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>茶叶管理系统</title>

    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>

    <nav class="navbar navbar-default">
        <div class="container-fluid">
            <a class="navbar-brand" href="#">茶叶品级管理系统</a>
            <ul class="nav navbar-nav">
                <li><a href="index.jsp">添加</a></li>
                <li class="active"><a href="statistics.jsp">统计</a></li>
                <li><a href="vote.jsp">投票</a></li>
                <li><a href="score.html">作业要求</a></li>                                                                                
            </ul>
        </div>
    </nav>

    <div class="container">
        <div class="row">
            <div class="col-md-6">

                <div class="panel panel-default">
                    <div class="panel-heading">历史记录</div>

                    <!-- Table -->
                    <table class="table table-bordered table-hover">
                        <tr>
                            <th>序号</th>
                            <th>
                                品级&emsp;
                                <button type="button" class="btn btn-link btn-default btn-xs" onclick="loadTea1(1)">
                                    <span class="glyphicon glyphicon-triangle-top" aria-hidden="true"></span>
                                </button>
                                <button type="button" class="btn btn-link btn-default btn-xs" onclick="loadTea1(2)">
                                    <span class="glyphicon glyphicon-triangle-bottom" aria-hidden="true"></span>
                                </button>
                            </th>
                            <th>
                                添加时间&emsp;
                                <button type="button" class="btn btn-link btn-default btn-xs" onclick="loadTea1(3)">
                                        <span class="glyphicon glyphicon-triangle-top" aria-hidden="true"></span>
                                </button>
                                <button type="button" class="btn btn-link btn-default btn-xs" onclick="loadTea1(4)">
                                        <span class="glyphicon glyphicon-triangle-bottom" aria-hidden="true"></span>
                                </button>

                            </th>
                            <th>详情</th>
                        </tr>
    
                    </table>

                    <div class="panel-footer">
                        <nav aria-label="Page navigation pagination-sm">
                            <ul class="pagination" style="margin:0%">
                                <li>
                                    <a href="#" aria-label="Previous">
                                          <span aria-hidden="true">&laquo;</span>
                                        </a>
                                </li>
                                <li><a href="#">1</a></li>
                                <li><a href="#">2</a></li>
                                <li><a href="#">3</a></li>
                                <li><a href="#">4</a></li>
                                <li><a href="#">5</a></li>
                                <li>
                                    <a href="#" aria-label="Next">
                                          <span aria-hidden="true">&raquo;</span>
                                        </a>
                                </li>
                            </ul>
                        </nav>
                    </div>
                </div>
            </div>
            <div class="col-md-6">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title">茶叶品级分布图</h3>
                    </div>
                    <div class="panel-body">

                        <!-- 茶叶总体分布图 -->
                        <div id="chart1" style="height:425px;">

                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- 弹出框 -->
    <div class="modal fade" id="teaInfoModal" tabindex="-1" role="dialog" aria-labelledby="teaInfoModalLabel">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title" id="teaInfoModalLabel">茶叶得分情况</h4>
                </div>
                <div class="modal-body">

                    <!-- 茶叶得分雷达图 -->
                    <div id="chart2" style="width:568px; height:392px;">

                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">确定</button>
                </div>
            </div>
        </div>
    </div>



    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="js/jquery.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>

    <!-- 图表 js 库 -->
    <script src="js/echarts.min.js"></script>

    <script type="text/javascript">
        var chart1 = null;// 饼状图
        var chart2 = null;// 茶叶得分图
        var p1=1;
        var s1=0;
        
        var pies=null;
        		
        

        $(document).ready(function () {

            // 获取两个图表
            chart1 = echarts.init(document.getElementById('chart1'));
            chart2 = echarts.init(document.getElementById('chart2'));
            loadTea(p1,s1);
            loadPie();
        })
        // 加载饼状图，自己使用 ajax 获取数据
        function loadPie() {
            
            var pie=new Array();

                    $.ajax({

                            type : 'POST',
                            url : 'http://localhost:8080/101/getpie',

                            async : true,

                            contentType : 'application/json;charset=utf-8',

                            data : JSON.stringify({

                                

                            }),

                            dataType : 'json',

                            success : function(data) {

                                pie=data.data;
                                option = {
                                        title : {
                                            text : '茶叶品级统计图',
                                            x : 'center'
                                        },
                                        tooltip : {// 鼠标放上展示的提示信息格式，a, b, c, d 不改
                                            trigger : 'item',
                                            formatter : "{b} <br/>总数 : {c} ({d}%)"
                                        },
                                        legend : {// 底部说明
                                            x : 'center',
                                            y : 'bottom',
                                            data : [ '特一级', '特二级', '特三级', '一级', '二级', '三级',
                                                    '四级' ]
                                        },
                                        toolbox : {// 右上角工具栏
                                            show : true,
                                            feature : {
                                                mark : {
                                                    show : true
                                                },
                                                dataView : {
                                                    show : true,
                                                    readOnly : false
                                                },
                                                magicType : {
                                                    show : true,
                                                    type : [ 'pie', 'funnel' ]
                                                },
                                                restore : {
                                                    show : true
                                                },
                                                saveAsImage : {
                                                    show : true
                                                }
                                            }
                                        },
                                        calculable : true,
                                        series : [ {
                                            // name: '数据',// 对应 tooltip 中的 a
                                            type : 'pie',
                                            center : [ '50%', '50%' ],
                                            roseType : 'area',
                                            data : [// =============请求结果替换 value 的值
                                            {
                                                value : pie[0],
                                                name : '特一级'
                                            }, {
                                                value : pie[1],
                                                name : '特二级'
                                            }, {
                                                value : pie[2],
                                                name : '特三级'
                                            }, {
                                                value : pie[3],
                                                name : '一级'
                                            }, {
                                                value : pie[4],
                                                name : '二级'
                                            }, {
                                                value : pie[5],
                                                name : '三级'
                                            }, {
                                                value : pie[6],
                                                name : '四级'
                                            }, ]
                                        // 填写每一个等级的个数
                                        } ]
                                    };
                                
                             // 使用指定的配置项和数据显示图表。
                                chart1.setOption(option);

                            },
                            error : function(msg) {

                                alert(JSON.stringify(msg));
                            }
                        });

                        // 指定图表的配置项和数据
                        

                        
                    }

                    // 展示茶叶得分的雷达图，自己使用 ajax 获取数据
                    function loadTeaInfo(objId) {
                    	
                    	
                    	
                    	$.ajax({

                            type : 'POST',
                            url : 'http://localhost:8080/101/getTea',

                            async : true,

                            contentType : 'application/json;charset=utf-8',

                            data : JSON.stringify({

                                "id":objId

                            }),

                            dataType : 'json',

                            success : function(data) {
                            	
                            	var obj=data.data;
                            	
                            	 // 展示弹出框
                                $('#teaInfoModal').modal();
                                // 展示图表
                                option = {
                                    title : {
                                        text : obj.gradeName,
                                    },
                                    radar : {
                                        name : {
                                            textStyle : {
                                                color : '#fff',
                                                backgroundColor : '#999',
                                                borderRadius : 3,
                                                padding : [ 3, 5 ]
                                            }
                                        },
                                        indicator : [ {
                                            text : '形状',
                                            max : 1
                                        }, {
                                            text : '色泽',
                                            max : 1
                                        }, {
                                            text : '净度',
                                            max : 1
                                        }, {
                                            text : '汤色',
                                            max : 1
                                        }, {
                                            text : '香气',
                                            max : 1
                                        }, {
                                            text : '滋味',
                                            max : 1
                                        }, {
                                            text : '叶底',
                                            max : 1
                                        } ],
                                    },
                                    series : [ {
                                        itemStyle : {
                                            normal : {
                                                areaStyle : {
                                                    type : 'default'
                                                }
                                            }
                                        },
                                        type : 'radar',
                                        data : [ {// ===========修改 value 的值为茶叶的数据
                                            value : [ obj.shape, obj.color, obj.purity,
                                                    obj.soupColor, obj.sweetSmell,
                                                    obj.smell, obj.leafButtom ],
                                            name : '茶叶得分图'
                                        } ]
                                    } ]
                                };

                                // 使用指定的配置项和数据显示图表。
                                chart2.setOption(option);

                               
                            },
                            error : function(msg) {

                                alert(JSON.stringify(msg));
                            }
                        });


                       
                    }

                    //===========================================================================================

                    function loadTea(pageIndex, sort) {

                        p1 = pageIndex;
                        s1 = sort;

                        $
                                .ajax({

                                    type : 'POST',

                                    url : 'http://localhost:8080/101/list',
                                    async : true,

                                    contentType : 'application/json;charset=utf-8',

                                    data : JSON.stringify({
                                        "pageIndex" : pageIndex,
                                        "sort" : sort
                                    }),

                                    dataType : 'json',

                                    success : function(data) {

                                        $(".content").empty();

                                        //alert(data.data.listCourses)

                                        //datas=data;
                                        
                                        var pageIndex=data.page;
                                        
                                        var count=data.count;

                                        list = data.data;

                                        $
                                                .each(
                                                        list,
                                                        function(index, obj) {

                                                            //alert(obj.id);

                                                            $(".table")
                                                                    .append(
                                                                            "<tr class='content'><td>"
                                                                                    + (index + 1)
                                                                                    +

                                                                                    "</td><td>"
                                                                                    + obj.gradeName
                                                                                    + "</td><td>"
                                                                                    + obj.createTime
                                                                                    + "</td><td>"
                                                                                    + "<button class='btn btn-default' type='button' onclick='loadTeaInfo("
                                                                                    + obj.id
                                                                                    + ")'>得分情况</button>"
                                                                                    + "</td></tr>");
                                                        });

                                        //分页
                                        $(".pagination").empty("");

                                        // 2.2 向分页标签中追加页码

                                        // 2.2.1 追加上一页按钮，第一页禁用掉，pageIndex - 1
                                        $(".pagination")
                                                .append(
                                                        "<li "
                                                                + (count == 1
                                                                        || pageIndex == 1 ? "class='disabled'"
                                                                        : '')
                                                                + "><a aria-label='Previous' onclick='loadTea2("
                                                                + (pageIndex - 1)
                                                                + ")'><span aria-hidden='true'>&laquo;</span></a></li>");

                                        // 2.2.2 追加每一个页码
                                        for (var i = 1; i <= count; i++) {
                                            $(".pagination")
                                                    .append(
                                                            "<li "
                                                                    + (pageIndex == i ? "class='active'"
                                                                            : '')
                                                                    + "><a aria-label='Previous' onclick='loadTea2("
                                                                    + i
                                                                    + ")'>"
                                                                    + i
                                                                    + "</a></li>");
                                        }

                                        // 2.2.3 追加下一页按钮，最后一页禁用掉，pageIndex + 1
                                        $(".pagination")
                                                .append(
                                                        "<li "
                                                                + (count == 1
                                                                        || pageIndex == count? "class='disabled'"
                                                                        : '')
                                                                + "><a aria-label='Next' onclick='loadTea2("
                                                                + (pageIndex + 1)
                                                                + ")'><span aria-hidden='true'>&raquo;</span></a></li>");

                                    },

                                    error : function(msg) {

                                        alert(JSON.stringify(msg));
                                    }
                                });

                    }

                    function loadTea1(sort) {

                        loadTea(p1, sort);

                    }

                    function loadTea2(pageIndex) {

                        loadTea(pageIndex, s1);

                    }
                </script>
</body>

</html>