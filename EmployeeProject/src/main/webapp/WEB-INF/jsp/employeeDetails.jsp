<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

<style type="text/css">

body {
  padding-top: 40px;
  padding-bottom: 40px;
  background-color: #eee;
}

.form-signin {
  max-width: 330px;
  padding: 15px;
  margin: 0 auto;
}
.form-signin .form-signin-heading,
.form-signin .checkbox {
  margin-bottom: 10px;
}
.form-signin .checkbox {
  font-weight: normal;
}
.form-signin .form-control {
  position: relative;
  height: auto;
  -webkit-box-sizing: border-box;
     -moz-box-sizing: border-box;
          box-sizing: border-box;
  padding: 10px;
  font-size: 16px;
}
.form-signin .form-control:focus {
  z-index: 2;
}
.form-signin input[type="email"] {
  margin-bottom: -1px;
  border-bottom-right-radius: 0;
  border-bottom-left-radius: 0;
}
.form-signin input[type="password"] {
  margin-bottom: 10px;
  border-top-left-radius: 0;
  border-top-right-radius: 0;
}



</style>



</head>
<body>

<div class="container">

      <form class="form-signin" action="saveEmpDetails" method="post">
        <h2 class="form-signin-heading">Employee Details</h2>
        <label for="name" class="sr-only">Name</label>
        <input type="text" name="name" id="name" class="form-control" placeholder="Name" required autofocus>
        <label for="phoneno" class="sr-only">Phone No</label>
        <input type="text" id="phoneno" name="phoneno" class="form-control" placeholder="Phoneno" required>
        
         <div class="form-group">
    	<label for="exampleInputEmail1">Email address</label>
    	<input type="email" name="emailid" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
    	<small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
 		 </div>
        <!-- <label for="emailid" class="sr-only">Email Id</label>
        <input type="text" id="emailid" name="emailid" class="form-control" placeholder="Emailid" required>
         -->
        <button class="btn btn-lg btn-primary btn-block" type="submit">Save</button>
      </form>

    </div> <!-- /container -->



</body>
</html>