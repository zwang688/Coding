
public class NyPizzaStore extends ConcretePizzaStore{
	protected Pizza makePizza(String type) {
		switch(type) {
		case "Cheese":
			return new CheeseNyPizza(type);
		case "Veggie":
			return new VeggieNyPizza(type);
			default:
				System.out.println("Type " + type + " is unknown for NY");
				return new SimplePizza(type);
		}
	}
}
