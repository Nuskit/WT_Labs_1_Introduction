package task_2;

import java.awt.Point;

public class CheckPoint {

	private int upY = 5;
	private int downY = -3;
	private int centerY = 0;
	private int upX = 4;
	private int downX = 6;
	private int centerX = 0;

	public boolean isInZone(Point point) {
		Point pointInRightZone=changePointToRightZone(point);
		return isInUpZone(pointInRightZone) || isInDownZone(pointInRightZone);
	}

	private boolean isInDownZone(Point point) {
		return isInDownXZone(point.x) && isDownYZone(point.y);
	}

	private boolean isDownYZone(int y) {
		return isInBeetweenZone(Math.abs(y), centerY, Math.abs(downY));
	}

	private boolean isInDownXZone(int x) {
		return isInBeetweenZone(x, centerX, downX);
	}

	private boolean isInUpZone(Point point) {
		return isInUpXZone(point.x) && isInUpYZone(point.y);
	}

	private boolean isInUpYZone(int y) {
		return isInBeetweenZone(y, centerY, upY);
	}

	private boolean isInUpXZone(int x) {
		return isInBeetweenZone(x, centerX, upX);
	}

	private boolean isInBeetweenZone(int checkValue, int left, int right) {
		return isBiggerOrEqual(checkValue, left) && isSmallerOrEqual(checkValue, right);
	}

	private boolean isBiggerOrEqual(int left, int right) {
		return left >= right;
	}

	private boolean isSmallerOrEqual(int left, int right) {
		return left <= right;
	}

	private Point changePointToRightZone(Point point) {
		return new Point(Math.abs(point.x), point.y);
	}
}
