package PharmacityWeb.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import PharmacityWeb.Dto.ProductsDto;
import PharmacityWeb.Entity.Categorys;
import PharmacityWeb.Entity.Menus;
import PharmacityWeb.Entity.Slides;

@Service
public interface IHomeService {
	@Autowired
	public List<Slides> getDataSlide();
	
	public List<Categorys> getDataCategorys();
	
	public List<Menus> getDataMenus();
	
	public List<ProductsDto> getDataProducts();
	
}
