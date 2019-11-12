<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
    
    
    
    <!DOCTYPE html>
<html>
<head>
<style type="text/css">
* {
	margin: 0;
	padding: 0;
	text-decoration: none
}

body {
	
}

header {
	position: relative;
	width: 100%;
	background: #376c86;
}

.logo {
	position: relative;
	z-index: 123;
	padding: 10px;
	font: 18px verdana;
	color: #6DDB07;
	float: left;
	width: 15%
}

.logo a {
	color: #6DDB07;
}

nav {
	position: relative;
	width: 980px;
	margin: 0 auto;
}

#cssmenu, #cssmenu ul, #cssmenu ul li, #cssmenu ul li a, #cssmenu #head-mobile
	{
	border: 0;
	list-style: none;
	line-height: 1;
	display: block;
	position: relative;
	-webkit-box-sizing: border-box;
	-moz-box-sizing: border-box;
	box-sizing: border-box
}

#cssmenu:after, #cssmenu>ul:after {
	content: ".";
	display: block;
	clear: both;
	visibility: hidden;
	line-height: 0;
	height: 0
}

#cssmenu #head-mobile {
	display: none
}

#cssmenu {
	font-family: sans-serif;
	background: #333
}

#cssmenu>ul>li {
	float: left
}

#cssmenu>ul>li>a {
	padding: 17px;
	font-size: 12px;
	letter-spacing: 1px;
	text-decoration: none;
	color: #ddd;
	font-weight: 700;
}

#cssmenu>ul>li:hover>a, #cssmenu ul li.active a {
	color: #fff
}

#cssmenu>ul>li:hover, #cssmenu ul li.active:hover, #cssmenu ul li.active,
	#cssmenu ul li.has-sub.active:hover {
	background: #448D00 !important;
	-webkit-transition: background .3s ease;
	-ms-transition: background .3s ease;
	transition: background .3s ease;
}

#cssmenu>ul>li.has-sub>a {
	padding-right: 30px
}

#cssmenu>ul>li.has-sub>a:after {
	position: absolute;
	top: 22px;
	right: 11px;
	width: 8px;
	height: 2px;
	display: block;
	background: #ddd;
	content: ''
}

#cssmenu>ul>li.has-sub>a:before {
	position: absolute;
	top: 19px;
	right: 14px;
	display: block;
	width: 2px;
	height: 8px;
	background: #ddd;
	content: '';
	-webkit-transition: all .25s ease;
	-ms-transition: all .25s ease;
	transition: all .25s ease
}

#cssmenu>ul>li.has-sub:hover>a:before {
	top: 23px;
	height: 0
}

#cssmenu ul ul {
	position: absolute;
	left: -9999px
}

#cssmenu ul ul li {
	height: 0;
	-webkit-transition: all .25s ease;
	-ms-transition: all .25s ease;
	background: #333;
	transition: all .25s ease
}

#cssmenu ul ul li:hover {
	
}

#cssmenu li:hover>ul {
	left: auto
}

#cssmenu li:hover>ul>li {
	height: 35px
}

#cssmenu ul ul ul {
	margin-left: 100%;
	top: 0
}

#cssmenu ul ul li a {
	border-bottom: 1px solid rgba(150, 150, 150, 0.15);
	padding: 11px 15px;
	width: 170px;
	font-size: 12px;
	text-decoration: none;
	color: #ddd;
	font-weight: 400;
}

#cssmenu ul ul li:last-child>a, #cssmenu ul ul li.last-item>a {
	border-bottom: 0
}

#cssmenu ul ul li:hover>a, #cssmenu ul ul li a:hover {
	color: #fff
}

#cssmenu ul ul li.has-sub>a:after {
	position: absolute;
	top: 16px;
	right: 11px;
	width: 8px;
	height: 2px;
	display: block;
	background: #ddd;
	content: ''
}

#cssmenu ul ul li.has-sub>a:before {
	position: absolute;
	top: 13px;
	right: 14px;
	display: block;
	width: 2px;
	height: 8px;
	background: #ddd;
	content: '';
	-webkit-transition: all .25s ease;
	-ms-transition: all .25s ease;
	transition: all .25s ease
}

#cssmenu ul ul>li.has-sub:hover>a:before {
	top: 17px;
	height: 0
}

#cssmenu ul ul li.has-sub:hover, #cssmenu ul li.has-sub ul li.has-sub ul li:hover
	{
	background: #363636;
}

#cssmenu ul ul ul li.active a {
	border-left: 1px solid #333
}

