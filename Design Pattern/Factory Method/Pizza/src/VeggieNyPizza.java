
public class VeggieNyPizza extends SimplePizza{
	public VeggieNyPizza(String type) {
		super(type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String introduce() {
		// TODO Auto-generated method stub
		return super.introduce() + " with " + this.s + " in New York style";
	}
}
