package design_pattern.ch02;

public class TestMain {
	
	public static void main(String[] args) {
		Pet[] p = {new Cat(), new Dog(), new Parrot()};
		groupTalk(p);
	}
	
	public static void groupTalk(Pet[] p){
		int i;
		
		for(i=0; i<p.length;i++){
			p[i].talk();
		}
		
		
	}
}
