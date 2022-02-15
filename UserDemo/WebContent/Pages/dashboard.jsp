<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import= "java.util.List" %>
    <%@ page import= "com.example.demo.pojo.User" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dashboard</title>


!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
<style type="text/css">
	body{
		padding:25px;
	}
</style>

</head>
<body>

<%--<%

List<User> list= (List<User>)request.getAttribute("userList");

--%>
<div class="panel panel-primary">
  <div class="panel-heading">User List</div>
  <div class="panel-body">
	<form action="processUser" method="post">
	  <div class="form-group">
	    <label for="name">Name:</label>
	    <input type="text" name="name" class="form-control" id="name">
	  </div>
	  
	  <div class="form-group">
	    <label for="phone">Phone:</label>
	    <input type="text" name="phone" class="form-control" id="phone">
	  </div>
	  
	  
	  
	  <div class="form-group">
	    <label for="dob">Date:</label>
	    <input type="text" name="dob" class="form-control" id="dob">
	  </div>
	  
	   <div class="form-group">
	    <label for="username">Username:</label>
	    <input type="date" name="username" class="form-control" id="username">
	  </div>
	  
	    <div class="form-group">
	    <label for="password">Password:</label>
	    <input type="password" name="password" class="form-control" id="password">
	  </div>
	  
	  <div class="checkbox">
	    <label><input type="checkbox"> Remember me</label>
	  </div>
	  <button type="submit" class="btn btn-default">Submit</button>
	</form>
 </div>
 </div>



<div class="panel panel-primary">
  <div class="panel-heading">User List</div>
  <div class="panel-body">
  
  <table class="table">
	<thead>
		<tr><th>Name</th><th>phone</th><th>Date</th></tr>
	</thead>
	
	<tbody>
	<%-- <%
	SimpleDateFormat dateformat= new SimpleDateFormat("mm/dd/yy");
	for(User user: list){
	
	<tr>
	<td><%=user.getName() %> </td>
	<td><%=user.getPhoneNo() %> </td>
	<td> <%= dateformat.format(user.getDob()) %></td>
	</tr>
	<%} %>
	--%>
	
	<c:forEach items= "${requestScope.userList }" var= "row">
	
	<tr>
		<td>${row.name}</td>
		<td>${row.phoneNo}</td>
		<td> <f:formatDate value="${row.dob}" pattern= "mm/dd/yyyy"/> </td>
		
	</tr>
	</c:forEach>
	</tbody>




</table>
  
  
  </div>
</div>






</body>
</html>