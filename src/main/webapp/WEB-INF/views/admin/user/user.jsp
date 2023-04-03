<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="/WEB-INF/views/layouts/admin/taglib.jsp"%>
<!-- partial -->
<div class="main-panel">
	<div class="content-wrapper">
		<div class="row ">
			<div class="col-12 grid-margin">
				<div class="card">
					<div class="card-body">
						<h4 class="card-title">Users</h4>
						<div class="table-responsive">
							<table class="table">
								<thead>
									<tr>
										<th>
											<div class="form-check form-check-muted m-0">
												<label class="form-check-label"> <input
													type="checkbox" class="form-check-input">
												</label>
											</div>
										</th>
										<th>id</th>
										<th>user</th>
										<th>password</th>
										<th>display_name</th>
										<th>address</th>
										<th>permission</th>
									</tr>
								</thead>
								<tbody>

									<c:forEach var="item" items="${ users}" varStatus="loop">
										<tr>
											<td>
												<div class="form-check form-check-muted m-0">
													<label class="form-check-label"> <input
														type="checkbox" class="form-check-input">
													</label>
												</div>
											</td>

											<td>${ item.id}</td>
											<td>${ item.user }</td>
											<td>${ item.password }</td>
											<td>${ item.display_name }</td>
											<td>${ item.address }</td>

											<td>
			<div class="badge badge-outline-success">Active</div>
		</td>
										</tr>
									</c:forEach>

								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>

	</div>
	<!-- content-wrapper ends -->
	<!-- partial:partials/_footer.html -->

	<!-- partial -->
</div>