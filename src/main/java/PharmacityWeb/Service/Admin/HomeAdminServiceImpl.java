package PharmacityWeb.Service.Admin;

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
public class HomeAdminServiceImpl implements IHomeAdminService{
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

	public int addItemMenus(String name) {
		return menusDao.addItemMenus(name);
	}

	public int deleteMenu(int menuId) {
		return menusDao.deleteMenu(menuId);
	}
	
	public int editMenu(int menuId, String name) {
		return menusDao.editMenu(menuId,name);
	}
	
}
