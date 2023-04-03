package PharmacityWeb.Service.Admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import PharmacityWeb.Dao.UsersDao;
import PharmacityWeb.Entity.Menus;
import PharmacityWeb.Entity.Users;

@Service
public class UserAdminServiceImpl implements IUserAdminService{
	@Autowired
	UsersDao userDao;
	
	public List<Users> getDataUser(){
		return userDao.getDataUser();
	}
}
