package codeguide;

import java.util.Random;

/**
 * 
 * @author Napong Dungduangsasitorn
 *
 */
public class Dog extends Animal{

	public int hp = 200;
	public int atk = 15;
	public int def = 20;
	public int flee = 20;
	
	//TODO fill the blank and create Accessor and Mutator methods

	public Dog(int Hp){

	}

	public Dog(int Hp, int Atk){

	}

	public Dog(int Hp, int Atk, int Def){

	}

	public Dog(int Hp, int Atk, int Def,int flee) {
		
	}

	public void Attack(Cat cat) {
		Random r = new Random();
		int missChance = r.nextInt()%101;
		if (missChance > cat.flee) {
			cat.hp = cat.hp - (atk - def);
		}
	}

	public void reanimate() {
		hp = staticHp;
	}
	
}
