package PharmacityWeb.Dao;

import java.awt.Menu;
import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Repository;

import PharmacityWeb.Entity.Menus;
import PharmacityWeb.Entity.Bills;
import PharmacityWeb.Entity.MapperMenus;
@Repository
public class MenusDao extends BaseDao {
	
	public List<Menus> getDataMenus() {
		List<Menus> list = new ArrayList<Menus>();
		String sql = "SELECT * FROM menus";
		list = _jdbcTemplate.query(sql, new MapperMenus());
		return list;
	}

	public int addItemMenus(String name) {
	    String sql = "INSERT INTO menus (name) VALUES (?)";
	    int rowsAffected = 0;
	    try {
	        rowsAffected = _jdbcTemplate.update(sql, name);
	    } catch (Exception ex) {
	        ex.printStackTrace();
	    }
	    return rowsAffected;
	}
	
	public int deleteMenu(int menuId) {
	    String sql = "DELETE FROM menus WHERE id = ?";
	    int rowsAffected = 0;
	    try {
	        rowsAffected = _jdbcTemplate.update(sql, menuId);
	    } catch (Exception ex) {
	        ex.printStackTrace();
	    }
	    return rowsAffected;
	}
	
	public int editMenu(int menuId, String name) {
	    String sql = "UPDATE menus SET name = ? WHERE id = ?";
	    int rowsAffected = 0;
	    try {
	        rowsAffected = _jdbcTemplate.update(sql, name, menuId);
	    } catch (Exception ex) {
	        ex.printStackTrace();
	    }
	    return rowsAffected;
	}
}