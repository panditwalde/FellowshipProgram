<%@page import="com.bridgelabz.dao.DBConnection"%>
<%@page import="com.bridgelabz.model.Registermodel"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!DOCTYPE html>
<html>
<head>


<style type="text/css">

table {
	width: 750px;
	border-collapse: collapse;
	margin: 50px auto;
}

/* Zebra striping */
tr:nth-of-type(odd) {
	background: #eee;
}

th {
	background: #3498db;
	color: white;
	font-weight: bold;
}

td, th {
	padding: 10px;
	border: 1px solid #ccc;
	text-align: left;
	font-size: 18px;
}

/* 
Max width before this PARTICULAR table gets nasty
This query will take effect for any screen smaller than 760px
and also iPads specifically.
*/
@media only screen and (max-width: 760px) , ( min-device-width : 768px)
	and (max-device-width: 1024px) {
	table {
		width: 100%;
	}

	/* Force table to not be like tables anymore */
	table, thead, tbody, th, td, tr {
		display: block;
	}

	/* Hide table headers (but not display: none;, for accessibility) */
	thead tr {
		position: absolute;
		top: -9999px;
		left: -9999px;
	}
	tr {
		border: 1px solid #ccc;
	}
	td {
		/* Behave  like a "row" */
		border: none;
		border-bottom: 1px solid #eee;
		position: relative;
		padding-left: 50%;
	}
	td:before {
		/* Now like a table header */
		position: absolute;
		/* Top/left values mimic padding */
		top: 6px;
		left: 6px;
		width: 45%;
		padding-right: 10px;
		white-space: nowrap;
		/* Label the data */
		content: attr(data-column);
		color: #000;
		font-weight: bold;
	}
}
.button-6{
  width:140px;
  height:50px;
  border:2px solid #34495e;
  float:left;
  text-align:center;
  cursor:pointer;
  position:relative;
  box-sizing:border-box;
  overflow:hidden;
  margin:0 0 40px 50px;
}
.button-6 a{
  font-family:arial;
  font-size:16px;
  color:#34495e;
  text-decoration:none;
  line-height:50px;
  transition:all .5s ease;
  z-index:2;
  position:relative;
}
.eff-6{
  width:140px;
  height:50px;
  right:-140px;
  bottom:-50px;
  background:#34495e;
  position:absolute;
  transition:all .5s ease;
  z-index:1;
}
.button-6:hover .eff-6{
  right:0;bottom:0;
}
.button-6:hover a{
  color:#fff;
}
<link href="./Login/css/show.css" rel="stylesheet" type="text/css">




</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

 <div class="button-6">
    <div class="eff-6"></div>
    <a href="Logout">Logout</a>
  </div>


	<table border="1" align="center">



		<thead>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Phone</th>
				<th>Email</th>
				<th>Password</th>
			</tr>
		</thead>
		<tbody>
			<%
				response.setHeader("Cache-Control", "no-cache");
				response.setHeader("Cache-Control", "no-store");
				response.setHeader("Pragma", "no-cache");
				response.setDateHeader("Expires", 0);

				if (session.getAttribute("username") == null) {

					response.sendRedirect("Login.jsp");

				}

				ArrayList<Registermodel> al = DBConnection.show();

				for (Registermodel reg : al) {
			%>
			<tr>
				<td>
					<%
						out.println(reg.getId());
					%>
				</td>
				<td>
					<%
						out.println(reg.getName());
					%>
				</td>
				<td>
					<%
						out.println(reg.getPhone());
					%>
				</td>
				<td>
					<%
						out.println(reg.getEmail());
					%>
				</td>
				<td>
					<%
						out.println(reg.getPassword());
					%>
				</td>

			</tr>
			<%
				session = null;
				}
			%>

		</tbody>
	</table>




</body>
</html>