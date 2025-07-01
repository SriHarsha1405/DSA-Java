import java.util.Scanner;

public class pattern20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();

        for(int i=0; i<range; i++){
            for(int j=0; j<i;j++){
                System.out.print(" ");
            }

            for(int j=0; j<2*range-(2*i+1);j++){
                System.out.print("*");
            }

            for(int j=0; j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
