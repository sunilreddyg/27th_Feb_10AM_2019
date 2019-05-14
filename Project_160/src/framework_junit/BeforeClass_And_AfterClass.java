package framework_junit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class BeforeClass_And_AfterClass {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		System.out.println("pre-condition");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		System.out.println("Post-condition");
	}

	@Test
	public void test() 
	{
		System.out.println("test executed");
	}
	
	@Test
	public void test1() 
	{
		System.out.println("test1 executed");
	}

	
	@Test
	public void test2() 
	{
		System.out.println("test2 executed");
	}


}
