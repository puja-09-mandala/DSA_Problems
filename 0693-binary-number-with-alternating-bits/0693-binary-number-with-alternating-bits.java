class Solution {
    public boolean hasAlternatingBits(int n) {
        StringBuilder str=new StringBuilder();
     while(n>0)
     {
        int digit=n%2;
        str.append(digit);
        n=n/2;
     }
     String binaryString = str.reverse().toString();
     char arr[]=binaryString.toCharArray();
     boolean is=true;
    for(int i=0;i<arr.length-1;i++)
    {
        if(arr[i]==arr[i+1])
        {
            is=false;
            break;
        }
    }
    return is;
    }
}