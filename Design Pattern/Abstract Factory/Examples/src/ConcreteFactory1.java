
public class ConcreteFactory1 implements WidgetFactory{

	@Override
	public Scroll createScroll() {
		// TODO Auto-generated method stub
		return new ConcreteScroll1();
	}

	@Override
	public Window createWindow() {
		// TODO Auto-generated method stub
		return new ConcreteWindow1();
	}
}
