package task_9;

import java.awt.Color;

public class Ball {
	private Color color;
	private int weight;

	public Ball(Color color, int weight) {
		this.color = color;
		this.weight = weight;
	}

	public Color getColor() {
		return color;
	}

	public int getWeight() {
		return weight;
	}
}