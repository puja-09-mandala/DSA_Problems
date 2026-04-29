import java.util.*;
class Solution {
    List<List<Integer>> list = new ArrayList<>();
    public void subsequence(int arr[], int idx, List<Integer> ans) {
        if (idx == arr.length) {
            list.add(new ArrayList<>(ans));
            return;
        }
        ans.add(arr[idx]);
        subsequence(arr, idx + 1, ans);
        ans.remove(ans.size() - 1);
        while (idx + 1 < arr.length && arr[idx] == arr[idx + 1]) {
            idx++;
        }
        subsequence(arr, idx + 1, ans);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);   
        subsequence(nums, 0, new ArrayList<>());
        return list;
    }
}