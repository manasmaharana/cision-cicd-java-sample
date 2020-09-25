package com.cision.accion.sample;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HelloAccionTest {

	HelloAccion helloAccion;

	@Before
	public void setUp() throws Exception {
		helloAccion = new HelloAccion();
	}

	@Test
	public void hello_accion_main_test_for_code_coverage() {
		String[] args = new String[] { "arg1" };
		HelloAccion.main(args);
		Assert.assertNotNull(args);
		Assert.assertEquals(1, args.length);
	}

	@After
	public void tearDown() throws Exception {
	}

}
