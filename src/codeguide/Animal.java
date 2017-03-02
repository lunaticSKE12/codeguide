package codeguide;

import java.util.Random;

/**
 * 
 * @author Napong Dungduangsasitorn
 *
 */
public class Animal {
	protected final int staticHp;
	public int hp;
	public int atk;
	public int def;
	public int flee;

	//TODO use Polymorphism to create other constructor methods 
	
	public Animal(int hp) {
		this.hp =hp;
		staticHp = hp;
	}
		
	/*public Animal(int hp, int atk, int def, int flee) {
		
	}*/
	
	//TODO eliminate duplicate code
	
	public void Attack(){
		
	}
	
	public void reanimate(){
		
	}
	


}
