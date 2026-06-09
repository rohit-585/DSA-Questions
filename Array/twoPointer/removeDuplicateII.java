public class removeDuplicateII {
    public static int removeDuplicateI(int[] nums) {
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(i<2 || nums[j]!=nums[i-2]){
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }
    static void main() {
        int[] nums = {1,1,2,2,2,3,3,3,4};
        System.out.println(removeDuplicateI(nums));
    }
}
