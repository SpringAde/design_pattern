package design_pattern.observer.after;

import java.util.Collections;
import java.util.List;

public class DataSheetView implements Observer {
	private ScoreRecord scoreRecord;
	private int viewCount;
	
	public DataSheetView(ScoreRecord scoreRecord, int viewCount) {
		this.scoreRecord = scoreRecord;
		this.viewCount = viewCount;
	}
	@Override
	public void update() { //점수의 변경을 통보받는다.
		List<Integer> records = scoreRecord.getScores();
		displayScores(records, viewCount);		
	}
	private void displayScores(List<Integer> records, int viewCount) {
		System.out.print("List of "+viewCount + " entries : ");
		for(int i=0; i<viewCount && i<records.size(); i++){			
			System.out.print(records.get(i)+" ");
		}
		System.out.println();		
	}
	
}






