import java.util.*;

public class pythagoreanTriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int great = Math.max(Math.max(a,b),c);
        boolean triplets = false;
        if(great == a){
            if(Math.pow(b,2) + Math.pow(c,2) == Math.pow(a,2)){
                triplets = true;
            }
        }
        else if(great == b){
            if(Math.pow(a,2) + Math.pow(c,2) == Math.pow(b,2)){
                triplets = true;
            }
        }
        else{
            if(Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2)){
                triplets = true;
            }
        }
        if(triplets){
            System.out.println(a + " " + b + " " + c + " are triplets");
        } else{
            System.out.println(a + " " + b + " " + c + " are not triplets");
        }
    }
}
