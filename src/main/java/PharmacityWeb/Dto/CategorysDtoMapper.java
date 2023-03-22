package PharmacityWeb.Dto;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CategorysDtoMapper implements RowMapper<CategorysDto> {

	public CategorysDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		CategorysDto categorys = new CategorysDto();
		categorys.setId_menu(rs.getInt("id_menu"));
		categorys.setId_category(rs.getInt("id_category"));
		categorys.setName(rs.getString("name"));
		return categorys;
	}

}