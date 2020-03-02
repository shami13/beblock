package ua.com.shami.beblock.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ua.com.shami.beblock.model.ProductIdEntity;

@Repository
public interface ProductIdDAO extends CrudRepository<ProductIdEntity, String> {
}
