import java.util.*;

public class digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int count = 0;
        while(temp != 0){
            temp = temp / 10;
            count  = count + 1;
        }
        int div = (int) Math.pow(10, count-1);
        while(num != 0){
            int digit = num / div;
            System.out.println(digit);
             num = num % div;
             div = div / 10;
        }
    }
}
