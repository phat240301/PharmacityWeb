package PharmacityWeb.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import PharmacityWeb.Dao.CategorysDao;
import PharmacityWeb.Dao.MenusDao;
import PharmacityWeb.Dao.ProductsDao;
import PharmacityWeb.Dao.SlidesDao;
import PharmacityWeb.Dto.ProductsDto;
import PharmacityWeb.Entity.Categorys;
import PharmacityWeb.Entity.Menus;
import PharmacityWeb.Entity.Slides;

@Service
public class HomeServiceImpl implements IHomeService {
	@Autowired
	private SlidesDao slideDao;
	@Autowired
	private CategorysDao categorysDao;
	@Autowired
	private MenusDao menusDao;
	@Autowired
	private ProductsDao productsDao;
	
	public List<Slides> getDataSlide() {
		return slideDao.getDataSlide();
	}

	public List<Categorys> getDataCategorys() {
		return categorysDao.getDataCategory();
	}
	
	public List<Menus> getDataMenus() {
		return menusDao.getDataMenus();
	}
	
	public List<ProductsDto> getDataProducts() {
		List<ProductsDto> listProducts = productsDao.GetDataProducts();
		return listProducts;
	}

}
