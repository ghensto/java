
abstract class AlienParent { //Abstract Base Class.  Cannot be made into an object, constructors cannot be directly called.
	private int health;
	public AlienParent(int h) {
		super();
		health = h;
	}
	
	public AlienParent(AlienParent a) {
		health = a.health;
	}
	
	public boolean isAlive() {
		return health > 0;
	}
	
	public void takeDamage(int d) {
		health -= d;
	}
	
	public abstract AlienParent clone();
	
	public abstract int getDamage();
	public int getHealth() {return health;}
	
	public String toString() {
		return "AlienParent. Health: " + health + ".";
	}
	
}


class BorgAlien extends AlienParent {
	private final int DAMAGE = 10;
	
	public BorgAlien(int h) {
		super(h);
	}
	
	public BorgAlien(BorgAlien b) {
		super(b);
	}
	
	public BorgAlien clone() {
		return new BorgAlien(this);
	}
	
	public int getDamage() {return DAMAGE;}
	
	//public void Assimilate(AlienParent a) {
	//
	//}
	
	public String toString() {
		return "BorgAlien. Health: " + getHealth() + ", Damage: " + getDamage() + ".";
	}
}
	
	
class MartianAlien extends AlienParent{
	
	public MartianAlien(int h) {
		super(h);
	}
	
	public MartianAlien(MartianAlien b) {
		super(b);
	}
	
	public MartianAlien clone() {
		return new MartianAlien(this);
	}
	
	public int getDamage() {return 3;} // overriding abstract method
	
	public String toString() {
		return "MartianAlien. Health: " + getHealth() + ", Damage: " + getDamage() + ".";
	}
}

class AlienPack2 {
	private AlienParent [] aliens;
	private int next;
	
	public AlienPack2(int num) {
		aliens = new AlienParent[num];
	}
	
	public AlienPack2(AlienPack2 a) {
		aliens = new AlienParent[a.aliens.length];
		next = a.next;
		for(int i = 0; i < next; i++) {
			aliens[i] = a.aliens[i].clone();
		}
	}
	
	public void addAlien(AlienParent a) {
		if(next < aliens.length) {
			aliens[next] = a;
			next++;
		}
	}
	
	public int totalDamage() {
		int total = 0;
		for(int i = 0; i < next; i++) {
			total += aliens[i].getDamage();
		}
		return total;
	}
}