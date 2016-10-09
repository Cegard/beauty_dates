package private_classes;

import static org.junit.Assert.*;

import org.junit.Test;

public class DatePCTest {

	@Test
	public void dateClassExists() {
		Date date = new Date();
		assertNotNull("Date class exists", date);
	}

}
