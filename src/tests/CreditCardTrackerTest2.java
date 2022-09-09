package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.CreditCard;

/**
 * @author Trevor Long - tlong5
 * CIS175 - Fall 2022
 * Sep 8, 2022
 */
public class CreditCardTrackerTest2 {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test3() {
		CreditCard discover = new CreditCard();
		discover.purchase(550.00);
		assertEquals(550.0, discover.balance(), 0.0);
		discover.payment(150.00);
		assertEquals(400.00, discover.balance(), 0.0);
	}

}
