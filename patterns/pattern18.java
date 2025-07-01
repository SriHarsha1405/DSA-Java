import java.util.Scanner;

public class pattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();

        for(int i=1; i<=range; i++){
            for(int j=1; j<i; j++){
                System.out.print(" ");
            }
            for(int j=i; j<=range; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
