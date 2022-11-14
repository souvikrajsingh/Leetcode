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


/*for (int i = 0; i < heights.length; i++) {
            int last = heights.length - i -1;
            int maxIndex = getmaxIndex(heights, 0 , last);
            swapString(names, last , maxIndex);
            //swapHeights(heights, last , maxIndex);
        }

       /* System.out.println(Arrays.toString(heights));
        System.out.println(Arrays.toString(names));*/

        /*return names;
    }

    static int getmaxIndex(int[] arr, int i, int last) {
        int max = i;
        for (int j = i; j <= last; j++) {
            if(arr[j]< arr[max]){
                max = j ;
            }
        }

        return max;
    }

    static void swapString(String [] arr, int j, int i) {
        String temp = arr[j];
        arr[j] =arr[i];
        arr[i] = temp;
    }
    /*static void swapHeights(int [] arr, int j, int i) {
        int  temp = arr[j];
        arr[j] =arr[i];
        arr[i] = temp;
    }*/