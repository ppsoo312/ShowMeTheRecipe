<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layout/header.jsp"%>
<section class="section-sm">
<div class="container">
		<form method="POST" action="#">
			<div class="form-group">
				<label for="name" >레시피 제목</label> 
				<input type="text"
					name="name" id="name" class="form-control" placeholder="ex) 초간단 파스타"
					required>
			</div>
			<div class="form-group">
				<label for="email">레시피 소개</label> 
				<input
					type="email" name="email" id="email" class="form-control"
					placeholder="레시피에 대한 소개를 해주세요 ex)성시경이 극찬한 브리치즈 파스타 응용해봤어요 ~ " required>
			</div>
			<div class="form-group">
				<label for="email">동영상 </label> 
				<input type="email"
					name="email" id="email" class="form-control"
					placeholder="첨부할 동영상이 있다면 링크를 입력해주세요(youtube,네이버tvcast,다음tvpot) ex)https://youtu.be/XNhyHR1Epf4">
			</div>
			<div class="form-group">
				<label for="message">Your Message Here</label>
				<textarea name="message" id="message" class="form-control"
					placeholder="Lorem ipsum dolor sit amet…"></textarea>
			</div>
			<button type="submit" class="btn btn-primary">Send Now</button>
		</form>
</div>
</section>
<%@ include file="/WEB-INF/views/layout/footer.jsp"%>
