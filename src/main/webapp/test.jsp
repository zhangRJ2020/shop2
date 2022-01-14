<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/3/30
  Time: 11:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试ajax</title>
    <script src="/jquery.min.js"></script>
    <script>

        function test() {
            //alert("11111111");
            $.get("${pageContext.request.contextPath}/test",{},function (data) {
                $("#d1").html("");
                data = eval("(" + data + ")");
                for (var i = 0; i < data.length; i++) {
                    var p = data[i];
                    for (key in p){
                        $("#d1").append("<h3>"+key+":"+p[key]+"</h3>")
                    }
                    $("#d1").append("<hr/>")

                }

            })
        }

    </script>
</head>
<body>

<input type="button" onclick="test()" value="测试ajax" id="s1">
<hr>
<div id="d1">
    <h1>我是div</h1>

</div>

</body>
</html>
