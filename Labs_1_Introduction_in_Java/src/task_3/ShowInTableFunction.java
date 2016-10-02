package task_3;

import java.util.HashMap;
import java.util.Map;

public class ShowInTableFunction {
	private IShowAsTable showAsTableFunction;
	private final double exp = 1E-5;
	private double minValue;
	private double maxValue;
	private double step;
	private final HashMap<Double, Double> indexWithValues;

	public ShowInTableFunction(IShowAsTable showAsTable) {
		showAsTableFunction = showAsTable;
		indexWithValues = new HashMap<Double, Double>();
	}

	public void showInTableResultFuncion(double a, double b, double h) {
		generateMapValues(a, b, h);
		showTables();
	}

	private void showTables() {
		for (Map.Entry<Double, Double> entry : indexWithValues.entrySet()) {
			showAsTableFunction.show(entry.getKey(), entry.getValue());
		}

	}

	private void generateMapValues(double a, double b, double h) {
		indexWithValues.clear();
		if (!isZeroStep(h)) {
			initializeRange(a, b, h);
			generateRange();
		}
	}

	public HashMap<Double, Double> generateResultFunction(double a, double b, double h) {
		generateMapValues(a, b, h);
		return indexWithValues;
	}

	private boolean isZeroStep(double h) {
		return h + exp > 0 && h - exp < 0;
	}

	private void generateRange() {
		while (isInRange(minValue, maxValue)) {
			indexWithValues.put(minValue, calculateFunction(minValue));
			minValue += step;
		}
	}

	private void initializeRange(double a, double b, double h) {
		minValue = getMinValue(a, b);
		maxValue = getMaxValue(a, b);
		step = getPositiveStep(h);
	}

	private double getMinValue(double a, double b) {
		return Math.min(a, b);
	}

	private double getMaxValue(double a, double b) {
		return Math.max(a, b);
	}

	private double getPositiveStep(double h) {
		return h >= 0 ? h : Math.abs(h);
	}

	private boolean isInRange(double a, double b) {
		return a + exp < b;
	}

	public double calculateFunction(double x) {
		return Math.tan(x);
	}
}
