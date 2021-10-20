package org.test;

import org.openqa.selenium.WebElement;

public class BaseClass extends Maven {
	public static void main(String[] args) {
		
		launchBr("chrome");
		launchUrl("https:www.facebook.com/");
		WebElement user=findElement("id", "email");
		filltextbox(user, "aishu");
	
		WebElement pass=findElement("id", "pass");
		filltextbox(pass, "0987");
		
		WebElement btnlogin=findElement("name", "login");
		btnClick(btnlogin);
		
	}

}
