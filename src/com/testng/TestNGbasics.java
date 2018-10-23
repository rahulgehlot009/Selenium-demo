package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGbasics {
//main method is not applicable in testng
	
	@BeforeSuite
	public void setup(){
		System.out.println("set up system property for chrome");
	}
	@BeforeTest
	public void launchchrome(){
		System.out.println("launch chrome browser");
	}
	@BeforeClass
	public void login(){
		System.out.println("login to app");
		}
	@BeforeMethod
	public void url(){
		System.out.println("enter url");
	}
	@Test
	public void titletest(){
		System.out.println("google title logo");
	}
		@AfterMethod
		public void logout(){
			System.out.println("logout from app");
		}
		@AfterClass
		public void close(){
			System.out.println("close browser");
		}
		@AfterTest
		public void delete(){
			System.out.println("deleteall cookies");
		}
	}

