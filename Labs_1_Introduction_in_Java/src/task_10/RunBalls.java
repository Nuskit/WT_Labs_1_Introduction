package task_10;

import java.awt.Color;

import task_9.*;

public class RunBalls {

	public static void main(String[] args) {
		Basket basket = new Basket(
				new Ball[] { new Ball(Color.blue, 10), new Ball(Color.white, 15), new Ball(Color.blue, 7) });
		System.out.println(basket);
	}
}
