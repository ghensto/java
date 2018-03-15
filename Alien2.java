
public class Alien2 {
	private int health, damage, type;
	private final int
					BORG = 1,
					MARTIAN = 2,
					DALEK = 3,
					WOOKIE = 4,
					CYLON = 5,
					ALF = 6;
	private final int
					BORG_DAM = 10,
					MARTIAN_DAM = 3,
					DALEK_DAM = 12,
					WOOKIE_DAM = 6,
					CYLON_DAM = 2,
					ALF_DAM = 60;				
	
	
	
	public Alien2(int h, int t) {
		health = h;
		type = t;
		switch(type) {
			case BORG: damage = BORG_DAM;
			break;
			case MARTIAN: damage = MARTIAN_DAM;
			break;
			case DALEK: damage = DALEK_DAM;
			break;
			case WOOKIE: damage = WOOKIE_DAM;
			break;
			case CYLON: damage = CYLON_DAM;
			break;
			case ALF: damage = ALF_DAM;
			break;
		}
	}
	
	public Alien2(Alien2 a) {
		health = a.health;
		type = a.type;
		damage = a.damage;
	}
	
	public boolean isAlive() {
		return health > 0;
	}
	
	public void takeDamage(int d) {
		health -= d;
	}
	
	public int getDamage() {return damage;}
	public int getHealth() {return health;}
	
	public String toString() {
		String s;
		
		switch(type) {
			case BORG: s = "Borg. ";
			break;
			case MARTIAN: s = "Martian. ";
			break;
			case DALEK: s = "Dalek. ";
			break;
			case WOOKIE: s = "Wookie. ";
			break;
			case CYLON: s = "Cylon. ";
			break;
			case ALF: s = "Alf. ";
			break;
		}
		
		return s + "Health: " + health + ", Damage: " + damage + ".";
	}
}