class Solution {
    public int maxValue(int n, int index, int maxSum) {
        //try again
        long r = n - index - 1;
        long l = index;

        long low = 1;
        long high = maxSum;
        long res = 0;

        while(low <= high){
            long mid = low + (high - low)/2;
            long sum = mid;
            long lsum = 0;//left sum
            long rsum = 0;//right sum
            long m = mid - 1;

            if(r<=m){
                rsum = m*(m+1)/2 - (m-r)*(m-r+1)/2;
            }else{
                rsum = m*(m+1)/2 + 1*(r-m);
            }

            if(l<=m){
                lsum = m*(m+1)/2 - (m-l)*(m-l+1)/2;
            }else{
                lsum = m*(m+1)/2 + 1*(l-m);
            }

            sum = sum + lsum + rsum;

            if(sum <= maxSum){
                res = mid;
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return (int)res;
    }
}
