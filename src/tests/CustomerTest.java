import java.lang.*;
import java.util.*;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import classes.*;

package tests;

public class CustomerTest{
    private Customer customer;

    @Before
    public void setUp(){
        customer = new Customer("Ted");
    }

    @Test
    public void getName(){
        assertEquals("Ted", customer.getName());
    }

    @Test
    public void statement(){
        assertTrue(customer.statement().startsWith("Rental Record"));
        assertTrue(customer.statement().endsWith("points"));
    }

}