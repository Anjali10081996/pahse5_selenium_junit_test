package com.dell.webapp.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JunitStandardMethodTest {
	@Before
	public void setup()
	{
		System.out.println("---BeforeAll");
	}
	@Before
	public void setup()
	{
		System.out.println("---Before");
	}
	@After
	public void after() {
		System.out.println("---After");
	}
	
	@Test
	public void testOne() {
		System.out.println("---Test one is complete");
	}
	
	@Test
	public void testTwo() {
		System.out.println("---Test two is complete");
	}
	
	@Test
	public void testThree() {
		System.out.println("---Test three is complete");
	}
}
