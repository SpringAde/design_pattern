	package design_pattern.observer.before;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord {
	private List<Integer> scores;
	private List<DataSheetView> dataSheetViews;
	private MinMaxView minMaxView;
	
	public ScoreRecord() {
		scores = new ArrayList<>();	
		dataSheetViews = new ArrayList<>();
	}
/*	public void setDataSheetView(DataSheetView dataSheetView) {
		this.dataSheetView = dataSheetView;
	}
*/
	public void addDataSheetView(DataSheetView dataSheetView){
		dataSheetViews.add(dataSheetView);
	}
			
	public void addScore(int score){
		scores.add(score);//autoboxing
//		dataSheetView.update();
		for(DataSheetView dataSheetView : dataSheetViews){
			dataSheetView.update();
		}
		minMaxView.update();
	}
	
	public void setMinMaxView(MinMaxView minMaxView) {
		this.minMaxView = minMaxView;
	}
	
	public List<Integer> getScores() {
		return scores;
	}
	
	
}
