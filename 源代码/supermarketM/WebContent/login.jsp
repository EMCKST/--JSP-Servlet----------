<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>超市管理系统</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="robots" content="all,follow">
    <link rel="stylesheet" href="https://ajax.aspnetcdn.com/ajax/bootstrap/4.2.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="css/style.default.css" id="theme-stylesheet">
  </head>
  <body>
    <div class="page login-page">
      <div class="container d-flex align-items-center">
        <div class="form-holder has-shadow">
          <div class="row">
            <!-- Logo & Information Panel-->
            <div class="col-lg-6">
              <div class="info d-flex align-items-center">
                <div class="content">
                  <div class="logo">
                    <h1>欢迎登录</h1>
                  </div>
                  <p>超市管理系统</p>
                </div>
              </div>
            </div>
            <!-- Form Panel    -->
            <div class="col-lg-6 bg-white">
              <div class="form d-flex align-items-center">
                <div class="content">
                  <form method="post" action="${pageContext.request.contextPath}/user/login" class="form-validate" id="loginFrom">
                    <div class="form-group">
                      <input id="login-username" type="text" name="name" required data-msg="请输入用户名" placeholder="用户名" value="admin" class="input-material">
                    </div>
                    <div class="form-group">
                      <input id="login-password" type="password" name="pwd" required data-msg="请输入密码" placeholder="密码" class="input-material">
                    </div>
                    <button id="login" type="submit" class="btn btn-primary">登录</button>
                  </form>
                  <br />
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <!-- JavaScript files-->
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="vendor/jquery-validation/jquery.validate.min.js"></script><!--表单验证-->
    <!-- Main File-->
    <script src="js/front.js"></script>
    <script>
    		$("#login").click(function(){
    			var userName=$("#login-username").val();
    			var passWord=$("#login-password").val();
    			localStorage.setItem("username",userName)
    			localStorage.setItem("password",passWord)
    		})
    		
    </script>
  </body>
</html>