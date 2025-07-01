import java.util.*;

public class calculateGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int min = Math.min(n1, n2);
        int gcd = 1;
        for(int i=1; i<=min; i++){
            if(n1%i ==0 && n2%i == 0){
                gcd = i;
            }
        }
        System.out.println(gcd);
    }
}
