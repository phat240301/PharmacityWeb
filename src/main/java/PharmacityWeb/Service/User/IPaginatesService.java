package PharmacityWeb.Service.User;

import org.springframework.stereotype.Service;

import PharmacityWeb.Dto.PaginatesDto;

@Service
public interface IPaginatesService {
	public PaginatesDto getInfoPaginates(int totalData, int limit, int currentPage );
}
