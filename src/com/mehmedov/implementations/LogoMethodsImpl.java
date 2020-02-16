package com.mehmedov.implementations;

import com.mehmedov.exceptions.NotOddException;
import com.mehmedov.exceptions.OutOfTheRangeException;
import com.mehmedov.interfaces.LogoMethods;

public class LogoMethodsImpl implements LogoMethods {

	@Override
	public boolean isOdd(int initialLetterWidth) {
		if (initialLetterWidth % 2 == 0) {
			return false;
		}
		return true;
	}

	@Override
	public int findTheLastUpperRow(int initialLetterWidth) throws NotOddException,OutOfTheRangeException {

		int rowCounter = 0;

		if (isInTheGivenRange(initialLetterWidth) == false) {
			throw new OutOfTheRangeException("The number you are passing should be in that range 2<N<10000");
		}
		
		if (isOdd(initialLetterWidth) == false) {
			throw new NotOddException("The number you are passing should be odd !");
		}

		for (int initialWidth = initialLetterWidth; initialWidth != -1; initialWidth -= 2) {

			rowCounter++;
		}

		return rowCounter;
	}

	@Override
	public void printDash(int numberOfDashes) {
		for(int i=0;i<numberOfDashes;i++) {
			System.out.print('-');
		}
	}

	@Override
	public boolean isInTheGivenRange(int initialLetterWidth) {
		if (initialLetterWidth > 2 && initialLetterWidth < 10000) {
			return true;
		}
		return false;
	}

	@Override
	public void printAsterisk(int numberOfAsterisks) {
		for(int i=0;i<numberOfAsterisks;i++) {
			System.out.print('*');
		}
	}

	@Override
	public void printTheUpperPart(int initialLetterWidth) throws NotOddException, OutOfTheRangeException {
		
		int lastUpperRow= findTheLastUpperRow(initialLetterWidth);
		int numberOfDashes=initialLetterWidth;
		int numberOfAsterisks=initialLetterWidth;
		int numberOfMiddleColumnDashes=initialLetterWidth;
		
		while(lastUpperRow>0) {
			
		for(int i=0;i<2;i++) {
		
		printDash(numberOfDashes);
		printAsterisk(numberOfAsterisks);
		printDash(numberOfMiddleColumnDashes);
		printAsterisk(numberOfAsterisks);
		printDash(numberOfDashes);
		}
		System.out.println();
		
		numberOfDashes--;
		numberOfAsterisks+=2;
		numberOfMiddleColumnDashes-=2;
		lastUpperRow--;
			}
		}

	@Override
	public void printTheLowerPart(int initialLetterWidth) throws NotOddException, OutOfTheRangeException {
	
		int lastUpperRow= findTheLastUpperRow(initialLetterWidth);
		int rowsLeftToPrint=(initialLetterWidth-lastUpperRow)+1;
		int numberOfDashes=rowsLeftToPrint-1;
		final int numberOfAsterisks=initialLetterWidth;
		int numberOfMiddleColumnAsterisks=(initialLetterWidth*2)-1;
		int numberOfMiddleColumnDashes=1;
		
		while(rowsLeftToPrint>0) {
			
		for(int i=0;i<2;i++) {
		
		printDash(numberOfDashes);
		printAsterisk(numberOfAsterisks);
		printDash(numberOfMiddleColumnDashes);
		printAsterisk(numberOfMiddleColumnAsterisks);
		printDash(numberOfMiddleColumnDashes);
		printAsterisk(numberOfAsterisks);
		printDash(numberOfDashes);
		
		}
		
		System.out.println();
		
		numberOfDashes--;
		numberOfMiddleColumnDashes+=2;
		numberOfMiddleColumnAsterisks-=2;
		rowsLeftToPrint--;
			}
		}

	@Override
	public void printLogo(int initialLetterWidth) throws NotOddException, OutOfTheRangeException {
		
		printTheUpperPart(initialLetterWidth);
		printTheLowerPart(initialLetterWidth);
		
	}
	}