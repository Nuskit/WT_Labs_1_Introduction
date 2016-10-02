package task_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckArrayForPrimeElements {
	private List<Integer> primeNumberPosition;
	private boolean[] primeNumber;

	public CheckArrayForPrimeElements() {
		primeNumberPosition = new ArrayList<Integer>();
	}

	public List<Integer> getPrimeNumberPosition(int[] array) {
		primeNumberPosition.clear();
		if (array.length > 0) {
			startInitialize(getMaxNumber(array));
			generatePrimeNumber(getMaxNumber(array));
			findPrimePosition(array);
		}
		return primeNumberPosition;
	}

	private void startInitialize(int size) {
		primeNumber = new boolean[size + 1];
		Arrays.fill(primeNumber, true);
	}

	private void generatePrimeNumber(int maxNumber) {
		primeNumber[0] = primeNumber[1] = false;
		for (int i = 2; i < primeNumber.length; i++) {
			if (primeNumber[i]) {
				for (int j = 2; i * j < primeNumber.length; j++) {
					primeNumber[i * j] = false;
				}
			}
		}
	}

	private void findPrimePosition(final int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (primeNumber[array[i]]) {
				primeNumberPosition.add(i + 1);
			}
		}
	}

	private int getMaxNumber(int[] array) {
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			max = max >= array[i] ? max : array[i];
		}
		return max;
	}

}
