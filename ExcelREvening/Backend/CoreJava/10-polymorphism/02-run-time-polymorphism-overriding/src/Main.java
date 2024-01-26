class Animal
{
	void makeSound()
	{
		System.out.println("Generic Animal Sound");
	}
}

class Dog extends Animal
{
	void makeSound()
	{
		System.out.println("Bark!");
	}
}

class Cat extends Animal
{
	void makeSound()
	{
		System.out.println("Meow!");
	}
}

class Main
{
	public static void main(String[] args) 
	{
		Animal genericAnimal = new Animal();
		Animal dog = new Dog();
		Animal cat = new Cat();
		
		genericAnimal.makeSound();
		dog.makeSound();
		cat.makeSound();
		System.out.println("done");
	}
}
