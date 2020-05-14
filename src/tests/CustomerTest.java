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
        String statement = "Rental Record for Ted" + "\n";
        statement += "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";
        statement += "Amount owed is " + "0.0" + "\n";
        statement += "You earned " + "0" + " frequent renter points";

        assertEquals(statement, customer.statement());
    }

}