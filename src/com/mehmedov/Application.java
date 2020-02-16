package com.mehmedov;

import com.mehmedov.exceptions.NotOddException;
import com.mehmedov.exceptions.OutOfTheRangeException;
import com.mehmedov.implementations.LogoMethodsImpl;

public class Application {

	public static void main(String[] args) throws NotOddException, OutOfTheRangeException{

	    LogoMethodsImpl testObject=new LogoMethodsImpl();
		testObject.printLogo(13);
	}
}
