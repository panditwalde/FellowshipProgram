<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Login page</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->
<link rel="icon" type="image/png" href="./Login/images/icons/favicon.ico" />
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="./Login/vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="./Login/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="./Login/fonts/iconic/css/material-design-iconic-font.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css" href="./Login/vendor/animate/animate.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="./Login/vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="./Login/vendor/animsition/css/animsition.min.css">

<link rel="stylesheet" type="text/css" href="./Login/css/main.css">
<link rel="stylesheet" type="text/css" href="./Login/css/util.css">
<!--===============================================================================================-->
</head>
<body>

	<div class="limiter">
		<div class="container-login100"
			style="background-image: url('./Login/images/bg-01.jpg');">
			<div class="wrap-login100 p-l-55 p-r-55 p-t-65 p-b-54">
				<form class="login100-form validate-form" name="frm" action="resetpassword"method="post">
					<span class="login100-form-title p-b-49"> Reset Password </span>

					

					<div class="wrap-input100 validate-input"
						data-validate="Password is required">
						<span class="label-input100"><B>Password</B></span> <input
							class="input100" type="password" name="password"
							placeholder="Type your password"> <span
							class="focus-input100" data-symbol="&#xf190;"></span>
					</div>
					<div class="wrap-input100 validate-input"
						data-validate="Password is required">
						<span class="label-input100"> <b>confirm Password</b></span> <input
							class="input100" type="password" name="cfmpassword"
							placeholder="Type your confirm password"> <span
							class="focus-input100" data-symbol="&#xf190;"></span>
					</div>

					
					<div class="container-login100-form-btn">
						<div class="wrap-login100-form-btn">
							<div class="login100-form-bgbtn"></div>
							<button class="login100-form-btn">Submit</button>
						</div>
					</div>




				</form>
			</div>
		</div>
	</div>

</body>
</html>