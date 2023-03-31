package PharmacityWeb.Controller.Admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import PharmacityWeb.Entity.Menus;
import PharmacityWeb.Service.User.ICategoryService;
import PharmacityWeb.Service.User.IProductService;

@Controller
public class HomeAdminController extends BaseAdminController {
	@Autowired
	private ICategoryService _categoryService;

	@Autowired
	private IProductService _productService;

	@RequestMapping(value = "/quan-tri/")
	public ModelAndView Index() {
		_mvShare.addObject("slides", _HomeService.getDataSlide());
		_mvShare.addObject("categorys", _HomeService.getDataCategorys());
		_mvShare.addObject("products", _HomeService.getDataProducts());
		_mvShare.addObject("menus", _HomeService.getDataMenus());
		_mvShare.setViewName("admin/index2");
		return _mvShare;
	}
	
	@RequestMapping(value = "/quan-tri/add")
	public @ResponseBody ModelAndView AddMenu(@RequestParam("name") String name) {
	    int rowsAffected = _HomeService.addItemMenus(name);
	    if(rowsAffected > 0) {
	        // Nếu thêm menu thành công, ta cập nhật lại danh sách menu và trả về kết quả ngay lập tức
	    	_mvShare.addObject("slides", _HomeService.getDataSlide());
			_mvShare.addObject("categorys", _HomeService.getDataCategorys());
			_mvShare.addObject("products", _HomeService.getDataProducts());
	        _mvShare.addObject("menus", _HomeService.getDataMenus());
	        return _mvShare;
	    } else {
	    	_mvShare.addObject("slides", _HomeService.getDataSlide());
			_mvShare.addObject("categorys", _HomeService.getDataCategorys());
			_mvShare.addObject("products", _HomeService.getDataProducts());
	        // Nếu thêm menu không thành công, ta cần hiển thị thông báo lỗi lên màn hình
	        String errorMsg = "Thêm menu không thành công";
	        _mvShare.addObject("errorMsg", errorMsg);
	        return _mvShare;
	    }
	}
	
	@RequestMapping(value = "/quan-tri/delete/{id}", method = RequestMethod.GET)
	public @ResponseBody ModelAndView deleteMenu(@PathVariable int id) {
	    int rowsAffected = _HomeService.deleteMenu(id);
	    if (rowsAffected > 0) {
	    	_mvShare.addObject("slides", _HomeService.getDataSlide());
			_mvShare.addObject("categorys", _HomeService.getDataCategorys());
			_mvShare.addObject("products", _HomeService.getDataProducts());
	        _mvShare.addObject("menus", _HomeService.getDataMenus());
	        return _mvShare;
	    } else {
	    	_mvShare.addObject("slides", _HomeService.getDataSlide());
			_mvShare.addObject("categorys", _HomeService.getDataCategorys());
			_mvShare.addObject("products", _HomeService.getDataProducts());
	        // Nếu thêm menu không thành công, ta cần hiển thị thông báo lỗi lên màn hình
	        String errorMsg = "Xóa menu không thành công";
	        _mvShare.addObject("errorMsg", errorMsg);
	        return _mvShare;
	    }
	}
}
