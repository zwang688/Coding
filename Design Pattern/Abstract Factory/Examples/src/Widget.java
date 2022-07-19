
public class Widget {
	private Scroll scroll;
	private Window window;
	String s;
	
	Widget(WidgetFactory factory, String s) {
		scroll = factory.createScroll();
		window = factory.createWindow();
		this.s = s;
	}
	
	public void print() {
		System.out.println("Factory " + s + " " + scroll.introduce() + " " + window.introduce());
	}
}
