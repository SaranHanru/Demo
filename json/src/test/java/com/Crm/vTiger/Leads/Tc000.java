package com.Crm.vTiger.Leads;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Tc000 {
@Test	
public void login() {
	Reporter.log("Login Successfully",true);
}
@Test(dependsOnMethods="login")
public void addToCart() {
	Reporter.log("Added to Cart",true);
}
@Test(dependsOnMethods="addToCart")
public void purchase() {
	Reporter.log("Purchased",true);
}
}