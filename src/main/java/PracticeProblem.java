public class PracticeProblem {

	public static int towerOfHanoi(int num) {
		if (num < 3) {
			return -1;
		}

		return (int) Math.pow(2, num) - 1;
	}
	public static void main(String args[]) {
		int result = towerOfHanoi(100);
		System.out.println(result);
	}

	
}
