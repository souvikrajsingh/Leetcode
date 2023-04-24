//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a, n);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solve {
    int[] findTwoElement(int arr[], int n) {
            int[] ans = { -1 , -1};
          int i = 0 ;
          while(i < n){
              int correct = arr[i] - 1;
              if(arr[i]!= arr[correct]){
                  int temp = arr[i];
                  arr[i] = arr[correct];
                  arr[correct] = temp;
              }
              else{
                  i++;
              }
          }
          
          for(int ind = 0; ind< n; ind++){
              if(arr[ind]!=(ind+1)){
                  ans[0] = arr[ind];
                  ans[1] = ind+1;
              }
          }
          return ans;
    }
}   