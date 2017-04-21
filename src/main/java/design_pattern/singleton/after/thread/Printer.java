package design_pattern.singleton.after.thread;

public class Printer {
	
//	private static Printer printer = new Printer();		//해결1
	private static Printer printer = null;
	
	private int count;
	
	private Printer() {	}
	
//	public static Printer getPrinter() {
	public synchronized static Printer getPrinter() {
		if(printer == null){			
			try {
				Thread.sleep(1);		//0.001초 대기 후 생성
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
			printer = new Printer();
		}
		return printer;
	}
	
//	public void print(String str){
	public synchronized void print(String str){		//print()메서드도 count++ 동시 접근으로 인해 동기화로 처리
		count++;
		System.out.println(str+" : "+count);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode());
	}
	
}
