package task_6;

public class GenerateMatrix {
	private double resultMatrix[][];

	public double[][] generate(double... a) {
		generateEmptyMatrix(countNumber(a));
		fillMatrix(a);
		return resultMatrix;
	}

	private void fillMatrix(double[] startArray) {
		for (int i = 0, size = countNumber(startArray); i < size; i++){
			for (int j = 0; j < size; j++){
				setElement(j, (size + i - j) % size, startArray[i]);
			}
		}
	}

	private void setElement(int row, int column, double element) {
		resultMatrix[row][column] = element;
	}

	private void generateEmptyMatrix(int size) {
		resultMatrix = new double[size][size];
	}

	private int countNumber(double[] a) {
		return a.length;
	}
}
