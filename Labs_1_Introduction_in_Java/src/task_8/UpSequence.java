package task_8;

public class UpSequence {
	final double epsilon = 0.001;
	private int positionArray[];
	private int currentPositionA;

	public int[] insertPosition(double[] a, double[] b) {
		if (a != null && b != null) {
			createPositionArray(getSize(b));
			startInitializeA(b);
			checkInsertPosition(getSize(b), a, b);
		} else {
			createPositionArray(0);
		}
		return positionArray;
	}

	private void checkInsertPosition(int size, double[] a, double[] b) {
		for (int i = 0; i < size; i++) {
			checkPosition(b[i], a);
			insertPosition(i);
		}
	}

	private void insertPosition(final int position) {
		positionArray[position] = currentPositionA;
	}

	private void startInitializeA(double[] a) {
		currentPositionA = 0;
	}

	private void checkPosition(double compareElement, double[] checkingArray) {
		while (currentPositionA < getSize(checkingArray) && isBigger(compareElement, checkingArray[currentPositionA])) {
			currentPositionA++;
		}
	}

	private boolean isBigger(double left, double right) {
		return left > right + epsilon;
	}

	private void createPositionArray(int size) {
		positionArray = new int[size];
	}

	private int getSize(double[] array) {
		return array.length;
	}
}
