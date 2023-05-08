class Solution {
    public int diagonalSum(int[][] mat) {
         
        int i,j;
        int sum = 0;
        
        for( i= 0 ; i< mat.length; i++){
            for(j = 0; j< mat[0].length; j++){
                if(i == j || (i + j) == mat.length -1  ){
                   sum = sum + mat[i][j]; 
                }
            }
        }
         return sum;
    }
}