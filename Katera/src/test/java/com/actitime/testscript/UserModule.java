package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class UserModule {
public static void main(String[] args) {
	System.out.println("Hi");
}
@Test
public void addUser() {
Reporter.log("hello",true);	
}
}
