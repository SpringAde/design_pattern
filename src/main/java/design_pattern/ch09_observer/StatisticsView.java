package design_pattern.ch09_observer;

import java.util.List;

public class StatisticsView implements Observer {
	private ScoreRecord scoreRecord;

	public StatisticsView(ScoreRecord scoreRecord) {
		this.scoreRecord = scoreRecord;
	}

	@Override
	public void update() {
		List<Integer> record = scoreRecord.getScoreRecord(); // 성적조회
		displayStatistics(record);
	}

	private void displayStatistics(List<Integer> record) {
		int sum = 0;		
		for(int scoreSum : record){
			sum =+ scoreSum;
		}
		
		double avg = sum / record.size();		
		System.out.println("Sum : "+sum+" / "+"Average : "+avg);
		System.out.println("=================================");
	}

}
