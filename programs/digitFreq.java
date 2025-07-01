import java.util.*;

public class digitFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int digit = sc.nextInt();
        int freq = getDigitFrequency(number, digit);
        System.out.println(freq);

    }

    private static int getDigitFrequency(int number, int digit) {
        int rem;
        int count=0;
        while(number > 0){
            rem = number % 10;
            if(rem == digit){
                count++;
            }
            number = number / 10;
        }
        return count;
    }
}
