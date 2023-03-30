class Solution {
    static boolean canThisFormed(int n, int a[]){
        while(n>0){
            a[n%10]--;
            n=n/10;
        }
        for(int v:a){
            if(v<0)
                return false;
        }
        return true;
    }

    public int[] findEvenNumbers(int[] digits) {
        int f[]=new int[10];
        for(int i=0;i<digits.length;i++){
            f[digits[i]]++;
        }
        ArrayList<Integer>l=new ArrayList<Integer>();
        for(int i=100;i<=999;i++){
            int c[]=Arrays.copyOf(f, f.length);
    
            if(canThisFormed(i,c)&&i%2==0){
                l.add(i);
            }   
        }
        int ans[]=new int[l.size()];
        int index=0;
        for(int val:l){
            ans[index++]=val;
        }
        Arrays.sort(ans);
        return ans;
    }
}