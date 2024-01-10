import java.util.Scanner;

public class binarytodecimal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int placeValue = 1;
        int ans = 0;
        while (n != 0) {
            int lastDigit = n % 10;
            n = n / 10;
            ans = ans + placeValue * lastDigit;
            placeValue = 2 * placeValue;
        }
        System.out.println(ans);
    }
}