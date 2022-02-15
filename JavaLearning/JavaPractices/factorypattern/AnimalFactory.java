package factorypattern;

public class AnimalFactory {
	
	//private static AnimalFactory animalFactoryRef;
	
	private AnimalFactory() {
		
	}
	

	
	
	public static Animal getMeAnimal(String animalType) {
		if(animalType.equals("cat")) {
			return new Cat();
		}
		else if(animalType.equals("dog")) {
			return new Dog();
		}
		else if(animalType.equals("pig")) {
			return new Pig();
		}
		else {
			Animal name= new Animal() {
				
				@Override
				public void sound() {
					System.out.println("unknown sound");
					
				}
			};
			return name;
		}
		
	}

}
