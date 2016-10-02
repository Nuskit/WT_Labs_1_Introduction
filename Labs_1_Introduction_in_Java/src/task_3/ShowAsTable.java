package task_3;

public class ShowAsTable implements IShowAsTable {
	
	
	@Override
	public void show(double x, double valueFunction) {
		System.out.println(x+" "+valueFunction);
	}
}
