class Solution {
    public String[] sortPeople(String[] names, int[] heights) {

        String[] results = new String[names.length];

        HashMap<Integer , String> maps = new HashMap<>();

        for(int i = 0 ; i < names.length; i++){
            maps.put(heights[i] , names[i]);
        }

        Arrays.sort(heights);
        int index = 0;

        for(int  i = heights.length - 1 ; i >= 0; i--){
            results[index++] = maps.get(heights[i]);
        }

        return results;

    }
}