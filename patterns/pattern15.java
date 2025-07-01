import java.util.*;

public class pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int num = 1;
        for(int i=1; i<=range; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }
}
