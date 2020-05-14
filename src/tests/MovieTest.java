import java.lang.*;
import java.util.*;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import classes.*;

package tests;

public class MovieTest{
    private Movie movie;

    @Before
    public void setUp(){
        movie = new Movie("Friday the 13th", 0);
    }

    @Test
    public void getPriceCode(){
        assertEquals(0, movie.getPriceCode());
    }

    @Test
    public void getTitle(){
        assertEquals("Friday the 13th", movie.getTitle());
    }
}