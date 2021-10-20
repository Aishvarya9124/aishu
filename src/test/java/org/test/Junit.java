package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Junit extends Maven{
	public Junit() {
		PageFactory.initElements(driver, this);	
		}
	
	@FindBy(name="username")
	private WebElement textusername;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="login")
	private WebElement blogin;
	
	@FindBy (name="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotels;
	
	@FindBy(id="room_type")	
	private WebElement room;
	
	@FindBy(id="room_nos")
	private WebElement noofrooms;
	
	@FindBy(id="datepick_in")
	private WebElement datein;
	
	@FindBy(id="datepick_out")
	private WebElement dateout;
	
	@FindBy(id="adult_room")
	private WebElement personroom;
	
	@FindBy(name="Submit")
	private WebElement submit;
	
	@FindBy(name="radiobutton_0")
	private WebElement button;
	
	@FindBy(id="continue")
	private WebElement continues;
	
	@FindBy(id="first_name")
	private WebElement name;
	
	@FindBy(id="last_name")
	private WebElement last;
	
	@FindBy(id="address")
	private WebElement addresses;
	
	@FindBy(id="cc_num")
	private WebElement num;
	
	@FindBy(id="cc_type")
	private WebElement type;

	@FindBy(id="cc_exp_month")
	private WebElement expmnth;

	@FindBy(id="cc_exp_year")
	private WebElement expyear;

	@FindBy(name="cc_cvv")
	private WebElement ccv;

	@FindBy(id="book_now")
	private WebElement book;

	@FindBy(id="order_no")
	private WebElement no;

	public WebElement getTextusername() {
		return textusername;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getBlogin() {
		return blogin;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getNoofrooms() {
		return noofrooms;
	}

	public WebElement getDatein() {
		return datein;
	}

	public WebElement getDateout() {
		return dateout;
	}

	public WebElement getPersonroom() {
		return personroom;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getButton() {
		return button;
	}

	public WebElement getContinues() {
		return continues;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getLast() {
		return last;
	}

	public WebElement getAddresses() {
		return addresses;
	}

	public WebElement getNum() {
		return num;
	}

	public WebElement getType() {
		return type;
	}

	public WebElement getExpmnth() {
		return expmnth;
	}

	public WebElement getExpyear() {
		return expyear;
	}

	public WebElement getCcv() {
		return ccv;
	}

	public WebElement getBook() {
		return book;
	}

	public WebElement getNo() {
		return no;
	}
	
	}

