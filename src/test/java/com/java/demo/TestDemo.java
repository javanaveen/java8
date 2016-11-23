package test.java.com.java.demo;

import org.junit.Assert;
import org.junit.Test;

import main.java.com.java.demo.Demo;
import main.java.com.java.demo.FunctionalDemo;
import main.java.com.java.demo.TimeDemo;

public class TestDemo {
	
	@Test
	public void testDemo() {
		Demo d = new Demo();
		
		Assert.assertEquals("Hello World!", d.hello());
	}
	
	@Test
	public void functionalDemo() {
		FunctionalDemo fd = new FunctionalDemo();
		//Just invoking the demo not actually testing anything
		fd.demo();
		Assert.assertTrue(true);
	}
	
	@Test
	public void timeDemo() {
		TimeDemo td = new TimeDemo();
		//Just invoking the demo not actually testing anything
		td.demo();
		Assert.assertTrue(true);
	}
}
