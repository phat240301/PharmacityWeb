package PharmacityWeb.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


public class MapperCategorys implements RowMapper<Categorys> {
	
	public Categorys mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Categorys category = new Categorys();
		category.setId(rs.getInt("id"));
		category.setName(rs.getString("name"));
		category.setDescription(rs.getString("description"));
		category.setId_menu(rs.getInt("id_menu"));
		return category;
	}
}
