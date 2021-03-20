public class Clock{
	private int hour;
	private int minute;
	private boolean isDay;

	public Clock(){
		hour = 12;
		minute = 0;
		isDay = true;
	}

	public Clock(int hour, int minute){
		if(hour > 12){
			isDay = false;
			hour -= 12;
		}else{
			isDay = true;
		}

		this.hour = hour;
		this.minute = minute;
	}

	public int getHour(){
		return hour;
	}

	public int getMinute(){
		return miunute;
	}

	public boolean beforeNoon(){
		return isDay;
	}

	public void moveTime(int minute){
		if(minute > this.minute){
			if(minute > 60){
				int count = 0;
				while(minute < 60){
					minute -= 60;
					count++;
				}
				this.hour -= count;
				this.minute = 60 - minute - this.minute;
			} else{
				this.hour -= 1;
				this.minute = 60 - minute - this.minute;
			}
		} else{
			this.minute -= minute;
		}
	}
}
