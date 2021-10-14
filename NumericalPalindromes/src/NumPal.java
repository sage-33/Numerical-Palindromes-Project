
/**
 * @author sagesilberman
 *
 */
public class NumPal {

	private long cur; // current number
	private long rev; // the number reversed
	private long sum; // the sum of current and reversed number
	String curString = ""; // current number in String form
	String revString = ""; // the number reversed in String form

	/**
	 * Constructs a Palindrome with the start number a.k.a. current number
	 * 
	 * @param start the starting number
	 */
	public NumPal(String start) {
		curString = start;
		cur = Long.parseLong(curString);

		for (int i = curString.length(); i > 0; i--) {
			revString += curString.substring(i - 1, i);
		}

		rev = Long.parseLong(revString);

	}

	/**
	 * Returns <code>true</code> if the number is a Palindrome.
	 *
	 * ...
	 * 
	 * @return<code>true</code> if the number is a Palindrome; <code>false</code> if
	 * the number isn't the same backwards as it is forwards (a Palindrome)
	 */
	public boolean isPalindrome() {
		int i = 0, j = curString.length() - 1;

		while (i < j) {

			if (curString.charAt(i) != curString.charAt(j))
				return false;

			i++;
			j--;
		}

		return true;
	}

	/**
	 * Formats to show that the current number reversed is the reversed number
	 */
	public String toString() {
		return curString + " reverse -> " + revString;

	}

	/**
	 * Adds the current number and the reverse of that number together
	 * 
	 * @return the sum of the current and reverse of that number
	 */
	public NumPal next() {
		sum = cur + rev;
		return new NumPal(sum + "");

	}

	/**
	 * Returns the current number
	 * 
	 * @return the current number
	 */
	public long getCur() {
		return cur;

	}

	/**
	 * Returns the number in reverse order
	 * 
	 * @return the reversed number
	 */
	public long getRev() {
		return rev;

	}
}
