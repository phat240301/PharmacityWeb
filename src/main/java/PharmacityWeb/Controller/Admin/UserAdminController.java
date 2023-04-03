package PharmacityWeb.Controller.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import PharmacityWeb.Service.Admin.IUserAdminService;
import PharmacityWeb.Service.User.IProductService;

@Controller
public class UserAdminController extends BaseAdminController{
	@Autowired
	private IUserAdminService _userAdminService;
//	@Autowired
//	private IProductService _productService;
	
	@RequestMapping(value = "/quan-tri/user")
	public ModelAndView Index() {
		_mvShare.addObject("users", _userAdminService.getDataUser());
		_mvShare.setViewName("admin/user/user");
		return _mvShare;
	}
}
