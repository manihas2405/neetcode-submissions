class Solution {
    public boolean isAnagram(String s, String t) {
      if(s.length()!=t.length())
      {
        return false;
      }
      char[] a = s.toCharArray();
      char[] b = t.toCharArray();
      HashMap<Character,Integer> h= new HashMap<>();
      for(int i=0;i<a.length;i++)
      {
          if(h.containsKey(a[i]))
          {
            h.put(a[i],h.get(a[i])+1);
          }
          else
          {
            h.put(a[i],1);
          }
      }
      for(int i=0;i<b.length;i++)
      {
        if(!h.containsKey(b[i]))
        {
            return false;
        }
        else
        {
            h.put(b[i],h.get(b[i])-1);
            if(h.get(b[i])<0)
            {
                return false;
            }
        }
      }
      return true;
    }
}
