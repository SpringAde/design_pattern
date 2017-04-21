package design_pattern.singleton.after.mystatic;

public class Printer {
	private static int counter=0;
	public synchronized static void print(String str){	//메서드 동기화
		counter++;
		System.out.println(str+" : "+counter);
	}
}
