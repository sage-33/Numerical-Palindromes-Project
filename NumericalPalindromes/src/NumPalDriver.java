import javax.swing.JOptionPane;

public class NumPalDriver {

	public static void main(String[] args) {
		String start = JOptionPane.showInputDialog("Enter a number: ");
		System.out.println("start value [" + start + "]");
		NumPal numPal = new NumPal(start);
		int ctr = 0;
		while (!numPal.isPalindrome() && (ctr < 10)) {
			System.out.println(numPal.toString());
			System.out.print("new sum: ");
			System.out.println(numPal.getCur() + " + " + numPal.getRev() + " = " + (numPal.getCur() + numPal.getRev()));
			numPal = numPal.next();
			ctr++;
		}
		System.out.println("final value: " + numPal.getCur());
		System.out.println("number of steps: " + ctr);
	}
}