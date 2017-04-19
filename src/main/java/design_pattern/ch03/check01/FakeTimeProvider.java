package design_pattern.ch03.check01;

import java.util.Calendar;

public class FakeTimeProvider implements TimeProvider {
	private Calendar cal;

	public FakeTimeProvider() {
		cal = Calendar.getInstance();	// 실제 시간
	}
	
	public FakeTimeProvider(int hour){
		this();	// 자신의 기본 생성자 호출
		setHours(hour);	// 사용자가 직접 시간 설정
	}

	@Override
	public void setHours(int hours) {
		cal.set(Calendar.HOUR_OF_DAY, hours);		
	}

	@Override
	public int getTime() {
		return cal.get(Calendar.HOUR_OF_DAY);
	}

}
