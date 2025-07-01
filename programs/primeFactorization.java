import java.util.*;

public class primeFactorization {
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2; i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1; i<=num; i++){
            if(isPrime(i)){
                if(num % i ==0){
                    System.out.print(i + " ");
                }
            }
        }
    }
}
