package exe3;

public class RiskTime {
	private int hour;
	private int minute;
	private int second;

	void setTime(int newHour, int newMinute, int newSecond) throws Exception {
		
		if(newHour < 0 || newHour >= 24)
			throw new Exception();
		if(newMinute < 0 || newMinute >= 60)
			throw new Exception();
		if(newSecond < 0 || newSecond >= 60)
			throw new Exception();
		hour = newHour;
		minute = newMinute;
		second = newSecond;
		
	}

	int[] getTime() {
		int result[] = { hour, minute, second };
		return result;
	}
	
	RiskTime(){
		try {
			setTime(0,0,0);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	void incrementTime() {
		/* mutator implementation */ }
	
	public static void main(String[] args){
		RiskTime riskTime = new RiskTime();
		try {
			riskTime.setTime(2, 56, 32);
			System.out.println("Horario: " + riskTime.getTime()[0] + ":" + riskTime.getTime()[1] + ":" + riskTime.getTime()[2]);
		} catch (Exception e) {
			System.out.println("Excessao 1");
		}
		
	}

}
