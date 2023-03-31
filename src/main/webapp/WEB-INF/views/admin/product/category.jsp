<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="add-items d-flex">
	<input type="text" class="form-control todo-list-input"
		placeholder="enter task..">
	<button class="add btn btn-primary todo-list-add-btn">Add</button>
</div>
<div class="list-wrapper">
	<ul
		class="d-flex flex-column-reverse text-white todo-list todo-list-custom">
		<c:forEach var="item" items="${ categorys }" varStatus="index">
			<li>
				<div class="form-check form-check-primary">
					<label class="form-check-label"> <input class="checkbox"
						type="checkbox"> ${ item.name }
					</label>
				</div> <i class="remove mdi mdi-close-box"></i>
			</li>
		</c:forEach>
	</ul>
</div>


