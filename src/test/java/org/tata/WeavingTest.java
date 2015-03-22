package org.tata;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test(groups = { "unit" })
@ContextHierarchy({ @ContextConfiguration(classes = WeavingTestConfig.class) })
public class WeavingTest extends AbstractTestNGSpringContextTests {

	private final static Logger LOGGER = LoggerFactory.getLogger(WeavingTest.class);

	public void test1() {

		final ConfigurableBean configurableBean = new ConfigurableBean();
		Assert.assertNotNull(configurableBean.springBean, "bean not correctly injected");
		final String msg = "beanToWeave.beanToInject.message : " + configurableBean.springBean.message;
		LOGGER.debug(msg);
		//System.out.println(msg);
	}

}
