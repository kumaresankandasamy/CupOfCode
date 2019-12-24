package Array;

public class RemoveElement {
    public  int removeElement(int[] nums,int val){
        if(nums.length == 0){
            return 0;
        }
        int slow=0;
        for(int fast=0;fast<nums.length;fast++){
            if (nums[fast]!=val){
               nums[slow++] =  nums[fast];
            }
        }
        return  slow;
    }
}
