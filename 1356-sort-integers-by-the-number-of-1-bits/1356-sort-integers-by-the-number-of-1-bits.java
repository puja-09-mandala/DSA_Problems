class Solution {

    public int binary(int n)
    {
        // int temp=n;
        int count=0;
        while(n>0)
        {
            if(n%2==1)
            {
                count++;
            }
            n=n/2;
        }
         return count;
    }
    public int[] sortByBits(int[] arr) {
       Integer[] temp = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        Arrays.sort(temp, (a, b) -> {
            int countA = binary(a);
            int countB = binary(b);
            if (countA != countB) {
                return countA - countB;
            }
            // if equal, compare by value
            return a - b;
        });
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
        return arr;
    }
}