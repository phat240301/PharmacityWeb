<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/admin/taglib.jsp"%>
<form id="add-menu-form" action="<c:url value="/quan-tri/add"/>"
	method="post">
	<div class="form-group">
		<label for="name">Tên menu:</label> <input type="text"
			class="form-control" id="name" name="name">
	</div>
	<button type="submit" class="btn btn-primary">Thêm mới</button>

</form>
</br>
<div class="list-wrapper">


	<table class="table">
	<thead class="thead-dark">
		<tr>
			<th scope="col">Tên</th>
			<th scope="col">Action</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="item" items="${menus}" varStatus="index">
			<tr>
				<td>
					<form action="/quan-tri/update/${item.id}" method="POST">
						 <input type="hidden" name="_method" value="PUT">
    					<input type="text" name="name" value="${item.name}">
    						<button type="submit">Lưu</button>
					</form>
				</td>
				<td>
					<button class="btn-delete" data-menu-id="${item.id}">
						<a href="<c:url value="/quan-tri/delete/${ item.id }"/>"> Xóa</a>
					</button> |
					<button type="submit" class="edit-menu" id="submitBtn" data-menu-id="${item.id}">
						<a href="<c:url value="/quan-tri/update/${ item.id }/${ item.name }"/>">Sửa</a>
					</button>
				</td>
			</tr>
		</c:forEach>
	</tbody>
</table>

</div>

<script>
	$(document).ready(function() {
		$('#add-menu-form').submit(function(event) {
			// Ngăn chặn gửi form thông thường
			event.preventDefault();

			// Lấy giá trị của input tên menu
			var name = $('#name').val();

			// Gửi request AJAX đến server
			$.ajax({
				url : $(this).attr('action'),
				type : $(this).attr('method'),
				data : {
					name : name
				},
				success : function(data) {
					// Nếu request thành công, cập nhật danh sách menu
					$('#menu-list').html(data);
					$('#name').val(''); // Xóa giá trị input
				},
				error : function(xhr, status, error) {
					// Xử lý lỗi nếu có
					console.log('Error:', error);
				}
			});
		});
	});
	

</script>
