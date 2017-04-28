package design_pattern.composite_exercise.after;

public class File extends FileExplorer {
	private int size;
	
	public File(String name, int size) {
		super(name);
		this.size = size;		
	}	

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public void print() {
		for(int i=0; i<getDepth(); i++){
			System.out.println("\t");
		}
		System.out.println("[File] "+getName()+", Size : "+getSize());
	}
	
	
	
	
}
