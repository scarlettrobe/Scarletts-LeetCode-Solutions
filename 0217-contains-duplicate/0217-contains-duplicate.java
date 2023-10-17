class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> uniqueNums = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            if(uniqueNums.contains(nums[i])){
                return true;
            }
            uniqueNums.add(nums[i]);
        }
        return false;
    }
}