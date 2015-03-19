package org.tata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

@Configurable
public class BeanToWeave {

	@Autowired
	BeanToInject beanToInject;



}
