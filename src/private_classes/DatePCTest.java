package private_classes;

import static org.junit.Assert.*;

import org.junit.Test;

public class DatePCTest {
	
	

	private Date date = new Date();
	
	
	@Test
	public void dateClassExists() {
		assertNotNull("Date class exists", this.date);
	}
	
	
	@Test
	public void dateHasADay(){
		assertNotNull("Date class has a day property", this.date.getDay());
	}
	
	
	@Test
	public void dateHasAMonth(){
		assertNotNull("Date class has a month property", this.date.getMonth());
	}
	
	
	@Test
	public void dateHasAYear(){
		assertNotNull("Date class has a year property", this.date.getYear());
	}

}
