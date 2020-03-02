package ua.com.shami.beblock.providers.coinbase;

import com.missd.gdaxjavawebsocketclient.GdaxWebsocketClient;
import com.missd.gdaxjavawebsocketclient.message.ChannelName;
import com.missd.gdaxjavawebsocketclient.message.Subscription;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

@Component
@RequiredArgsConstructor
@Slf4j
public class EventListenerForSubscribeCoinbaseSocket {

	@Value("${coinbase.products}")
	private String products;

	@Value("${coinbase.seconds.connect}")
	private int secondsForCoinbaseConnection;

	private final GdaxWebsocketClient gdaxWebsocketClient;

	@EventListener
	public void subscribedClient(ContextRefreshedEvent event) throws InterruptedException {
		for (int i = 0; i < secondsForCoinbaseConnection && !gdaxWebsocketClient.isConnected(); i++) {
			sleep(TimeUnit.SECONDS.toMillis(1));
		}
		gdaxWebsocketClient.subscribe(new Subscription()
				.forProductIds(products.split(","))
				.forChannels(ChannelName.ticker)
		);
	}
}
