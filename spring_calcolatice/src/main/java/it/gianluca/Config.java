package it.gianluca;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = Calcolatrice.class)
public class Config {

	@Bean
	public Operazione getOperazione() {
		return new Operazione();
	}
}
