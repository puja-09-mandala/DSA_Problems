class Solution {
    public int maxVowels(String s, int k) {
        char arr[]=s.toCharArray();
        int maxx=0;
        int count=0;
      for(int i=0;i<k;i++)
      {
        if(arr[i]=='a'||arr[i]=='e'|| arr[i]=='o'|| arr[i]=='i'||arr[i]=='u')
        {
            count++;
        }
      }
      maxx=count;
      for(int i=k;i<arr.length;i++)
      {
        char curr=arr[i];
       if(curr=='a'||curr=='e'||curr=='o'|| curr=='i'||curr=='u')
        {
            count++;
        }
        if(arr[i-k]=='a'||arr[i-k]=='i'|| arr[i-k]=='e'|| arr[i-k]=='o'||arr[i-k]=='u')
        {
            count--;
        }
        maxx=Math.max(maxx,count); 
      }  
      return maxx;
    }
}