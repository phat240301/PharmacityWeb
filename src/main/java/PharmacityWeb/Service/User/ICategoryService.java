package PharmacityWeb.Service.User;

import java.util.List;

import org.springframework.stereotype.Service;

import PharmacityWeb.Dto.CategorysDto;
import PharmacityWeb.Dto.ProductsDto;

@Service
public interface ICategoryService {
	
	public List<ProductsDto> GetAllProductsByID(int id);
	
	public List<CategorysDto> GetCategoryByIDMenu(int id);
	
	public List<CategorysDto> GetCategoryByName(String name);
	
}