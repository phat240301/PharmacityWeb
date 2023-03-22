package PharmacityWeb.Controller.User;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import PharmacityWeb.Dto.ProductsDto;
import PharmacityWeb.Service.User.ICategoryService;
import PharmacityWeb.Service.User.IProductService;

@Controller
public class HomeController extends BaseController{
	@Autowired
	private ICategoryService _categoryService;
	
	@Autowired
	private IProductService _productService;
	
	@RequestMapping(value = {"/", "/trang-chu/"})
	public ModelAndView Index() {
		_mvShare.addObject("slides", _HomeService.getDataSlide());
		_mvShare.addObject("categoryByIDMenu",_categoryService.GetCategoryByIDMenu(1));
		_mvShare.addObject("products", _HomeService.getDataProducts());
		_mvShare.setViewName("user/index");
		return _mvShare;
	}
	
	@RequestMapping(value = {"/trang-chu/{id}"})
	public ModelAndView Index(@PathVariable int id) {
		_mvShare.setViewName("user/products/product");
		_mvShare.addObject("slides",_HomeService.getDataSlide());
		_mvShare.addObject("products", _HomeService.getDataProducts());
		_mvShare.addObject("categoryByIDMenu",_categoryService.GetCategoryByIDMenu(id));
		_mvShare.setViewName("user/index");
		return _mvShare;
	}
}
