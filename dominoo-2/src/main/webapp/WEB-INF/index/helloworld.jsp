<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
li{cursor:pointer;}
</style>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <h2>입력 상자</h2> 
<ul>
	<li id="insert">1.입력</li>
	<br>
	<li>2.보기</li>
	<br>
	<li>3.수정</li>
	<br>
	<li>4.삭제</li>
</ul> 
</body>
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script>
$('#insert').click(function(){
	location.href="/insert";
	
});
</script>
</html>