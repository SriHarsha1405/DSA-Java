import java.util.Scanner;

public class conversion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(Integer.parseInt(s,2));
        System.out.println(Integer.parseInt(s,8));
        System.out.println(Integer.parseInt(s,16));
    }
}
