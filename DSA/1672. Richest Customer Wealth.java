import java.util.Scanner;

class Solution {
    public static int maximumWealth(int[][] accounts) {
        int n = accounts.length;
        int sum = 0;
        int max = 0;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<accounts[i].length; j++){
                sum = sum + accounts[i][j];
            }
            if(sum > max){
                max = sum;
            }
            sum = 0;
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] accounts = new int[n][];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<accounts[i].length; j++){
                accounts[i][j] = sc.nextInt();
            }
        }
        System.out.println(maximumWealth(accounts));
    }
}
