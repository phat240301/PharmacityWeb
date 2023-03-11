package PharmacityWeb.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import PharmacityWeb.Entity.MapperSliders;
import PharmacityWeb.Entity.Slides;

@Repository
public class SlidesDao extends BaseDao {
	
	public List<Slides> getDataSlide() {
		List<Slides> list = new ArrayList<Slides>();
		String sql = "SELECT * from slide";
		list = _jdbcTemplate.query(sql, new MapperSliders());
		return list;
	}
	
}
