package org.tata;

import org.dellroad.stuff.spring.ThreadConfigurable;
import org.springframework.beans.factory.annotation.Autowired;

@ThreadConfigurable
public class ThreadConfigurableBean {

	@Autowired
	SpringBean springBean;



}
