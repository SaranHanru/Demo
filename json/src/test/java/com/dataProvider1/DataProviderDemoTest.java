package com.dataProvider1;

//import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemoTest {
	@Test (dataProvider = "bookTicketDataProvider")
	public void ticketBook(String src, String dest) {
		//Reporter.log("Ticket is booked from "+src+" to"+dest,true);
	      System.out.println("Ticket booking is confirmed from "+src+" to"+dest);
	      System.out.println("Happy Journey");
	}
	
	@DataProvider Object[][]bookTicketDataProvider() {
		Object[][] objArr =new Object[5][2];
		objArr[0][0] ="Chennai";
		objArr[0][1] ="Bangalore";
		
		objArr[1][0] ="Chennai";
		objArr[1][1] ="Mysore";
		
		objArr[2][0] ="Chennai";
		objArr[2][1] ="Pune";
		
		objArr[3][0] ="Chennai";
		objArr[3][1] ="Mumbai";
		
		objArr[4][0] ="Chennai";
		objArr[4][1] ="Kerala";
		
		
		return objArr;
		
	}

}
