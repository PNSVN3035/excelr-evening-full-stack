class Dog 
{
	String name, breed, gender, nature;
	int age;
	double height, weight;

	Dog(String name, String breed, String gender, int age, double height, 
	double weight)
	{
		this.name = name;
		this.breed = breed;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
		System.out.println("Dog(....)");
	}

	{
		this.nature = "Animal";
		System.out.println("Dog-IIB");
	}

	public static void main(String[] args) 
	{
		Dog charlie = new Dog("Charlie", "Labrador", "Male", 6, 2.5, 6.4);
		System.out.println("Your dog Details: " + "Dog Name: " + charlie.name
		+ ", " + "Dog breed: " + charlie.breed + ", " + "Dog gender : " +
		charlie.gender + ", "+ "Dog Nature: " + charlie.nature + ", " + 
		"Dog Age: " + charlie.age + ", " + "Dog Height: " + charlie.height + 
		", " + "Dog Weight: " + charlie.weight);
		System.out.println("-------------------------------------------");
		Dog baby = new Dog("Baby", "Indian Periah", "Female", 3, 2.0, 5.3);
		System.out.println("Your dog Details: " + "Dog Name: " + baby.name + 
		", " + "Dog breed: " + baby.breed + ", " + "Dog gender: " + baby.gender 
		+ ", "+ "Dog Nature: " + baby.nature + ", " + "Dog Age: " + baby.age + 
		", " + "Dog Height: " + baby.height + ", " + "Dog Weight: " + 
		baby.weight);
		System.out.println("-------------------------------------------");
		Dog ruby = new Dog("ruby", "Indian Periah", "Female", 2, 2.5, 6.0);
		System.out.println("Your dog Details: " + "Dog Name: " + ruby.name + 
		", " + "Dog breed: " + ruby.breed + ", " + "Dog gender: " + ruby.gender 
		+ ", "+ "Dog Nature: " + ruby.nature + ", " + "Dog Age: " + ruby.age + 
		", " + "Dog Height: " + ruby.height + ", " + "Dog Weight: " + 
		ruby.weight);
	}
}
