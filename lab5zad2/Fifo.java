package lab5zad2;

import java.util.Arrays;

public class Fifo {

	private Car[] cars = new Car[30];

	private static int index = 0;

	public void add(Car car) {

		if (index < 29) {
			cars[index] = car;
			index++;
		}
	}

	public Car get() {

		return cars[0];
	}

	public boolean isEmpty() {
		return index == 0;
	}

	public boolean isFull() {
		return index == 29;
	}

	public boolean contains(Car car) {

		for (Car c : cars) {

			if (c.equals(car))
				return true;
		}

		return false;
	}

	public Car find(Car car) {

		for (Car c : cars) {
			if (c.equals(car))
				return c;
		}

		return null;
	}

	@Override
	public String toString() {

		return Arrays.toString(cars);
	}

}
