package PharmacityWeb.Service.User;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import PharmacityWeb.Dto.CartDto;
import PharmacityWeb.Entity.Bills;

@Service
public interface IBillsService {
	public int AddBills(Bills bill);
	
	public void AddbillsDetail(HashMap<Long, CartDto> carts);
}