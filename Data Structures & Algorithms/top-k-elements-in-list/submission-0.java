class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       HashMap<Integer,Integer> h= new HashMap<>();
       for(int num: nums)
       {
        h.put(num,h.getOrDefault(num,0)+1);
       }
       List<Integer>[] l=new ArrayList[nums.length+1];
       for(int i=0;i<l.length;i++)
       {
        l[i]=new ArrayList<>();
       }
       for(HashMap.Entry<Integer,Integer> entry :h.entrySet())
       {
        int num= entry.getKey();
        int count = entry.getValue();
        l[count].add(num);
       }
       int a[]=new int[k];
       int j=0;
       for(int i=l.length-1;i>=0&&j<k;i--)
       {
        Iterator<Integer> it = l[i].iterator();
    while (it.hasNext() && j < k) {
        a[j++] = it.next();
       }
    }
      return a;
    }
}
