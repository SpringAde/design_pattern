package design_pattern.ch09_observer;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord extends Subject{
	private List<Integer> scores;	// 점수저장
	
	public ScoreRecord() {
		scores = new ArrayList<>();
	}
	
	public void addScore(int score){
		scores.add(score);	// 점수 추가
		notifyObserver(); // 데이터 변경시, Subject의 notifyObserver호출
	}
	

	public List<Integer> getScoreRecord() {
		return scores;
	}
	
}
