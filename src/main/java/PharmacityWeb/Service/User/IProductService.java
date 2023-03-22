package PharmacityWeb.Service.User;

import java.util.List;

import org.springframework.stereotype.Service;

import PharmacityWeb.Dao.ProductsDao;
import PharmacityWeb.Dto.ProductsDto;

@Service
public interface IProductService {
	
	public ProductsDto GetProductByID(long id);
	
	public List<ProductsDto> GetProductByIDCategory(int id);
	
	public List<ProductsDto> searchByKeyword(String keyword);

}
