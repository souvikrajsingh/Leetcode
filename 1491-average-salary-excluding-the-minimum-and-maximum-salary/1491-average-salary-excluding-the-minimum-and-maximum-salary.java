class Solution {
    public double average(int[] salary) {
         Arrays.sort(salary);
        int cnt = 0;
        double sum  = 0;
        for (int i = 1; i < salary.length - 1 ; i++) {
            sum = sum + salary[i];
            cnt++;
        }
        return sum / cnt;
    }
}
