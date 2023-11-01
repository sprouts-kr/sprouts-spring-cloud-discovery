package kr.sprouts.framework.service.discovery;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.time.ZoneId;
import java.util.TimeZone;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryApplication {
	@PostConstruct
	protected void initialize() {
		TimeZone.setDefault(TimeZone.getTimeZone(ZoneId.of("Asia/Seoul")));
	}

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryApplication.class, args);
	}
}
