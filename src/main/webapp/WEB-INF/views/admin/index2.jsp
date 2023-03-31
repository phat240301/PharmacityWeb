<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="/WEB-INF/views/layouts/admin/taglib.jsp"%>
<!-- partial -->
<div class="main-panel">
	<div class="content-wrapper">
		<div class="row ">
			 <div class="col-md-12 col-xl-4 grid-margin stretch-card">
                <div class="card">
                  <div class="card-body">
                    <h4 class="card-title">Danh mục</h4>
                     	<%@include file="/WEB-INF/views/admin/product/menu.jsp"%>
                  </div>
                </div>
              </div>
		</div>
		
            
		<div class="row ">
			<div class="col-12 grid-margin">
				<div class="card">
					<div class="card-body">
						<h4 class="card-title">Sản phẩm</h4>
						<div class="table-responsive">
							<table class="table">
								<%@include file="/WEB-INF/views/admin/product/product.jsp"%>				
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