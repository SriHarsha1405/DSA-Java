import java.util.*;

public class pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();

        for(int i=0; i<range; i++){
            for(int j=0; j<range; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
