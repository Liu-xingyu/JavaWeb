<%--
  Created by IntelliJ IDEA.
  User: YRP-Laptop
  Date: 2017/7/15
  Time: 22:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>初始化界面</title>
</head>
<body>
Intellij Idea测试Web成功
<br/>
<form action="aaa.do" method="post" onsubmit="return checkForm()">
    <table>
        <tr>
            <th>No1:</th>
            <td><input type="text" id="text1" name="text1" placeholder="第一个输入框"></td>
        </tr>
        <tr>
            <th>No2:</th>
            <td><input type="text" id="text2" name="text2" placeholder="第二个输入框"></td>
        </tr>
        <tr>
            <th>No3:</th>
            <td><input type="text" id="text3" name="text3" placeholder="第三个输入框"></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" name="submitBtn" value="提交"></td>
        </tr>
    </table>
</form>
</body>
</html>

<script type="text/javascript">
    function checkForm() {
        var _input1 = document.getElementById('text1');
        var _input2 = document.getElementById('text2');
        var _input3 = document.getElementById('text3');
        alert("text1=" + _input1.value + ";text2=" + _input2.value + ";text3=" + _input3.value)
        alert('测试提交form表单成功');
        _input1.value = "";
        _input2.value = "";
        _input3.value = "";
        return false;
    }
</script>
