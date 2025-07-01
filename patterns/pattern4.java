import java.util.*;

public class pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();

        for (int i = range; i >= 1; i--) {

            for (int j = 1; j < i; j++) {
                System.out.print("\t");
            }

            for (int j = 0; j <= range - i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
