class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int[] pairs = new int[spells.length];
        for(int i = 0; i < spells.length; i++){
            long factor = (long)Math.ceil((double)success/spells[i]);
            pairs[i] = find(potions, factor);
        }
        return pairs;
    }
    public int find(int[] potions, long success){
        int start = 0;
        int end = potions.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if((potions[mid]) < success){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return potions.length - start;
    }
}
