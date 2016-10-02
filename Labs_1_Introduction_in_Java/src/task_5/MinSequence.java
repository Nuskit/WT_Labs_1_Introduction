package task_5;

public class MinSequence {
	private int size;
	private int minDistantion[];
	private int startPosition[];

	public MinSequenceValue foundMinSequence(int[] array) {
		MinSequenceValue result = new MinSequenceValue();
		if (array != null) {
			startInitialize(getSize(array));
			findSequence(array);

			setResult(result);
		}
		return result;
	}

	private void findSequence(int[] array){
		for (int i = 0; i < getSize(array); i++) {
			minDistantion[i] = 1;
			startPosition[i] = -1;
			for (int j = 0; j < i; ++j) {
				if (array[j] >= array[i]) {
					if (1 + minDistantion[j] > minDistantion[i]) {
						minDistantion[i] = 1 + minDistantion[j];
						startPosition[i] = j;
					}
				}
			}
		}
	}
	
	private void setResult(MinSequenceValue result){
		result.distance = minDistantion[0];
		result.position = 0;
		for (int i = 0; i < size; ++i) {
			if (minDistantion[i] > result.distance) {
				result.distance = minDistantion[i];
				result.position = i;
			}
		}
	}
	
	private void startInitialize(int size) {
		this.size = size;
		minDistantion = new int[size];
		startPosition = new int[size];
	}

	private int getSize(int[] array) {
		return array.length;
	}
}
