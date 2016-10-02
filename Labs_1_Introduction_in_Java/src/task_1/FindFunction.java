package task_1;

public class FindFunction {
	public double calculate(double x,double y) {
		return calculateUp(x,y)/calculateDown(x,y)+x;
	}
	
	private double calculateDown(double x, double y) {
		return 2+calcuateAbsBlock(x,y);
	}

	private double calcuateAbsBlock(double x, double y) {
		return x-calculateDownUp(x)/calcuateDownDown(x,y);
	}

	private double calcuateDownDown(double x, double y) {
		return 1+calculateSquare(x)*calculateSquare(y);
	}

	private double calculateDownUp(double x) {
		return 2*x;
	}

	private double calculateSin(double x,double y){
		return Math.sin(x+y);
	}
	
	private double calculateUp(double x,double y){
		return 1+calculateSquareSin(x,y);
	}
	
	private double calculateSquareSin(double x, double y) {
		return calculateSquare(calculateSin(x,y));
	}

	private double calculateSquare(double x){
		return Math.pow(x, 2);
	}
}
