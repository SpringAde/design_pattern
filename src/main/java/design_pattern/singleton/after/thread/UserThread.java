package design_pattern.singleton.after.thread;

public class UserThread extends Thread {

	public UserThread(String name) {
		super(name);		
	}
	
	@Override
	   public void run(){
	      Printer prn = Printer.getPrinter();		//getPrinter()로 참조
	      String str = String.format(
	    		  "%s print using %s", 
	    		  Thread.currentThread().getName(), // 자신의 스레드 이름이 출력
    		  	  prn.getPrinter());
	      prn.print(str);
	   }
	
	
}
