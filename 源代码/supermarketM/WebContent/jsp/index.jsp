<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="description" content="12">
<meta name="author" content="12">
<meta name="keyword" content="12">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>超市管理系统</title>
<!-- start: Css -->
<link rel="stylesheet" type="text/css"
	href="../asset/css/bootstrap.min.css">
<!-- plugins -->
<link rel="stylesheet" type="text/css"
	href="../asset/css/plugins/font-awesome.min.css" />
<link rel="stylesheet" type="text/css"
	href="../asset/css/plugins/simple-line-icons.css" />
<link rel="stylesheet" type="text/css"
	href="../asset/css/plugins/animate.min.css" />
<link rel="stylesheet" type="text/css"
	href="../asset/css/plugins/fullcalendar.min.css" />
<link href="../asset/css/style.css" rel="stylesheet">
</head>

<body id="mimin" class="dashboard">
	<!-- start: Header -->
	<nav class="navbar navbar-default header navbar-fixed-top">
		<div class="col-md-12 nav-wrapper">
			<div class="navbar-header" style="width: 100%;">
				<div class="opener-left-menu is-open">
					<span class="top"></span> <span class="middle"></span> <span
						class="bottom"></span>
				</div>
				<a href="index.html" class="navbar-brand"> <b>首页</b>
				</a>
				<ul class="nav navbar-nav navbar-right user-nav">
					<li class="user-name"><span>${USER.username }</span></li>
					<li class="dropdown avatar-dropdown"><img
						src="../asset/img/avatar.jpg" class="img-circle avatar"
						alt="user name" data-toggle="dropdown" aria-haspopup="true"
						aria-expanded="true" />
						<ul class="dropdown-menu user-dropdown">
							<li><a href="${pageContext.request.contextPath }/user/toEditUser?id=${USER.id }"><span
									class="fa fa-power-off"></span> 修改密码</a></li>
							<li><a href="${pageContext.request.contextPath }/login.jsp"><span
									class="fa fa-power-off"></span> 退出登录</a></li>
						</ul></li>
				</ul>
			</div>
		</div>
	</nav>
	<!-- end: Header -->
	<div class="container-fluid mimin-wrapper">
		<!-- start:Left Menu -->
		<div id="left-menu">
			<div class="sub-left-menu scroll">
				<ul class="nav nav-list">
					<li>
						<div class="left-bg"></div>
					</li>

					<li class="ripple"><a class="tree-toggle nav-header"> <span
							class="fa-diamond fa"></span> 操作 <span
							class="fa-angle-right fa right-arrow text-right"></span>
					</a>
						<ul class="nav nav-list tree">

							<c:choose>
								<c:when test="${USER.roleId == 1}">
									<li><a
										href="${pageContext.request.contextPath }/goods/list">查看商品</a></li>
									<li><a
										href="${pageContext.request.contextPath }/sell/sell-list">商品出售</a></li>
									<li><a
										href="${pageContext.request.contextPath }/stati/stati-list">商品统计</a></li>
										<li><a
										href="${pageContext.request.contextPath }/ware/ware-list">仓库管理</a></li>
								</c:when>
								<c:when test="${USER.roleId == 2}">
									<li><a
										href="${pageContext.request.contextPath }/goods/list">查看商品</a></li>
									<li><a
										href="${pageContext.request.contextPath }/sell/sell-list">商品出售</a></li>
									<li><a
										href="${pageContext.request.contextPath }/stati/stati-list">商品统计</a></li>
								</c:when>
								<c:when test="${USER.roleId == 3}">
									<li><a
										href="${pageContext.request.contextPath }/sell/sell-list">商品出售</a></li>
									<li><a
										href="${pageContext.request.contextPath }/stati/stati-list">商品统计</a></li>
								</c:when>
								<c:when test="${USER.roleId == 4}">
									<li><a
										href="${pageContext.request.contextPath }/sell/sell-list">商品出售</a></li>
									<li><a
										href="${pageContext.request.contextPath }/stati/stati-list">商品统计</a></li>
									<li><a
										href="${pageContext.request.contextPath }/ware/ware-list">仓库管理</a></li>
								</c:when>
							</c:choose>

						</ul></li>
				</ul>
			</div>
		</div>
		<!-- end: Left Menu -->

		<!-- start: content -->
		<div id="content">
			<div class="panel">
				<div class="panel-body">
					<div class="col-md-6 col-sm-12">
						<h3 class="animated fadeInLeft">欢迎您：${USER.username }</h3>
						<p class="animated fadeInDown">
							<span class="fa  fa-map-marker"></span>
							<c:choose>
								<c:when test="${USER.roleId == 1}">
									管理员
								</c:when>
								<c:when test="${USER.roleId == 2}">
									超市经理
								</c:when>
								<c:when test="${USER.roleId == 3}">
									收银员
								</c:when>
								<c:when test="${USER.roleId == 4}">
									仓管
								</c:when>
							</c:choose>
						</p>
					</div>
				</div>
			</div>
			<div class="col-md-12" style="padding: 20px;">
				<div class="col-md-12 padding-0">
					<div class="col-md-8 padding-0">
						<div class="col-md-12 padding-0">
							<div class="col-md-6">
								<div class="panel box-v1">
									<div class="panel-heading bg-white border-none">
										<div class="col-md-6 col-sm-6 col-xs-6 text-left padding-0">
											<h4 class="text-left">超市动态</h4>
										</div>
										<div class="col-md-6 col-sm-6 col-xs-6 text-right">
											<h4>
												<span class="icon-user icons icon text-right"></span>
											</h4>
										</div>
									</div>
									<div class="panel-body text-center">
										<ul class="normal-list">
											<li class="text-left"><span class="right">2017-11-18</span><a
												href="#"><span class="fa fa-angle-right"></span>
													通知公告列表文字</a></li>
											<li class="text-left"><span class="right">2017-11-18</span><a
												href="#"><span class="fa fa-angle-right"></span>
													通知公告列表文字</a></li>
											<li class="text-left"><span class="right">2017-11-18</span><a
												href="#"><span class="fa fa-angle-right"></span>
													通知公告列表文字</a></li>
											<li class="text-left"><span class="right">2017-11-18</span><a
												href="#"><span class="fa fa-angle-right"></span>
													通知公告列表文字</a></li>
											<li class="text-left"><span class="right">2017-11-18</span><a
												href="#"><span class="fa fa-angle-right"></span>
													通知公告列表文字</a></li>
											<li class="text-left"><span class="right">2017-11-18</span><a
												href="#"><span class="fa fa-angle-right"></span>
													通知公告列表文字</a></li>
											<li class="text-left"><span class="right">2017-11-18</span><a
												href="#"><span class="fa fa-angle-right"></span>
													通知公告列表文字</a></li>
											<li class="text-left"><span class="right">2017-11-18</span><a
												href="#"><span class="fa fa-angle-right"></span>
													通知公告列表文字</a></li>
										</ul>
										<p>
											<a href="#">更多信息</a>
										</p>
										<hr />
									</div>
								</div>
							</div>
							<div class="col-md-6">
								<div class="panel box-v1">
									<div class="panel-heading bg-white border-none">
										<div class="col-md-6 col-sm-6 col-xs-6 text-left padding-0">
											<h4 class="text-left">通知公告</h4>
										</div>
										<div class="col-md-6 col-sm-6 col-xs-6 text-right">
											<h4>
												<span class="icon-check icons icon text-right"></span>
											</h4>
										</div>
									</div>
									<div class="panel-body text-center">
										<ul class="normal-list">
											<li class="text-left"><span class="right">2017-11-18</span><a
												href="#"><span class="fa fa-angle-right"></span>
													通知公告列表文字</a></li>
											<li class="text-left"><span class="right">2017-11-18</span><a
												href="#"><span class="fa fa-angle-right"></span>
													通知公告列表文字</a></li>
											<li class="text-left"><span class="right">2017-11-18</span><a
												href="#"><span class="fa fa-angle-right"></span>
													通知公告列表文字</a></li>
											<li class="text-left"><span class="right">2017-11-18</span><a
												href="#"><span class="fa fa-angle-right"></span>
													通知公告列表文字</a></li>
											<li class="text-left"><span class="right">2017-11-18</span><a
												href="#"><span class="fa fa-angle-right"></span>
													通知公告列表文字</a></li>
											<li class="text-left"><span class="right">2017-11-18</span><a
												href="#"><span class="fa fa-angle-right"></span>
													通知公告列表文字</a></li>
											<li class="text-left"><span class="right">2017-11-18</span><a
												href="#"><span class="fa fa-angle-right"></span>通知公告列表文字</a></li>
											<li class="text-left"><span class="right">2017-11-18</span><a
												href="#"><span class="fa fa-angle-right"></span>
													通知公告列表文字</a></li>
										</ul>
										<p>
											<a href="#">更多信息</a>
										</p>
										<hr />
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="col-md-4">
						<div class="col-md-12 padding-0">
							<div class="panel box-v2">
								<div class="panel-heading padding-0">
									<img src="../asset/img/bg2.jpg"
										class="box-v2-cover img-responsive" />
									<div class="box-v2-detail">
										<img src="../asset/img/avatar.jpg" class="img-responsive" />
										<h4>${user.username }</h4>
									</div>
								</div>
								<div class="panel-body">
									<div class="col-md-12 padding-0 text-center">
										<div class="col-md-4 col-sm-4 col-xs-6 padding-0">
											<h3>2000</h3>
											<p>已读公告</p>
										</div>
										<div class="col-md-4 col-sm-4 col-xs-6 padding-0">
											<h3>1000</h3>
											<p>新发公告</p>
										</div>
										<div class="col-md-4 col-sm-4 col-xs-6 padding-0">
											<h3>1000</h3>
											<p>己发公告</p>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- end: content -->

	</div>

	<!-- start: Javascript -->
	<script src="../asset/js/jquery.min.js"></script>
	<script src="../asset/js/jquery.ui.min.js"></script>
	<script src="../asset/js/bootstrap.min.js"></script>
	<!-- plugins -->
	<script src="../asset/js/plugins/jquery.nicescroll.js"></script>
	<!-- custom -->
	<script src="../asset/js/main.js"></script>
	<!-- end: Javascript -->
</body>
</html>

