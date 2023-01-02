<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layout/header.jsp"%>

<div class="widget">
	<table>
		<tr>
			<th>종류별</th>
			<td class="division"><a
				href="${ pageContext.request.contextPath }/search/total">전체</a></td>
			<c:forEach var="i" items="${list }">
				<td class="division">리스트</td>
			</c:forEach>
		</tr>
		<tr>
			<th>상황별</th>
			<td class="division"><a
				href="${ pageContext.request.contextPath }/search/total">전체</a></td>
			<c:forEach var="i" items="${list }">
				<td class="division">리스트</td>
			</c:forEach>
		</tr>
		<tr>
			<th>재료별</th>
			<td class="division"><a
				href="${ pageContext.request.contextPath }/search/total">전체</a></td>
			<c:forEach var="i" items="${list }">
				<td class="division">리스트</td>
			</c:forEach>
		</tr>
		<tr>
			<th>방법별</th>
			<td class="division"><a
				href="${ pageContext.request.contextPath }/search/total">전체</a></td>
			<c:forEach var="i" items="${list }">
				<td class="division">리스트</td>
			</c:forEach>
		</tr>
	</table>
</div>
<div class="container">
	<div class="row">
		<div class=" col-lg-8 mb-5 mb-lg-0">
			<div class="content">
				<article>
					<h4 id="tab">Tab</h4>
					<div class="code-tabs">
						<ul class="nav nav-tabs"></ul>
						<div class="tab-content">
							<div class="tab-pane" title="first">This is first tab</div>
							<div class="tab-pane" title="second">this is second tab</div>
							<div class="tab-pane" title="third">this is third tab</div>
						</div>
					</div>
				</article>
			</div>
		</div>
	</div>
</div>

<script type="text/javascript">
	$('.tab-content')
			.find('.tab-pane')
			.each(
					function(idx, item) {
						var navTabs = $(this).closest('.code-tabs').find(
								'.nav-tabs'), title = $(this).attr('title');
						navTabs
								.append('<li class="nav-item"><a class="nav-link" href="#">'
										+ title + '</a></li>');
					});

	$('.code-tabs ul.nav-tabs').each(function() {
		$(this).find('li:first').addClass('active');
	});

	$('.code-tabs .tab-content').each(function() {
		$(this).find('div:first').addClass('active');
	});

	$('.nav-tabs a')
			.click(
					function(e) {
						e.preventDefault();
						var tab = $(this).parent(), tabIndex = tab.index(), tabPanel = $(
								this).closest('.code-tabs'), tabPane = tabPanel
								.find('.tab-pane').eq(tabIndex);
						tabPanel.find('.active').removeClass('active');
						tab.addClass('active');
						tabPane.addClass('active');
					});
</script>
<%@ include file="/WEB-INF/views/layout/footer.jsp"%>