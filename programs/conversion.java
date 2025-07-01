import java.util.*;

public class conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int base = sc.nextInt();

        if(base == 2){
            String s = Integer.toBinaryString(num);
            System.out.println(s);
        } else if(base == 8){
            String s = Integer.toOctalString(num);
            System.out.println(s);
        } else if(base == 16){
            String s = Integer.toHexString(num);
            System.out.println(s);
        } else{
            System.out.println("Invalid Base");
        }

    }
}
