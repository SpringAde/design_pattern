package design_pattern.composite_exercise;

import java.util.ArrayList;
import java.util.List;

public class Directory {
	private String name;
	private int depth = 0;
	private List<Object> entries = new ArrayList<Object>();
	
	public Directory(String name) {
		this.name = name;
	}
	
	public void setDepth(int depth) {
		this.depth = depth;
	}

	public String getName() {
		return name;
	}	

	public void addEntry(Object entry){
		entries.add(entry);
		if (entry instanceof File){
			((File) entry).setDepth(depth+1);
		}else if(entry instanceof Directory){
			((Directory) entry).setDepth(depth+1);
		}
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
		for (int i=0; i<depth; i++){
			System.out.println("\t");
		}
		System.out.println("[Directory] "+name+", Size : "+getSize());
		
		for (Object entry : entries){
			if(entry instanceof File){
				((File) entry).print();
			}else if(entry instanceof Directory){
				((Directory) entry).print();				
			}
		}
	}
	
}
