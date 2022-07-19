public class Client {
	public static void main(String[] args) {
		System.out.println("Test project for Abstract Factory design pattern.");
		
		WidgetFactory factory = new ConcreteFactory1();
		
		factory.print();
		
		factory = new ConcreteFactory2();
		
		factory.print();
		
		factory = new ConcreteFactory3();
		
		factory.print();
	}
}
