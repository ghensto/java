

public class IceCreamSorter {
	
	public static void sort (IceCreamTruck [] trucks) {
		IceCreamTruck t;
		for(int a=1; a < trucks.length; a++)  
			for(int b=trucks.length-1; b >= a; b--) {  
				if(trucks[b-1].getSales() > trucks[b].getSales()) { // if out of order  
					// exchange elements   
					t = trucks[b-1];  
					trucks[b-1] = trucks[b];  
					trucks[b] = t;  
				}  
			}
	}
	
	public static void main(String [] args) {
		IceCreamTruck [] trucks2 = new IceCreamTruck[4];
		trucks2[0] = new IceCreamTruck(50,50,50);
		trucks2[1] = new IceCreamTruck(50,50,50);
		trucks2[2] = new IceCreamTruck(50,50,50);
		trucks2[3] = new IceCreamTruck(50,50,50);
		
		IceCreamTruck [] trucks = {new IceCreamTruck(50,50,50),
									new IceCreamTruck(50,50,50),
									new IceCreamTruck(50,50,50),
									new IceCreamTruck(50,50,50)};
		
		trucks[0].sellIceCreamSandwich(10);
		trucks[2].sellFudgeBar(10);
		trucks[3].sellPushUpPop(10);
		System.out.println("Initial: ");
		for(int i = 0; i < trucks.length; i++) {
			System.out.println(trucks[i].toString());
		}
		sort(trucks);
		System.out.println("\nAfterSort:");
		
		for(int i = 0; i < trucks.length; i++) {
			System.out.println(trucks[i].toString());
		}
	
	
	}
}