package design_pattern.composite_exercise.after;

import java.util.ArrayList;
import java.util.List;

public class Directory extends FileExplorer {	
	private List<Object> entries = new ArrayList<Object>();
	
	public Directory(String name) {
		super(name);		
	}
	
	public void addEntry(Object entry){
		entries.add(entry);	
	}
	
	public void removeEntry(Object entry){
		entries.remove(entry);
	}
	
	
	
	public int getSize(){
		int size = 0;
		for(Object entry : entries){
			if(entry instanceof File){
				size += ((File) entry).getSize();
			}else if(entry instanceof Directory){
				size += ((Directory) entry).getSize();
			}
		}
		return size;		
	}
	
	public void print(){
		for (int i=0; i<getDepth(); i++){
			System.out.println("\t");
		}
		System.out.println("[Directory] "+getName()+", Size : "+getSize());
		
		for (Object entry : entries){
			if(entry instanceof File){
				((File) entry).print();
			}else if(entry instanceof Directory){
				((Directory) entry).print();				
			}
		}
	}
	
}
