package warmup2;

public class NoTriples {
    /*
    Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array. Return true if the array does not contain any triples.

    noTriples([1, 1, 2, 2, 1]) → true
    noTriples([1, 1, 2, 2, 2, 1]) → false
    noTriples([1, 1, 1, 2, 2, 2, 1]) → false
     */

    public boolean noTriples(int[] nums) {
        // check for the same value in 3 consecutive indices

        if (nums.length < 3){
            return true;
        }

        boolean noTriples = true;

        for (int i = 0; i < nums.length - 2; i++){

            if (nums[i] == nums[i+1] && nums[i] == nums[i+2]){
                noTriples = false;
                break;
            }
        }
        return noTriples;
    }
}