#cssmenu>ul>li.has-sub>ul>li.active>a, #cssmenu>ul ul>li.has-sub>ul>li.active>a
	{
	border-top: 1px solid #333
}

@media screen and (max-width:1000px) {
	.logo {
		position: absolute;
		top: 0;
		left: 0;
		width: 100%;
		height: 46px;
		text-align: center;
		padding: 10px 0 0 0;
		float: none
	}
	.logo2 {
		display: none
	}
	nav {
		width: 100%;
	}
	#cssmenu {
		width: 100%
	}
	#cssmenu ul {
		width: 100%;
		display: none
	}
	#cssmenu ul li {
		width: 100%;
		border-top: 1px solid #444
	}
	#cssmenu ul li:hover {
		background: #363636;
	}
	#cssmenu ul ul li, #cssmenu li:hover>ul>li {
		height: auto
	}
	#cssmenu ul li a, #cssmenu ul ul li a {
		width: 100%;
		border-bottom: 0
	}
	#cssmenu>ul>li {
		float: none
	}
	#cssmenu ul ul li a {
		padding-left: 25px
	}
	#cssmenu ul ul li {
		background: #333 !important;
	}
	#cssmenu ul ul li:hover {
		background: #363636 !important
	}
	#cssmenu ul ul ul li a {
		padding-left: 35px
	}
	#cssmenu ul ul li a {
		color: #ddd;
		background: none
	}
	#cssmenu ul ul li:hover>a, #cssmenu ul ul li.active>a {
		color: #fff
	}
	#cssmenu ul ul, #cssmenu ul ul ul {
		position: relative;
		left: 0;
		width: 100%;
		margin: 0;
		text-align: left
	}
	#cssmenu>ul>li.has-sub>a:after, #cssmenu>ul>li.has-sub>a:before,
		#cssmenu ul ul>li.has-sub>a:after, #cssmenu ul ul>li.has-sub>a:before
		{
		display: none
	}
	#cssmenu #head-mobile {
		display: block;
		padding: 23px;
		color: #ddd;
		font-size: 12px;
		font-weight: 700
	}
	.button {
		width: 55px;
		height: 46px;
		position: absolute;
		right: 0;
		top: 0;
		cursor: pointer;
		z-index: 12399994;
	}
	.button:after {
		position: absolute;
		top: 22px;
		right: 20px;
		display: block;
		height: 4px;
		width: 20px;
		border-top: 2px solid #dddddd;
		border-bottom: 2px solid #dddddd;
		content: ''
	}
	.button:before {
		-webkit-transition: all .3s ease;
		-ms-transition: all .3s ease;
		transition: all .3s ease;
		position: absolute;
		top: 16px;
		right: 20px;
		display: block;
		height: 2px;
		width: 20px;
		background: #ddd;
		content: ''
	}
	.button.menu-opened:after {
		-webkit-transition: all .3s ease;
		-ms-transition: all .3s ease;
		transition: all .3s ease;
		top: 23px;
		border: 0;
		height: 2px;
		width: 19px;
		background: #fff;
		-webkit-transform: rotate(45deg);
		-moz-transform: rotate(45deg);
		-ms-transform: rotate(45deg);
		-o-transform: rotate(45deg);
		transform: rotate(45deg)
	}
	.button.menu-opened:before {
		top: 23px;
		background: #fff;
		width: 19px;
		-webkit-transform: rotate(-45deg);
		-moz-transform: rotate(-45deg);
		-ms-transform: rotate(-45deg);
		-o-transform: rotate(-45deg);
		transform: rotate(-45deg)
	}
	#cssmenu .submenu-button {
		position: absolute;
		z-index: 99;
		right: 0;
		top: 0;
		display: block;
		border-left: 1px solid #444;
		height: 46px;
		width: 46px;
		cursor: pointer
	}
	#cssmenu .submenu-button.submenu-opened {
		background: #262626
	}
	#cssmenu ul ul .submenu-button {
		height: 34px;
		width: 34px
	}
	#cssmenu .submenu-button:after {
		position: absolute;
		top: 22px;
		right: 19px;
		width: 8px;
		height: 2px;
		display: block;
		background: #ddd;
		content: ''
	}
	#cssmenu ul ul .submenu-button:after {
		top: 15px;
		right: 13px
	}
	#cssmenu .submenu-button.submenu-opened:after {
		background: #fff
	}
	#cssmenu .submenu-button:before {
		position: absolute;
		top: 19px;
		right: 22px;
		display: block;
		width: 2px;
		height: 8px;
		background: #ddd;
		content: ''
	}
	#cssmenu ul ul .submenu-button:before {
		top: 12px;
		right: 16px
	}
	#cssmenu .submenu-button.submenu-opened:before {
		display: none
	}
	#cssmenu ul ul ul li.active a {
		border-left: none
	}
	#cssmenu>ul>li.has-sub>ul>li.active>a, #cssmenu>ul ul>li.has-sub>ul>li.active>a
		{
		border-top: none
	}
}


