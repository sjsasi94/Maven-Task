package org.junit;

public class Junit1 {

	@BeforeClass
 public static void beforeClass() {
		System.out.println("Before class");

}
	@AfterClass
	public static void afterClass() {
System.out.println("Afterclass");

	}
	
	@Before
	
	public void before() {
		System.out.println("before");
		

	}
	
	@After
	public void after() {
		System.out.println("after");

	}
	
	@Test
	public void test2() {
	 System.out.println("test2");

	}
	
	@Test
	public void test1() {
		System.out.println("test1");

	}
	
	
	
}
