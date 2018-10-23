package com.testng;

import org.testng.annotations.Test;

public class TestNGfeatures {
@Test
public void logintest(){
	System.out.println("login test");
	int i=9/0;
}
@Test(dependsOnMethods="logintest")
public void homepagetest(){
	System.out.println("home test");
	
}
@Test(dependsOnMethods="logintest")
public void regpagetest(){
	System.out.println("registration page test");
	
}

//invocation count-we can execute same test case multiple times using this keyword
@Test(invocationCount=10)
public void sum(){
	int a =10;
	int b=20;
	int c=a+b;
	System.out.println("sum is"+c);
}


}
