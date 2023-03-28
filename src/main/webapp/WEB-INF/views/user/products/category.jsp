<%@ page language="java" contentType="text/html; charset=UTF8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/user/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sản phẩm</title>
<style>
.pagination {
	display: flex;
	justify-content: center;
}

.pagination a {
	color: black;
	float: left;
	padding: 8px 16px;
	text-decoration: none;
}

.pagination a.active {
	background-color: #4CAF50;
	color: white;
	border-radius: 5px;
}

.pagination a:hover:not(.active) {
	background-color: #ddd;
	border-radius: 5px;
}
</style>

</head>
<body>
	<div class="well well-small">
		<div class="row">
			<span style="margin-left: 25px;">Danh sách sản phẩm</span> <select
				class="pull-right">
				<option>A - Z</option>
				<option>Cao - Thấp</option>
			</select>
		</div>

		<c:if test="${ productsPaginate.size() > 0 }">
			<div class="row-fluid">
				<ul class="thumbnails">

					<c:forEach var="item" items="${ productsPaginate }"
						varStatus="loop">
						<li class="span4">
							<div class="thumbnail">
								<a href="product_details.html" class="overlay"></a> 
								<a class="zoomTool" href="product_details.html"	title="add to cart"><span class="icon-search"></span> QUICKVIEW</a> 
								<a href="<c:url value="/chi-tiet-san-pham/${ item.id_product }"/>">
								<img src="<c:url value="/assets/user/img/${ item.img }"/>" alt=""></a>
								<div class="caption cntr">
									<p>${ item.name }</p>
									<p>
										<strong> <fmt:formatNumber type="number"
												groupingUsed="true" value="${ item.price }" /> ₫
										</strong>
									</p>
									<h4>
										<a class="shopBtn" href="#" title="add to cart"> Add to
											cart </a>
									</h4>
									<div class="actionList">
										<a class="pull-left" href="#">Add to Wish List </a> <a
											class="pull-left" href="#"> Add to Compare </a>
									</div>
									<br class="clr">
								</div>
							</div>
						</li>

						<c:if
							test="${ (loop.index + 1) % 3 == 0 || (loop.index + 1)  == productsPaginate.size() }">
				</ul>
			</div>
			<c:if test="${ (loop.index + 1) < productsPaginate.size() }">
				<div class="row-fluid">
					<ul class="thumbnails">
			</c:if>
		</c:if>

		</c:forEach>

		</c:if>

	</div>
	<div class="pagination">
	
		<c:forEach var="item" begin="1" end="${ paginateInfo.totalPage }" varStatus="loop">
			<c:if test="${ (loop.index) == paginateInfo.currentPage }">
				<c:if test="${ (loop.index - 1 ) >= 1 }">
					<a href="<c:url value="/san-pham/${ idCategory }/${ loop.index -1}"/>">&laquo;</a>
				</c:if>
				<c:if test="${ (loop.index - 1 ) < 1 }">
				 	<a href="<c:url value="/san-pham/${ idCategory }/${ loop.index }"/>">&laquo;</a>
				</c:if>
			</c:if>
		</c:forEach>
		
			
		<c:forEach var="item" begin="1" end="${ paginateInfo.totalPage }" varStatus="loop">
			<c:if test="${ (loop.index) == paginateInfo.currentPage  }">
				<a href="<c:url value="/san-pham/${ idCategory }/${ loop.index }"/>" class="active">${ loop.index }</a>
			</c:if>
			<c:if test="${ (loop.index) != paginateInfo.currentPage }">
				<a href="<c:url value="/san-pham/${ idCategory }/${ loop.index }"/>">${ loop.index }</a>
			</c:if>
		</c:forEach>
		
		<c:forEach var="item" begin="1" end="${ paginateInfo.totalPage }" varStatus="loop">
			<c:if test="${ (loop.index) == paginateInfo.currentPage }">
				<c:if test="${ (loop.index + 1 ) > paginateInfo.totalPage }">
				 	<a href="<c:url value="/san-pham/${ idCategory }/${ loop.index }"/>">&raquo;</a>
				</c:if>
				<c:if test="${ (loop.index + 1 ) <= paginateInfo.totalPage}">
				 	<a href="<c:url value="/san-pham/${ idCategory }/${ loop.index + 1 }"/>">&raquo;</a>
				</c:if>
			</c:if>
		</c:forEach>
		
	</div>
</body>
</html>