import org.example.VailRotate;
import org.junit.Assert;
import org.junit.Test;

public class VailRotateTest {

    @Test
    public void testRotateLeftOne() {
        VailRotate vailRotate = new VailRotate();
        int[] nums = {1, 2, 3, 4, 5};
        int k = 2;
        int[] expected = {3, 4, 5, 1, 2};
        vailRotate.rotateLeftOne(nums, k);
        Assert.assertArrayEquals(expected, nums);
    }

    @Test
    public void testRotateLeftTwo() {
        VailRotate vailRotate = new VailRotate();
        int[] nums = {1, 2, 3, 4, 5};
        int k = 2;
        int[] expected = {3, 4, 5, 1, 2};
        vailRotate.rotateLeftTwo(nums, k);
        Assert.assertArrayEquals(expected, nums);
    }

    @Test
    public void testRotateLeftOneWithKGreaterThanNumsLength() {
        VailRotate vailRotate = new VailRotate();
        int[] nums = {1, 2, 3, 4, 5};
        int k = 7;
        int[] expected = {3, 4, 5, 1, 2};
        vailRotate.rotateLeftOne(nums, k);
        Assert.assertArrayEquals(expected, nums);
    }

    @Test
    public void testRotateLeftTwoWithKGreaterThanNumsLength() {
        VailRotate vailRotate = new VailRotate();
        int[] nums = {1, 2, 3, 4, 5};
        int k = 8;
        int[] expected = {4, 5, 1, 2, 3};
        vailRotate.rotateLeftTwo(nums, k);
        Assert.assertArrayEquals(expected, nums);
    }

    @Test
    public void testRotateLeftOneWithNegativeShift() {
        VailRotate vailRotate = new VailRotate();
        int[] nums = {1, 2, 3, 4, 5};
        int k = -2;
        vailRotate.rotateLeftOne(nums, k);
        // No changes should occur as negative shift is invalid
        int[] expected = {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, nums);
    }

    @Test
    public void testRotateLeftTwoWithNegativeShift() {
        VailRotate vailRotate = new VailRotate();
        int[] nums = {1, 2, 3, 4, 5};
        int k = -2;
        vailRotate.rotateLeftTwo(nums, k);
        // No changes should occur as negative shift is invalid
        int[] expected = {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, nums);
    }

    @Test
    public void testReflectMid() {
        VailRotate vailRotate = new VailRotate();
        int[] nums = {1, 2, 3, 4, 5};
        vailRotate.reflectMid(nums, 0, nums.length - 1);
        int[] expected = {5, 4, 3, 2, 1};
        Assert.assertArrayEquals(expected, nums);
    }
}
