<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script type="text/javascript">
	function check() {
		if()
	}
	
	// 공백확인 함수
	function checkExistData(value, dataName){
		if(value == ""){
			alert(dataName + "입력해주세요!");
			return false;
		}
		return true;
	}
	// email check
	function checkMail(email){
		//email이 입력되었는지
		if(!checkExistData(email,"이메일을"))
			return false;
		
		// 이메일 검사 정규식
		var mailJ = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;
		if(!mailJ.test(email)) {
			alert("이메일 형식이 올바르지 않습니다!");
			joinCheck.email.value ="";
			joinCheck.email.foucs();
			return false;
		}
		return true; //확인이 완료되었을 때
	}
	// password check
	function checkPassword(password, passwordRe) {
		
	    //비밀번호가 입력되었는지 확인하기
	    if (!checkExistData(password, "비밀번호를"))
	         return false;    
	    //비밀번호 확인이 입력되었는지 확인하기
	    if (!checkExistData(passwordRe, "비밀번호 확인을"))
	        return false;
	    
	 	// 비밀번호 정규식
	    var pwJ = /^[a-zA-z0-9]{4,12}$/; 
	    if (!pwJ.test(password)) {
	        alert("비밀번호는 영문 대소문자와 숫자 4~12자리로 입력해야합니다!");
	        joinCheck.password.value = "";
	        joinCheck.password.focus();
	        return false;
	    }

	    //비밀번호와 비밀번호 확인이 맞지 않다면..
	    if (password != passwordRe) {
	        alert("두 비밀번호가 맞지 않습니다.");
	        joinCheck.password.value = "";
	        joinCheck.passwordRe.value = "";
	        joinCheck.passwordRe.focus();
	        return false;
	    }

	    return true; //확인이 완료되었을 때
	} 
	// nickName check
	function checkNickName(nickName){
		if(!checkExistData(nickName,"닉네임을"))
			return false;
		
		// 이름 정규식
		var nickNameJ = /^[a-zA-Z]|[0-9]{2,6}$/;
		if(!nickNameJ.test(nickName)){
			alert("이름이 올바르지 않습니다.");
			return false;
		}
		return true;
	}
	
	// 중복 검사
	//이메일
	function checkEmail(){
		
		const email = document.getElementById("email");
		
		var mailJ = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;
		
		if(email.value == ""){
			alert("이메일을 입력하십시오!");
			return; 
		}else if(!mailJ.test(email.value)){
				alert("이메일 형식이 올바르지 않습니다!");
				return;
		}
		
		
		
		var method = "POST";
		var param = "email=" + encodeURIComponent(email.value);
		var url = "${ pageContext.request.contextPath }/member/checkEmail"
		sendRequest(url,param,resultCheckEmail,method);
	}
	
	function resultCheckEmail() {
		if(xhr.readyState == 4 && xhr.status == 200){
			
			var data = xhr.responseText;
			const emailcheck = document.getElementById("emailcheck");
			
			emailcheck.innerText = "";
			
		
			if(data == '사용 가능한 Email입니다'){
				emailcheck.style.cssText="color: blue; font-size: 10px;";
			}else{
				emailcheck.style.cssText="color: red; font-size: 10px;";				
			}
			
			emailcheck.innerText = data;
		}	
	
	}	
	
	function checkNickName(){
		
		const nickName = document.getElementById("nickName");
		
		var nickNameJ = /^[a-zA-Z]|[0-9]{2,6}$;
		
		if(nickName.value == ""){
			alert("닉네임을 입력하십시오!");
			return; 
		}else if(!nickNameJ.test(nickName.value)){
				alert("닉네임은 2자리 이상 6자리 문자로 적어주세요!");
				return;
		}
		
		
		
		var method = "POST";
		var param = "id=" + encodeURIComponent(id.value);
		var url = "${ pageContext.request.contextPath }/member/checkId"
		sendRequest(url,param,resultCheckNickName,method);
	}

	function resultCheckNickName() {
		if(xhr.readyState == 4 && xhr.status == 200){
			
			var data = xhr.responseText;
			const check = document.getElementById("nickcheck");
			
			check.innerText = "";
			
			
			if(data == '사용 가능한 ID입니다'){
				check.style.cssText="color: blue; font-size: 10px;";
			}else{
				check.style.cssText="color: red; font-size: 10px;";				
			}
			
			check.innerText = data;
		}
		
	}	
	
