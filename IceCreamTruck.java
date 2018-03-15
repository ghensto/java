

public class IceCreamTruck {
	private int iceCreamSandwich, pushUpPop, fudgeBar;
	private double sales;
	private final double icsCost = 2, pupCost = 1.25, fbCost = 6;
	//final is, roughly, Java for const
	
	public IceCreamTruck() {
		iceCreamSandwich = 0;
		pushUpPop = 0;
		fudgeBar = 0;
		sales = 0;
	}
	
	public IceCreamTruck(int ics, int pup, int fb) {
		if (ics > 0)
			iceCreamSandwich = ics;
		if (pup > 0)
			pushUpPop = pup;
		if (fb > 0)
			fudgeBar = fb;
	}
	
	public void sellIceCreamSandwich(int ics) {
		if (ics <= iceCreamSandwich) {
			iceCreamSandwich -= ics;
			sales += ics * icsCost;
		}
		else {
			sales += iceCreamSandwich * icsCost;
			iceCreamSandwich = 0;
		}
	}
	
	public void sellIceCreamSandwich() {
		if (iceCreamSandwich > 0) {
			iceCreamSandwich--;
			sales += icsCost;
		}
	}

	public void sellPushUpPop(int pup) {
		if (pup > pushUpPop)
			pup = pushUpPop;
		pushUpPop -= pup;
		sales += pup * pupCost;
	}

	public void sellPushUpPop() {
		sellPushUpPop(1);
	}

	public void sellFudgeBar(int fb) {
		if (fb > fudgeBar) 
			fb = fudgeBar;
		fudgeBar -= fb;
		sales += fb * fbCost;
	}

	public void sellFudgeBar() {
		sellFudgeBar(1);
	}
	
	public void transferIceCreamSandwiches(int ics) {
		if (iceCreamSandwich + ics >= 0 )
			iceCreamSandwich += ics;
		else
			iceCreamSandwich = 0;
	}

	public void transferPushUpPops(int pup) {
		if (pushUpPop + pup >= 0)
			pushUpPop += pup;
		else
			pushUpPop = 0;
	}

	public void transferFudgeBars(int fb) {
		if (fudgeBar + fb >= 0) 
			fudgeBar += fb;
		else
			fudgeBar = 0;
	}
	
	public int getIceCreamSandwiches() {
		return iceCreamSandwich;
	}

	public int getPushUpPops() {
		return pushUpPop;
	}

	public int getFudgeBars() {
		return fudgeBar;
	}

	public double getSales() {
		return sales;
	}
	
	public void resetSales() {
		sales = 0;
	}
	
	public String toString() {
		String s = "Ice Cream Sandwiches: " + iceCreamSandwich + '\n';
		s += "PushUp Pops: " + pushUpPop + '\n';
		s += "Fudge Bars: " + fudgeBar + '\n';
		s += "Current total sales: $" + sales + '\n';
		return s;
	}	
}

class IceCreamBusiness {
	public static void main(String args[]) {
		IceCreamTruck ic1 = new IceCreamTruck(40, 40, 40);
		IceCreamTruck ic2 = new IceCreamTruck(50, 100, 100);
		IceCreamTruck ic3 = new IceCreamTruck(50, -300, 80);
		
		outputICSs(ic1, ic2, ic3);
		ic2.sellFudgeBar(5);
		ic2.sellFudgeBar();
		ic2.sellPushUpPop(13);
		ic1.sellIceCreamSandwich(20);
		ic1.sellIceCreamSandwich(15);
		ic1.sellIceCreamSandwich(20);
		
		outputICSs(ic1, ic2, ic3);
		
		
	}
	
	public static void outputICSs(IceCreamTruck ic1, IceCreamTruck ic2, IceCreamTruck ic3) {
		System.out.println("Truck 1\n" + ic1.toString());
		System.out.println();
		System.out.println("Truck 2\n" + ic2.toString());
		System.out.println();
		System.out.println("Truck 3\n" + ic3.toString());
		System.out.println();
	}
}


















