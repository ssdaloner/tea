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
                <li><a href="index.html">添加</a></li>
                <li><a href="statistics.html">统计</a></li>
                <li class="active"><a href="vote.html">投票</a></li>
                <li><a href="score.html">作业要求</a></li>
            </ul>
        </div>
    </nav>

    <div class="container">
        <div class="row">
            <div class="col-md-7">

                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title">群众最喜欢的茶叶</h3>
                    </div>
                    <div class="panel-body">
                        <div class="row">
                            <div class="col-md-3">
                                <div style="background-color:burlywood; padding:10px;margin-top:5px">
                                    <img src="img/ahhc.gif" class="img-thumbnail">
                                    <button class="btn btn-default" type="button" onclick="loadVote(1)" style="width:100%; margin-top:10px;"><span id="tea1">投票(10000)</span></button>
                                </div>
                            </div>
                            <div class="col-md-3">
                                <div style="background-color:burlywood; padding:10px;margin-top:5px">

                                    <img src="img/ajbc.gif" class="img-thumbnail">
                                    <button class="btn btn-default" type="button" onclick="loadVote(2)" style="width:100%; margin-top:10px;"><span id="tea2">投票(10000)</span></button>
                                </div>

                            </div>
                            <div class="col-md-3">
                                <div style="background-color:burlywood; padding:10px;margin-top:5px">

                                    <img src="img/axtgy.gif" class="img-thumbnail">
                                    <button class="btn btn-default" type="button" onclick="loadVote(3)" style="width:100%; margin-top:10px;"><span id="tea3">投票(10000)</span></button>
                                </div>
                            </div>
                            <div class="col-md-3">
                                <div style="background-color:burlywood; padding:10px;margin-top:5px">

                                    <img src="img/hsmf.gif" class="img-thumbnail">
                                    <button class="btn btn-default" type="button" onclick="loadVote(4)" style="width:100%; margin-top:10px;"><span id="tea4">投票(10000)</span></button>
                                </div>
                            </div>
                            <div class="col-md-3">
                                <div style="background-color:burlywood; padding:10px;margin-top:5px">

                                    <img src="img/jsyz.gif" class="img-thumbnail">
                                    <button class="btn btn-default" type="button" onclick="loadVote(5)" style="width:100%; margin-top:10px;"><span id="tea5">投票(10000)</span></button>
                                </div>
                            </div>
                            <div class="col-md-3">
                                <div style="background-color:burlywood; padding:10px;margin-top:5px">

                                    <img src="img/lagp.gif" class="img-thumbnail">
                                    <button class="btn btn-default" type="button" onclick="loadVote(6)" style="width:100%; margin-top:10px;"><span id="tea6">投票(10000)</span></button>
                                </div>
                            </div>
                            <div class="col-md-3">
                                <div style="background-color:burlywood; padding:10px;margin-top:5px">

                                    <img src="img/lsywc.gif" class="img-thumbnail">
                                    <button class="btn btn-default" type="button" onclick="loadVote(7)" style="width:100%; margin-top:10px;"><span id="tea7">投票(10000)</span></button>
                                </div>
                            </div>
                            <div class="col-md-3">
                                <div style="background-color:burlywood; padding:10px;margin-top:5px">

                                    <img src="img/mlhc.gif" class="img-thumbnail">
                                    <button class="btn btn-default" type="button" onclick="loadVote(8)" style="width:100%; margin-top:10px;"><span id="tea8">投票(10000)</span></button>
                                </div>
                            </div>
                            <div class="col-md-3">
                                <div style="background-color:burlywood; padding:10px;margin-top:5px">

                                    <img src="img/mtcy.gif" class="img-thumbnail">
                                    <button class="btn btn-default" type="button" onclick="loadVote(9)" style="width:100%; margin-top:10px;"><span id="tea9">投票(10000)</span></button>
                                </div>
                            </div>
                            <div class="col-md-3">
                                <div style="background-color:burlywood; padding:10px;margin-top:5px">

                                    <img src="img/pec.gif" class="img-thumbnail">
                                    <button class="btn btn-default" type="button" onclick="loadVote(10)" style="width:100%; margin-top:10px;"><span id="tea10">投票(10000)</span></button>
                                </div>
                            </div>
                            <div class="col-md-3">
                                <div style="background-color:burlywood; padding:10px;margin-top:5px">

                                    <img src="img/wysdhp.gif" class="img-thumbnail">
                                    <button class="btn btn-default" type="button" onclick="loadVote(11)" style="width:100%; margin-top:10px;"><span id="tea11">投票(10000)</span></button>
                                </div>
                            </div>
                            <div class="col-md-3">
                                <div style="background-color:burlywood; padding:10px;margin-top:5px">

                                    <img src="img/xymj.gif" class="img-thumbnail">
                                    <button class="btn btn-default" type="button" onclick="loadVote(12)" style="width:100%; margin-top:10px;"><span id="tea12">投票(10000)</span></button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-md-5">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title">排行榜 2017-09-30 09:00:00</h3>
                    </div>
                    <div class="panel-body">

                        <!-- 图表要绘制到这里，设定宽度和高度 -->
                        <div id="chart1" style="height:370px;">

                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="modal fade" id="loginModal" tabindex="-1" role="dialog" aria-labelledby="loginModalLabel">
            <div class="modal-dialog" role="document">
              <div class="modal-content">
                <div class="modal-header">
                  <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                  <h4 class="modal-title" id="loginModalLabel">登录</h4>
                </div>
                <div class="modal-body">
                    <div class="form-group">
                      <input type="text" id="phonenumber" class="form-control" placeholder="请输入手机号" onblur="upperCase()">
                    </div>
                    <div id="tips"></div>
                </div>
                <div class="modal-footer">
                  <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                  <button type="button" class="btn btn-primary" onclick="loadUser()">登录</button>
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
        // 设置图表为全局变量
        var chart1 = null;

        $(document).ready(function () {
        	
        	listVotes();

            // 基于准备好的 dom，初始化echarts实例，并设置全局变量 chart1
            chart1 = echarts.init(document.getElementById('chart1'));

            // 加载完毕页面就加载排行榜
            loadRank();

            // 然后每两秒更新一次排行榜，自己修改为 30 s
            setInterval('loadRank()', 2000);
        })

        // 投票
        function loadVote(id) {
        	
          $.ajax({
                
                type:'POST',
                url:'http://localhost:8080/101/vote',
               
                async:true,
                
                contentType : 'application/json;charset=utf-8',

                data : JSON.stringify({
                    "id":id
                    
                }),

                dataType : 'json',

                success : function(data) {
                    
                	if(data.errorCode==-1000){
                		
                		alert("你还没有登录，请登录");
                		
                		$('#loginModal').modal();
                		
                	}else{
                		
                		if(data.message==null){
                			var votes=new Array();
                            
                            votes=data.data;
                            
                            alert(votes[0]);
                            
                            alert("投票成功");
                            
                            $("#tea1").replaceWith(votes[0]);
                            $("#tea2").replaceWith(votes[1]);
                            $("#tea3").replaceWith(votes[2]);
                            $("#tea4").html(votes[3]);
                            $("#tea5").html(votes[4]);
                            $("#tea6").html(votes[5]);
                            $("#tea7").html(votes[6]);
                            $("#tea8").html(votes[7]);
                            $("#tea9").html(votes[8]);
                            $("#tea10").html(votes[9]);
                            $("#tea11").html(votes[10]);
                            $("#tea12").html(votes[11]);
                		}else{
                			alert(data.message);
                		}
                		
                		
                	}
                    
                    
                    
                    
                },
                error : function(msg) {

                    alert(JSON.stringify(msg));
                }
            });

        	
        	
            
        }
        
        //手机号验证
        function upperCase(){
        	var phoneStyle=/^1[0-9]{10}$/;
            
            var chinaNet=/(^1(33|53|77|8[019])\d{8}$)|(^1700\d{7}$)/;
            
            var chinaMobile=/(^1(3[4-9]|4[7]|5[0-27-9]|7[8]|8[2-478])\d{8}$)|(^1705\d{7}$)/;
            
            var chinaUnicom=/(^1(3[0-2]|4[5]|5[56]|7[6]|8[56])\d{8}$)|(^1709\d{7}$)/;
            
            var phone=$("#phonenumber").val();
            
            //alert(phone);
                
                if(phoneStyle.test(phone)){
                    if(chinaNet.test(phone)){
                        
                    	$("#tips").empty();
                    	
                        $("#tips").append("中国电信");
                        
                    }else if(chinaMobile.test(phone)){
                    	$("#tips").empty();
                        $("#tips").append("中国移动");
                        
                    }else if(chinaUnicom.test(phone)){
                    	$("#tips").empty();
                        $("#tips").append("中国联通");
                    }
                    
                }else{
                	$("#tips").empty();
                    $("#tips").append("非法手机号");
                    
                    alert("非法手机号");
                }
        	
        }
        //登录
        
        function loadUser(){
        	
            $.ajax({
                
                type:'POST',
                url:'http://localhost:8080/101/loadUser',
               
                async:true,
                
                contentType : 'application/json;charset=utf-8',

                data : JSON.stringify({
                    "number":$("#phonenumber").val()
                    
                }),

                dataType : 'json',

                success : function(data) {
                    
                	alert(data.message);
                	
                	$('#loginModal').modal('hide');
                    
                },
                error : function(msg) {

                    alert(JSON.stringify(msg));
                }
            });

        	
        }
        
        function listVotes(){
           $.ajax({
                
                type:'GET',
                url:'http://localhost:8080/101/listvote',
               
                async:true,
                
                contentType : 'application/json;charset=utf-8',

                dataType : 'json',

                success : function(data) {
                	var votes=new Array();
                    
                    votes=data.data;
                    
                    alert(votes[0]);
                    
                $("#tea1").replaceWith(votes[0]);
                $("#tea2").replaceWith(votes[1]);
                $("#tea3").replaceWith(votes[2]);
                $("#tea4").html(votes[3]);
                $("#tea5").html(votes[4]);
                $("#tea6").html(votes[5]);
                $("#tea7").html(votes[6]);
                $("#tea8").html(votes[7]);
                $("#tea9").html(votes[8]);
                $("#tea10").html(votes[9]);
                $("#tea11").html(votes[10]);
                $("#tea12").html(votes[11]);
                           
                },
                error : function(msg) {

                    alert(JSON.stringify(msg));
                }
            });
        	
        }
        
        
        
        

        // 获取排行榜
        function loadRank() {

        	 $.ajax({
                 
                 type:'GET',
                 url:'http://localhost:8080/101/chart',
                
                 async:true,
                 
                 contentType : 'application/json;charset=utf-8',

                 dataType : 'json',

                 success : function(data) {
                     var votes=new Array();
                     
                     votes=data.data;
                    
                  // 指定图表的配置项和数据
                     var option = {
                         title: {
                             text: '得票数'
                         },
                         tooltip: {// 鼠标放上展示的提示信息格式
                             trigger: 'item',
                             formatter: "信阳毛尖 <br/>得票数 : {c}" // 设置茶叶名称
                         },
                         xAxis: {
                             type: 'value',
                         },
                         yAxis: {
                             type: 'category',
                             data: ["第8名", "第7名", "第6名", "第5名", "第4名", "第3名", "第2名", "第1名"]
                         },
                         series: [{
                             type: 'bar',//==============使用得票数填充 data
                             data: [votes[0], votes[1], votes[2], votes[3], votes[4], votes[5], votes[6], votes[7]],
                             itemStyle: {
                                 normal: {
                                     color: function (param) {
                                         var colorList = [
                                             '#C1232B', '#B5C334', '#FCCE10', '#E87C25', '#27727B',
                                             '#FE8463', '#9BCA63'
                                         ];
                                         return colorList[param.dataIndex]
                                     }
                                 }
                             }
                         }]
                     };

                     // 使用指定的配置项和数据显示图表。
                     chart1.setOption(option);
              
                            
                 },
                 error : function(msg) {

                     alert(JSON.stringify(msg));
                 }
             });
        	
        	
            
        }
    </script>
</body>

</html>