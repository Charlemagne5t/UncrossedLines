import org.example.Solution;
import org.junit.Assert;
import org.junit.Test;

public class TestSolution {
    @Test
    public void maxUncrossedLinesTest1() {
        Assert.assertEquals(2, new Solution().maxUncrossedLines(new int[]{1, 4, 2}, new int[]{1, 2, 4}));
    }
    @Test
    public void maxUncrossedLinesTest2() {
        Assert.assertEquals(3, new Solution().maxUncrossedLines(new int[]{2,5,1,2,5}, new int[]{10,5,2,1,5,2}));
    }
}
