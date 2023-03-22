<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<body>
	<form action="#" class="navbar-search pull-left">
		<input type="text" id="search_box" placeholder="Tìm sản phẩm .." class="search-query span2">
		 <div id="search_suggestion"></div>
		 <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
	    <script>
	        $(document).ready(function(){
	            $('#search_box').keyup(function(){
	                var query = $(this).val();
	                if(query != ''){
	                    $.ajax({
	                        url:"search",
	                        method:"GET",
	                        data:{query:query},
	                        success:function(data){
	                            $('#search_suggestion').fadeIn();
	                            $('#search_suggestion').html(data);
	                        }
	                    });
	                }else{
	                	$.ajax({
	                        url:"search",
	                        method:"GET",
	                        data:{query:null},
	                        success:function(data){
	                            $('#search_suggestion').fadeIn();
	                            $('#search_suggestion').html(data);
	                        }
	                    });
	                }
	            });
	        });
	    </script>
	</form>
</body>

