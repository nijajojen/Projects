<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import= "java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="page1.jsp" method="post">
<input type= "text" name="text1"/>
<input type= "submit" value="submit"/>
</form>



<%

//To recieve data from the request
String data1= request.getParameter("param1");
String data2= request.getParameter("param2");
String data3= request.getParameter("param3");
%>

<%

System.out.println("nija");
Date date= new Date();
int count;
for(int i=0;i<3;i++){
	count=i;

%>
<h1>Hello world</h1><%= date %>
<%
}
%>
<%=Integer.parseInt(data1) %>
</body>
</html>