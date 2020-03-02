package ua.com.shami.beblock.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TickDTO {
	private String productId;
	private BigDecimal price;
	private BigDecimal bestBid;
	private BigDecimal bestAsk;
}
