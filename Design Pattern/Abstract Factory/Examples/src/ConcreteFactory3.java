
public class ConcreteFactory3 extends ConcreteFactory1{
	public ConcreteFactory3() {
		this.s = "Factory: 3";
		createScroll();
		createWindow();
	}

	@Override
	public void createWindow() {
		// TODO Auto-generated method stub
		this.window = new ConcreteWindow2();
	}
}
