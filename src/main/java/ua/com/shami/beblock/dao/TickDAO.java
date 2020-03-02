package ua.com.shami.beblock.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ua.com.shami.beblock.model.TickEntity;

@Repository
public interface TickDAO extends CrudRepository<TickEntity, Long> {
}
