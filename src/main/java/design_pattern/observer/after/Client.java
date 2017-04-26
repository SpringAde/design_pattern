package design_pattern.observer.after;

public class Client {
	public static void main(String[] args) {
		ScoreRecord scoreRecord = new ScoreRecord();
		
		DataSheetView dataSheetView3 = new DataSheetView(scoreRecord, 3);		
		DataSheetView dataSheetView5 = new DataSheetView(scoreRecord, 5);		
		MinMaxView minMaxView = new MinMaxView(scoreRecord);
		
		scoreRecord.attach(dataSheetView3);
		scoreRecord.attach(dataSheetView5);
		scoreRecord.attach(minMaxView);		
		
		for(int i=1; i<6; i++){
			scoreRecord.addScore(i*10);
		}
		
		System.out.println("=============================");
		scoreRecord.detach(dataSheetView5);
		for(int i=1; i<6; i++){
			scoreRecord.addScore(i*10);
		}
	}
}
