package ua.com.shami.beblock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;

@SpringBootApplication
@EnableJpaRepositories
public class BeblockApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeblockApplication.class, args);
	}

}
