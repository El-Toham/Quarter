import org.jfree.data.time.Quarter;
import org.junit.Assert;
import org.junit.Test;

public class QuarterTestSuite {
    @Test
    public void shouldConstructQuarter() {
        Quarter quarter = new Quarter();
        Assert.assertNotNull(quarter);
    }
}
