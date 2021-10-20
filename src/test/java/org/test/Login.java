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
		launchUrl("http://adactinhotelapp.com/");
		Login l = new Login();
		filltextbox(l.getTextusername(), "aishuvaryau");
		filltextbox(l.getPassword(), "aishvarya");
		btnClick(l.getBlogin());
		btnClick(l.getLocation());
		dropdowm(4);
		btnClick(l.getHotels());
		dropdowm(0);
		btnClick(l.getRoom());
		dropdowm(4);
		btnClick(l.getNoofrooms());
		dropdowm(4);
		btnClick(l.getDatein());
		dropdowm(4);
		btnClick(l.getDateout());
		dropdowm(4);
		btnClick(l.getPersonroom());
		dropdowm(4);
		btnClick(l.getSubmit());
		btnClick(l.getButton());
		btnClick(l.getContinues());
		// dropdowm(4);
		filltextbox(l.getName(), "aishuus");
		// dropdowm(4);
		filltextbox(l.getLast(), "6789");
		// dropdowm(4);
		filltextbox(l.getAddresses(), "jjnagar");
		// dropdowm(4);
		filltextbox(l.getNum(), "1234567890912345");
		btnClick(l.getType());
		dropdowm(4);
		btnClick(l.getExpmnth());
		dropdowm(10);
		btnClick(l.getExpyear());
		dropdowm(11);
		filltextbox(l.getCcv(), "897");
		// dropdowm(4);
		btnClick(l.getBook());
		// dropdowm(4);
		// btnClick(l.gets);
		System.out.println(getAttribute(l.getNo()));
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
