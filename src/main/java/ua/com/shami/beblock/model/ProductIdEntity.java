package ua.com.shami.beblock.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ua.com.shami.beblock.providers.enums.Providers;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductIdEntity {
	@Id
	private String id;

	private Providers source;
}
