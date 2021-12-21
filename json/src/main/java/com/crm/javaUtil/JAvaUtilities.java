package com.crm.javaUtil;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Date;
import java.util.Random;

import org.testng.annotations.Test;

public class JAvaUtilities {
	/**
	 * This will return the random number
	 * @return 
	 */
	public int getRandomNumber() {
		Random rdm= new Random();
		int Rnum = rdm.nextInt();
		return Rnum;	
	}
	@Test
	public String getSystemDate() {
		Date d=new Date();
		//int date1 = d.getDate();
		String date2 = d.toString();
		//System.out.println(date1);
		return date2;
	}

	public void getVirtualKey() throws AWTException {
		Robot r =new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
	}
}
