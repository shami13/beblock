package ua.com.shami.beblock.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ua.com.shami.beblock.dao.ProductIdDAO;
import ua.com.shami.beblock.model.ProductIdEntity;

@Service
@RequiredArgsConstructor
public class ProductIdService {
	private final ProductIdDAO productIdDAO;

	public void saveIfNotExist(ProductIdEntity productIdEntity) {
		if (!productIdDAO.existsById(productIdEntity.getId())) {
			productIdDAO.save(productIdEntity);
		}
	}
}
