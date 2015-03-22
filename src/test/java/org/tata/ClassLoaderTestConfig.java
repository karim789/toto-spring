package org.tata;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
/*@EnableLoadTimeWeaving*/
/*@EnableSpringConfigured*/
public class ClassLoaderTestConfig {


	
	@Bean
	SpringBean beanToInject(){
		return new SpringBean();
	}

}
