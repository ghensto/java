import java.util.Scanner;

public class InventoryItem {
	public String name;
	public String description;
	public String sku;
	public String category;
}
	
class IITester {
	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		InventoryItem i1 = new InventoryItem();
		InventoryItem i2 = new InventoryItem();
		
		System.out.print("Item 1 name: ");
		i1.name = kb.nextLine();
		System.out.print("Item 1 description: ");
		i1.description = kb.nextLine();
		System.out.print("Item 1 SKU: ");
		i1.sku = kb.nextLine();
		System.out.print("Item 1 category: ");
		i1.category = kb.nextLine();
		
		System.out.print("Item 2 name: ");
		i2.name = kb.nextLine();
		System.out.print("Item 2 description: ");
		i2.description = kb.nextLine();
		System.out.print("Item 2 SKU: ");
		i2.sku = kb.nextLine();
		System.out.print("Item 2 category: ");
		i2.category = kb.nextLine();
		
		System.out.println("Name\t\tSKU\t\tCategory\t\tDescription");
		System.out.println(i1.name + '\t' + i1.sku + '\t' + i1.category + '\t' + i1.description);
		System.out.println(i2.name + '\t' + i2.sku + '\t' + i2.category + '\t' + i2.description);
			
		
	
	}
}