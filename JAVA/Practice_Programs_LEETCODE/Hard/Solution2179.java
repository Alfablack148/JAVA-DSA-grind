package JAVA.Practice_Programs_LEETCODE.Hard;

import java.util.HashMap;
import java.util.Map;

public class Solution2179 {
     private long[] segTree;

    private void updateSegTree(int stIdx, int start, int end, int queryIdx) {
        if (end < queryIdx || start > queryIdx) return;
        if (start == end) {
            segTree[stIdx]++;
            return;
        }
        int mid = start + (end - start) / 2;
        updateSegTree(2 * stIdx, start, mid, queryIdx);
        updateSegTree(2 * stIdx + 1, mid + 1, end, queryIdx);
        segTree[stIdx] = segTree[2 * stIdx] + segTree[2 * stIdx + 1];
    }

    private long rangeSumQuery(int stIdx, int start, int end, int qs, int qe) {
        if (qs > end || qe < start) return 0;
        if (start >= qs && end <= qe) return segTree[stIdx];
        int mid = start + (end - start) / 2;
        long leftSum = rangeSumQuery(2 * stIdx, start, mid, qs, qe);
        long rightSum = rangeSumQuery(2 * stIdx + 1, mid + 1, end, qs, qe);
        return leftSum + rightSum;
    }

    public long goodTriplets(int[] nums1, int[] nums2) {
        int n = nums1.length;
        segTree = new long[4 * n + 1];

        Map<Integer, Integer> nums2ValIdx = new HashMap<>();
        for (int i = 0; i < n; i++) {
            nums2ValIdx.put(nums2[i], i);
        }

        updateSegTree(1, 0, n - 1, nums2ValIdx.get(nums1[0]));

        long countGoodTriplets = 0;
        for (int i = 1; i < n - 1; i++) {
            int nums2Idx = nums2ValIdx.get(nums1[i]);
            long commonLeftElements = rangeSumQuery(1, 0, n - 1, 0, nums2Idx);
            long uncommonLeftItems = i - commonLeftElements;
            long commonRightElements = (n - nums2Idx - 1) - uncommonLeftItems;
            countGoodTriplets += commonLeftElements * commonRightElements;

            updateSegTree(1, 0, n - 1, nums2Idx);
        }
        return countGoodTriplets;
    }
}
