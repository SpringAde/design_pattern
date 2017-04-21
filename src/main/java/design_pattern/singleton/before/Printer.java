package design_pattern.singleton.before;

public class Printer {
	public void print(String str){
		System.out.println(str);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode());
	}

	
	
	
}
