package ua.com.shami.beblock.providers.coinbase;

import com.missd.gdaxjavawebsocketclient.GdaxWebsocketClientConfigurer;
import com.missd.gdaxjavawebsocketclient.message.MessageType;
import com.missd.gdaxjavawebsocketclient.message.handler.MessageHandlerRegistry;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class GdaxClientConfig implements GdaxWebsocketClientConfigurer {

	private final CoinbaseTickerMessageHandler coinbaseTickerMessageHandler;

	@Override
	public void addMessageHandlers(MessageHandlerRegistry messageHandlerRegistry) {
		messageHandlerRegistry.addMessageHandler(MessageType.ticker, coinbaseTickerMessageHandler);
	}
}
