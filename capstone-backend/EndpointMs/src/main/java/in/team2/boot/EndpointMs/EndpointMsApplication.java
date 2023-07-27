package in.team2.boot.EndpointMs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EndpointMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EndpointMsApplication.class, args);
	}

}
