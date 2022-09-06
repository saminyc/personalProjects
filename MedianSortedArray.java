import java.util.Arrays;

public class Solution {// nums=[1,2,3]

    public static void main(String[] args) {
        int[] arr1 = { 1, 3 };
        int[] arr2 = { 2 };
        System.out.println(findMedianSortedArrays(arr1, arr2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int mergedArray_length = nums1.length + nums2.length;
        double[] mergedArray = new double[mergedArray_length];

        for (int i = 0; i < nums1.length; i++) {
            mergedArray[i] = nums1[i];
        }

        for (int j = nums1.length; j < mergedArray_length; j++) {

            mergedArray[j] = nums2[j - 2];
        }

        Arrays.sort(mergedArray);

        double ans = 0.0;
        if (mergedArray.length % 2 == 0) {
            ans = (mergedArray[(mergedArray.length / 2) - 1] +
                    mergedArray[(mergedArray.length / 2)]) / 2.0;
        } else {
            ans = mergedArray[mergedArray.length / 2];

        }
        return ans;

    }

}
