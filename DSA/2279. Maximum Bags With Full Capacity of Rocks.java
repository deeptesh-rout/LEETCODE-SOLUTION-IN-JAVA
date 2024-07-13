class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        /* Checking from the first index but we need to at first fill that bag which have min
        diff in capacity[i] and rocks[i]
        int sum = 0;
        for(int i = 0; i < capacity.length; i++){
            sum = sum + capacity[i];
        }
        if(additionalRocks > sum){
            return capacity.length;
        }
        int j = 0;
        for(int i = 0; i < capacity.length; i++){
            while(j < additionalRocks){
                if(rocks[i] < capacity[i]){
                    rocks[i] = rocks[i] + 1;
                }
                else if(rocks[i] == capacity[i]){
                    break;
                }
                j++;
            }
        }
        int count = 0;
        for(int i = 0; i < capacity.length; i++){
            if(capacity[i] == rocks[i]){
                count++;
            }
        }
        return count;*/
        int count = 0;
        int[] diff = new int[capacity.length];
        for(int i = 0; i < capacity.length; i++){
            diff[i] = capacity[i] - rocks[i];
        }
        Arrays.sort(diff);
        for(int j = 0; j < diff.length; j++){
            if(diff[j] == 0){
                count++;
            }else{
                if(additionalRocks >= diff[j]){
                    additionalRocks = additionalRocks - diff[j];
                    count++;
                }
            }
        }
        return count;
    }
}
