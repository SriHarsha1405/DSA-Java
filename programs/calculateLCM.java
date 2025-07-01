import java.util.*;

public class calculateLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int prod = n1 * n2;
        int max = Math.max(n1, n2);
        int lcm=prod;
        for(int i=max; i<=prod; i++){
            if(i%n1 == 0 && i%n2 == 0){
                lcm = i;
                break;
            }
        }
        System.out.println(lcm);
    }
}
