package lab5zad2;

public class Test {

	public static void main(String[] args) {

		Car car1 = new Car("Robert Lewandowski", "Audi", "RS7", 2019, "Czerwony");
		Car car2 = new Car("Robert Kubica", "Porsche", "911", 2018, "Czarny");
		Car car3 = new Car("Leonardo Di Caprio", "BMW", "M2", 2018, "Czerwony");
		Car car4 = new Car("John smith", "Audi", "RS7", 2019, "Zielony");
		Car car5 = new Car("Robert Lewandowski", "Audi", "RS7", 2019, "Czerwony");

		Fifo fifo = new Fifo();

		System.out.println("bufor pusty?");
		System.out.println(fifo.isEmpty());

		fifo.add(car1);
		fifo.add(car2);
		fifo.add(car3);
		fifo.add(car4);
		fifo.add(car5);

		System.out.println("dodajemy  5 samochodów");
		System.out.println("bufor pusty?");
		System.out.println(fifo.isEmpty());

		System.out.println("dodajemy 25 samochodów");

		fifo.add(car1);
		fifo.add(car2);
		fifo.add(car3);
		fifo.add(car4);
		fifo.add(car5);

		fifo.add(car1);
		fifo.add(car2);
		fifo.add(car3);
		fifo.add(car4);
		fifo.add(car5);

		fifo.add(car1);
		fifo.add(car2);
		fifo.add(car3);
		fifo.add(car4);
		fifo.add(car5);

		fifo.add(car1);
		fifo.add(car2);
		fifo.add(car3);
		fifo.add(car4);
		fifo.add(car5);

		fifo.add(car1);
		fifo.add(car2);
		fifo.add(car3);
		fifo.add(car4);
		fifo.add(car5);

		System.out.println("bufor pelny?");
		System.out.println(fifo.isFull());

		System.out.println("bufor zawiera car5?");
		System.out.println(fifo.contains(car5));

		System.out.println("Odnajdywanie elementu w kolejce: ");
		Car finded = fifo.find(car2);
		System.out.println("Informacje o samochodzie: Właściciel " + finded.getOwner() + " Marka " + finded.getBrand()
				+ " Model " + finded.getModel());

		System.out.println("Pobranie elementu z kolejki: ");
		Car car6 = fifo.get();
		System.out.println("Informacje o samochodzie: Właściciel " + car6.getOwner() + " Marka " + car6.getBrand()
				+ " Model " + car6.getModel());

		System.out.println(fifo.toString());
	}

}
