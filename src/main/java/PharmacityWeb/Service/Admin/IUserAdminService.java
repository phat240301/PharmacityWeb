package PharmacityWeb.Service.Admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import PharmacityWeb.Entity.Menus;
import PharmacityWeb.Entity.Users;

@Service
public interface IUserAdminService {
	
	@Autowired
	public List<Users> getDataUser();
	
}
