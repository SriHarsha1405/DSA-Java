import java.util.*;

public class fibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int a,b,c;
        if(range == 1  || range == 2){
            System.out.println("1");
        } else{
            a = 1; b = 1;
            c = 0;
            for(int i=3; i<range; i++){
                c = a + b;
                a = b;
                b = c;
            }
            System.out.println(c);
        }
    }
}
