package day15;

public class MergeTwoSortedArray {
    public static int[] mergeSortedArray(int[] nums1, int [] nums2){

        int [] result = new int[nums1.length + nums2.length];
        int i=0;
        int j=0;
        int k=0;
        while (i<nums1.length && j<nums2.length){
            if (nums1[i]<=nums2[j]){
                result[k] = nums1[i];
                i++;
            }else {
                result[k] =nums2[j];
                j++;
            }
            k++;
        }
        while (i<nums1.length){
            result[k]=nums1[i];
            j++;
            k++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,3,2,5};
        int[] nums2={4,7,6};
        int [] result = mergeSortedArray(nums1,nums2);
        for (int num: result){
            System.out.println(num+ "");
        }
    }
}
