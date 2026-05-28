class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> h= new HashMap<>();
       int a[]=new int[2];
       for(int i=0;i<nums.length;i++)
       {
        int sum = target-nums[i];
         if(h.containsKey(sum))
         {
            a[0]=h.get(sum);
            a[1]=i;
            break;
         }
         else{
          h.put(nums[i],i);
         }
       } 
       return a;
    }
}
