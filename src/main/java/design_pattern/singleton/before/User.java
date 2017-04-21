package design_pattern.singleton.before;

public class User {
	private String name;

	public User(String name) {
		this.name = name;
	}
	
	public void print(){
		Printer prn = new Printer();
		prn.print(String.format("%s print using %s.", name, prn.toString()));
	}
	
}
