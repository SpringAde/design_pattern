package design_pattern.ch09_observer;

public class User {
	public static void main(String[] args) {
		ScoreRecord scoreRecord = new ScoreRecord();
		DataSheetView dataSheetView3 = new DataSheetView(scoreRecord, 3);
		MinMaxView minMaxView = new MinMaxView(scoreRecord);
		StatisticsView statisticsView = new StatisticsView(scoreRecord);
		
//		scoreRecord.setDataSheetView(dataSheetView);
//		scoreRecord.setMinMaxView(minMaxView); // 서로 알고 있다.
		
		scoreRecord.attach(dataSheetView3);	//성적출력
		scoreRecord.attach(minMaxView);	// 최대값 최소값 출력
		scoreRecord.attach(statisticsView); //합계, 평균
		
		scoreRecord.addScore(77);
		
		
		for(int index=1; index<=5; index++){
			int score = index * 10;
			System.out.println("Adding... "+score);
			
			scoreRecord.addScore(score);
		}
	}
}
