<%@ page isELIgnored="false" language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 <%@ taglib uri="/struts-tags" prefix="s"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script src="/js/jquery_dev.js"></script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>用户显示界面</title>
</head>
<body>
<ul>
<c:forEach items="${list}" var="user">
<li>${user.username} <input type="button" value="删除用户"></li>
</c:forEach>
<!--  
<s:iterator value="list" var="user">
<li> ${user}</li>
</s:iterator>
-->
</ul>
<script >
$(function(){
	$("#${i}").click(function(){
		$.get("userdelete",{},function(res){
			<!--var sz=Json.parse(res);
			for(var i=0;i<sz.length;i++){
				$("#aab").append("<li>"+sz[i]+"</li>")
			}
		-->
		})
	})
})
</script>
</body>
</html>