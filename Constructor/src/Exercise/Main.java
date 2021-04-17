package Exercise;

public class Main {

	public static void main(String[] args) {
		Clothes blouse = new Clothes();
		System.out.println("_____________________________________");
		System.out.println("+++ BLOUSE +++");
		System.out.println("Type: " + blouse.type);
		System.out.println("Brand: " + blouse.brand);
		System.out.println("Material: " + blouse.material);
		System.out.println("Price: " + "RM" + blouse.price);
		System.out.println("Size wanted: " + blouse.size);
		System.out.println("Suitable for: " + blouse.suitsFor);
		System.out.println("_____________________________________");

		
		Clothes jacket = new Clothes("Outwear", "Guess", "Leather", 3000, 'S','B');
		System.out.println("+++ JACKET +++");
		System.out.println("Type: " + jacket.type);
		System.out.println("Brand: " + jacket.brand);
		System.out.println("Material: " + jacket.material);
		System.out.println("Price: " + "RM" + jacket.price);
		System.out.println("Size wanted: " + blouse.size);
		System.out.println("Suitable for: " + jacket.suitsFor);
		System.out.println("_____________________________________");	
		}

}
