package ua.com.shami.beblock.providers.coinbase.converter;

import com.missd.gdaxjavawebsocketclient.message.channels.Ticker;
import org.springframework.stereotype.Component;
import ua.com.shami.beblock.model.ProductIdEntity;
import ua.com.shami.beblock.model.TickEntity;
import ua.com.shami.beblock.providers.enums.Providers;

@Component
public class CoinbaseConverter {
	public TickEntity convertToTickEntity(Ticker ticker) {
		return TickEntity.builder()
				.productIdEntity(convertToProductIdEntity(ticker.getProductId()))
				.bestAsk(ticker.getBest_ask())
				.bestBid(ticker.getBest_bid())
				.price(ticker.getPrice())
				.time(ticker.getTime())
				.build();
	}

	public ProductIdEntity convertToProductIdEntity(String productId) {
		return ProductIdEntity.builder()
			.id(productId)
			.source(Providers.COINBASE)
			.build();
	}
}
