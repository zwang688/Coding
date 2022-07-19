
public class ChicagoPizzaStore extends ConcretePizzaStore{
	protected Pizza makePizza(String type) {
		switch(type) {
			case "Sausage":
				return new SausageChicagoPizza(type);
			default:
				System.out.println("Type " + type + " is unknown for Chicago");
				return new SimplePizza(type);
		}
	}
}
