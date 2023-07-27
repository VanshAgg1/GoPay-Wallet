package in.team2.boot.RewardMs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RewardMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RewardMsApplication.class, args);
	}

}
