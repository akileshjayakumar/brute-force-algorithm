public class BruteForce {

	public static void main(String[] args) {
		int maxHashes = 256;
		int maxSum = 64;

		for (int i = 1; i <= maxHashes; i++) {
			int counter = countCombinations(i, maxSum);
			System.out.println("Number of hashes: " + i + " Counter: " + counter);
		}
	}

	private static int countCombinations(int target, int maxSum) {
		int count = 0;
		for (int j = 1; j <= maxSum; j++) {
			for (int k = 1; k <= maxSum; k++) {
				for (int l = 1; l <= maxSum; l++) {
					int remaining = target - (j + k + l);
					if (remaining >= 1 && remaining <= maxSum) {
						count++;
					}
				}
			}
		}
		return count;
	}
}
