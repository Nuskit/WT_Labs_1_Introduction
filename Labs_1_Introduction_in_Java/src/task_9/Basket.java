package task_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.awt.Color;

public class Basket {
	private List<Ball> ballsContainer;

	public Basket(Ball[] containtsBalls) {
		ballsContainer = new ArrayList<Ball>(Arrays.asList(containtsBalls));
	}

	public void AddBall(Ball ball) {
		ballsContainer.add(ball);
	}

	public void AddBall(Ball[] ball) {
		ballsContainer.addAll(Arrays.asList(ball));
	}

	public int getWeight() {
		int weight = 0;
		for (Ball ball : ballsContainer) {
			weight += ball.getWeight();
		}
		return weight;
	}

	public int getNumberSimpleColorBalls(Color checkingColor) {
		int count = 0;
		for (Ball ball : ballsContainer) {
			if (ball.getColor() == checkingColor) {
				count++;
			}
		}
		return count;
	}
}