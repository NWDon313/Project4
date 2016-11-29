package Conventer;

import static org.junit.Assert.*;

import org.junit.Test;

public class BoundryTestCelsious {

	@Test
	public void test() {
		Conventer test = new Conventer();
		try {
			assertEquals(-128.89, test.celsius(-200), 0.10);
		}
		catch (Exception e){
			
			assertSame("Invalid Values", e);
			
		}
		
	}




}
