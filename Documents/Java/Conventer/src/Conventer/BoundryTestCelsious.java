package Conventer;

import static org.junit.Assert.*;

import org.junit.Test;

public class BoundryTestCelsious {

	//>>> Far > Cel
	//Equivlance Partitioning test 
	//Number below the absolute zero input: 500
	//Expected output "0 Temperature out of the scalele"
	@Test
	public void test001() {
		Conventer test = new Conventer();
		try {
			assertEquals(0, test.celsius(-500), 0.10);
		}
		catch (Exception e){
			
			assertSame("Invalid Values", e);
			
		}
		
	}
	
	
	//>>> Far > Cel
	//Equivlance Partitioning test 
	//Negative number above absoulte zero
	//Input:-200 
	//Expected output "-128.89â€�
	@Test
	public void test002() {
		Conventer test = new Conventer();
		try {
			assertEquals(-128.89, test.celsius(-200), 0.10);
		}
		catch (Exception e){
			
			assertSame("Invalid Values", e);
			
		}
		
	}
	
	
	//>>> Far > Cel
		//Equivlance Partitioning test 
		//Positive number below 100 degrees 
		//Input:-150
		//Expectd output "65.56"
		@Test
		public void test003() {
			Conventer test = new Conventer();
			try {
				assertEquals(65.56, test.celsius(150), 0.10);
			}
			catch (Exception e){
				
				assertSame("Invalid Values", e);
				
			}
			
		}
		
		//>>> Far > Cel
		//Equivlance Partitioning test 
		//Positive number above 100cc 
		//Input:350
		//Expected output "0 Temperature out of the scaleâ€�
		@Test
		public void test004(){
			Conventer test = new Conventer();
			try {
				assertEquals(0, test.celsius(350), 0.10);
			}
			catch (Exception e){
				
				assertSame("Invalid Values", e);
				
			}
			
		
		
		}
				
				//>>> Far > Cel
				//Boundry value of -273F degrees test 
				//Input:-459.4
				//Expected output "-273â€�
				@Test
				public void test005(){
					Conventer test = new Conventer();
					try {
						assertEquals(-273, test.celsius(-459.4), 0.10);
					}
					catch (Exception e){
						
						assertSame("Invalid Values", e);
						
					}
			
		}

				//>>> Far > Far
				//Boundry value of -273F degrees test 
				//Below boundry
				//Input:-460 (273.3)
				//Expected output "Temperature out of the scaleâ€�
				@Test
				public void test06(){
					Conventer test = new Conventer();
					try {
						assertEquals(0, test.celsius(-460), 0.10);
					}
					catch (Exception e){
						
						assertSame("Invalid Values", e);
						
					}
			
		}

				//>>> Far > Cel
				//Boundry value of -273F degrees test 
				//Above boundry
				//Input:-459.22
				//Expected output "Temperature out of the scaleâ€�
				@Test
				public void test07(){
					Conventer test = new Conventer();
					try {
						assertEquals(-272.9, test.celsius(-459.22), 0.10);
					}
					catch (Exception e){
						
						assertSame("Invalid Values", e);
						
					}
			
		}
				
				//>>> Far > Cel
				//Boundry value of 100C degrees test 
				//Exact 100C
				//Input:212
				//Expected output "100â€�
				@Test
				public void test08(){
					Conventer test = new Conventer();
					try {
						assertEquals(100, test.celsius(212), 0.10);
					}
					catch (Exception e){
						
						assertSame("Invalid Values", e);
						
					}
					}
					
					//>>> Far > Cel
					//Boundry value of 100C degrees test 
					//Below boundry value
					//Input:211.64
					//Expected output "99.8â€�
					@Test
					public void test09(){
						Conventer test = new Conventer();
						try {
							assertEquals(99.8, test.celsius(211.64), 0.10);
						}
						catch (Exception e){
							
							assertSame("Invalid Values", e);
							
						}
					}
						//>>> Far > Cel
						//Boundry value of 100C degrees test 
						//Above boundry value
						//Input:212.36 (100.2C)
						//Expected output "Temperature out of the scale"
						@Test
						public void test010(){
							Conventer test = new Conventer();
							try {
								assertEquals(0, test.celsius(212.36), 0.10);
							}
							catch (Exception e){
								
								assertSame("Invalid Values", e);
								
							}
						
					
			
		}
						
