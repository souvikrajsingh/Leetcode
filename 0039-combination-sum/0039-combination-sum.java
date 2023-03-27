class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }

    private void findCombinations(int ind, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds) {
        if (target == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        if (target < 0 || ind == arr.length) {
            return;
        }

        // include current candidate in the combination
        ds.add(arr[ind]);
        findCombinations(ind, arr, target - arr[ind], ans, ds);
        ds.remove(ds.size() - 1);

        // exclude current candidate from the combination
        findCombinations(ind + 1, arr, target, ans, ds);
    }
}