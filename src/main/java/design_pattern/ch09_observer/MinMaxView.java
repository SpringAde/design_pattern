package design_pattern.ch09_observer;

import java.util.Collections;
import java.util.List;

public class MinMaxView implements Observer{
	private ScoreRecord scoreRecord;

	public MinMaxView(ScoreRecord scoreRecord) {
		this.scoreRecord = scoreRecord;
	}
	
	@Override
	public void update() {
		List<Integer> record = scoreRecord.getScoreRecord(); // 점수 조회
		displayMinMax(record);	// 최대값과 최소값 출력
	}

	private void displayMinMax(List<Integer> record) {
		int min = Collections.min(record);
		int max = Collections.max(record);
		
		System.out.printf("Min : %s %nMax : %s%n", min, max);
	}

}
