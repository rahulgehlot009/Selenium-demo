package com.testng;

import org.testng.annotations.Test;

public class exceptiontimeouttest {
@Test(invocationTimeOut=2000,expectedExceptions=NumberFormatException.class)
public void infinitelooptest(){
	int i=1;
	while(i==1){
		System.out.println(i);
	}
}
@Test(expectedExceptions=NumberFormatException.class)
public void test1(){
	String x="100A";
	Integer.parseInt(x);
	}
}