						//>>> Far > Cel
						//Boundry value of 0C degrees test 
						//Exact 0 degrees
						//Input:32
						//Expected output "0â€�
						@Test
						public void test011(){
							Conventer test = new Conventer();
							try {
								assertEquals(0, test.celsius(32), 0.10);
							}
							catch (Exception e){
								
								assertSame("Invalid Values", e);
								
							}
						
					
			
		}

						//>>> Far > Cel
						//Boundry value of 0C degrees test 
						//Above boundry value
						//Input:212.36 (100.2C)
						//Expected output "Temperature out of the scaleâ€�
						@Test
						public void test012(){
							Conventer test = new Conventer();
							try {
								assertEquals(0.5, test.celsius(32.9), 0.10);
							}
							catch (Exception e){
								
								assertSame("Invalid Values", e);
								
							}
					
			
		}
						
						//>>> Far > Cel
						//Boundry value of 0C degrees test 
						//Below boundry value
						//Input:31.1
						//Expected output "-0.5â€�
						@Test
						public void test013(){
							Conventer test = new Conventer();
							try {
								assertEquals(-0.5, test.celsius(31.1), 0.10);
							}
							catch (Exception e){
								
								assertSame("Invalid Values", e);
								
							}
							
					
			
		}
						
						
						//>>> Cel > Far
						//Equivlance Partitioning test 
						//Negative number below absoulte zero
						//Input:-284.4
						//Expected output "0 Temperature out of the scale"
						@Test
						public void test014(){
							Conventer test = new Conventer();
							try {
								assertEquals(0, test.farenheit(-284.4), 0.10);
							}
							catch (Exception e){
								
								assertSame("Invalid Values", e);
								
							}
						}
							
							//>>> Cel > Far
							//Equivlance Partitioning test 
							//Negative number above absoulte zero
							//Input:-240
							//Expected output -400
							@Test
							public void test015(){
								Conventer test = new Conventer();
								try {
									assertEquals(-400, test.farenheit(-240), 0.10);
								}
								catch (Exception e){
									
									assertSame("Invalid Values", e);
									
								}
							}
								
								//>>> Cel > Far
								//Equivlance Partitioning test 
								//Negative number above absoulte zero
								//Input:50
								//Expected output 122
								@Test
								public void test016(){
									Conventer test = new Conventer();
									try {
										assertEquals(122, test.farenheit(50), 0.10);
									}
									catch (Exception e){
										
										assertSame("Invalid Values", e);
										
									}

		}
								
								//>>> Cel > Far
								//Equivlance Partitioning test 
								//Negative number above absoulte zero
								//Input:104.44
								//Expected output "0 Temperature out of the scale"
								@Test
								public void test017(){
									Conventer test = new Conventer();
									try {
										assertEquals(0, test.farenheit(104.44), 0.10);
									}
									catch (Exception e){
										
										assertSame("Invalid Values", e);
										
									}

		}
								
								
								//>>> Cel > Far
								//Boundry value of 460F degrees test 
								//Above boundry value
								//Input:-273.33
								//Expected output -460
								@Test
								public void test018(){
									Conventer test = new Conventer();
									try {
										assertEquals(-460, test.farenheit(-273.33), 0.10);
									}
									catch (Exception e){
										
										assertSame("Invalid Values", e);
										
									}
								
							
					
				}
								
