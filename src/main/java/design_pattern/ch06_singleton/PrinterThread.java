package design_pattern.ch06_singleton;

public class PrinterThread {
	
	private int count;
	private static PrinterThread printer = null;	
	private PrinterThread() {	}	//생성자를 외부에서 호출하지 못하도록 private선언
	
	public static PrinterThread getPrinter() {
//	public synchronized static PrinterThread getPrinter() {
		if (printer == null){
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			printer = new PrinterThread();			
		}
		return printer;
	}
	public void print(String str){
//	public synchronized void print(String str){
		count++;
		System.out.println(str+" : "+count);
	}
	@Override
	public String toString() {
		return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode());
	}
	
	
}