</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body   background="<c:url value='/resources/Home/images/1.jpg' />">

<div id="slideshow" >
<br><br>

	
		<nav id='cssmenu'>
			<div class="logo">
				<a href="index.html">SpringMVC </a>
			</div>
			<div id="head-mobile"></div>
			
			<ul style="    background-color: #3a5050;    height: 66px;">
				<li class='active'><a href='home'>HOME</a></li>
				
						<li><a href="addrecord">ADD</a></li>
						<li><a href="view">VIEW</a></li>
						<li><a href="del">DELETE</a></li>
						<li><a href="up">UPDATE</a></li>
						<li><a href="searc">SEARCH</a></li>
						<li><a href="logout">LOGOUT</a></li>
			</ul>
		</nav>
	

</div>
</body>
</html>
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
<%-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zxx">

<head>
	<title>Spring MVC Curd Application</title>
	<!-- Meta tag Keywords -->
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta charset="UTF-8" />
	<meta name="keywords"
		content="Natural Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
	<script>
		addEventListener("load", function () {
			setTimeout(hideURLbar, 0);
		}, false);

		function hideURLbar() {
			window.scrollTo(0, 1);
		}
	</script>
	
	<link href="<c:url value="/resources/Home/css/bootstrap.css"/>" rel="stylesheet">
	<link href="<c:url value="/resources/Home/css/font-awesome.min.css" />" rel="stylesheet">
	<link href="<c:url value="/resources/Home/css/style.css" />" rel="stylesheet" media="all">
	
	

	
	

	<!-- Web-Fonts -->
	<link
		href="<c:url value="//fonts.googleapis.com/css?family=Source+Sans+Pro:200,200i,300,300i,400,400i,600,600i,700,700i,900,900i&amp;subset=cyrillic,cyrillic-ext,greek,greek-ext,latin-ext,vietnamese"
		/>"rel="stylesheet">
	<link href="<c:url value="//fonts.googleapis.com/css?family=Tangerine:400,700"/>" rel="stylesheet">
	<!-- //Web-Fonts -->
</head>

<body>
	<!-- home -->
	<div id="home">
		<!-- banner -->
		<div class="banner_w3lspvt">
			<!-- nav -->
			<div class="nav_w3ls pt-4 pb-3 text-center">
				<nav>
					<label for="drop" class="toggle">Menu</label>
					<input type="checkbox" id="drop" />
					<ul class="menu">
						<li><a href="master.jsp">Home</a></li>
						<li><a href="addrecord">ADD</a></li>
						<li><a href="view">VIEW</a></li>
						<li><a href="searc">DELETE</a></li>
						<li><a href="searc">UPDATE</a></li>
						<li><a href="searc">SEARCH</a></li>
						<li><a href="logout">LOGOUT</a></li>
					</ul>
					
				</nav>
			</div>
			<!-- //nav -->
			<!-- banner slider -->
			<div id="homepage-slider" class="st-slider">
				<input type="radio" class="cs_anchor radio" name="slider" id="play1" checked="" />
				<input type="radio" class="cs_anchor radio" name="slider" id="slide1" />
				<input type="radio" class="cs_anchor radio" name="slider" id="slide2" />
				<input type="radio" class="cs_anchor radio" name="slider" id="slide3" />
				<div class="images">
					<div class="images-inner">
						<div class="image-slide">
							<div class="banner-w3ls-1">

							</div>
						</div>
						<div class="image-slide">
							<div class="banner-w3ls-2">

							</div>
						</div>
						<div class="image-slide">
							<div class="banner-w3ls-3">

							</div>
						</div>
					</div>
				</div>
				<div class="labels">
					<div class="fake-radio">
						<label for="slide1" class="radio-btn"></label>
						<label for="slide2" class="radio-btn"></label>
						<label for="slide3" class="radio-btn"></label>
					</div>
				</div>
				<!-- banner-text -->
				<div class="banner-text">
					
				</div>
				<!-- //banner-text -->
			</div>
			<!-- //banner slider -->
		</div>
		<!-- //banner -->
	</div>
	
	





</body>

</html> --%>






