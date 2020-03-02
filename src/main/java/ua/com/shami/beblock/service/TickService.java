package ua.com.shami.beblock.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ua.com.shami.beblock.dao.TickDAO;
import ua.com.shami.beblock.model.TickEntity;

@Service
@RequiredArgsConstructor
public class TickService {
	private final TickDAO tickDAO;
	private final ProductIdService productIdService;

	public void save(TickEntity tickEntity) {
		productIdService.saveIfNotExist(tickEntity.getProductIdEntity());
		tickDAO.save(tickEntity);
	}
}