</script>
<%@ include file="/WEB-INF/views/layout/header.jsp"%>
	<div class="header text-center">
	  <div class="container">
	    <div class="row">
	      <div class="col-lg-9 mx-auto">
	        <h1 class="mb-4">회원가입</h1>
	      </div>
	    </div>
	  </div>
	  
	  <svg class="header-shape-1" width="39" height="40" viewBox="0 0 39 40" fill="none" xmlns="http://www.w3.org/2000/svg">
	    <path d="M0.965848 20.6397L0.943848 38.3906L18.6947 38.4126L18.7167 20.6617L0.965848 20.6397Z" stroke="#040306"
	      stroke-miterlimit="10" />
	    <path class="path" d="M10.4966 11.1283L10.4746 28.8792L28.2255 28.9012L28.2475 11.1503L10.4966 11.1283Z" />
	    <path d="M20.0078 1.62949L19.9858 19.3804L37.7367 19.4024L37.7587 1.65149L20.0078 1.62949Z" stroke="#040306"
	      stroke-miterlimit="10" />
	  </svg>
	
	  
	  <svg class="header-shape-2" width="39" height="39" viewBox="0 0 39 39" fill="none" xmlns="http://www.w3.org/2000/svg">
	    <g filter="url(#filter0_d)">
	      <path class="path"
	        d="M24.1587 21.5623C30.02 21.3764 34.6209 16.4742 34.435 10.6128C34.2491 4.75147 29.3468 0.1506 23.4855 0.336498C17.6241 0.522396 13.0233 5.42466 13.2092 11.286C13.3951 17.1474 18.2973 21.7482 24.1587 21.5623Z" />
	      <path
	        d="M5.64626 20.0297C11.1568 19.9267 15.7407 24.2062 16.0362 29.6855L24.631 29.4616L24.1476 10.8081L5.41797 11.296L5.64626 20.0297Z"
	        stroke="#040306" stroke-miterlimit="10" />
	    </g>
	    <defs>
	      <filter id="filter0_d" x="0.905273" y="0" width="37.8663" height="38.1979" filterUnits="userSpaceOnUse"
	        color-interpolation-filters="sRGB">
	        <feFlood flood-opacity="0" result="BackgroundImageFix" />
	        <feColorMatrix in="SourceAlpha" type="matrix" values="0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 127 0" />
	        <feOffset dy="4" />
	        <feGaussianBlur stdDeviation="2" />
	        <feColorMatrix type="matrix" values="0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.25 0" />
	        <feBlend mode="normal" in2="BackgroundImageFix" result="effect1_dropShadow" />
	        <feBlend mode="normal" in="SourceGraphic" in2="effect1_dropShadow" result="shape" />
	      </filter>
	    </defs>
	  </svg>
	
	  
	  <svg class="header-shape-3" width="39" height="40" viewBox="0 0 39 40" fill="none" xmlns="http://www.w3.org/2000/svg">
	    <path d="M0.965848 20.6397L0.943848 38.3906L18.6947 38.4126L18.7167 20.6617L0.965848 20.6397Z" stroke="#040306"
	      stroke-miterlimit="10" />
	    <path class="path" d="M10.4966 11.1283L10.4746 28.8792L28.2255 28.9012L28.2475 11.1503L10.4966 11.1283Z" />
	    <path d="M20.0078 1.62949L19.9858 19.3804L37.7367 19.4024L37.7587 1.65149L20.0078 1.62949Z" stroke="#040306"
	      stroke-miterlimit="10" />
	  </svg>
	
	  
	  <svg class="header-border" height="240" viewBox="0 0 2202 240" fill="none" xmlns="http://www.w3.org/2000/svg">
	    <path
	      d="M1 123.043C67.2858 167.865 259.022 257.325 549.762 188.784C764.181 125.427 967.75 112.601 1200.42 169.707C1347.76 205.869 1901.91 374.562 2201 1"
	      stroke-width="2" />
	  </svg>
	</div>
	
	<section class="section-sm">
	  <div class="container">
	    <div class="row">
	      <div class="col-lg-8 mx-auto">
	        
	        <div class="content mb-5">
	          <h2 id="we-would-love-to-hear-from-you">ShowMeTheRecipe 방문하신 것을 환영합니다.</h2>
	          <p>아래 설명에 맞추어 회원가입을 진행해주세요.</p>
	        </div>
	        
	        <form method="POST" action="${pageContext.request.contextPath }/member/join" name="joinCheck">
	          <div class="form-group">
	            <label for="email">Email(ID)</label>
	            <input type="text" name="email" id="email" class="form-control" placeholder="000000@naver.com" required>
	            <button type="button" onclick="checkEmail()">중복확인</button><br><span id="emailcheck"></span>
	          </div>
	          <div class="form-group">
	            <label for="password">Password(비밀번호)</label>
	            <input type="text" name="password" id="password" class="form-control" placeholder="비밀번호는 영문 대소문자와 숫자 4~12자리로 입력해야합니다!" required>
	          </div>
	           <div class="form-group">
	            <label for="passwordRe">Password(비밀번호) 확인</label>
	            <input type="text" name="passwordRe" id="passwordRe" class="form-control" placeholder="위에 비밀번호와 똑같이 입력해주세요" required>
	          </div>
	          <div class="form-group">
	            <label for="nickName">NickName</label>
	            <input type="text" name="nickName" id="nickName" class="form-control" placeholder="예)선량한행인, 닉네임은 2자리 이상 6자리 문자로 적어주세요!">
	            <button type="button" onclick="checkNickName()">중복확인</button><br><span id="nickcheck"></span>
	          </div>
	          <div class="form-group">
	            
	          </div>
	          <button type="button" class="btn btn-primary" onclick="check()">가입완료하기</button>
	        </form>
	      </div>
	    </div>
	  </div>
	</section>
<%@ include file="/WEB-INF/views/layout/footer.jsp"%>