package task_5;

public class MinSequenceValue{
	public MinSequenceValue(){}
	public MinSequenceValue(int position,int distance){
		this.position=position;
		this.distance=distance;
	}
	
	@Override
	public String toString() {
		return "MinSequenceValue [position=" + position + ", distance=" + distance + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + distance;
		result = prime * result + position;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MinSequenceValue other = (MinSequenceValue) obj;
		if (distance != other.distance)
			return false;
		if (position != other.position)
			return false;
		return true;
	}

	public int position;
	public int distance;
}
