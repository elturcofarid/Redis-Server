package co.gov.icfes.redis.general;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
@EnableAutoConfiguration
public class RedisServerApplication {

	
	
	public static void main(String[] args) {
		SpringApplication.run(RedisServerApplication.class, args);
	}
	


}
