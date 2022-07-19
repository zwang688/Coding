
public class ConcreteWindow1 implements Window{
	String s;
	
	public ConcreteWindow1() {
		this.s = "Window: 1";
	}

	@Override
	public String introduce() {
		// TODO Auto-generated method stub
		return this.s;
	}
}
