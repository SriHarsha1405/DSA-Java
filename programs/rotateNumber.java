import java.util.*;

public class rotateNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = sc.nextInt();
        int div = (int) Math.pow(10,k);
        int rot = num % div;
        num = num / div;
        int temp = num;
        int count = 0;
        while(num != 0){
            num = num / 10;
            count  = count + 1;
        }
        int div1 = (int) Math.pow(10,count);
        rot = rot * div1;
        rot = rot + temp;
        System.out.println(rot);
    }
}
