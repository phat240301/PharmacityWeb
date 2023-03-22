package PharmacityWeb.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import PharmacityWeb.Dto.CategorysDto;
import PharmacityWeb.Dto.CategorysDtoMapper;
import PharmacityWeb.Dto.ProductsDto;
import PharmacityWeb.Dto.ProductsDtoMapper;
import PharmacityWeb.Entity.Categorys;
import PharmacityWeb.Entity.MapperCategorys;


@Repository
public class CategorysDao extends BaseDao{
	
	public List<Categorys> getDataCategory() {
		List<Categorys> list = new ArrayList<Categorys>();
		String sql = "SELECT * FROM categorys ";
		list = _jdbcTemplate.query(sql, new MapperCategorys());
		return list;
	}
	
	public List<Categorys> getDataCategoryByID(int id) {
		List<Categorys> list = new ArrayList<Categorys>();
		String sql = "SELECT * FROM categorys WHERE id_menu = " + id + " ";
		list = _jdbcTemplate.query(sql, new MapperCategorys());
		return list;
	}
	
	private StringBuffer SqlString() {
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT m.id as id_menu, c.id as id_category ,c.name as name FROM menus as m INNER JOIN categorys as c ON m.id = c.id_menu ");
		return sql;
	}
	
	private String SqlCategoryByID(int id) {
		StringBuffer sql = SqlString();
		sql.append("WHERE 1 = 1 ");
		sql.append("AND id_menu = " + id + " ");
		return sql.toString();
	}
	
	private String SqlCategoryByName(String name) {
		StringBuffer sql = SqlString();
		sql.append("WHERE 1 = 1 ");
		sql.append("AND name = '%" + name + "%' ");
		return sql.toString();
	}
	
	public List<CategorysDto> GetAllCatagoryByID(int id) {
		String sql = SqlCategoryByID(id);
		List<CategorysDto> listCategorys= _jdbcTemplate.query(sql, new CategorysDtoMapper());
		return listCategorys;
	}

	public List<CategorysDto> GetAllCatagoryByName(String name) {
		String sql = SqlCategoryByName(name);
		List<CategorysDto> listCategorys= _jdbcTemplate.query(sql, new CategorysDtoMapper());
		return listCategorys;
	}
}
