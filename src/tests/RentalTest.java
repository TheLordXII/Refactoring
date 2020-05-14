import java.lang.*;
import java.util.*;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import classes.*;

package tests;

public class RentalTest{
    private Rental rental;
    private Movie movie;

    @Before
    public void setUp(){
        movie = new movie("Halloween", 0);
        rental = new Rental(movie, 10);
    }

    @Test
    public void getDaysRented(){
        assertEquals(10, rental.getDaysRented());
    }

    @Test
    public void getMovie(){
        assertEquals(movie, rental.getMovie());
    }
}