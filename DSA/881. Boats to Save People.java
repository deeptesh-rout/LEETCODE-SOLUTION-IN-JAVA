class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int count = 0;
        int i = 0;
        int j = people.length-1;
        while(i < j){
            if(people[i] + people[j] <= limit){
                count++;
                i++;
                j--;
            }else{
                count++;
                j--;
            }
        }
        if(i == j){
            count++;
        }
        return count;
    }
}
