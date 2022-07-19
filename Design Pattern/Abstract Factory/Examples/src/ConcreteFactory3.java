
public class ConcreteFactory3 extends ConcreteFactory1{

	@Override
	public Window createWindow() {
		// TODO Auto-generated method stub
		return new ConcreteWindow2();
	}
}
