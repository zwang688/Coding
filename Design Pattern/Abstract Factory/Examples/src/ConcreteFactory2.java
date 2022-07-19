
public class ConcreteFactory2 implements WidgetFactory{
	Scroll scroll;
	Window window;
	String s;
	
	public ConcreteFactory2() {
		this.s = "Factory: 2";
		createScroll();
		createWindow();
	}

	@Override
	public void createScroll() {
		// TODO Auto-generated method stub
		this.scroll = new ConcreteScroll1();
	}

	@Override
	public void createWindow() {
		// TODO Auto-generated method stub
		this.window = new ConcreteWindow1();
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(this.s + " " + scroll.introduce() + " " + window.introduce());
	}
}
