import java.util.*;
class Majority_Element {
    public int majorityElement(int[] nums) {
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<nums.length;i++)
       {
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
       if(map.get(nums[i])>nums.length/2)
       {
        return nums[i];
       }
    }
    return -1;
    }
    public static void main(String[] args) {
        Majority_Element obj = new Majority_Element();
        int[] nums = {3, 2, 3};
        int majorityElement = obj.majorityElement(nums);
        System.out.println(majorityElement); 
    }
}
