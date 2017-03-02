package codeguide;

import java.util.Random;

/**
 * 
 * @author Napong Dungduangsasitorn
 *
 */
public class Cat extends Animal{
	
	public int hp = 50;
	public int atk = 8;
	public int def = 3;
	public int flee = 80;
	
	//TODO fill the blank and create Accessor and Mutator methods
	
	public Cat(int Hp){
		
	}
	
	public Cat(int Hp, int Atk){
		
	}
	
	public cat(int Hp, int Atk, int Def){
		
	}
	
	public Cat(int Hp, int Atk, int Def,int flee) {
	
	}
	
	public void Attack(Dog dog) {
		Random r = new Random();
		int missChance = r.nextInt()%101;
		if (missChance > dog.flee) {
			dog.hp = dog.hp - (atk - def);
		}
	}
	
	public void reanimate() {
		hp = staticHp;
	}

}
