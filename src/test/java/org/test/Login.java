package org.test;

import java.awt.AWTException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Login extends Junit {
	@BeforeClass
	public static void beforeClass() {
		launchBr("chrome");
		maximize();
		implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Before
	public void before() {
		System.out.println("Start time--------" + new Date());
	}

	@Test
	public void test() throws AWTException {
		
	}

	@After
	public void after() {
		System.out.println("End time--------" + new Date());
	}

	@AfterClass
	public static void afterclass() {
		quit();
	}
}
