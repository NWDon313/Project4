package Conventer;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runners.JUnit4;

public class BoundryTest {

	@Test
	public void test() {
		Conventer test = new Conventer();
		try {
			assertEquals(211, test.farenheit(99.44), 0.10);
		}
		catch (Exception e){
			
			assertSame("Invalid Values", e);
			
		}
		
	}




}
