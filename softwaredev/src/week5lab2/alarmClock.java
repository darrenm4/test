package week5lab2;

public class alarmClock {
	
	//variables
	private time currentTime;
	private time alarmTime;
	private boolean set = true;
	
	//constructors
	public alarmClock() {
		currentTime = new time(0,0);
		alarmTime = new time(0,0);
	}
	public alarmClock(int h,int min) {
		currentTime = new time(h,min);
		alarmTime = new time(0,0);
	}
	
	//getters and setters
	public void setalarmTime(int h,int min) {
		alarmTime.setTime(h, min, 0);
	}
	public String showAlarmTime() {
		return(alarmTime.getHour()+":"+alarmTime.getMinute());
	}
	public boolean AlarmStatus() {
		return set;
	}
	public void setCurrentTime(int h,int min) {
		currentTime.setTime(h,min,0);
	}
	public void tick() {
		currentTime.tick();
	}
	public String showCurrentTime() {
		return (currentTime.getHour()+":"+currentTime.getMinute()+":"+currentTime.getSecond());
	}
	public void enableAlarm() {
		set= true;
	}
	public void disableAlarm() {
		set= false;
	}
	public boolean checkAlarmTime(){
		int alarmHour=alarmTime.getHour();
		int alarmMinute=alarmTime.getMinute();
		
		if(currentTime.getHour()==alarmHour && currentTime.getMinute()==alarmMinute && set == true) {
			set=false;
			return true;
		}
		else 
			return false;
	}
	//toString
	
	
	//misc methods

}
