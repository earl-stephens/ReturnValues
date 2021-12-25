package application;

public class App {

	public static void main(String[] args) {
		ReturnValues values1 = new ReturnValues();
		values1.getAnimal();
		
		//Should return cat
		values1.getAnimals();
		//use println to display it
		System.out.println(values1.getAnimals());
	}

}
