package orderProcessingService.order.bo;

import orderProcessingService.order.dao.OrderDAO;
import orderProcessingService.order.dto.Order;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class OrderBOImplTest {
	
	public OrderBOImplTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}
	
	@Before
	public void setUp() {
	}
	
	@After
	public void tearDown() {
	}

	/**
	 * Test of getDao method, of class OrderBOImpl.
	 */
	@Test
	public void testGetDao() {
		System.out.println("getDao");
		OrderBOImpl instance = new OrderBOImpl();
		OrderDAO expResult = null;
		OrderDAO result = instance.getDao();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of setDao method, of class OrderBOImpl.
	 */
	@Test
	public void testSetDao() {
		System.out.println("setDao");
		OrderDAO o = null;
		OrderBOImpl instance = new OrderBOImpl();
		instance.setDao(o);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of placeOrder method, of class OrderBOImpl.
	 */
	@Test
	public void testPlaceOrder() throws Exception {
		System.out.println("placeOrder");
		Order order = null;
		OrderBOImpl instance = new OrderBOImpl();
		boolean expResult = false;
		boolean result = instance.placeOrder(order);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of cancelOrder method, of class OrderBOImpl.
	 */
	@Test
	public void testCancelOrder() throws Exception {
		System.out.println("cancelOrder");
		int id = 0;
		OrderBOImpl instance = new OrderBOImpl();
		boolean expResult = false;
		boolean result = instance.cancelOrder(id);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of deleteOrder method, of class OrderBOImpl.
	 */
	@Test
	public void testDeleteOrder() throws Exception {
		System.out.println("deleteOrder");
		int id = 0;
		OrderBOImpl instance = new OrderBOImpl();
		boolean expResult = false;
		boolean result = instance.deleteOrder(id);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
}
