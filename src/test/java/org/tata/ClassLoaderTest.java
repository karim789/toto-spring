package org.tata;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@Test(groups = { "unit" })
@ContextHierarchy({ @ContextConfiguration(classes = {ClassLoaderTestConfig.class}) })
public class ClassLoaderTest extends AbstractTestNGSpringContextTests {

	private final static Logger LOGGER = LoggerFactory.getLogger(ClassLoaderTest.class);

	public void test1() {

		final ConfigurableBean beanToWeave = new ConfigurableBean();
		/*Assert.assertNotNull(beanToWeave.beanToInject, "bean not correctly injected");
		final String msg = "beanToWeave.beanToInject.message : " + beanToWeave.beanToInject.message;
		LOGGER.debug(msg);*/

	}

}
