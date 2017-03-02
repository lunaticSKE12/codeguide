package codeguide;
/**
 * Game main class that cat and dog can fight each other and show how many win
 * @author Napong Dungduangsasitorn
 *
 */
public class Main {
	public static void main(String[] agrs) {
		int dog_win = 0, cat_win = 0, draw = 0;
		//TODO use other way to create class cat and dog by use Polymorphism constructor to create class. 
		Cat cat = new Cat(4);
		Dog dog = new Dog(5);
		
		
		for(int i=0; i<1000; i++){
			while (cat.hp > 0 && dog.hp > 0 ) {
				cat.Attack(dog);
				dog.Attack(cat);
			}
			if (dog.hp > 0){
				System.out.println("Dog Win!!");
				dog_win++;
			}
			else if (cat.hp > 0) {
				System.out.println("Cat Win!!");
				cat_win++;
			}
			else {
				System.out.println("They are die!!");
				draw++;
			}
			cat.reanimate();
			dog.reanimate();

		}
		System.out.println("Dog win " + dog_win +" \n"+ "Cat win " + cat_win +"  \n" + "They are die " + draw);

	}

}
