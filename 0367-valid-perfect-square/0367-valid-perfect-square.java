class Solution {
    public boolean isPerfectSquare(int num) {
        
        if(num < 2)
        {
            return true;
        }
        else {
            long s = 2;
            long e = num / 2;
            while (s <= e) {
                long mid = s + (e - s) / 2;
                if ((mid * mid) == num) {
                    return true;
                } else if ((mid * mid) > num) {
                    e = mid - 1;

                } else if ((mid * mid) < num) {
                    s = mid + 1;

                }
            }
        }
        return false;
}
}

