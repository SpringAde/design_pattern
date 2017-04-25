package design_pattern.ch09_observer;

import java.util.List;

public class DataSheetView implements Observer {
	private ScoreRecord scoreRecord;
	private int viewCount;

	public DataSheetView(ScoreRecord scoreRecord, int viewCount) {
		this.scoreRecord = scoreRecord;
		this.viewCount = viewCount;
	}
	
	@Override
	public void update() {	// 데이터 변화를 통보 받는다.
		List<Integer> record = scoreRecord.getScoreRecord(); // 점수조회
		displayScores(record, viewCount); // 점수를 count만큼만 출력	
	}

	private void displayScores(List<Integer> record, int viewCount) {
		System.out.println("List of "+viewCount+" entries : ");
		for(int i=0; i<viewCount && i<record.size(); i++){			
			System.out.print(record.get(i)+" ");
		}				
		System.out.println();
	}

	

}
