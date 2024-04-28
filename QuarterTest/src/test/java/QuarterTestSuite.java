import org.jfree.data.time.Quarter;
import org.junit.Assert;
import org.junit.Test;

public class QuarterTestSuite {
    @Test
    public void shouldConstructQuarter() {
        Quarter quarter = new Quarter();
        Assert.assertNotNull(quarter);
    }

    @Test
    public void shouldConstructQuarterWithYearAndQuarter() {
        Quarter quarter = new Quarter(1, 2024);
        Assert.assertNotNull(quarter);
    }
}
