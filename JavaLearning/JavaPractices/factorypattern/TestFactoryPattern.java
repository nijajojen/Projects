package factorypattern;

public class TestFactoryPattern {

	public static void main(String[] args) {
		Animal animal= AnimalFactory.getMeAnimal("cat");
		animal.sound();
	 animal= AnimalFactory.getMeAnimal("dog");
	 animal.sound();
	 animal= AnimalFactory.getMeAnimal("pig");
	 animal.sound();
	 animal= AnimalFactory.getMeAnimal("tiger");
	 animal.sound();

	}

}
