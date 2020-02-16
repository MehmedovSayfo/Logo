package com.mehmedov.interfaces;

import com.mehmedov.exceptions.NotOddException;
import com.mehmedov.exceptions.OutOfTheRangeException;


/**
 * @author Sayfo Mehmedov
 */
public interface LogoMethods {

	/**
	 *
	 * @param initialLetterWidth  the initial parameter N representing the width of the "M" letters
	 * @return if the number we are passing is an odd number
	 */
	public boolean isOdd(int initialLetterWidth);

	/**
	 *
	 * @param initialLetterWidth  the initial parameter N representing the width of the "M" letters
	 * @return if the number is in the range 2<N<10000
	 */
	public boolean isInTheGivenRange(int initialLetterWidth);

	/**
	 *
	 * @param numberOfDashes the number of "-" to be printed
	 */
	public void printDash(int numberOfDashes);

	/**
	 *
	 * @param numberOfAsterisks the number of "*" to be printed
	 */
	public void printAsterisk(int numberOfAsterisks);

	/**
	 *
	 * @param initialLetterWidth  the initial parameter N representing the width of the "M" letters
	 * @return the last row of the upper part of the logo
	 */
	public int findTheLastUpperRow(int initialLetterWidth) throws NotOddException,OutOfTheRangeException;

	/**
	 *
	 * @param initialLetterWidth  the initial parameter N representing the width of the "M" letters
	 * @return the upper part of the logo
	 */
	public void printTheUpperPart(int initialLetterWidth)throws NotOddException, OutOfTheRangeException;

	/**
	 *
	 * @param initialLetterWidth  the initial parameter N representing the width of the "M" letters
	 * @return the lower part of the logo
	 */
	public void printTheLowerPart(int initialLetterWidth) throws NotOddException, OutOfTheRangeException;

	/**
	 *
	 * @param initialLetterWidth  the initial parameter N representing the width of the "M" letters
	 * @return the whole logo
	 */
	public void printLogo(int initialLetterWidth) throws NotOddException, OutOfTheRangeException;
}
