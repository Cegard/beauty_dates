package private_classes;

import static org.junit.Assert.*;

import org.junit.Test;

public class DatePCTest {
	

	private Date date = new Date(10);
	
	
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
		assertEquals("failure - Day is not of type int", getDayClass, intClass);
	}
	
	
	@Test
	public void dayIsOneWhenNegativeOrCeroIsGiven(){
		Date date2 = new Date(-5);
		int dayValue = date2.getDay();
		int lessOfAll = 1;
		assertEquals("failure - Day is negative or cero", dayValue, lessOfAll);
	}
	
	
	@Test
	public void dayIs31WhenMoreIsGiven(){
		Date date2 = new Date(32);
		int dayValue = date2.getDay();
		int greaterOfAll = 31;
		assertEquals("failure -" + dayValue + " is greater than 31", dayValue, greaterOfAll);
	}

}
