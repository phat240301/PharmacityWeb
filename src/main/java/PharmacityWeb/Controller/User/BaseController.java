package PharmacityWeb.Controller.User;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import PharmacityWeb.Service.User.HomeServiceImpl;
@Controller
public class BaseController {
	@Autowired
	HomeServiceImpl _HomeService;
	public ModelAndView _mvShare = new ModelAndView();
	
	@PostConstruct
	public ModelAndView init() {
		_mvShare.addObject("menus", _HomeService.getDataMenus());
		return _mvShare;
	}
}