package design_pattern.observer.before;

public class Client {
	public static void main(String[] args) {
		ScoreRecord scoreRecord = new ScoreRecord();
		
		DataSheetView dataSheetView3 = new DataSheetView(scoreRecord, 3);
		scoreRecord.addDataSheetView(dataSheetView3);
		
		DataSheetView dataSheetView5 = new DataSheetView(scoreRecord, 5);
		scoreRecord.addDataSheetView(dataSheetView5);
		
		MinMaxView minMaxView = new MinMaxView(scoreRecord);
		scoreRecord.setMinMaxView(minMaxView);
		
		for(int i=1; i<6; i++){
			scoreRecord.addScore(i*10);
		}
	}
}
