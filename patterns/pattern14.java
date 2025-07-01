import java.util.*;

public class pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int num = 1;
        for(int i=1; i<=range; i++){
            for(int j=0; j<i; j++){
                System.out.print(num + "\t");
                num++;
            }
            System.out.println();
        }
    }
}
