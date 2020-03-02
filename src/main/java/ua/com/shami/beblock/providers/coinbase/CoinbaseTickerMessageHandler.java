package ua.com.shami.beblock.providers.coinbase;

import com.missd.gdaxjavawebsocketclient.message.channels.Ticker;
import com.missd.gdaxjavawebsocketclient.message.handler.GdaxMessageHandler;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import ua.com.shami.beblock.providers.coinbase.converter.CoinbaseConverter;
import ua.com.shami.beblock.service.TickService;

@Slf4j
@Component
@RequiredArgsConstructor
public class CoinbaseTickerMessageHandler implements GdaxMessageHandler<Ticker> {

	private final TickService tickService;
	private final CoinbaseConverter coinbaseTickerConverter;

	@Override
	public void handleMessage(Ticker ticker) {
		log.debug("Coinbase tick: {}", ticker);

		tickService.save(coinbaseTickerConverter.convertToTickEntity(ticker));
	}
}
