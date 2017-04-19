package design_pattern.ch03.check01;

import org.apache.log4j.Logger;
import org.junit.Test;

public class OCPTest {
	private static final Logger log = Logger.getLogger(OCPTest.class);

	@Test
	public void testFakeTimeReminder() {
		log.debug("FakeTime()");
		TimeProvider tProvSub = new FakeTimeProvider();
		tProvSub.setHours(23);
		
		TimeReminder tr = new TimeReminder();
		tr.settProv(tProvSub);		
		tr.reminder();
	}
	
	@Test
	public void testRealTimeReminder() {
		log.debug("RealTime()");
		TimeProvider tProvSub = new RealTimeProvider();		
		
		TimeReminder tr = new TimeReminder();
		tr.settProv(tProvSub);		
		tr.reminder();
	}
	
}
