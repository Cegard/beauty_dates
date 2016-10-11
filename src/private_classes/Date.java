package private_classes;


public class Date {
	
	private Day day;
	private Month month;
	private Year year;
	
	
	public Date(int _day, int _month){
		this.day = new Day(_day);
		this.month = new Month(_month);
		this.year = new Year();
	}
	
	
	public Integer getDay(){
		return this.day.value;
	}
	
	
	public Integer getMonth(){
		return this.month.value;
	}
	
	
	public Year getYear(){
		return this.year;
	}
	
	
	private class Day{
		
		public Integer value;
		
		
		public Day(int day){
			
			if (day > 0 && day < 32)
				this.value = day;
				
			else if (day >= 32)
				this.value = 31;
			
			else
				this.value = 1;
		}
	}
	
	
	public class Month{
		
		public int value;
		
		
		public Month(int month){
			this.value = month;
		}
	}
	
	
	private class Year{
		
	}
}
