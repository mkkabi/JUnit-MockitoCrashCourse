package orderProcessingService.order.bo;

import java.sql.SQLException;
import orderProcessingService.order.bo.exception.BOException;
import orderProcessingService.order.dao.OrderDAO;
import orderProcessingService.order.dto.Order;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;

public class OrderBOImplTest {
    
    @Mock
    OrderDAO dao;
	
    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
    }
    
    @Test
    public void placeOrder_Shourd_Create_An_Order() throws SQLException, BOException{
        OrderBOImpl bo = new OrderBOImpl();
        bo.setDao(dao);
        Order order = new Order();
        when(dao.create(order)).thenReturn(new Integer(1));
        
        boolean result = bo.placeOrder(order);
        
        assertTrue(result);
        verify(dao).create(order);
    }
    
    @Test
    public void placeOrder_Should_NOT_Create_An_Order() throws SQLException, BOException{
        OrderBOImpl bo = new OrderBOImpl();
        bo.setDao(dao);
        Order order = new Order();
        when(dao.create(order)).thenReturn(new Integer(0));
        
        boolean result = bo.placeOrder(order);
        
        assertFalse(result);
        verify(dao).create(order);
    }
    
    @Test(expected = BOException.class)
    public void placeOrder_Should_Throw_BOException() throws SQLException, BOException{
        OrderBOImpl bo = new OrderBOImpl();
        bo.setDao(dao);
        Order order = new Order();
        when(dao.create(order)).thenThrow(SQLException.class);        
        boolean result = bo.placeOrder(order);
        
    }
}
