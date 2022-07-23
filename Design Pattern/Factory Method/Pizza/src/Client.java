import java.util.*;
public class Client {
	public static void main(String[] args) {
		
		String[] type = {"Sausage", "Cheese", "Veggie"};
		PizzaStore ps = new ChicagoPizzaStore();
		Pizza pizza;
		
		for(int i = 0; i < 3; i ++) {
			pizza = ps.prepare(type[i]);
			System.out.println();
		}
		
		ps = new NyPizzaStore();
		for(int i = 0; i < 3; i ++) {
			pizza = ps.prepare(type[i]);
			System.out.println();
		}
	}
}
