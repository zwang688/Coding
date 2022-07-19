public class Client {
	public static void main(String[] args) {
		System.out.println("Test project for Abstract Factory design pattern.");
		
		Widget widget = new Widget(new ConcreteFactory1(), "1");
		widget.print();
		
		widget = new Widget(new ConcreteFactory2(), "2");
		widget.print();
		
		widget = new Widget(new ConcreteFactory3(), "3");
		widget.print();
	}
}
