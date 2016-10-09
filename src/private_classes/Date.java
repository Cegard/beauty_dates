package private_classes;


public class Date {
	
	
	private Day day;
	private Month month;
	private Year year;
	
	
	public Date(){
		this.day = new Day();
		this.month = new Month();
		this.year = new Year();
	}
	
	
	public Day getDay(){
		return this.day;
	}
	
	
	public Month getMonth(){
		return this.month;
	}
	
	
	public Year getYear(){
		return this.year;
	}
	
	
	private class Day{
		
	}
	
	
	private class Month{
		
	}
	
	
	private class Year{
		
	}
}
