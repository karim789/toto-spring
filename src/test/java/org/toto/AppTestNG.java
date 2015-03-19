package org.toto;

import static org.junit.Assert.assertNotNull;

import javax.ejb.EJB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;
import org.toto.service.AService;
import org.toto.service.IPouet;
import org.toto.service.ITruc;

/**
 * Unit test for simple App.
 */
@Test(groups = { "unit" })
@ContextHierarchy({ @ContextConfiguration(classes = AppTestConfig.class) })
@Lazy
public class AppTestNG extends AbstractTestNGSpringContextTests {

	@EJB
	@Lazy
	AService aservice;
	
	@Autowired
	@Lazy
	IPouet pouet;
	
	@Autowired
	ITruc truc;

	@Test
	public void toto() {
		assertNotNull(aservice);
		aservice.doToto();
		
		System.out.println("pouet.nada() :"+ pouet.nada());
		
		truc.muche();
		
	}
}
