package rt.hustle.dsa.algo.arrays.merge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MergeArrayVariationATest {
    private MergeArrayVariationA merger;

    @BeforeEach
    void setUp() {
        merger = new MergeArrayVariationA();
    }

    @Test
    void testBigON_NormalCase() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int[] expected = {1, 2, 2, 3, 5, 6};

        merger.bigON(nums1, 3, nums2, 3);
        assertArrayEquals(expected, nums1, "Arrays should be merged in sorted order");
    }

    @Test
    void testBigON_EmptyNums2() {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {};
        int[] expected = {1, 2, 3};

        merger.bigON(nums1, 3, nums2, 0);
        assertArrayEquals(expected, nums1, "nums1 should remain unchanged when nums2 is empty");
    }

    @Test
    void testBigON_EmptyNums1() {
        int[] nums1 = {0, 0, 0};
        int[] nums2 = {1, 2, 3};
        int[] expected = {1, 2, 3};

        merger.bigON(nums1, 0, nums2, 3);
        assertArrayEquals(expected, nums1, "nums1 should contain all elements from nums2");
    }

    @Test
    void testBigON_AllSmallerInNums1() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {4, 5, 6};
        int[] expected = {1, 2, 3, 4, 5, 6};

        merger.bigON(nums1, 3, nums2, 3);
        assertArrayEquals(expected, nums1, "Arrays should be merged maintaining order");
    }

    @Test
    void testBigON_AllLargerInNums1() {
        int[] nums1 = {4, 5, 6, 0, 0, 0};
        int[] nums2 = {1, 2, 3};
        int[] expected = {1, 2, 3, 4, 5, 6};

        merger.bigON(nums1, 3, nums2, 3);
        assertArrayEquals(expected, nums1, "Arrays should be merged maintaining order");
    }

    @Test
    void testBigONLogN_NormalCase() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int[] expected = {1, 2, 2, 3, 5, 6};

        merger.bigONLogN(nums1, 3, nums2, 3);
        assertArrayEquals(expected, nums1, "Arrays should be merged in sorted order");
    }

    @Test
    void testBigONLogN_EmptyNums2() {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {};
        int[] expected = {1, 2, 3};

        merger.bigONLogN(nums1, 3, nums2, 0);
        assertArrayEquals(expected, nums1, "nums1 should remain unchanged when nums2 is empty");
    }

    @Test
    void testBigONLogN_EmptyNums1() {
        int[] nums1 = {0, 0, 0};
        int[] nums2 = {1, 2, 3};
        int[] expected = {1, 2, 3};

        merger.bigONLogN(nums1, 0, nums2, 3);
        assertArrayEquals(expected, nums1, "nums1 should contain all elements from nums2");
    }

    @Test
    void testBigONLogN_DuplicateElements() {
        int[] nums1 = {1, 1, 1, 0, 0, 0};
        int[] nums2 = {1, 1, 1};
        int[] expected = {1, 1, 1, 1, 1, 1};

        merger.bigONLogN(nums1, 3, nums2, 3);
        assertArrayEquals(expected, nums1, "Arrays should be merged maintaining duplicates");
    }
}