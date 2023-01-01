class Solution {
    public String strWithout3a3b(int a, int b) {
       
      StringBuilder sb = new StringBuilder();
      while(a>0 || b>0)
      {
       if(a>2*b)
        {
         sb.append('a');
          a--;
        }
          
       if(b>2*a)
      {
       sb.append('b');
       b--;
      }
          
    else if(a>0 && b>0)
   {
   sb.append('a');
   sb.append('b');
    a--;
    b--;
  }
          
}
        
return sb.toString();

}
    
}