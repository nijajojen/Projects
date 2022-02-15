<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/wow/1.1.2/wow.js"></script>

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
		
  <form class="form-signin" action="saveComponent" method="post">
      
       <h2 class="form-signin-heading">Component Master</h2>
      
        

        
        
   <script type="text/javascript">
		function entryCreation()
		{
            
		document.getElementById("container");
        var myTable = document.getElementById("table1");
        var currentIndex = myTable.rows.length;
        var currentRow = myTable.insertRow(currentIndex);
           var td= currentRow.insertCell(0);
           var td2=  currentRow.insertCell(1);
           td.innerHTML = currentIndex;
           var td3 = currentRow.insertCell(2);
           var td4 = currentRow.insertCell(3);
           
           var inputComName= document.createElement("input");
           		inputComName.setAttribute("Name","inputComName");
           var inputComAmt= document.createElement("input");
           		inputComAmt.setAttribute("Name","inputComAmt")
            td2.appendChild(inputComName);
            td4.appendChild(inputComAmt);
            
            var selectList = document.createElement("select");
            	selectList.setAttribute("Name", "selectList")
            selectList.id = "mySelect";
            var option1 = document.createElement("option");
             option1.value = "fixed";
             option1.text = "fixed pay";
             selectList.appendChild(option1);
              var option2 = document.createElement("option");
             option2.value = "percentage";
             option2.text = "percentage";
             selectList.appendChild(option2);
             td3.appendChild(selectList);


		}

    function tableToJson(table) { 
        var data = []; // first row needs to be headers var headers = []; 
        for (var i=0; i<table.rows[0].cells.length; i++) {
        headers[i] = table.rows[0].cells[i].innerHTML.toLowerCase().replace(/ /gi,''); 
        } 
        // go through cells 
        for (var i=1; i<table.rows.length; i++) { 
        var tableRow = table.rows[i]; var rowData = {}; 
        for (var j=0; j<tableRow.cells.length; j++) { 
        rowData[ headers[j] ] = tableRow.cells[j].innerHTML; 
        } data.push(rowData); 
        } 
        return data; 
        }
   </script>
        
      <div>
        <div>
        <table id="table1">
            <tr><th>Serial No</th> 
                <th>Component Name</th>
                 <th>Component Type</th> 
                 <th>Amount</th>
                </tr>
            <tr><td>1</td>
                 <td><input type="text" disabled="disabled" placeholder="Password" value="basic"/></td> 
              <td>  <select name="sel" disabled>
                    <option>fixed pay</option>
                </select></td>
                <td><input type="text" disabled="disabled" placeholder="0" value="0"/> </td></tr>
        </table>
        
        </div>
        
       <div style="float:left;">
       <br><br><br><br><br><br><br>
       <button class="btn btn-lg btn-primary btn-block" type="button" onclick="entryCreation()">Add New</button>
       <button class="btn btn-lg btn-primary btn-block"  type="submit">Save</button>
   
       </div>
      

    </div>
    
 

</form>
</div>
</body>
</html>