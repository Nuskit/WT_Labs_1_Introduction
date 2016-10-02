package testing;

import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.Test;

import task_9.Ball;
import task_9.Basket;

public class TestTask_9 {

	@Test
	public void testBasket() {
		Basket basket = new Basket(new Ball[] { new Ball(Color.blue, 10), new Ball(Color.white, 15),
				new Ball(Color.blue, 7), new Ball(Color.red, 14) });
		assertEquals(basket.getNumberSimpleColorBalls(Color.blue), 2);
		assertEquals(basket.getNumberSimpleColorBalls(Color.white), 1);
		assertEquals(basket.getNumberSimpleColorBalls(Color.yellow), 0);

		assertEquals(basket.getWeight(), 46);
	}
}
