<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">

@import url(https://fonts.googleapis.com/css?family=Open+Sans+Condensed:300|Oxygen);

/* Page layout */
.button {
  background-color: Crimson;  
  border-radius: 5px;
  color: white;
  padding: .5em;
  text-decoration: none;
}

.button:focus,
.button:hover {
  background-color: FireBrick;
  color: White;
}

.content {
  display: none;
  margin: 1em 0;
}

.content.active,
.no-js .content {
  display: block;
}

body {
    background-color: #fff;
    margin: 0;
    padding: 0;
    font-family: 'Oxygen', sans-serif;
    color: #444;
    font-size: 15px;
    line-height: 18px;
    font-weight: 300;
}

header {
    margin: 0;
    background: #000;
    height: 65px;
    padding: 1px;
}

article {
    margin: 40px 30px;
}

h1 {
    font-family: 'Open Sans Condensed', sans-serif;
    letter-spacing: 1px;
    font-size: 2.3em;
    line-height: 44px;
    text-transform: uppercase;
    color: #fff;
    font-weight: 900;
    margin: 0;
    padding: 10px 0 0 30px;
    letter-spacing: 2px;
}

h2 { margin: 20px 0 10px 0;
    font-weight: 900;
}

p {
    
}


/* Table Layout */

table.vitamins {
       margin-top: 37px;
    margin-left: 300px;
    border-collapse: collapse;
    border-spacing: 0;
    background: #212121;
    color: #fff;
    font-family: sans-serif;
    font-style: normal;
        border-radius: 8px
}


table.vitamins th, table.vitamins td {
    text-align: center;
}

table.vitamins thead {
    line-height: 12px;
    background: #2e63e7;
    text-transform: uppercase;
}

table.vitamins thead th {
    color: #fff;
    padding: 10px;
    letter-spacing: 1px;
    vertical-align: bottom;
}

table.vitamins thead th:nth-child(1) {
    width: 20%;
    text-align: left;
    padding-left: 20px;
}

table.vitamins thead th:nth-child(2) {
    width: 3%;
}

table.vitamins thead th:nth-child(3) {
    width: 35%;
}

table.vitamins thead th:nth-child(4) {
    width: 15%;
}

table.vitamins tbody {
    font-size: 1em;
    line-height: 15px;
}

table.vitamins tbody tr {
    border-top: 2px solid rgba(109, 176, 231, 0.8);
    transition: background 0.6s, color 0.6s;
}

table.vitamins tbody tr:nth-child(even) {
    background: rgba(255, 255, 255, 0.2);
}

table.vitamins tbody tr:hover {
    color: #000;
    background: rgba(255, 255, 255, 0.7);
    font-weight: 900;
}

table.vitamins tbody td {
    padding: 12px;
}

table.vitamins tbody tr:hover td:first-child {
    background: rgba(0,0,0,0);
}

table.vitamins tbody td:first-child {
    text-align: left;
    padding-left: 20px;
    font-weight: 700;
    background: rgba(109, 176, 231, 0.35);
    transition: backgrounf 0.6s;
}

table.vitamins tfoot {
    font-size: 0.8em;
}

table.vitamins tfoot tr {
    border-top: 2px solid #2e63e7;
}

table.vitamins tfoot td {
    color: rgba(255,255,215,0.6);
    text-align: left;
    line-height: 15px;
    padding: 15px 20px;
}


/* Mobile Layout */

@media screen and (max-width: 400px) {
    h1 {
        font-size: 34px;
        line-height: 36px;
        padding-left: 15px;
    }

    article {
        margin: 10px 15px;
    }

    table.vitamins {
        font-size: 0.8em;
    }
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<jsp:include page="master.jsp"></jsp:include>
	<br>
	<br>
	   
	 
	
	<table class="vitamins" style="    width: 630px;">
        <thead>
            <tr>
                	<th>ID</th>
			        <th>FIRSTNAME</th>
			        <th>LASTNAME</th>
			         <th>Email</th>
			         <th>Contact</th>
			         <th>password</th>
			         <th>Gender</th>
		          	
            </tr>
        </thead>
        <tfoot>
            <tr>
                
            </tr>
        </tfoot>
        <tbody>
        
        <c:forEach items="${regData}" var="reg">
			<tr>
			    <Td>${reg.getId()}</Td>
				<Td>${reg.getFirstname()}</Td>
				<Td>${reg.getLastname()}</Td>
				<Td>${reg.getEmail()}</Td>
				<Td>${reg.getPhone()}</Td>
				<Td>${reg.getPassword()}</Td>
				<Td>${reg.getGender()}</Td>
				
				
		

			</tr>

		</c:forEach>
           
        </tbody>
    </table>
</article>
	
	
</body>
</html>