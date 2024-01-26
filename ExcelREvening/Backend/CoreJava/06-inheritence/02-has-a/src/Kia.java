class Car
{
	String color;

	String engineVarient;

	void engine()
	{
		System.out.println("Car-engine()");
	}
}

class Kia
{
	Car carRef1;

	Kia(Car carRef2)
	{
		this.carRef1 = carRef2;
	}
	
	void sonet()
	{
		System.out.println("Kia-sonet()");
		carRef1.color = "White";
		System.out.print(carRef1.color + ", ");
		carRef1.engineVarient = "Turbo 1.0";
		System.out.print(carRef1.engineVarient + ", ");
		carRef1.engine();
	}
	public static void main(String[] args) 
	{
		Car car = new Car();
		Kia kiaModel = new Kia(car);
		kiaModel.sonet();
		System.out.println("done");
	}
}