<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<thead>
	<tr>
		<th>
			<div class="form-check form-check-muted m-0">
				<label class="form-check-label"> <input type="checkbox"
					class="form-check-input">
				</label>
			</div>
		</th>
		<th>id_product</th>
		<th>id_category</th>
		<th>name</th>
		<th>name_color</th>
		<th>price</th>
		<th>sale</th>
		<th>created_at</th>
		<th>updated_at</th>
	</tr>
</thead>
<tbody>

	<c:forEach var="item" items="${ products}" varStatus="loop">
		<tr>
			<td>
				<div class="form-check form-check-muted m-0">
					<label class="form-check-label"> <input type="checkbox"
						class="form-check-input">
					</label>
				</div>
			</td>
			<td><img src="<c:url value="/assets/user/img/${ item.img }"/>"
				alt="image" /> <span class="pl-2">${ item.id_product }</span></td>
			<td>${ item.id_category }</td>
			<td>${ item.name }</td>
			<td>${ item.name_color }</td>
			<td>${ item.price }</td>
			<td>${ item.sale }</td>
			<td>${ item.created_at }</td>
			<td>${ item.updated_at }</td>
			<!-- <td>
			<div class="badge badge-outline-success">Còn</div>
		</td> -->
		</tr>
	</c:forEach>

</tbody>
