<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<form id="add-menu-form" action="<c:url value="/quan-tri/add"/>" method="post">
    <div class="form-group">
        <label for="name">Tên menu:</label>
        <input type="text" class="form-control" id="name" name="name">
    </div>
    <button type="submit" class="btn btn-primary">Thêm mới</button>
</form>
<div class="list-wrapper">
	<ul>
  <c:forEach var="item" items="${menus}" varStatus="index">
    <li>
      <div class="form-check form-check-primary">
        <label class="form-check-label">${item.name}</label>
      </div>
      <button class="btn-delete" data-menu-id="${item.id}">
      	<a href="<c:url value="/quan-tri/delete/${ item.id }"/>"> Xóa</a>
      </button>
    </li>
  </c:forEach>
</ul>
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