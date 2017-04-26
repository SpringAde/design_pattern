package design_pattern.observer.after;

import java.util.Collections;
import java.util.List;

public class MinMaxView implements Observer{
	private ScoreRecord scoreRecord;
	private int viewCount;
	
	public MinMaxView(ScoreRecord scoreRecord) {
		this.scoreRecord = scoreRecord;	
	}
	
	@Override
	public void update() { //점수의 변경을 통보받는다.
		List<Integer> records = scoreRecord.getScores();
		displayMinMax(records);
		
	}
	private void displayMinMax(List<Integer> records) {
		int min = Collections.min(records);
		int max = Collections.max(records);
		System.out.printf("Min : %d Max : %d %n", min, max);
	}
	
}
