package private_classes;


public class Date {
	
	private Day day;
	private Month month;
	private Year year;
	
	
	public Date(int _day){
		this.day = new Day(_day);
		this.month = new Month();
		this.year = new Year();
	}
	
	
	public Integer getDay(){
		return this.day.day;
	}
	
	
	public Month getMonth(){
		return this.month;
	}
	
	
	public Year getYear(){
		return this.year;
	}
	
	
	private class Day{
		
		public Integer day;
		
		
		public Day(int value){
			
			if (value > 0 && value < 32)
				this.day = value;
				
			else if (value >= 32)
				this.day = 31;
			
			else
				this.day = 1;
		}
	}
	
	
	private class Month{
		
	}
	
	
	private class Year{
		
	}
}
