<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Simple Interest</title>

<style>
body {font-family: Arial, Helvetica, sans-serif;}

.form-inline {  
  display: flex;
  flex-flow: row wrap;
  align-items: center;
}

.form-inline label {
  margin: 5px 10px 5px 0;
}

.form-inline input {
  vertical-align: middle;
  margin: 5px 10px 5px 0;
  padding: 10px;
  background-color: #fff;
  border: 1px solid #ddd;
}

.form-inline button {
  padding: 10px 20px;
  background-color: dodgerblue;
  border: 1px solid #ddd;
  color: white;
  cursor: pointer;
}

  .form-inline {
    flex-direction: column;
    align-items: stretch;
  }
}
</style>

</head>
<body>
	<h1 style="color:blue;text-align:center;">Simple Interest Calculator</h1>
	
	<form class="form-inline" action="processform" method="post">
	
	<label>Principal Amount : </label>
	<input type="text" id="amount" name="amount"><br>
	<label>Rate Of Interest : </label>
	<input type="text" id="rate" name="rate"><br>
	<label>Number Of Years : </label>
	<input type="text" id="time" name="time"><br>
	
	<button type="submit">Submit</button>
	</form>
</body>
</html>