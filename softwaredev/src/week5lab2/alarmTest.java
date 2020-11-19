package week5lab2;

public class alarmTest {

	public static void main(String[] args) {
		
		alarmClock myAlarm = new alarmClock(11,0);
		myAlarm.setalarmTime(11, 1);
		
		while(myAlarm.checkAlarmTime()==false) {
			long wait= System.currentTimeMillis()+1000;
			while(System.currentTimeMillis()<wait);
			myAlarm.tick();
			System.out.println(myAlarm.showCurrentTime());
			}
		System.out.println("ring ring");

	}

}
