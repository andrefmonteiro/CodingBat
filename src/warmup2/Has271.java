package warmup2;

public class Has271 {
    /*
    Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value, followed by the value plus 5, followed by the value minus 1. Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.

    has271([1, 2, 7, 1]) → true
    has271([1, 2, 8, 1]) → false
    has271([2, 7, 1]) → true
     */

    public boolean has271(int[] nums) {
        // 2,7,1
        // 2,7,-1..3

        if (nums.length < 3){
            return false;
        }

        boolean hasPattern = false;
        int initialValue = 0;

        for (int i = 0; i < nums.length - 2; i++){

            initialValue = nums[i];

            if ((nums[i+1] == initialValue + 5) && (nums[i+2] >= initialValue - 3 && nums[i+2] <= initialValue + 1)){
                hasPattern = true;
                break;
            }
        }
        return hasPattern;
    }
}
