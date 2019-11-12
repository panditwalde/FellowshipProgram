<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
body{
    margin: 0;
    padding: 0;
    font-family: sans-serif;
   
}
.box{
position: absolute;
    top: 15%;
    left: 36%;
transform:translate(- 50%,-50%);
width: 400px;
padding: 40px;
background: rgba(0,0,0,.8);
box-sizing: border-box;
box-shadow: 0 15px 25px rgba(0,0,0,.5);
border-radius: 10px;


}
.box h2
{
  margin: 0,0,30px;
  padding: 0;
  color: #fff;
  text-align: center;
}
.box .inputBox
{ 
 position: relative;
}
.box .inputBox input
{
 width: 100%;
 padding: 10px,0;
 font-size: 16px;
 color: #fff;
 letter-spacing:1px;
 margin-bottom: 30px;
 border:  none;
 border-bottom :1px solid #fff;
 outline: none;
 background: transparent; 
 
}
.box .inputBox label

{
  position: absolute;
 top:0;
 left:0;
 letter-spacing:1px;
 padding: 10px,0;
 font-size: 16px;
 color: #fff; 
 pointer-events:none;
 transition:.5s;}
 
 .box .inputBox input:focus ~  label,
 .box .inputBox input:valid ~  label
 {
   top: -10px;
   left: 0;
   color: #03a9f4;
   font-size:12px; 
 }
 
 .box input[type="submit"]
 {
 background: transparent;
 border: none;
 outline: none;
 color: #fff;
 background: #03a9f4;
 padding: 10px 20px;
 cursor: pointer; 
 border-radius: 5px;
 
 
 }
</style>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body   background="<c:url value='/resources/Home/images/3.jpg' />">
<div class="box">
    <h2>login</h2>
<form  name="frm" action="valid" method="get">

  <div class="inputBox">
    <input type="text" name="username" required="">
    <label>User   name</label> 
    </div>
    
     <div class="inputBox">
    <input type="password" name="password" required="">
    <label>password</label> 
    </div>
     <input type="submit" name="" value="Login ">
    


</form>
</div>
</body>
</html>