package PharmacityWeb.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import PharmacityWeb.Entity.Users;
import PharmacityWeb.Entity.MapperMenus;
import PharmacityWeb.Entity.MapperSliders;
import PharmacityWeb.Entity.MapperUsers;
import PharmacityWeb.Entity.Menus;
import PharmacityWeb.Entity.Slides;

@Repository
public class UsersDao extends BaseDao{
	public int AddAccount(Users user) {
		StringBuffer sql = new StringBuffer();
		sql.append("INSERT ");
		sql.append("INTO users ");
		sql.append("( ");
		sql.append("    user, ");
		sql.append("    password, ");
		sql.append("    display_name, ");
		sql.append("    address ");
		sql.append(") ");
		sql.append("VALUES ");
		sql.append("( ");
		sql.append("    '"+user.getUser()+"', ");
		sql.append("    '"+user.getPassword()+"', ");
		sql.append("    '"+user.getDisplay_name()+"', ");
		sql.append("    '"+user.getAddress()+"' ");
		sql.append(")");
		
		int insert = _jdbcTemplate.update(sql.toString());
		return insert;
	};
	public Users GetUserByAcc(Users user) {
		String sql = "SELECT * FROM users WHERE user='"+user.getUser()+"'";
		Users result = _jdbcTemplate.queryForObject(sql, new MapperUsers());
		return result;
	};
	
	public List<Users> getDataUser(){
		List<Users> list = new ArrayList<Users>();
		String sql = "SELECT * FROM users ";
		list = _jdbcTemplate.query(sql, new MapperUsers());
		return list;
	}	
}
