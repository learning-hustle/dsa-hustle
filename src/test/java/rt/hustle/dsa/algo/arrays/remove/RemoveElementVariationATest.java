package rt.hustle.dsa.algo.arrays.remove;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rt.hustle.dsa.algo.arrays.merge.MergeArrayVariationA;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RemoveElementVariationATest {
    private RemoveElementVarientA remove;

    @BeforeEach
    void setUp() {
        remove = new RemoveElementVarientA();
    }

    @Test
    void testBigON_NormalCase() {
        int[] nums1 = {3, 2, 2, 3};
        remove.bigO_N(nums1, 3);
        assertArrayEquals(new int[]{3, 2, 2, 3}, nums1);
        assertArrayEquals(new int[]{1, 2}, nums1, "Arrays should be merged maintaining order");
    }
}