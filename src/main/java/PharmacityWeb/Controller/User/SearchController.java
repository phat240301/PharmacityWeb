package PharmacityWeb.Controller.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import PharmacityWeb.Dto.ProductsDto;
import PharmacityWeb.Service.User.IProductService;

@Controller
public class SearchController {
    @Autowired
    private IProductService productService;

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    @ResponseBody
    public String search(@RequestParam(required=false, name="query") String query) {
        List<ProductsDto> products = productService.searchByKeyword(query);

        String result = "";
        for (ProductsDto product : products) {
            result += "<div><a href='/PharmacityWeb/chi-tiet-san-pham/"+product.getId_product()+"'>"+ product.getName() + "</a></div>";
        }
        if (result.equals("")) {
//            result = "<div>No result found</div>";
        }
        return result;
    }
}

