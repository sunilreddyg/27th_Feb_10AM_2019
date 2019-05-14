package framework_junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BeforeMethod_And_AfterMethod {

	@Before
	public void setUp() throws Exception 
	{
		System.out.println("preconditon");
	}

	@After
	public void tearDown() throws Exception 
	{
		System.out.println("post-condition"+"\n");
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
