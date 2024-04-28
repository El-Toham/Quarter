import org.jfree.data.time.Quarter;
import org.junit.Assert;
import org.junit.Test;

public class QuarterTestSuite {
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

}
