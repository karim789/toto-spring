package org.tata;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableLoadTimeWeaving;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;

@Configuration
/*@EnableLoadTimeWeaving*/
@EnableSpringConfigured
public class WeavingTestConfig {

	@Bean
	BeanToInject beanToInject(){
		return new BeanToInject();
	}

}
