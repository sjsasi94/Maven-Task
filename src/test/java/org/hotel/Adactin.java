package org.hotel;

import java.util.Date;

import org.baseclass.Base;
import org.junit.*;

public class Adactin extends Base {
	@BeforeClass
	public static void beforeClass() {
launchBrowser();
	}
	@Before
	public void before() {
Date d= new Date();
System.out.println("Test Starts..."+d);
	}
	@Test
	public void test1() throws InterruptedException {
		System.out.println("test");
		launchurl("https://adactinhotelapp.com/");
		LoginPage lg=new LoginPage();
		lg.setUserNameAndPassword("abdullathif14", "2364VD");
		lg.login();
		Thread.sleep(3000);
		SearchHotels sh=new SearchHotels();
		sh.selectLocation(2);
		sh.selectHotels(3);
		sh.selectRoomType(3);
		sh.selectNumOfRooms(2);
		sh.selectAdultsPerRoom(2);
		sh.selectChildrenPerRoom(1);
		sh.submit();
	}
	@Ignore
	@Test
	public void test2() {
		System.out.println("test2");
	}
	@After
	public void after() {
		Date d= new Date();
		System.out.println("Test Ends..."+d);
	}
	@AfterClass
	public static void afterclass() {

	}
	

}
