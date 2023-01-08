<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<script type="text/javascript">
	function notice(){
		window.alert("서비스 준비중입니다.")
	}
	
	function change(){
		document.change.submit();
	}
</script>
<!--
 // WEBSITE: https://themefisher.com
 // TWITTER: https://twitter.com/themefisher
 // FACEBOOK: https://www.facebook.com/themefisher
 // GITHUB: https://github.com/themefisher/
-->

<head>
<meta charset="utf-8">
<script src="https://code.jquery.com/jquery-3.6.1.js" integrity="sha256-3zlB5s2uwoUzrXK3BT7AX3FyvojsraNFxCc2vC/7pNI=" crossorigin="anonymous"></script>

<link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.js"></script>

<!-- summernote를 위해서 추가해야 할 부분 -->
<script type="text/javascript" src="${ pageContext.request.contextPath }/resources/summernote/summernote-lite.js"></script>
<script type="text/javascript" src="${ pageContext.request.contextPath }/resources/summernote/lang/summernote-ko-KR.js"></script>
<link rel="stylesheet" href="${ pageContext.request.contextPath }/resources/summernote/summernote-lite.css">
<title>ShowMeTheRecipe</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<meta name="description" content="This is meta description">
<meta name="author" content="Themefisher">
<meta name="generator" content="Hugo 0.74.3" />
<!-- theme meta -->
<meta name="theme-name" content="reader" />

<!-- plugins -->
<link rel="stylesheet" href="${ pageContext.request.contextPath }/resources/plugins/bootstrap/bootstrap.min.css">
<link rel="stylesheet" href="${ pageContext.request.contextPath }/resources/plugins/themify-icons/themify-icons.css">
<link rel="stylesheet" href="${ pageContext.request.contextPath }/resources/plugins/slick/slick.css">

<!-- Main Stylesheet -->
<link rel="stylesheet" href="${ pageContext.request.contextPath }\resources\css\style.css" media="screen">

<!--Favicon-->
<link rel="shortcut icon" href="${ pageContext.request.contextPath }/resources/images/favicon.png" type="image/x-icon">
<link rel="icon" href="${ pageContext.request.contextPath }/resources/images/favicon.png" type="image/x-icon">

<meta property="og:title" content="Reader | Hugo Personal Blog Template" />
<meta property="og:description" content="This is meta description" />
<meta property="og:type" content="website" />
<meta property="og:url" content="" />
<meta property="og:updated_time" content="2020-03-15T15:40:24+06:00" />
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

<!-- 부가적인 테마 -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script src="${ pageContext.request.contextPath }/resources/js/httpRequest.js"></script>
</head>
<body>
  <!-- navigation -->
<header class="navigation nav-bg">
  <div class="container">
    <nav class="navbar navbar-expand-lg navbar-white">
      <a class="navbar-brand order-1" href="index.html" style="margin-top: -40px; margin-left: 80px">
        <img class="img-fluid" width="100px" src="${ pageContext.request.contextPath }/resources/images/imgMain.jpg"
          alt="Reader | Hugo Personal Blog Template">
      </a>
      

      <div class="order-2 order-lg-3 d-flex align-items-center">
        
        <!-- search -->
        <form class="search-bar">
          <input class="search-query" id="search-query" name="s" type="search" placeholder="Type &amp; Hit Enter..." >
        </form>
        
		<c:choose>
			<c:when test="${empty login}">
				<div class="mr-3">
					<a href="${ pageContext.request.contextPath }/login/login"><img class="widget-author-image" src="${ pageContext.request.contextPath }/resources/images/imgPro.png" style="border-radius: 70%; overflow: hidden; width: 50px; margin-top: 50px; margin-left: 50px"></a>
				</div>
		
				<div class="mr-3">
					<img class="widget-author-image" src="${ pageContext.request.contextPath }/resources/images/imgWrite.png" style="border-radius: 70%; overflow: hidden; width: 50px; margin-top: 50px; margin-left: 20px">
				</div>			
			</c:when>
			<c:otherwise>
				<div class="mr-3">
					<img class="widget-author-image" src="${ pageContext.request.contextPath }/resources/images/kate-stone.jpg" style="border-radius: 70%; overflow: hidden; width: 50px; margin-top: 50px; margin-left: 50px">
				</div>
		
				<div class="mr-3">
					<img class="widget-author-image" src="${ pageContext.request.contextPath }/resources/images/imgWrite.png" style="border-radius: 70%; overflow: hidden; width: 50px; margin-top: 50px; margin-left: 20px">
				</div>
			</c:otherwise>
				
			</c:choose>

      </div>

    </nav>
  </div>
  <br>
  <!--  --------------------------------------------------------------------- -->
  <div class="container" align="center">
    <nav class="navbar navbar-expand-lg navbar-white">
      
      <div class="collapse navbar-collapse text-center order-lg-2 order-3 marginLeft100" id="navigation" align="center">
        <ul class="navbar-nav mx-auto list-inline widget-list-inline">
          <li class="nav-item">
            <a class="nav-link" href="${ pageContext.request.contextPath }/search/searchMain">레시피 검색</a>
          </li>
          <li class="nav-item">
            <a class="nav-link marginLeft140" href="#" role="button" data-toggle="dropdown" aria-haspopup="true"
              aria-expanded="false">
              냉장고털기
            </a>
          </li>

          <li class="nav-item">
            <a class="nav-link marginLeft140" href="contact.html">스크랩한 페이지</a>
          </li>

          <li class="nav-item list-inline-item">
            <a class="nav-link marginLeft140" href="shop.html">요리사</a>
            
          </li>
        </ul>
      </div>

      <div class="order-2 order-lg-3 d-flex align-items-center">
        
        <button class="navbar-toggler border-0 order-1" type="button" data-toggle="collapse" data-target="#navigation">
          <i class="ti-menu"></i>
        </button>
      </div>
    </nav>
  </div>
</header>
  <div class="container" align="center">