								//>>> Cel > Far
								//Boundry value of 460F degrees test 
								//Above boundry value
								//Input:-273.6 
								//Expected output "0 Temperature out of the scale"
								@Test
								public void test019(){
									Conventer test = new Conventer();
									try {
										assertEquals(0, test.farenheit(-273.6), 0.10);
									}
									catch (Exception e){
										
										assertSame("Invalid Values", e);
										
									}
								
							
					
				}
								
								//>>> Cel > Far
								//Boundry value of 460F degrees test 
								//Above boundry value
								//Input:-273.055
								//Expected output -459.5
								@Test
								public void test020(){
									Conventer test = new Conventer();
									try {
										assertEquals(-459.5, test.farenheit(-273.055), 0.10);
									}
									catch (Exception e){
										
										assertSame("Invalid Values", e);
										
									}
								
							
					
				}
								
								
								
								//>>> Cel > Far
								//Boundry value of 460F degrees test 
								//Above boundry value
								//Input:-273.055
								//Expected output -459.5
								@Test
								public void test021(){
									Conventer test = new Conventer();
									try {
										assertEquals(-459.5, test.farenheit(-273.055), 0.10);
									}
									catch (Exception e){
										
										assertSame("Invalid Values", e);
										
									}
								
							
					
				}
						
								
								//>>> Cel > Far
								//Boundry value of 212F degrees test 
								//Above boundry value
								//Input:-273.055
								//Expected output -459.5
								@Test
								public void test0022(){
									Conventer test = new Conventer();
									try {
										assertEquals(-459.5, test.farenheit(-273.055), 0.10);
									}
									catch (Exception e){
										
										assertSame("Invalid Values", e);
										
									}
								}
									
									

									//>>> Cel > Far
									//Boundry value of 212F degrees test 
									//Above boundry value
									//Input:100
									//Expected output 212
									@Test
									public void test023(){
										Conventer test = new Conventer();
										try {
											assertEquals(212, test.farenheit(100), 0.10);
										}
										catch (Exception e){
											
											assertSame("Invalid Values", e);
											
										}

				}
									
									//>>> Cel > Far
									//Boundry value of 212F degrees test 
									//Above boundry value
									//Input:100.56
									//Expected output "0 Temperature out of the scale"
									@Test
									public void test029(){
										Conventer test = new Conventer();
										try {
											assertEquals(0, test.farenheit(100.56), 0.10);
										}
										catch (Exception e){
											
											assertSame("Invalid Values", e);
											
										}

				}
									
									
									
									//>>> Cel > Far
									//Boundry value of 212F degrees test 
									//Above boundry value
									//Input:99.44
									//Expected output 211
									@Test
									public void test024(){
										Conventer test = new Conventer();
										try {
											assertEquals(211, test.farenheit(99.44), 0.10);
										}
										catch (Exception e){
											
											assertSame("Invalid Values", e);
											
										}

				}
									
									//>>> Cel > Far
									//Boundry value of 0F degrees test 
									//Above boundry value
									//Input:-17.78
									//Expected output 0
									@Test
									public void test025(){
										Conventer test = new Conventer();
										try {
											assertEquals(0, test.farenheit(-17.78), 0.10);
										}
										catch (Exception e){
											
											assertSame("Invalid Values", e);
											
										}

				}
									
									

									//>>> Cel > Far
									//Boundry value of 0F degrees test 
									//Above boundry value
									//Input:-18
									//Expected output -0.4
									@Test
									public void test026(){
										Conventer test = new Conventer();
										try {
											assertEquals(-0.4, test.farenheit(-18), 0.10);
										}
										catch (Exception e){
											
											assertSame("Invalid Values", e);
											
										}

				}
									
									//>>> Cel > Far
									//Boundry value of 0F degrees test 
									//Above boundry value
									//Input:-17.5
									//Expected output: 0.5
									@Test
									public void test027(){
										Conventer test = new Conventer();
										try {
											assertEquals(0.5, test.farenheit(-17.5), 0.10);
										}
										catch (Exception e){
											
											assertSame("Invalid Values", e);
											
										}

				}
								
								

								



}
