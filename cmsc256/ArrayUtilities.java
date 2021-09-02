/**
 *   Class-level comments go here
 */
package cmsc256;

import java.util.Arrays;

public class ArrayUtilities {

	/**
	* Determines the maximum value in the given array of integers
	 * @param nums	array of integers
	 * @return		element with the largest value
	 */
	public static int findMax(int[] nums) {
		return -1;
	}

	/**
	 * Determines the index of the maximum value in the given array of integers
	 * @param nums	array of integers
	 * @return		index of the element with the largest value
	 */
	public static int findIndexOfMax(int[] nums) {
		return -1;
	}

	/**
	 *  Determines the correct sequence of digits in a matrix of transmissions where
	 *  each row represents a single transmission of single digit characters where
	 *  there may be incorrectly transmitted digits.
	 *
	 * @param multiples	2D array representing multiple rows of single digits
	 * @return			array of the most commonly occurring digit by column
	 */
	public static byte[] extractCorrectArray(byte[][] multiples) {
			return null;
	}

	/**
	 *  Calculates the number of errors in a matrix of transmissions where
	 *  each row represents a single transmission of single digit characters.
	 *
	 * @param matrix	2D array representing multiple rows of single digits
	 * @return			number of errors in matrix
	 */
	public static int countErrors(byte[][] matrix) {
		return null;
	}

	/**
	 *  Calculates the overall error rate in a matrix of transmissions where
	 *  each row represents a single transmission of single digit characters.
	 *
	 * @param matrix	2D array representing multiple rows of single digits
	 * @return			rate of errors in matrix as a percentage (0 - 100%)
	 */
	 public static double errorRate(byte[][] matrix) {
		return 0.0;
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] testFindMax = {1, 42, 35, 50, 75, -6, 89, 4, 12};
		System.out.println("Testing findMax: Expected is 89 - Observed is "
				+  ArrayUtilities.findMax(testFindMax));
		System.out.println("Testing findIndexOfMax: Expected is 6 - Observed is "
				+  ArrayUtilities.findIndexOfMax(testFindMax));

		byte[][] testTransmission = {
									{5, 2, 9, 3, 7, 5},
									{5, 2, 1, 3, 7, 5},
									{5, 2, 1, 3, 1, 1},
									{5, 4, 4, 3, 7, 5},
									{7, 2, 1, 8, 7, 5}
									};
		int[] correctRow = {5, 2, 1, 3, 7, 5};
		System.out.println("Testing extractCorrectArray:\n  Expected is "
				+ Arrays.toString(correctRow) +	"\n  Observed is "
				+  Arrays.toString(ArrayUtilities.extractCorrectArray(testTransmission)));

		System.out.println("Testing countErrors: Expected is 7 - Observed is "
				+ ArrayUtilities.countErrors(testTransmission));

		System.out.println("Testing errorRate: Expected is approx. 23.33% - Observed is "
				+ ArrayUtilities.errorRate(testTransmission) + "%");
	}

}
