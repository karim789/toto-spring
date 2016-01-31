package org.toto;

import javax.ejb.Stateful;
import javax.ejb.Stateless;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.toto.service.ITruc;
import org.toto.service.Pouet;
import org.toto.service.Truc;

@Configuration
@ComponentScan(
		basePackages = { "org.toto.dao",
						 "org.toto.service"}, 
		includeFilters = {
				@Filter(type = FilterType.ANNOTATION, 
						value = { Stateless.class,Stateful.class })
					}
		)
public class AppTestConfig {

	@Bean
	public Pouet pouet() {
		return new Pouet();
	}
	
	@Bean
	public Tagada tagada() {
		return new Tagada();		
	}
	
	@Bean
	public Bidule bidule() {
		return null;
	}
	
	@Bean
	public ITruc truc() {
		return new Truc();
	}
	
	
	/*
	 * @Bean public ADao getADao() { return new ADaoImpl(); }
	 */
	/*@Bean
	@Autowired
	public AService getAService(ADao aDao) {
		AServiceImpl aService = new AServiceImpl();
		// aService.setaDao(aDao);
		return aService;
	}*/

}
