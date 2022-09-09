package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import model.CreditCard;

/**
 * @author Trevor Long - tlong5
 * CIS175 - Fall 2022
 * Sep 8, 2022
 */
public class CreditCardTrackerTest1 {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test1() {
		CreditCard personal = new CreditCard();
		personal.purchase(220.00);
		assertEquals(220.00, personal.balance(), 0.0);
	}
	
	@Test
	public void test2() {
		CreditCard business = new CreditCard();
		assertEquals(15.5, business.chargeInterest(100.00), 0.0);
		assertNotNull(business.balance());
	}
}
