package main.java.com.java.demo;

public class Demo {
	public static void main(String[] args) {
		System.out.println("Hello World! Here is a demo of Java 8 new features");
		
		TimeDemo td = new TimeDemo();
		td.demo();
		
		FunctionalDemo fd = new FunctionalDemo();
		fd.demo();
	}
	
	public String hello() {
		return "Hello World!";
	}
}
