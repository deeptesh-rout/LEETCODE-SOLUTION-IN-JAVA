import java.util.Scanner;

class Solution {
    public static int subtractProductAndSum(int n) {
        int rem;
        int prod = 1;
        int sum = 0;
        while(n>0){
            rem = n%10;
            prod = rem * prod;
            sum  = sum + rem;
            n = n/10;
        }
        int result = (prod - sum);
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(subtractProductAndSum(n));
        sc.close();
    } 
}
