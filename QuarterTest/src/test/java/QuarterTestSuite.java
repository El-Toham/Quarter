import org.jfree.data.time.Quarter;
import org.jfree.data.time.Year;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class QuarterTestSuite {

    //*************Constructors*************//

    // Default Constructor "Quarter()"
    @Test
    public void shouldConstructQuarter() {
        Quarter quarter = new Quarter();
        Assert.assertNotNull(quarter);
    }

    // Parameterized constructor "Quarter(int quarter, int year)".
    @Test
    public void shouldConstructQuarterWithYearAndQuarter() {
        Quarter quarter = new Quarter(1, 2024);
        Assert.assertNotNull(quarter);
    }

    @Test
    public void shouldGetQuarter() {
        Quarter quarter = new Quarter(1, 2024);
        Assert.assertEquals(1, quarter.getQuarter());
    }

    @Test
    public void shouldGetYear() {
        Quarter quarter = new Quarter(1, 2024);
        Assert.assertEquals(2024, quarter.getYear());
    }

    @Test(expected = IllegalArgumentException.class)
    public void quarterShouldInRange(){
        Quarter quarter = new Quarter(5, 2024);
    }

    @Test(expected = IllegalArgumentException.class)
    public void yearShouldInRange(){
        Quarter quarter = new Quarter(1, 19999);
    }

    // Parameterized constructor "Quarter(int quarter, Year year)".
    @Test
    public void shouldConstructQuarterWithYearAndQuarter2() {
        Quarter quarter = new Quarter(1, 2024);
        Assert.assertNotNull(quarter);
    }

    @Test
    public void shouldGetQuarter2() {
        Quarter quarter = new Quarter(1, 2024);
        Assert.assertEquals(1, quarter.getQuarter());
    }

    @Test
    public void shouldGetYear2() {
        Quarter quarter = new Quarter(1, 2024);
        Assert.assertEquals(2024, quarter.getYear());
    }

    @Test(expected = IllegalArgumentException.class)
    public void quarterShouldInRange2(){
        Quarter quarter = new Quarter(5, 2024);
    }

    @Test(expected = IllegalArgumentException.class)
    public void yearShouldInRange2(){
        Quarter quarter = new Quarter(1, 19999);
    }

    // Parameterized constructor "Quarter(Date time)".
    @Test
    public void shouldConstructQuarterWithDate() {
        Quarter quarter = new Quarter(new Date(2024, 1, 1));
        Assert.assertNotNull(quarter);
    }

    //*************Methods*************//

    // Method "getQuarter()"
    @Test
    public void shouldGetQuarterMethod() {
        Quarter quarter = new Quarter(1, 2024);
        Assert.assertEquals(1, quarter.getQuarter());
    }
}
