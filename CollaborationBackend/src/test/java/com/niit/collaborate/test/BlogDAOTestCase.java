package com.niit.collaborate.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class BlogDAOTestCase
{
	@BeforeClass
	public static void initalize()
	{
		AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext ();
		annotationConfigApplicationContext.scan("com.niit.collaborate");
		annotationConfigApplicationContext.refresh();
		
	}

	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}

}
