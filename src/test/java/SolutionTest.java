import org.junit.Assert;
import org.junit.Test;
//master branch...
/** 
* Solution Tester. 
* 
* @author <Authors name> 
* @since <pre>11ÔÂ 27, 2023</pre> 
* @version 1.0 
*/
public class SolutionTest {

    @Test
    public void testCompareVersion(){

        Solution s = new Solution();
        Assert.assertEquals(s.compareVersion("1.01","1.001"),0);
        Assert.assertEquals(s.compareVersion("1.0","1.00"),0);
        Assert.assertEquals(s.compareVersion("0.1","1.1"),-1);
    }


} 
