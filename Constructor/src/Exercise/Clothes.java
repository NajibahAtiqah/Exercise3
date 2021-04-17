package Exercise;

import java.util.Scanner;

public class Clothes {
	
	String type;
	String brand;
	String material;
	int price;
	char size;
	char suitsFor;
	
	Scanner s = new Scanner(System.in);
	//default constructor
	//Clothes Blouse = new Clothes();
	Clothes() {
		
		System.out.println("Enter the type of clothes: ");
		this.type = s.nextLine();
		System.out.println("Enter the brand of clothes: ");
		this.brand = s.nextLine();
		System.out.println("Enter material of clothes: ");
		this.material = s.nextLine();		
		System.out.println("Enter price of clothes: ");
		this.price = s.nextInt();
		System.out.println("What size do you want?");
		this.size = s.next().charAt(0);
		System.out.println("It is suitable for male, female or both?");
		this.suitsFor = s.next().charAt(0);
			
	}
	
	
	//Parameterized constructor
	Clothes(String t, String b, String m, int p, char n, char q){
			this.type=t;
			this.brand=b;
			this.material=m;
			this.price=p;
			this.size=n;
			this.suitsFor=q;


}
}
