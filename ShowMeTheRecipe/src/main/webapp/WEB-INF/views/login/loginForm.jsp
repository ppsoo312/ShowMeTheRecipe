<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- plugins -->
<link rel="stylesheet" href="${ pageContext.request.contextPath }/resources/plugins/bootstrap/bootstrap.min.css">
<link rel="stylesheet" href="${ pageContext.request.contextPath }/resources/plugins/themify-icons/themify-icons.css">
<link rel="stylesheet" href="${ pageContext.request.contextPath }/resources/plugins/slick/slick.css">

<!-- Main Stylesheet -->
<link rel="stylesheet" href="${ pageContext.request.contextPath }\resources\css\style.css" media="screen">
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

<!-- 부가적인 테마 -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script src="${ pageContext.request.contextPath }/resources/js/httpRequest.js"></script>

<body>
<!-- <div class="container2 footerColor1">
	<div align="center" class="loginFormStyle">
		SHOW ME THE RECIPE	
	</div>
</div> -->
<div class="container">
	<div class="row">
		<div class="christTemaBack" align="center" class="col-lg-9 mx-auto">
			<h1 class="mb-4" style="color: white"><strong>Show Me The Recipe</strong></h1>
			<h3 class="loginH3_1"><strong>로그인 / 회원가입</strong></h3>
			
		</div>
	</div>
</div>
<div align="center" class="container">
	<a href="javascript:kakaoLogin();"><img class="kakaoB" src="../resources/images/kakao_loginM.png" alt="카카오계정 로그인" style="height: 40px;"/></a>
	<br><br><strong> OR </strong><br>
	<div class="loginH3_1">
		<input class="inputText" type="text" name="email" placeholder="아이디">
		<input class="inputText" type="text" name="password" placeholder="비밀번호">
		<br>
		<c:choose>
			<c:when test="${check }">
				<br><input type="checkbox" name="ckid" value="true" checked="checked">
			</c:when>
			<c:otherwise>
				<br><input type="checkbox" name="ckid" value="true"> 로그인 상태 유지
			</c:otherwise>
		</c:choose>

		<br><input type="submit" value="Login" style="margin-top: 10px">
	</div>
    <a href="javascript:kakaoLogout();"><img src="../resources/images/kakao_login.png" alt="카카오계정 로그아웃" style="height: 40px;"/></a>
    <a href="javascript:secession();"><img src="../resources/images/kakao_login.png" alt="카카오계정 회원탈퇴" style="height: 40px;"/></a>
</div>
  
    

    <script src="https://developers.kakao.com/sdk/js/kakao.js"></script>
    <script>
        window.Kakao.init('1446ed647320403f97e23ec6c394fedf');

        function kakaoLogin() {
            window.Kakao.Auth.login({
                scope: 'profile_nickname, profile_image, account_email',  //동의항목 페이지에 있는 개인정보 보호 테이블의 활성화된 ID값을 넣습니다.
                success: function(response)  {
                    //alert(response) // 로그인 성공하면 받아오는 데이터
                    window.Kakao.API.request({ // 사용자 정보 가져오기 
                        url: '/v2/user/me',
                        success: (res) => {
                            const kakao_account = res.kakao_account;
                            alert(Object.entries(kakao_account));
                            alert(Object.values(kakao_account)[2]['nickname']); // 카톡 닉네임
                            alert(Object.values(kakao_account)[2]['profile_image_url']); // 카톡 프로필 사진
                            alert(Object.values(kakao_account)[7]); // 카톡 이메일
                            //console.log(Object.entries(kakao_account));
                            //console.log(Object.values(kakao_account)[2]['nickname']); // 카톡 닉네임
                            //console.log(Object.values(kakao_account)[2]['profile_image_url']); // 카톡 프로필 사진
                            //console.log(Object.values(kakao_account)[7]); // 카톡 이메일

                        }
                    });
                    // window.location.href='/ex/kakao_login.html' //리다이렉트 되는 코드
                },
                fail: function(error) {
                    console.log(error);
                }
            });
        }
        
        function kakaoLogout() {
        	if (!Kakao.Auth.getAccessToken()) {
    		    console.log('Not logged in.');
    		    return;
    	    }
    	    Kakao.Auth.logout(function(response) {
        		alert(response +' logout');
    		    window.location.href='${pageContext.request.contextPath}/login/login';
    	    });
    };
    function secession() {
    	Kakao.API.request({
        	url: '/v1/user/unlink',
        	success: function(response) {
        		console.log(response);
        		//callback(); //연결끊기(탈퇴)성공시 서버에서 처리할 함수
        		window.location.href='${pageContext.request.contextPath}/login/login';
        	},
        	fail: function(error) {
        		console.log('탈퇴 미완료')
        		console.log(error);
        	},
    	});
    };
    </script>
</body>