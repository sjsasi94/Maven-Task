package org.hotel;

import org.baseclass.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotels extends Base {
public SearchHotels() {
	PageFactory.initElements(driver, this);	
}
@FindBy(id="location")
private WebElement location;
@FindBy(id="hotels")
private WebElement hotels;
@FindBy(id="room_type")
private WebElement roomType;
@FindBy(id="room_nos")
private WebElement numOfRooms;
@FindBy(id="datepick_in")
private WebElement checkInDate;
@FindBy(id="datepick_out")
private WebElement checkOutDate;
@FindBy(id="adult_room")
private WebElement adultsPerRoom;
@FindBy(id="child_room")
private WebElement childrenPerRoom;
@FindBy(id="Submit")
private WebElement submit;

public void search() {

}

public void selectLocation(int index) {
	 sbvi(location, index);
}

public void selectHotels(int index) {
	sbvi(hotels, index);
}

public void selectRoomType(int index) {
	sbvi(roomType, index);
}

public void selectNumOfRooms(int index) {
	sbvi(numOfRooms, index);
}

public void setCheckInDate(String date) {
	checkInDate.sendKeys(date);
}

 public void setCheckOutDate(String date) {
	checkInDate.sendKeys(date);
}

public void selectAdultsPerRoom(int index) {
	sbvi(adultsPerRoom, index);}

public void selectChildrenPerRoom(int index) {
	sbvi(childrenPerRoom, index);}

public void submit() {
	 submit.click();
}

}