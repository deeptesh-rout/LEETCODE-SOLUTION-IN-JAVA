class Solution {
  public int countOdds(int low, int high) {
      int total;
      if(high > low){
          total = (high - low) + 1;
      }else{
          total = (low - high) + 1;
      }
      if(total % 2 == 0){
          return total/2;
      }else{
          if(low < high){
              return low % 2 == 0 ? total/2 : (total/2)+1;
          }else{
              return high % 2 == 0 ? total/2 : (total/2)+1;
          }
      }
  }
}
