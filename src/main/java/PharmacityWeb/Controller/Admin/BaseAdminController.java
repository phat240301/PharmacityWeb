package PharmacityWeb.Controller.Admin;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import PharmacityWeb.Service.Admin.HomeAdminServiceImpl;
import PharmacityWeb.Service.User.HomeServiceImpl;

@Controller
public class BaseAdminController {
	@Autowired
	HomeAdminServiceImpl _HomeService;
	public ModelAndView _mvShare = new ModelAndView();
}
