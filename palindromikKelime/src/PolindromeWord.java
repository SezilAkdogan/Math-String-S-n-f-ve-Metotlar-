import java.util.Scanner;

public class PolindromeWord {
    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = "";

        while (!word.equals("0")) {
            System.out.print("Bir kelime yazınız : ");
            word = input.next();

            if (isPalindrome(word) && !word.equals("0")) {
                System.out.println( word + " Palindrom bir kelimedir.");
            } else if (!isPalindrome(word) && !word.equals("0")) {
                System.out.println( word + " Palindrom bir kelime değildir.");
            }

            System.out.println();
        }

        System.out.println("Programdan çıkış yapıldı");
    }
}
