
public abstract class ConcretePizzaStore implements PizzaStore{
	// hook
	protected Pizza makePizza(String type) {
		return new SimplePizza(type);
	}
	@Override
	public Pizza prepare(String type) {
		// TODO Auto-generated method stub
		Pizza pizza = makePizza(type);
		bake(pizza);
		cut(pizza);
		ready(pizza);
		return pizza;		
	}
	
	private void bake(Pizza pizza) {
		System.out.println("Baking " + pizza.introduce());
	}
	
	private void cut(Pizza pizza) {
		System.out.println("Cutting " + pizza.introduce());
	}
	
	private void ready(Pizza pizza) {
		System.out.println(pizza.introduce() + " is ready");
	}

}
