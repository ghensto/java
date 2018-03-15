

public class Alien {
	private int health, damage;
	
	public Alien(int h, int d) {
		health = h;
		damage = d;
	}
	
	public Alien(Alien a) {
		health = a.health;
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
		return "Alien. Health: " + health + ", Damage: " + damage + ".";
	}
}

class AlienPack {
	private Alien [] aliens;
	private int next;
	public Alien al;
	
	public AlienPack(int num) {
		aliens = new Alien[num];
	}
	
	public AlienPack(AlienPack a) {
		aliens = new Alien[a.aliens.length];
		next = a.next;
		for(int i = 0; i < next; i++) {
			aliens[i] = new Alien(a.aliens[i]);
		}
	}
	
	public void addAlien(Alien a) {
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

class AlienTester {
	
	public static void main(String [] args) {
	
		Alien a1 = new Alien(100, 3);
		Alien a2 = new Alien(300, 5);
		Alien a3 = new Alien(200, 2);
		Alien a4 = new Alien(a1);
		
		AlienPack ap1 = new AlienPack(10);
		ap1.addAlien(a1);
		ap1.addAlien(a4);
		ap1.addAlien(a2);
		ap1.addAlien(a3); 
		ap1.addAlien(new Alien(a1));
		
		AlienPack ap2 = new AlienPack(ap1);
		ap2.addAlien(new Alien(200, 6));
		
		System.out.println(ap1.totalDamage());	
		System.out.println(ap2.totalDamage());	
	
	
	
	
	}
}
	
	
























