package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserListPage {
	int count=2000;
@FindBy(className = "buttonText")
private WebElement addUserBtn;
@FindBy(name="firstName")
private WebElement firstNameTbx;
@FindBy(name="lastName")
private WebElement LastNameTbx;
@FindBy(id="userDataLightBox_emailField")
private WebElement emailTbx;
@FindBy(name="username")
private WebElement unTbx;
@FindBy(name="password")
private WebElement pwdTbx;
@FindBy(name="passwordCopy")
private WebElement retypePwdTbx;
@FindBy(id="userDataLightBox_commitBtn")
private WebElement createBtn;
@FindBy(id="userDataLightBox_deleteBtn")
private WebElement deleteBtn;
@FindBy(className = "userNameSpan")
private WebElement createdUserBtn;
public WebElement getCreatedUser() {
	return createdUserBtn;
}
public UserListPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public int getCount() {
	return count;
}
public WebElement getAddUserBtn() {
	return addUserBtn;
}
public WebElement getFirstNameTbx() {
	return firstNameTbx;
}
public WebElement getLastNameTbx() {
	return LastNameTbx;
}
public WebElement getEmailTbx() {
	return emailTbx;
}
public WebElement getUnTbx() {
	return unTbx;
}
public WebElement getPwdTbx() {
	return pwdTbx;
}
public WebElement getRetypePwdTbx() {
	return retypePwdTbx;
}
public WebElement getCreateBtn() {
	return createBtn;
}

public WebElement getDeleteBtn() {
	return deleteBtn;
}
}
