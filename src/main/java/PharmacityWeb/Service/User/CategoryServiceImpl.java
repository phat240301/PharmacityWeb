package PharmacityWeb.Service.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import PharmacityWeb.Dao.CategorysDao;
import PharmacityWeb.Dao.ProductsDao;
import PharmacityWeb.Dto.CategorysDto;
import PharmacityWeb.Dto.ProductsDto;

@Service
public class CategoryServiceImpl implements ICategoryService{

	@Autowired
	private ProductsDao productsDao;
	
	@Autowired
	private CategorysDao categorysDao;
	
	public List<ProductsDto> GetAllProductsByID(int id) {
		return productsDao.GetAllProductsByID(id);
	}
	
	public List<ProductsDto> GetDataProductsPaginate(int id, int start, int totalPage) {
		return productsDao.GetDataProductsPaginate(id, start, totalPage);
	}
	
	public List<ProductsDto> GetProductByIDCategory(int id){
		return productsDao.GetAllProductsByID(id);
	}
//
//	@Override
//	public CategorysDto GetCategoryByID(int id) {
//		List<CategorysDto> listCategorys = categorysDao.GetCatagoryByID(id);
//		return listCategorys.get(0);
//	}

	@Override
	public List<CategorysDto> GetCategoryByIDMenu(int id) {
		return categorysDao.GetAllCatagoryByID(id);
	}

	@Override
	public List<CategorysDto> GetCategoryByName(String name) {
		return categorysDao.GetAllCatagoryByName(name);
	}

//	@Override
//	public List<CategorysDto> GetAllCatagoryByID(int id) {
//		return categorysDao.GetAllCatagoryByID(id);
//	}
}
