package bars.login.client.mark.f.v.macandile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("bars.login.client.mark.f.v.macandile")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

