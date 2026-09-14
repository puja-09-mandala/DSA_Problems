class Solution {
    public int maximum69Number(int num) {
        String s = Integer.toString(num);
        int max = num;
        for (int i = 0; i < s.length(); i++) {
            char[] arr = s.toCharArray();
            if (arr[i] == '6') {
                arr[i] = '9';
            } else {
                arr[i] = '6';
            }
            int newNum = Integer.parseInt(new String(arr));
            max = Math.max(max, newNum);
        }
        return max;
    }
}