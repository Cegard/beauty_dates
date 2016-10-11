package private_classes;

import static org.junit.Assert.*;

import org.junit.Test;

public class DatePCTest {
	

	private Date date = new Date(10, 1);
	
	
	@Test
	public void dateClassExists() {
		assertNotNull("Date class exists", this.date);
	}
	
	
	@Test
	public void dateHasADay(){
		assertNotNull("failure - Date object is null", this.date.getDay());
	}
	
	
	@Test
	public void dateHasAMonth(){
		assertNotNull("failure - Date doesn't have a month property", this.date.getMonth());
	}
	
	
	@Test
	public void dateHasAYear(){
		assertNotNull("failure - Date doesn't have a year property", this.date.getYear());
	}
	
	
	@Test
	public void dateDayIsInt(){
		String intClass = "java.lang.Integer";
		String getDayClass = this.date.getDay().getClass().getName();
		assertEquals("failure - Day is not of type int", intClass, getDayClass);
	}
	
	
	@Test
	public void dayIsOneWhenNegativeOrCeroIsGiven(){
		Date date2 = new Date(-5, 1);
		int dayValue = date2.getDay();
		int lessOfAll = 1;
		assertEquals("failure - Day is negative or cero", dayValue, lessOfAll);
	}
	
	
	@Test
	public void dayIsThirtyOneWhenMoreIsGiven(){
		Date date2 = new Date(32, 1);
		int dayValue = date2.getDay();
		int greaterOfAll = 31;
		assertEquals("failure -" + dayValue + " is greater than 31", dayValue, greaterOfAll);
	}
	
	
	@Test
	public void dateMonthCanBeGiven(){
		Date date2 = new Date(1,1);
		boolean isDateTwooNotNull = date2 != null;
		assertTrue("failure - A month value can't be given", isDateTwooNotNull);
	}
	
	
	@Test
	public void dateMonthIsTheGivenInt(){
		int month = 2;
		Date dateTwoo = new Date(12, month);
		assertEquals("failure - the given value doesn't match gateMonth()", month, (int) dateTwoo.getMonth());
	}
}
