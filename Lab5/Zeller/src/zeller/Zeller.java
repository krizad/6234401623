package zeller;

public class Zeller {
	
	private int dayOfMonth, month, year;
	
	enum Day {
		
		SUNDAY("Sunday"),
		MONDAY("Monday"),
		TUESDAY("Tuesday"),
		WEDNESDAY("Wednesday"),
		THURSDAY("Thursday"),
		FRIDAY("Friday"),
		SATURDAY("Saturday");
		
		private final String DATE;
		Day(String DATE) {
			this.DATE = DATE;
		}
		
		public String getText() {
			return (DATE);
		}
	}
	
	public Zeller (int d, int m, int y) {
		this.dayOfMonth = d;
		this.month = m;
		this.year = (m <=2 ? y-1 : y);
	}
	
	public String getDayOfWeek() {
		int h = (dayOfMonth + ((26*((month <= 2 ? month+12 : month)+1)))/10 + year%100 + (year%100)/4 + (year/100)/4 + 5*(year/100))%7;
		String TEXT = Integer.toString(h);
        switch (h){
            case 0:
                TEXT = Day.SATURDAY.getText();
                break;
            case 1:
                TEXT = Day.SUNDAY.getText();
                break;
            case 2:
                TEXT = Day.MONDAY.getText();
                break;
            case 3:
                TEXT = Day.TUESDAY.getText();
                break;
            case 4:
                TEXT = Day.WEDNESDAY.getText();
                break;
            case 5:
                TEXT = Day.THURSDAY.getText();
                break;
            case 6:
                TEXT = Day.FRIDAY.getText();
                break; 
        }
        return TEXT;
	}
}
