package task_7;

public class ShellSorted {

	public void sort(double[] array) {
		int i = 0;
		while (i < array.length - 1) {
			if (isBigger(array[i], array[i + 1])) {
				swapElements(array, i, i + 1);
				i = downPosition(i);
			} else {
				i = upPosition(i);
			}
		}
	}

	private int downPosition(int position) {
		return position > 0 ? --position : position;
	}

	private int upPosition(int position) {
		return ++position;
	}

	private boolean isBigger(double left, double right) {
		return left > right;
	}

	private void swapElements(double[] array, int left, int right) {
		double temp = array[left];
		array[left] = array[right];
		array[right] = temp;
	}
}
