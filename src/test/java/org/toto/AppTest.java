package org.toto;

import static org.junit.Assert.assertNotNull;

import javax.ejb.EJB;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.toto.service.AService;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextHierarchy({ @ContextConfiguration(classes = AppTestConfig.class) })
public class AppTest {

	@EJB
	AService aservice;

	@Test
	public void toto() {
		assertNotNull(aservice);
		aservice.doToto();
	}
}
