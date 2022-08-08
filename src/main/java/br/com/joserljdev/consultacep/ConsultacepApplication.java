package br.com.joserljdev.consultacep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ConsultacepApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsultacepApplication.class, args);
	}
}