package org.tata;

import org.dellroad.stuff.spring.ThreadLocalContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;

@Configuration
/*@EnableLoadTimeWeaving*/
@EnableSpringConfigured
public class ThreadConfigurableTestConfig {

	@Bean
	ThreadLocalContext threadLocalContext(){
		return ThreadLocalContext.getInstance();
	}
	
	@Bean
	SpringBean beanToInject(){
		return new SpringBean();
	}

}
