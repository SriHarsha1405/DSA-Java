import java.util.Scanner;

public class pattern23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();

        int space = 0;
        for(int i=0; i<range; i++){
            for(int j=1; j<=range-i; j++){
                System.out.print("*");
            }

            for(int j=0; j<space; j++){
                System.out.print(" ");
            }

            for(int j=1; j<=range-i; j++){
                System.out.print("*");
            }

            System.out.println();
            space += 2;
        }

        space = 2 * (range - 1);
        for(int i=0; i<range; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }

            for(int j=0; j<space; j++){
                System.out.print(" ");
            }

            for(int j=0; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
            space -= 2;
        }
    }
}
