
public class NumPal {

	private long cur;
	private long rev;
	private long sum;
	String curString = "";
	String revString = "";

	public NumPal(String start) {
		curString = start; // starts as string
		cur = Long.parseLong(curString); // turns into number

		for (int i = curString.length(); i > 0; i--) {
			revString += curString.substring(i - 1, i); // reverses string
		}

		rev = Long.parseLong(revString); // turns into string

	}

	public long getCur() {
		return cur;

	}

	public long getRev() {
		return rev;

	}

	public NumPal next() { // adds current and reverse together
		sum = cur + rev;
		return new NumPal(sum + "");

	}

	public boolean isPalindrome() {
		return false;

	}

	public String toString() { // formats
		return curString + "reverse ->";

	}

}
