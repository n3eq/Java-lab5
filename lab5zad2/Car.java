package lab5zad2;

public class Car {

	private String owner;
	private String brand;
	private String model;
	private int year;
	private String color;

	public Car(String owner, String brand, String model, int year, String color) {
		this.owner = owner;
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.color = color;
	}

	@Override
	public boolean equals(Object o) {

		if (this == o) {
			return true;
		}

		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		Car car = (Car) o;
		return owner.equals(car.owner) && brand.equals(car.brand) && model.equals(model) && year == car.year
				&& color.equals(car.color);
	}

	@Override
	public String toString() {
		return "Owner: " + this.owner + " Marka: " + this.brand + " Model: " + this.model + " Year: " + this.year
				+ " Color: " + this.color + "\n";
	}

	public String getOwner() {
		return owner;
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}

	public String getColor() {
		return color;
	}

}
