package design_pattern.singleton.after;

public class User {
	private String name;

	public User(String name) {
		this.name = name;
	}
	
	public void print(){
		Printer prn = Printer.getPrinter();		// 싱글턴 사용
		prn.print(String.format("%s print using %s.", name, prn.toString()));
	}
	
}
