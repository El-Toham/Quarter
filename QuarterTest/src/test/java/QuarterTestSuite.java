import org.jfree.data.time.Quarter;
import org.jfree.data.time.Year;
import org.junit.Assert;
import org.junit.Test;

import java.util.Calendar;
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

    // Method "getYear()"
    @Test
    public void shouldGetYearMethod() {
        Quarter quarter = new Quarter(1, 2024);
        Assert.assertEquals(2024, quarter.getYear());
    }

    // Method "getYearValue()"
    @Test
    public void shouldGetYearValueMethod() {
        Quarter quarter = new Quarter(1, 2024);
        Assert.assertEquals(2024, quarter.getYearValue());
    }

    // Method "toString()"
    @Test
    public void shouldToStringMethod() {
        Quarter quarter = new Quarter(1, 2024);
        Assert.assertEquals("Q1/2024", quarter.toString());
    }

    // Method "peg(Calendar calendar)"
    @Test(expected = NullPointerException.class)
    public void shouldReturnExceptionWhenPegCalendar() {
        Quarter quarter = new Quarter(1, 2024);
        quarter.peg(null);
    }

    // Method "getLastMillisecond()"
    @Test
    public void shouldGetLastMillisecond() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2024); // Assuming you're testing for the year 2024
        calendar.set(Calendar.MONTH, Calendar.MARCH); // March is the last month of the first quarter
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH)); // Set to the last day of March
        calendar.set(Calendar.HOUR_OF_DAY, 23); // Set to the last hour of the day
        calendar.set(Calendar.MINUTE, 59); // Set to the last minute of the hour
        calendar.set(Calendar.SECOND, 59); // Set to the last second of the minute
        calendar.set(Calendar.MILLISECOND, 999); // Set to the last millisecond of the second

        long expectedLastMillisecond = calendar.getTimeInMillis();

        Quarter quarter = new Quarter(1, 2024);

        Assert.assertEquals(expectedLastMillisecond, quarter.getLastMillisecond());
    }

}
