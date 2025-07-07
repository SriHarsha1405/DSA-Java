import java.util.*;

public class powOfTwo {
    public static void main(String[] args) {
        int num = 10;
        boolean b = findWhetherPowOfTwo(num);
        if(b == true){
            System.out.println(num + " is power of 2");
        } else {
            System.out.println(num + " is not power of 2");
        }
    }

    private static boolean findWhetherPowOfTwo(int num) {
        int temp = num;
        int count = 0;
        while(num > 1){
            int q = num / 2;
            count++;
            num = q;
        }

        int res = (int) Math.pow(2, count);
        return temp == res;
    }
}
