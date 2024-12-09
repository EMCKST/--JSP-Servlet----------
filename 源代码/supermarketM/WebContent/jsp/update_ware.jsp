<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="description" content="xxxxx">
<meta name="author" content="xxxxx">
<meta name="keyword" content="xxxxx">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>上货</title>
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
<!-- end: Css -->
<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="asset/js/html5shiv.min.js"></script>
      <script src="asset/js/respond.min.js"></script>
    <![endif]-->
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
				<a href="#" class="navbar-brand"> <b>上货</b>
				</a>
				<ul class="nav navbar-nav navbar-right user-nav">
					<li class="user-name"><span>${USER.username }</span></li>
					<li class="dropdown avatar-dropdown"><img
						src="../asset/img/avatar.jpg" class="img-circle avatar"
						alt="user name" data-toggle="dropdown" aria-haspopup="true"
						aria-expanded="true" />
						<ul class="dropdown-menu user-dropdown">
							<li><a href="${pageContext.request.contextPath }/login.jsp"><span class="fa fa-power-off"></span>
									退出登录</a></li>
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
					<div class="col-md-12">
						<h3 class="animated fadeInLeft">上货</h3>
						<p class="animated fadeInDown">
							业务 <span class="fa-angle-right fa"></span> 上货
						</p>
					</div>
				</div>
			</div>
			<div class="form-element">
				<div class="col-md-12 padding-0">
					<div class="col-md-12">
						<form action="${pageContext.request.contextPath }/ware/update-ware"
							method="post">
							<input name="username" value="${USER.username }" type="hidden" />
							<div class="panel form-element-padding">
								<div class="panel-heading">
									<h4>库存详情</h4>
								</div>

								<div class="form-group">
									<label class="col-sm-1 control-label text-right">商品名称</label>
									<div class="col-sm-3">
										<input type="text" class="form-control" name="g_name" readonly="readonly"
											value="${UPDATEWARE.g_name }">
									</div>

								</div>

								<div class="form-group">
									<label class="col-sm-1 control-label text-right">原有库存</label>
									<div class="col-sm-3">
										<input type="text" class="form-control" name="stock_1" readonly="readonly"
											value="${UPDATEWARE.stock }">
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-1 control-label text-right">新增库存</label>
									<div class="col-sm-3">
										<input type="text" class="form-control" name="stock_2">
									</div>
								</div>

								<div class="form-group">
									<div class="form-group">

										<!-- id -->
										<input name="id" type="hidden" value="${UPDATEWARE.id }" />
									</div>
								</div>

								<div class="col-md-12 text-center" style="margin: 20px 0 0 0;">
									<input class="submit btn btn-danger" type="submit" value="提交">
								</div>
						</form>
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
	<script>
		$("#left-menu-2").click();
	</script>
</body>
</html>