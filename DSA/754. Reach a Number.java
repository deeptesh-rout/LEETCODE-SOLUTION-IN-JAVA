class Solution {
    public int reachNumber(int target) {
        //need to try again
        target = Math.abs(target);
        int sum = 0;
        int step = 0;
        while(sum < target){
            step++;
            sum = sum + step;
        }
        while((sum - target) % 2 != 0){
            step++;
            sum = sum + step;
        }
        return step;
    }
}
