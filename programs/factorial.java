import java.util.*;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fact = 1;
        if(num == 0 || num == 1){
            fact = 1;
        } else {
            for(int i=1; i<=num; i++){
                fact = fact * i;
            }
        }
        System.out.println(fact);
    }
}
