

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<style type="text/css">

*{
  padding:0;
  margin:0;
  box-sizing:border-box;
}
body{
  background-color: #00ace6;
}

.wrapper{
/*   border:solid black; */
  display: -webkit-flex;
  display: flex;
  height: 100%;
}

.myForm{
/*   border:solid black; */
  background-color:white;
  margin:50px auto;
  display:flex;
  flex-direction:column;
  flex-wrap:wrap;
  justify-content:space-between;
  align-items:center;
  width:25%;
  min-width:400px;
  border-radius:5px;
/*   height:450px;     */
}



.formElement{
/*   border:solid black; */
/*   flex-basis:100%; */
  width:90%;
}



.formInstructionsDiv{
  width:100%; 
/*   flex-grow:1; */
  padding:15px 0;
  background-color:#f8e76e;
  border-radius:5px;
  border-bottom: solid #f8e76e; 
 
}

.formInstructionsDiv h2{
  margin-left:5%;
  font-size:3em;
  font-family:"ebrima";
  font-weight:lighter;
}

.formInstructionsDiv p{
  margin-left:5%;
  font-size:1em;
  font-family: "ebrima";
}
.fillContentDiv{
  display:flex;
  flex-direction:column;
  justify-content:space-between;
  flex-grow:1;
  margin-top:24px;
  margin-bottom: 82px;
  height:280px;
  
  
}

.formContentElement{
  min-width:100%;
}

.names{
  display:flex;
  flex-wrap:wrap;
  justify-content:space-between;

}

.names .inputRequest{
  width:47.5%;
  min-width:150px;
}

.names .inputRequest:last-child{
/*   margin-right:5%; */
}

.otherInputs{

}

.otherInputs .inputRequest{

}


.inputRequest{
/*   margin-bottom:20px; */
  padding:15px;
  font-size:1.2em;
  background-color: #f2f2f2;
  border-style:none;
  border-radius:5px;
}

.inputRequest:focus{
  border-style:solid;
  border-width:3px;
  border-color: #0d6380;
}


.submitButton{
  width:40%;
  height:100%;
  background-color: #0099cc;
  border-style:none;
  color:white;
  font-size:1.2em;
  font-weight:800;
      margin-left: 90px;
  cursor:pointer;
  border-radius:5px;
}

.submitButton:hover{
  background-color:#1cacdd;
}
.submitButtonDiv{
  grow:1;
  height:45px;
/*   padding-bottom:40px; */
  margin-bottom:20px;
  
}


</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="master.jsp"></jsp:include>
	<br>
	<br>

<link href="https://fonts.googleapis.com/css?family=Roboto&display=swap" rel="stylesheet"> 
<div class="wrapper">
<form name="frm" action="insert" method="get"  class="myForm">
  
    <div class="formInstructionsDiv formElement">
      <h2 class="formTitle" >Student Form</h2>
    
     </div>
    <div class="fillContentDiv formElement">
    <div class="names formContentElement">  
      <input class="inputRequest " type="text"name="firstname" placeholder="First Name"/>

      <input class="inputRequest " type="text" name="lastname" placeholder="Last Name"/>

   </div>
   
    <br>    
      <label>
        <input class="inputRequest formContentElement" type="text"name="email" placeholder="Email">
      </label>
      <label>
        <input class="inputRequest formContentElement" type="text" name="phone" placeholder="Phone">
      </label>
      <label>
        <input class="inputRequest formContentElement" type="password"name="password" placeholder="Enter password">
      </label>
      <label>
        <input class="inputRequest formContentElement" type="password" placeholder="Confirm password">
      </label>
      
      <label>
        <select name="gender" input class="inputRequest formContentElement"  >
							<option >Gender</option>
							<option value="male">Male</option>
							<option value="female">Female</option>
							
						</select>
      </label>
  
      </div>
    <div class="submitButtonDiv formElement">
      
    <input type="submit" class="submitButton" value="submit"></button>
    </div>
  </form>
</div>

</body>
</html>