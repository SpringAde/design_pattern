package design_pattern.ch06_singleton;

public class Printer {
	
/*	private static final StudentService instance = new StudentService();		
	private StudentService() {}
	public static StudentService getInstance() {	return instance;	}
*/
	
	private static Printer printer = null;
	private Printer() {	}	//생성자를 외부에서 호출하지 못하도록 private선언
	public static Printer getPrinter() {
		if (printer == null){
			printer = new Printer();			
		}
		return printer;
	}

	public void print(String str){
		System.out.println(str);
	}
	@Override
	public String toString() {
		return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode());
	}
	
	
}
