package Conventer;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runners.JUnit4;

public class BoundryTestFarenheit {

	@Test
	public void test() {
		Conventer test = new Conventer();
		try {
			assertEquals(-400, test.farenheit(-240), 0.10);
		}
		catch (Exception e){
			
			assertSame("Invalid Values", e);
			
		}
		
	}




}
